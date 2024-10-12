package com.example.gestonnairedetache

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gestonnairedetache.ui.theme.GestonnaireDeTacheTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GestonnaireDeTacheTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyApp(
                        "davis","s", "p"
                    )
                }
            }
        }
    }
}

@Composable
fun MyApp(name: String, texta: String, textb: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_task_completed)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize()
    ) {

        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = texta,
            fontWeight = FontWeight.Bold,

            modifier = modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = textb,
            fontSize = 16.sp,
            modifier = modifier
        )
    }
}

@Composable
fun AppImage(name: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_task_completed)
    Image(
        painter = image,
        contentDescription = null
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyAppPreview() {

    MyApp("davis","All tasks completed", "Nice work!")

}