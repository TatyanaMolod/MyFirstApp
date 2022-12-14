package com.example.myfirstapp

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.ui.layout.ContentScale


@Composable
fun MarvelCard(MarvelCardModel: MarvelCardModel ) {
        Card(
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .size(320.dp, 440.dp),
            shape = RoundedCornerShape(15.dp),

        ) {
            Image(
                painter = painterResource(id = MarvelCardModel.image),
                contentDescription = "MarvelCard",
                contentScale = ContentScale.Crop,
            )
            Box(
                modifier = Modifier.fillMaxSize(),
                Alignment.BottomStart
            ) {
                Text(
                    text = MarvelCardModel.title,
                    modifier = Modifier.padding(start = 30.dp, bottom = 40.dp),
                    style = TextStyle(color = Color.White, fontSize = 35.sp)
                )
            }
        }
    }
