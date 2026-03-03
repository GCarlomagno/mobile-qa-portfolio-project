# SQL for QA — Data Validation Scenarios

---

## 1. Purpose

This document demonstrates practical SQL queries used by QA engineers to validate backend data after performing UI or API actions.

The focus is on verifying:

- Data correctness  
- Data consistency  
- Relational integrity  
- Duplicate prevention  
- Aggregated accuracy  

All queries reflect realistic validation scenarios performed during manual or API testing.

---

## 2. Test Database Assumption

For demonstration purposes, we assume a simplified application database with the following tables:

### users
- id (INT)
- name (VARCHAR)
- email (VARCHAR)
- status (VARCHAR)
- created_at (TIMESTAMP)

### orders
- id (INT)
- user_id (INT)
- total_amount (DECIMAL)
- status (VARCHAR)
- created_at (TIMESTAMP)

---

## 3. Core Validation Scenarios

### Scenario 1 — Validate New User Registration

**QA Context:**  
After registering a new user via the UI, verify that the record was correctly inserted into the database.

**Validation Goals:**
- User record exists
- Email stored correctly
- Status set to 'ACTIVE'
- created_at timestamp populated

**SQL Query:**

```sql
SELECT id, name, email, status, created_at
FROM users
WHERE email = 'testuser@email.com';
```
**What QA Validates:**

- Exactly one record is returned
- status = 'ACTIVE'
- created_at IS NOT NULL
- Email value matches the one used during registration

### Scenario 2 — Validate Duplicate Email Prevention

**QA Context:**  
The application should prevent multiple accounts from being created with the same email address.

**Validation Goal:**
Ensure only one record exists for a specific email.

**SQL Query:**

```sql
SELECT COUNT(*) AS total_records
FROM users
WHERE email = 'testuser@email.com';
```

**What QA Validates:**

- COUNT must return 1  
- If COUNT > 1 → Data integrity defect  
- If COUNT = 0 → Registration persistence failure  

### Scenario 3 — Validate Latest Registered User

**QA Context:**  
After registering a new user, verify that it appears as the most recent record in the database.

**Validation Goal:**
Ensure the latest inserted user matches the one created during testing.

**SQL Query:**

```sql
SELECT id, name, email, created_at
FROM users
ORDER BY created_at DESC;
```

**What QA Validates:**

- The first record in the result set matches the test email
- created_at timestamp reflects the recent registration time
- No unexpected records appear after the test action

### Scenario 4 — Validate Order Linked to Correct User

**QA Context:**  
After a user places an order via the UI or API, verify that the order is correctly linked to the corresponding user in the database.

**Validation Goal:**
Ensure the order references the correct user_id and relational integrity is maintained.

**SQL Query:**

```sql
SELECT u.id AS user_id,
       u.email,
       o.id AS order_id,
       o.total_amount,
       o.status
FROM users u
JOIN orders o ON u.id = o.user_id
WHERE u.email = 'testuser@email.com';
```

**What QA Validates:**

- Order exists for the correct user
- user_id in orders table matches users.id
- total_amount reflects the UI transaction
- Order status is correct (e.g., 'CREATED' or 'PAID')

### Scenario 5 — Validate Total Number of Orders per User

**QA Context:**  
After placing multiple orders, verify that the total number of orders associated with a user matches the expected count.

**Validation Goal:**
Ensure aggregation reflects correct number of related records.

**SQL Query:**

```sql
SELECT u.email,
       COUNT(o.id) AS total_orders
FROM users u
JOIN orders o ON u.id = o.user_id
WHERE u.email = 'testuser@email.com'
GROUP BY u.email;
```

**What QA Validates:**

- total_orders matches the number of orders created during testing
- No unexpected duplicate records exist
- Aggregation logic reflects actual transactional activity

### Scenario 6 — Validate Total Order Amount per User

**QA Context:**  
After placing multiple orders, verify that the total monetary amount recorded in the database matches the expected sum of transactions.

**Validation Goal:**
Ensure aggregated financial data is accurate.

**SQL Query:**

```sql
SELECT u.email,
       SUM(o.total_amount) AS total_spent
FROM users u
JOIN orders o ON u.id = o.user_id
WHERE u.email = 'testuser@email.com'
GROUP BY u.email;
```

**What QA Validates:**

- total_spent equals the sum of individual order amounts created during testing
- No incorrect duplication inflates the total
- Monetary precision is preserved (no rounding anomalies)

### Scenario 7 — Detect Orphan Orders (Data Integrity Check)

**QA Context:**  
Verify that every order in the database is linked to an existing user.  
Orders referencing non-existent users indicate a serious relational integrity issue.

**Validation Goal:**
Identify orders with invalid or missing user references.

**SQL Query:**

```sql
SELECT o.id AS order_id,
       o.user_id
FROM orders o
LEFT JOIN users u ON o.user_id = u.id
WHERE u.id IS NULL;
```

**What QA Validates:**

- Query should return zero rows
- Any returned record indicates a broken foreign key relationship
- Such issues may lead to reporting inconsistencies or system errors

### Scenario 8 — Validate Orders by Status

**QA Context:**  
After completing an order payment, verify that the order status is correctly updated in the database.

**Validation Goal:**
Ensure orders reflect the correct lifecycle state.

**SQL Query:**

```sql
SELECT id, user_id, status
FROM orders
WHERE status = 'PAID';
```

**What QA Validates:**

- Recently paid orders appear with status = 'PAID'
- No paid orders remain in incorrect states such as 'CREATED'
- Status transitions reflect business rules correctly

---

## 4. Key SQL Concepts Used

- SELECT  
- WHERE  
- COUNT  
- ORDER BY  
- JOIN  
- GROUP BY  
- SUM  

---

## 5. QA Mindset

The purpose of these queries is not development analysis.

They are used to validate:

- UI action → database reflection  
- Business rule enforcement  
- Data integrity  
- Prevention of inconsistent states  