package com.example.appdosorteio

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Home()
        }
    }
}

@Composable
fun Home() {

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 18.dp,
                    top = 20.dp,
                    end = 18.dp
                ),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Spacer(
                modifier = Modifier.width(6.dp)
            )

            Column {

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Box(
                        modifier = Modifier
                            .width(25.dp)
                            .height(1.dp)
                            .background(Color.Gray)
                    )

                    Box(
                        modifier = Modifier
                            .size(6.dp)
                            .clip(CircleShape)
                            .background(Color(0xFFFFC107))
                    )
                }

                Spacer(
                    modifier = Modifier.height(8.dp)
                )

                Box(
                    modifier = Modifier
                        .width(25.dp)
                        .height(1.dp)
                        .background(Color.Gray)
                )
            }
        }

        Spacer(
            modifier = Modifier.height(35.dp)
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(274.dp)
                .padding(horizontal = 16.dp)
                .background(Color(0xFF777777))
        )

        Spacer(
            modifier = Modifier.height(10.dp)
        )

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Black
            )
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Box(
                    modifier = Modifier
                        .size(28.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFE0E0E0)),
                    contentAlignment = Alignment.Center
                ) {

                    Text(
                        text = "foto",
                        color = Color.DarkGray,
                        fontSize = 6.sp
                    )
                }

                Spacer(
                    modifier = Modifier.width(8.dp)
                )

                Column(
                    modifier = Modifier.weight(1f)
                ) {

                    Text(
                        text = "XXXXXXX",
                        color = Color.White,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(
                        modifier = Modifier.height(2.dp)
                    )

                    Text(
                        text = "▣  VIDEO",
                        color = Color.Gray,
                        fontSize = 7.sp
                    )
                }

                Text(
                    text = "☆",
                    color = Color.Gray,
                    fontSize = 22.sp
                )
            }
        }

        Spacer(
            modifier = Modifier.height(8.dp)
        )

        Button(
            onClick = {
                Toast.makeText(
                    context,
                    "Publicação aberta!",
                    Toast.LENGTH_SHORT
                ).show()
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 22.dp)
        ) {

            Text(
                text = "Ver publicação",
                fontSize = 12.sp
            )
        }

        Spacer(
            modifier = Modifier.weight(1f)
        )

        BottomMenu()
    }
}

@Composable
fun BottomMenu() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(67.dp)
            .border(
                width = 1.dp,
                color = Color(0xFF303030)
            )
            .padding(horizontal = 5.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {

        MenuItem(
            icone = "⌂",
            texto = "Feed"
        )

        MenuItem(
            icone = "○",
            texto = "Descobrir"
        )

        MenuItem(
            icone = "▦",
            texto = "Estúdio"
        )

        MenuItem(
            icone = "♙",
            texto = "Perfil"
        )

        MenuItem(
            icone = "□",
            texto = "Spaces"
        )
    }
}

@Composable
fun MenuItem(
    icone: String,
    texto: String
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = icone,
            color = Color.Gray,
            fontSize = 21.sp
        )

        Spacer(
            modifier = Modifier.height(2.dp)
        )

        Text(
            text = texto,
            color = Color.Gray,
            fontSize = 7.sp
        )
    }
}