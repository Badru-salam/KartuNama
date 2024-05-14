package com.example.aplikasikartunama

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aplikasikartunama.ui.theme.AplikasiKartuNamaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AplikasiKartuNamaTheme {
                // A surface container using the 'background' color from the theme
                GreetingText(
                    nama = "Badru Salam",
                    title = "Android Development Extraordinaire",
                    kontak = "081298959113",
                    bagikan = "@badru_salam",
                    email = "badru.salam97@gmail.com"
                )
            }
        }
    }
}

@Composable
fun GreetingText(
    nama: String,
    title: String,
    kontak: String,
    bagikan: String,
    email: String
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFB5E5CF))
            .padding(16.dp, vertical = 100.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize(),
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.run { padding( 16.dp,vertical = 150.dp) }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "logo",
                    modifier = Modifier
                        .size(100.dp)
                        .align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = nama,
                    fontSize = 30.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Text(
                    text = title,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)
                )
            }
            pacer()
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start,  // Change alignment to start
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 60.dp)
            ) {
                ContactItem(
                    icon = Icons.Default.Call,
                    text = kontak
                )
                ContactItem(
                    icon = Icons.Default.Share,
                    text = bagikan
                )
                ContactItem(
                    icon = Icons.Default.Email,
                    text = email
                )
            }
        }
    }
}

fun pacer() {

}

@Composable
fun ContactItem(icon: ImageVector, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier
                .size(24.dp)
                .padding(end = 8.dp)
        )
        Text(
            text = text,
            fontSize = 14.sp,
            modifier = Modifier
                .weight(1f)
                .padding(end = 8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AplikasiKartuNamaTheme {
        GreetingText(
            nama = "Badru Salam",
            title = "Android Development Extraordinaire",
            kontak = "081298959113",
            bagikan = "@badru_salam",
            email = "badru.salam97@gmail.com"
        )
    }
}
