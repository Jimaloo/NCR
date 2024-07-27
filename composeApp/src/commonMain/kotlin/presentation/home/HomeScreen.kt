package presentation.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Warning
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex

@Composable
fun HomeScreen() {
    Scaffold(
        bottomBar = {
            Column {
                Divider()
                Row(
                    modifier = Modifier.fillMaxWidth().zIndex(5f).padding(top = 8.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(Icons.Default.DateRange, contentDescription = null)
                        Text("Plan")
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(Icons.Default.DateRange, contentDescription = null)
                        Text("Departures")
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(Icons.Default.LocationOn, contentDescription = null)
                        Text("Near me")
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(Icons.Default.Favorite, contentDescription = null)
                        Text("Saved")
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(Icons.Default.Menu, contentDescription = null)
                        Text("More")
                    }
                }
                Spacer(Modifier.height(20.dp))
            }
        }
    ) {
        Column(modifier = Modifier.fillMaxHeight().background(Color(0xFFEEEEEE))) {
            Column(
                Modifier.fillMaxWidth()
                    .background(Color(0xFF862330))
                    .windowInsetsPadding(WindowInsets.statusBars),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Text(
                    text = "Welcome to \n Nairobi Commmuter Rail",
                    color = Color.White, textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(16.dp).fillMaxWidth()
                        .background(
                            Color.White,
                            RoundedCornerShape(10.dp)
                        ).padding(15.dp)
                ) {

                    Column(
                        modifier = Modifier.fillMaxWidth(.1f).padding(end = 10.dp)
                            .wrapContentHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .size(15.dp)
                                .border(
                                    width = 2.dp,
                                    color = Color(0xFFFF5624),
                                    shape = CircleShape
                                ),
                        ) {}
                        Divider(
                            color = Color(0xFFFF5624),
                            modifier = Modifier.fillMaxHeight(.04f)  //fill the max height
                                .width(3.dp)
                        )

                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .size(15.dp)
                                .border(
                                    width = 2.dp,
                                    color = Color(0xFFFF5624),
                                    shape = CircleShape
                                ),
                        ) {}
                    }

                    Column(
                        modifier = Modifier.weight(1f),
                        verticalArrangement = Arrangement.SpaceAround
                    ) {
                        Text("Origin", modifier = Modifier.padding(0.dp))

                        Divider(modifier = Modifier.padding(top = 8.dp, bottom = 8.dp))

                        Text("Destination", modifier = Modifier.padding(0.dp))
                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(.2f).height(30.dp),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            Icons.Filled.KeyboardArrowDown,
                            contentDescription = null,
                            modifier = Modifier.align(Alignment.Bottom).size(25.dp)
                        )
                        Icon(
                            Icons.Filled.KeyboardArrowUp, contentDescription = null,
                            modifier = Modifier.align(Alignment.Top).size(25.dp)
                        )
                    }


                }


                Button(
                    modifier = Modifier.fillMaxWidth().padding(16.dp),
                    onClick = {
                        //your onclick code here
                    },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFFDC00))
                ) {
                    Text(
                        text = "Plan your journey",
                        modifier = Modifier.padding(5.dp),
                        style = MaterialTheme.typography.button
                    )
                }

                Divider()

                Row(
                    modifier = Modifier.fillMaxWidth().background(Color(0xFFFF5624)).padding(10.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Default.Warning,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.padding(start = 8.dp)
                    )

                    Text(
                        "Disruptions and engineering works (14)",
                        color = Color.White,
                        modifier = Modifier.padding(start = 8.dp),
                        style = MaterialTheme.typography.caption
                    )
                }
            }

            Column(
                modifier = Modifier.padding(16.dp).fillMaxWidth()
                    .background(
                        Color.White,
                        RoundedCornerShape(5.dp)
                    ).padding(10.dp)
            ) {
                Text(
                    "Location permission",
                    style = MaterialTheme.typography.h6,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    "Get up-to-date journey information about your train/bus as you travel. We use your location for that. You can always disable it again later in the app's settings.",
                    style = MaterialTheme.typography.caption
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Button(
                        modifier = Modifier.wrapContentSize().padding(10.dp),
                        onClick = {
                            //your onclick code
                        },
                        border = BorderStroke(1.dp, Color(0xFFFFDC00)),
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color(0xFFFFDC00))
                    ) {
                        Text(
                            text = "No thanks",
                            modifier = Modifier.padding(5.dp),
                            style = MaterialTheme.typography.button,
                            color = Color.DarkGray
                        )
                    }

                    Button(
                        modifier = Modifier.wrapContentSize().padding(10.dp),
                        onClick = {
                            //your onclick code here
                        },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFFDC00))
                    ) {
                        Text(
                            text = "Switch on",
                            modifier = Modifier.padding(5.dp),
                            style = MaterialTheme.typography.button
                        )
                    }
                }
            }
            Column(
                modifier = Modifier.padding(16.dp).fillMaxWidth()
                    .background(
                        Color.White,
                        RoundedCornerShape(5.dp)
                    ).padding(10.dp)
            ) {

                Text(
                    "Add Favourite location",
                    style = MaterialTheme.typography.h6,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "Set location and get live travel info",
                    style = MaterialTheme.typography.body2
                )

                Divider(modifier = Modifier.padding(top = 8.dp, bottom = 8.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        "Add favourite",
                        color = Color.Blue, style = MaterialTheme.typography.caption
                    )

                    Icon(Icons.Filled.Menu, contentDescription = null)
                }
            }
        }
    }
}