package com.example.weather.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.weather.R
import com.example.weather.ui.theme.BlueLight

@Preview(showBackground = true)
@Composable
fun MainScreen() {
    Image(
        painter = painterResource(id = R.drawable.weather_background2),
        contentDescription = "Image Background",
        modifier = Modifier
            .fillMaxSize()
            .alpha(0.5f),
        contentScale = ContentScale.Crop
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            backgroundColor = BlueLight,
            elevation = 0.dp,
            shape = RoundedCornerShape(10.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            modifier = Modifier.padding(8.dp),
                            text = "9 September 2022 15:00",
                            style = TextStyle(fontSize = 15.sp),
                            color = Color.White
                        )
                        AsyncImage(
                            model = "https://cdn.weatherapi.com/weather/64x64/day/116.png",
                            contentDescription = "Image mini current weather",
                            modifier = Modifier
                                .size(35.dp)
                                .padding(top = 3.dp, end = 8.dp)
                        )
                    }
                    Text(
                        text = "Minsk",
                        style = TextStyle(fontSize = 24.sp),
                        color = Color.White
                    )
                    Text(
                        text = "23°C",
                        style = TextStyle(fontSize = 65.sp),
                        color = Color.White
                    )
                    Text(
                        text = "Sunny",
                        style = TextStyle(fontSize = 16.sp),
                        color = Color.White
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        IconButton(
                            onClick = {

                            }
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_search),
                                contentDescription = "Image search",
                                tint = Color.White
                            )
                        }
                        Text(
                            text = "23°C / 12°C",
                            style = TextStyle(fontSize = 16.sp),
                            color = Color.White
                        )
                        IconButton(
                            onClick = {

                            }
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_sync),
                                contentDescription = "Image sync",
                                tint = Color.White
                            )
                        }

                    }
                }
            }
        }
    }
}