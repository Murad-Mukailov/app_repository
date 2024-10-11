package com.example.vknews.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.vknews.R

@Preview
@Composable
fun PostItem() {
    Card(
        modifier = Modifier
            .background(color = MaterialTheme.colorScheme.primary)
            .padding(7.dp)
    ) {
        Column(modifier = Modifier.padding(5.dp)) {
            PostHeader()

            Spacer(modifier = Modifier.height(11.dp))

            Text(
                text = stringResource(R.string.descreption)
            )
            Spacer(modifier = Modifier.height(11.dp))
            Image(
                modifier = Modifier.fillMaxWidth(),
                painter = painterResource(R.drawable.not_found_photo),
                contentDescription = null,
                contentScale = ContentScale.FillWidth
            )

            Statistics()
        }
    }
}

@Composable
private fun PostHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape),
            painter = painterResource(R.drawable.post_comunity_thumbnail),
            contentDescription = null
        )
        Spacer(modifier = Modifier.width(10.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = "Уволено",
                color = MaterialTheme.colorScheme.onPrimary
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "12:00",
                color = MaterialTheme.colorScheme.onSecondary
            )
        }
        Icon(
            imageVector = Icons.Default.MoreVert,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.onSecondary
        )
    }
}

@Composable
private fun Statistics() {
    Row(modifier = Modifier.padding(vertical = 11.dp)){
        Row(modifier = Modifier.weight(0.5f)) {
            IconWithText(iconResId = R.drawable.ic_views_count, title = "200")
        }
        Row(modifier = Modifier.weight(1f), horizontalArrangement = Arrangement.SpaceBetween){
            IconWithText(iconResId = R.drawable.ic_share, title = "27")
            IconWithText(iconResId = R.drawable.ic_comment, title = "2034")
            IconWithText(iconResId = R.drawable.ic_like, title = "123")
        }
    }
}

@Composable
private fun IconWithText(iconResId: Int, title: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(text = title)
        Spacer(modifier = Modifier.width(6.dp))
        Icon(
            painter = painterResource(id = iconResId),
            contentDescription = null,
        )
    }
}

@Preview
@Composable
private fun PreviewLight() {
    VkNewsTheme(darkTheme = true) {
        PostItem()
    }
}