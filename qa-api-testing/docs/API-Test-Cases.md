# API Test Cases — JSONPlaceholder User API

---

## 1. Test Objective

Validate the functionality and reliability of the JSONPlaceholder User API endpoints.

The testing focuses on:

- correct HTTP responses
- response structure validation
- API data consistency
- error handling behavior

---

## 2. Endpoint Under Test

Base URL:

https://jsonplaceholder.typicode.com

Primary resource:

/users

---

## 3. Test Cases

### TC-API-001 — Retrieve User List

**Endpoint**

GET /users

**Test Objective**

Verify that the API returns a list of users.

**Validation Steps**

1. Send GET request to `/users`
2. Observe HTTP response status
3. Inspect JSON response body

**Expected Results**

- Status code **200 OK**
- Response body contains a JSON array
- The array contains user objects
- Each user object contains:
  - id
  - name
  - username
  - email

### Additional Validations Implemented in Postman

The following automated validations were implemented in Postman test scripts:

- Status code validation (200 OK)
- Response body type validation (array)
- User object field validation (id, name, username, email)
- Response time verification (< 500 ms)

These validations ensure both structural correctness and basic performance 
requirements of the API endpoint.