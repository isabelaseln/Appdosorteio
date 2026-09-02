package com.example.appdosorteio

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
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.Composable

@Composable
fun EstudioScreen() {

    Scaffold(
        containerColor = Color.Black
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
                .padding(paddingValues)
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(62.dp)
                    .padding(horizontal = 14.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

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

                Spacer(
                    modifier = Modifier.weight(1f)
                )

                Text(
                    text = "Estúdio V",
                    color = Color.White,
                    fontSize = 12.sp
                )

                Spacer(
                    modifier = Modifier.weight(1f)
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color(0xFF8E8E93))
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = 8.dp,
                        vertical = 13.dp
                    ),
                horizontalArrangement = Arrangement.spacedBy(17.dp)
            ) {

                Filtro("Tudo")
                Filtro("Vídeos")
                Filtro("Imagens")
                Filtro("Montagens")
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {

                    Box(
                        modifier = Modifier
                            .width(125.dp)
                            .height(122.dp)
                            .background(Color(0xFF777777))
                    )

                    Box(
                        modifier = Modifier
                            .width(125.dp)
                            .height(150.dp)
                            .background(Color(0xFF777777))
                    )

                    Box(
                        modifier = Modifier
                            .width(125.dp)
                            .height(122.dp)
                            .background(Color(0xFF777777))
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {

                    Box(
                        modifier = Modifier
                            .width(125.dp)
                            .height(150.dp)
                            .background(Color(0xFF777777))
                    )

                    Box(
                        modifier = Modifier
                            .width(125.dp)
                            .height(122.dp)
                            .background(Color(0xFF777777))
                    )

                    Box(
                        modifier = Modifier
                            .width(125.dp)
                            .height(150.dp)
                            .background(Color(0xFF777777))
                    )
                }
            }

            Spacer(
                modifier = Modifier.weight(3f)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 8.dp),
                horizontalArrangement = Arrangement.End
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 8.dp),
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {

                    BotaoFlutuante(
                        simbolo = "▣",
                        legenda = "Tire uma foto"
                    )

                    BotaoFlutuante(
                        simbolo = "▧"
                    )

                    BotaoFlutuante(
                        simbolo = "▥"
                    )

                    Spacer(
                        modifier = Modifier.height(5.dp)
                    )


                    Button(
                        onClick = { },
                        modifier = Modifier.height(34.dp),
                        shape = CircleShape,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF777777)
                        )
                    ) {

                        Text(
                            text = "+  Importar",
                            fontSize = 10.sp,
                            color = Color.White
                        )
                    }
                }
            }

            Spacer(
                modifier = Modifier.height(8.dp)
            )

            MenuInferior()
        }
    }
}

@Composable
fun Filtro(texto: String) {

    Box(
        modifier = Modifier
            .clip(CircleShape)
            .background(Color(0xFF777777))
            .padding(
                horizontal = 13.dp,
                vertical = 5.dp
            )
    ) {

        Text(
            text = texto,
            color = Color.White,
            fontSize = 12.sp
        )
    }
}

@Composable
fun ImagemGaleria(
    modifier: Modifier,
    selecionada: Boolean = false
) {

    Box(
        modifier = modifier
            .height(120.dp)
            .background(Color(0xFF777777))
            .then(
                if (selecionada) {
                    Modifier.border(
                        width = 2.dp,
                        color = Color(0xFF03A9F4)
                    )
                } else {
                    Modifier
                }
            )
    )
}

@Composable
fun BotaoFlutuante(
    simbolo: String,
    legenda: String? = null
) {

    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {

        if (legenda != null) {

            Box(
                modifier = Modifier
                    .background(Color(0xFF252525))
                    .padding(
                        horizontal = 4.dp,
                        vertical = 2.dp
                    )
            ) {

                Text(
                    text = legenda,
                    color = Color.Gray,
                    fontSize = 7.sp
                )
            }

            Spacer(
                modifier = Modifier.width(4.dp)
            )
        }

        Box(
            modifier = Modifier
                .size(24.dp)
                .clip(CircleShape)
                .background(Color(0xFF777777)),
            contentAlignment = Alignment.Center
        ) {

            Text(
                text = simbolo,
                color = Color.DarkGray,
                fontSize = 15.sp
            )
        }
    }
}

@Composable
fun MenuInferior() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(64.dp)
            .border(
                width = 1.dp,
                color = Color(0xFF303030)
            ),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {

        ItemMenu(
            icone = "⌂",
            texto = "Feed"
        )

        ItemMenu(
            icone = "○",
            texto = "Descobrir"
        )

        ItemMenu(
            icone = "▦",
            texto = "Estúdio"
        )

        ItemMenu(
            icone = "♙",
            texto = "Perfil"
        )

        ItemMenu(
            icone = "□",
            texto = "Spaces"
        )
    }
}

@Composable
fun ItemMenu(
    icone: String,
    texto: String
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = icone,
            color = Color.Gray,
            fontSize = 19.sp
        )

        Text(
            text = texto,
            color = Color.Gray,
            fontSize = 7.sp
        )
    }
}