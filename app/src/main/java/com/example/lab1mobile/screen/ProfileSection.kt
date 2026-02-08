package com.example.lab1mobile.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.lab1mobile.R
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ProfileSection() {
    val imageSize = dimensionResource(id = R.dimen.profile_image_size)
    val nameSize = dimensionResource(id = R.dimen.profile_name_text_size)
    val titleSize = dimensionResource(id = R.dimen.profile_title_text_size)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .background(color = colorResource(R.color.text_primary)),
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = stringResource(id = R.string.logo_cd),
                modifier = Modifier
                    .size(imageSize)
            )
        }


        Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.padding_medium)))

        Text(
            text = stringResource(id = R.string.profile_name),
            fontSize = nameSize.value.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.text_primary)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = stringResource(id = R.string.profile_title),
            fontSize = titleSize.value.sp,
            color = colorResource(id = R.color.text_secondary)
        )
    }
}
