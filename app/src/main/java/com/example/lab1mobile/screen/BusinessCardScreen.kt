package com.example.lab1mobile.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.example.lab1mobile.R
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.BoxWithConstraints

@Preview(name = "Portrait")
@Composable
fun BusinessCardScreen_Preview_Portrait() {
    BusinessCardScreen()
}

@Preview(name = "Landscape", widthDp = 900, heightDp = 420)
@Composable
fun BusinessCardScreen_Preview_Landscape() {
    BusinessCardScreen()
}

@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun BusinessCardScreen(modifier: Modifier = Modifier) {
    BoxWithConstraints(
        modifier = modifier.fillMaxSize()
    ) {
        val isLandscape = maxWidth > maxHeight
        val paddingLarge = dimensionResource(id = R.dimen.padding_large)
        val paddingMedium = dimensionResource(id = R.dimen.padding_medium)

        if (isLandscape) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingLarge),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(paddingMedium)
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(),
                    contentAlignment = Alignment.Center
                ) {
                    ProfileSection()
                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(),
                    contentAlignment = Alignment.Center
                ) {
                    ContactSection()
                }
            }
        } else {
            Box(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingLarge),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    ProfileSection()
                }

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.BottomStart)
                        .padding(
                            start = paddingMedium,
                            end = paddingMedium,
                            bottom = paddingLarge
                        ),
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.Start
                ) {
                    ContactSection()
                }
            }
        }
    }
}
