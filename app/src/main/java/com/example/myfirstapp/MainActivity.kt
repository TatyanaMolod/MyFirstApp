package com.example.myfirstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Text
import androidx.compose.material.swipeable
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.chrisbanes.snapper.ExperimentalSnapperApi
import dev.chrisbanes.snapper.rememberSnapperFlingBehavior


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalSnapperApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(Color(60, 60, 60))
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Marvel()
                val listState = rememberLazyListState()
                LazyRow(
                    state = listState,
                flingBehavior = rememberSnapperFlingBehavior(listState)
                ) {
                    itemsIndexed(
                        listOf(
                            MarvelCardModel(R.drawable.deadpool, "Deadpool"),
                            MarvelCardModel(R.drawable.ironman, "Iron Man"),
                            MarvelCardModel(R.drawable.captain, "Captain America"),
                            MarvelCardModel(R.drawable.spiderman, "Spiderman"),
                            MarvelCardModel(R.drawable.doctor, "Doctor Strange"),
                            MarvelCardModel(R.drawable.thor, "Thor"),
                            MarvelCardModel(R.drawable.thanos, "Thanos")
                        )
                    )
                    { _, MarvelCardModel ->
                        MarvelCard(MarvelCardModel = MarvelCardModel)
                    }
                }
            }
            }
        }
    }





