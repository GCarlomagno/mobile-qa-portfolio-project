package com.example.myfirstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myfirstapp.ui.theme.MyFirstAppTheme
import android.widget.Toast
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.NavHostController
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstAppTheme {

                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "main"
                ) {

                    composable("main") {
                        MainScreen(navController)
                    }

                    composable("second") {
                        SecondScreen(navController)
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    val context = LocalContext.current

    Column(modifier = modifier) {
        Text(text= "Hello $name!")

        Button(onClick = {
            Toast.makeText(
                context,
                "Button clicked!",
                Toast.LENGTH_SHORT
            ).show()
        }) {
            Text("Press me")
        }
    }
}

@Composable
fun MainScreen(navController: NavHostController) {

    val context = LocalContext.current

    Column(modifier = Modifier.padding(16.dp)) {

        Text(text = "Hello Giacomo")

        Button(onClick = {
            Toast.makeText(context, "Going to second screen", Toast.LENGTH_SHORT).show()
            navController.navigate("second")
        }) {
            Text("Go to second screen")
        }
    }
}

@Composable
fun SecondScreen(navController: NavHostController) {

    Column(modifier = Modifier.padding(16.dp)) {

        Text(text = "This is the second screen!")

        Button(onClick = {
            navController.popBackStack()
        }) {
            Text("Go Back")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstAppTheme {
        Greeting("Giacomo")
    }
}