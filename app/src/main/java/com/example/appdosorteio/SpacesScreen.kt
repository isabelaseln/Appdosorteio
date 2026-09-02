package com.example.appdosorteio

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SpacesScreen() {

    var abaSelecionada by remember {
        mutableStateOf(0)
    }


    var nomeSpace by remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    top = 15.dp,
                    start = 6.dp,
                    end = 6.dp,
                    bottom = 60.dp
                )
                .clip(
                    RoundedCornerShape(
                        topStart = 20.dp,
                        topEnd = 20.dp
                    )
                )
                .background(Color.Black)
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 8.dp,
                        end = 12.dp,
                        top = 8.dp
                    ),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Column {

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Box(
                            modifier = Modifier
                                .width(23.dp)
                                .height(1.dp)
                                .background(Color.Gray)
                        )

                        Box(
                            modifier = Modifier
                                .size(5.dp)
                                .clip(CircleShape)
                                .background(Color(0xFFFFC107))
                        )
                    }

                    Spacer(
                        modifier = Modifier.height(7.dp)
                    )

                    Box(
                        modifier = Modifier
                            .width(23.dp)
                            .height(1.dp)
                            .background(Color.Gray)
                    )
                }

                /*
                 * BUTTON REAL
                 */
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(15.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF777777)
                    )
                ) {

                    Text(
                        text = "Criar",
                        color = Color.White,
                        fontSize = 9.sp
                    )
                }
            }

            Spacer(
                modifier = Modifier.height(14.dp)
            )

            Text(
                text = "Spaces",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(
                    horizontal = 8.dp
                )
            )

            Spacer(
                modifier = Modifier.height(10.dp)
            )


            OutlinedTextField(
                value = nomeSpace,
                onValueChange = {
                    nomeSpace = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 14.dp)
                    .height(55.dp),
                label = {
                    Text(
                        text = "Nome do Space",
                        fontSize = 10.sp
                    )
                },
                singleLine = true
            )

            Spacer(
                modifier = Modifier.height(12.dp)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 14.dp),
                horizontalArrangement = Arrangement.spacedBy(26.dp)
            ) {

                Aba(
                    texto = "Contribuir",
                    selecionada = abaSelecionada == 0,
                    onClick = {
                        abaSelecionada = 0
                    }
                )

                Aba(
                    texto = "Seguindo",
                    selecionada = abaSelecionada == 1,
                    onClick = {
                        abaSelecionada = 1
                    }
                )

                Aba(
                    texto = "Em destaque",
                    selecionada = abaSelecionada == 2,
                    onClick = {
                        abaSelecionada = 2
                    }
                )
            }

            Spacer(
                modifier = Modifier.height(18.dp)
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp)
                    .height(390.dp)
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(190.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {

                    Retangulo(
                        modifier = Modifier.weight(1f)
                    )

                    Retangulo(
                        modifier = Modifier.weight(1f)
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 200.dp)
                        .height(190.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {

                    Retangulo(
                        modifier = Modifier.weight(1f)
                    )

                    Retangulo(
                        modifier = Modifier.weight(1f)
                    )
                }

                Column(
                    modifier = Modifier
                        .padding(
                            top = 235.dp,
                            start = 18.dp
                        ),
                    horizontalAlignment = Alignment.Start
                ) {

                    Text(
                        text = "Crie uma galeria compartilhada",
                        color = Color.White,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Start
                    )

                    Text(
                        text =
                            "Defina um tema, convide\n" +
                                    "colaboradores, discuta\n" +
                                    "publicações e\n" +
                                    "compartilhe sua criação.",
                        color = Color.White,
                        fontSize = 13.sp,
                        lineHeight = 14.sp,
                        textAlign = TextAlign.Start
                    )
                }

                Row(
                    modifier = Modifier
                        .padding(
                            top = 350.dp,
                            start = 12.dp
                        ),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Box(
                        modifier = Modifier
                            .height(27.dp)
                            .clip(
                                RoundedCornerShape(
                                    topStart = 16.dp,
                                    bottomStart = 16.dp,
                                    topEnd = 0.dp,
                                    bottomEnd = 0.dp
                                )
                            )
                            .background(Color.White)
                            .clickable { }
                            .padding(
                                start = 15.dp,
                                end = 8.dp
                            ),
                        contentAlignment = Alignment.Center
                    ) {

                        Text(
                            text = "Crie seu primeiro espaço",
                            color = Color.DarkGray,
                            fontSize = 11.sp
                        )
                    }

                    Box(
                        modifier = Modifier
                            .size(34.dp)
                            .clip(CircleShape)
                            .background(Color(0xFF4A4A4A))
                            .clickable { },
                        contentAlignment = Alignment.Center
                    ) {

                        Text(
                            text = "+",
                            color = Color.White,
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Light
                        )
                    }
                }
            }
        }

        BottomNavigationBar(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .navigationBarsPadding()
        )
    }
}

@Composable
fun Retangulo(
    modifier: Modifier = Modifier
) {

    Box(
        modifier = modifier
            .fillMaxHeight()
            .background(Color(0xFF777777))
    )
}

@Composable
fun Aba(
    texto: String,
    selecionada: Boolean,
    onClick: () -> Unit
) {

    Column(
        modifier = Modifier.clickable {
            onClick()
        },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = texto,
            color = if (selecionada) {
                Color.White
            } else {
                Color.Gray
            },
            fontSize = 10.sp
        )

        Spacer(
            modifier = Modifier.height(5.dp)
        )

        if (selecionada) {

            Box(
                modifier = Modifier
                    .width(46.dp)
                    .height(1.dp)
                    .background(Color.White)
            )
        }
    }
}

@Composable
fun BottomNavigationBar(
    modifier: Modifier = Modifier
) {

    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(58.dp)
            .background(Color.Black),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {

        ItemBottom(
            simbolo = "⌂",
            texto = "Feed"
        )

        ItemBottom(
            simbolo = "⌕",
            texto = "Descobrir"
        )

        ItemBottom(
            simbolo = "▦",
            texto = "Estúdio"
        )

        ItemBottom(
            simbolo = "♙",
            texto = "Perfil"
        )

        ItemBottom(
            simbolo = "□",
            texto = "Spaces"
        )
    }
}

@Composable
fun ItemBottom(
    simbolo: String,
    texto: String
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.width(45.dp)
    ) {

        Text(
            text = simbolo,
            color = Color.Gray,
            fontSize = 19.sp
        )

        Text(
            text = texto,
            color = Color.Gray,
            fontSize = 10.sp
        )
    }
}