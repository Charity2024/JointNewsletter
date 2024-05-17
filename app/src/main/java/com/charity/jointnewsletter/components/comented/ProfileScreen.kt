package com.charity.jointnewsletter.components.comented
/*
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material3.Divider
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.charity.jointnewsletter.R


@Composable
fun ProfileScreen(article:Article, onNavIconPressed: () -> Unit = { }) {
    val scrollState = rememberScrollState()

    Column(modifier = Modifier.fillMaxSize()) {
        BoxWithConstraints(modifier = Modifier.weight(1f)) {
            Surface {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(scrollState),
                ) {
                    ProfileHeader(
                        scrollState,
                        article,
                        this@BoxWithConstraints.maxHeight
                    )
                    ProfileContent(article, this@BoxWithConstraints.maxHeight)
                }
            }
            AdoptFab(
                extended = scrollState.value == 0,
                modifier = Modifier.align(Alignment.BottomEnd)
            )
        }
    }
}

@Composable
private fun ProfileHeader(
    scrollState: ScrollState,
    article: Article,
    containerHeight: Dp
) {
    val offset = (scrollState.value / 2)
    val offsetDp = with(LocalDensity.current) { offset.toDp() }

    Image(
        modifier = Modifier
            .heightIn(max = containerHeight / 2)
            .fillMaxWidth()
            .padding(top = offsetDp),
        painter = painterResource(id = article.articleImageId),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}

@Composable
private fun ProfileContent(article: Article, containerHeight: Dp) {
    Column {
        Spacer(modifier = Modifier.height(8.dp))

        Name(article)

        ProfileProperty(stringResource(R.string.topic), article.topic)

        ProfileProperty(stringResource(R.string.title), article.title.toString())

        ProfileProperty(stringResource(R.string.description), article.description)

        // Add a spacer that always shows part (320.dp) of the fields list regardless of the device,
        // in order to always leave some content at the top.
        Spacer(Modifier.height((containerHeight - 320.dp).coerceAtLeast(0.dp)))
    }
}

@Composable
private fun Name(
    article: Article
) {
    Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)) {
        Name(
            article = article,
            //modifier = Modifier.baselineHeight(32.dp)
        )
    }
}

@Composable
private fun Name(article: Article, modifier: Modifier = Modifier) {
    Text(
        text =article.title,
        modifier = modifier,
       // style = MaterialTheme.typography.h5,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun ProfileProperty(label: String, value: String, isLink: Boolean = false) {
    Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)) {
        Divider()

            Text(
                text = label,
                modifier = Modifier.height(24.dp),
                //style = MaterialTheme.typography.caption,
            )

        val style = if (isLink) {
           // MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.primary)
        } else {
           // MaterialTheme.typography.body1
        }
        Text(
            text = value,
            modifier = Modifier.height(24.dp),
            style = style
        )
    }
}

private fun <ColumnScope> ColumnScope.Text(text: String, modifier: Modifier, style: Unit) {

}

@Composable
fun AdoptFab(extended: Boolean, modifier: Modifier = Modifier) {
    FloatingActionButton(
        onClick = { /* TODO */ },
        modifier = modifier
            .padding(16.dp)
            .padding()
            .height(48.dp)
            .background(Color.DarkGray)
            .widthIn(min = 48.dp),
        contentColor = Color.White
    ) {
        AnimatingFabContent(
            icon = {
                Icon(
                    imageVector = Icons.Outlined.Call,
                    contentDescription = stringResource(R.string.adopt_me)
                )
            },
            text = {
                Text(
                    text = stringResource(R.string.adopt_me),
                )
            },
            extended = extended

        )
    }
}

@Composable
fun AnimatingFabContent(icon: @Composable () -> Unit, text: @Composable () -> Unit, extended: Boolean) {

}

@Preview
@Composable
fun ProfilePreview() {
    val article = ArticleDataProvider.article
    ProfileScreen(article = article)
}

 */
