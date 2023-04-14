package com.example.podcasteapplication

import android.content.Context
import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.podcasteapplication.ui.theme.PodcasteApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PodcasteApplicationTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background

                ) {
                    playAudio(this)

                }
            }
        }
    }
}




@Composable
fun playAudio(context: Context) {

    Column(modifier = Modifier.fillMaxSize()) {

        Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Text(text = "PODCAST",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color(0xFFE60B6A),
                fontWeight = FontWeight.Black,
                fontSize = 67.sp,
                style = MaterialTheme.typography.h1,
                letterSpacing = 0.1.em

            )
        }

        Column(modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())) {


            Card(
                elevation = 12.dp,
                border = BorderStroke(1.dp, Color.Blue),
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .height(250.dp)
            )
            {
                val mp: MediaPlayer = MediaPlayer.create(context, R.raw.audio_10)

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.img_7),
                        contentDescription = null,
                        modifier = Modifier
                            .height(150.dp)
                            .width(200.dp),

                        )

                    Text(
                        text = "Pathu Thala-STR MOIVE",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(start = 20.dp, end = 20.dp)
                    )
                    Row() {

                        IconButton(onClick = { mp.start() }, modifier = Modifier.size(35.dp)) {
                            Icon(
                                painter = painterResource(id = R.drawable.play),
                                contentDescription = ""
                            )
                        }

                        IconButton(onClick = { mp.pause() }, modifier = Modifier.size(35.dp)) {
                            Icon(
                                painter = painterResource(id = R.drawable.pause),
                                contentDescription = ""
                            )
                        }

                    }
                }

            }


            Card(
                elevation = 12.dp,
                border = BorderStroke(1.dp, Color.Magenta),
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .height(250.dp)
            )
            {
                val mp: MediaPlayer = MediaPlayer.create(context, R.raw.audio_11)

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {

                    Image(
                        painter = painterResource(id = R.drawable.img_6),
                        contentDescription = null,
                        modifier = Modifier
                            .height(150.dp)
                            .width(200.dp)
                    )

                    Text(
                        text = "BABA-Thalaivar Ranjini Song",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(start = 20.dp, end = 20.dp)
                    )

                    Row() {

                        IconButton(onClick = { mp.start() }, modifier = Modifier.size(35.dp)) {
                            Icon(
                                painter = painterResource(id = R.drawable.play),
                                contentDescription = ""
                            )
                        }

                        IconButton(onClick = { mp.pause() }, modifier = Modifier.size(35.dp)) {
                            Icon(
                                painter = painterResource(id = R.drawable.pause),
                                contentDescription = ""
                            )
                        }

                    }
                }

            }



            Card(
                elevation = 12.dp,
                border = BorderStroke(1.dp, Color.DarkGray),
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .height(250.dp)
            )
            {
                val mp: MediaPlayer = MediaPlayer.create(context, R.raw.audio_12)

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {

                    Image(
                        painter = painterResource(id = R.drawable.img_12),
                        contentDescription = null,
                        modifier = Modifier
                            .height(150.dp)
                            .width(200.dp)
                    )

                    Text(
                        text = "Maanaadu-STR Song",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(start = 20.dp, end = 20.dp)
                    )

                    Row() {

                        IconButton(onClick = { mp.start() }, modifier = Modifier.size(35.dp)) {
                            Icon(
                                painter = painterResource(id = R.drawable.play),
                                contentDescription = ""
                            )
                        }

                        IconButton(onClick = { mp.pause() }, modifier = Modifier.size(35.dp)) {
                            Icon(
                                painter = painterResource(id = R.drawable.pause),
                                contentDescription = ""
                            )
                        }

                    }
                }

            }


            Card(
                elevation = 12.dp,
                border = BorderStroke(1.dp, Color.White),
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .height(250.dp)
            )
            {
                val mp: MediaPlayer = MediaPlayer.create(context, R.raw.audio_7)

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.img_10),
                        contentDescription = null,
                        modifier = Modifier
                            .height(150.dp)
                            .width(200.dp),

                        )

                    Text(
                        text = "LEO-THALAPATHY VIJAY",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(start = 20.dp, end = 20.dp)
                    )
                    Row() {

                        IconButton(onClick = { mp.start() }, modifier = Modifier.size(35.dp)) {
                            Icon(
                                painter = painterResource(id = R.drawable.play),
                                contentDescription = ""
                            )
                        }

                        IconButton(onClick = { mp.pause() }, modifier = Modifier.size(35.dp)) {
                            Icon(
                                painter = painterResource(id = R.drawable.pause),
                                contentDescription = ""
                            )
                        }

                    }
                }

            }


            Card(
                elevation = 12.dp,
                border = BorderStroke(1.dp, Color.Red),
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .height(250.dp)
            )
            {
                val mp: MediaPlayer = MediaPlayer.create(context, R.raw.audio_8)

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.img_9),
                        contentDescription = null,
                        modifier = Modifier
                            .height(150.dp)
                            .width(200.dp),

                        )

                    Text(
                        text = "DADA-KAVIN KUMAR LOVE SONG",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(start = 20.dp, end = 20.dp)
                    )
                    Row() {

                        IconButton(onClick = { mp.start() }, modifier = Modifier.size(35.dp)) {
                            Icon(
                                painter = painterResource(id = R.drawable.play),
                                contentDescription = ""
                            )
                        }

                        IconButton(onClick = { mp.pause() }, modifier = Modifier.size(35.dp)) {
                            Icon(
                                painter = painterResource(id = R.drawable.pause),
                                contentDescription = ""
                            )
                        }

                    }
                }

            }


            Card(
                elevation = 12.dp,
                border = BorderStroke(1.dp, Color.Green),
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .height(250.dp)
            )
            {
                val mp: MediaPlayer = MediaPlayer.create(context, R.raw.audio_9)

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.img_8),
                        contentDescription = null,
                        modifier = Modifier
                            .height(150.dp)
                            .width(200.dp),

                        )

                    Text(
                        text = "DADA-KAVIN KUMAR LOVE BETWEEN FATHER AND SON  ",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(start = 20.dp, end = 20.dp)
                    )
                    Row() {

                        IconButton(onClick = { mp.start() }, modifier = Modifier.size(35.dp)) {
                            Icon(
                                painter = painterResource(id = R.drawable.play),
                                contentDescription = ""
                            )
                        }

                        IconButton(onClick = { mp.pause() }, modifier = Modifier.size(35.dp)) {
                            Icon(
                                painter = painterResource(id = R.drawable.pause),
                                contentDescription = ""
                            )
                        }

                    }
                }

            }































        }
    }
}