package com.example.lab1mobile.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.lab1mobile.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun ContactSection() {
    val iconSize = dimensionResource(id = R.dimen.contact_icon_size)
    val textSize = dimensionResource(id = R.dimen.contact_text_size)
    val itemSpacing = dimensionResource(id = R.dimen.contact_item_spacing)

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(itemSpacing),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = stringResource(id = R.string.phone_cd),
                modifier = Modifier.size(iconSize),
                tint = colorResource(id = R.color.icon_tint)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = stringResource(id = R.string.phone_number),
                fontSize = textSize.value.sp,
                color = colorResource(id = R.color.text_primary)
            )
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = stringResource(id = R.string.share_cd),
                modifier = Modifier.size(iconSize),
                tint = colorResource(id = R.color.icon_tint)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = stringResource(id = R.string.telegram_handle),
                fontSize = textSize.value.sp,
                color = colorResource(id = R.color.text_primary)
            )
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = stringResource(id = R.string.email_cd),
                modifier = Modifier.size(iconSize),
                tint = colorResource(id = R.color.icon_tint)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = stringResource(id = R.string.email_address),
                fontSize = textSize.value.sp,
                color = colorResource(id = R.color.text_primary)
            )
        }
    }
}
