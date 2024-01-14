package com.islam.easycashtask.presentation.compititons

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.islam.easycashtask.model.competition.Competition


@Composable
fun CompetitionCard(
        competition: Competition,
        onCompetitionClick: (Competition) -> Unit = {}
) {

    Box(
            modifier = Modifier
                    .fillMaxSize()
                    .clickable(onClick = { onCompetitionClick(competition) }),
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            AsyncImage(
                    modifier = Modifier
                            .padding(all = 8.dp)
                            .width(70.dp),
                    model = ImageRequest.Builder(LocalContext.current)
                            .data(competition.emblem)
                            .crossfade(true)
                            .build(),
                    contentDescription = "competition_emblem",
                    contentScale = ContentScale.Fit
            )
            Column(modifier = Modifier.padding(all = 8.dp)) {
                Text(
                        modifier = Modifier.padding(vertical = 8.dp),
                        text = competition.name,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        fontSize = MaterialTheme.typography.titleLarge.fontSize,
                        fontWeight = FontWeight.Bold
                )
                Text(
                        modifier = Modifier.padding(bottom = 8.dp),
                        text = competition.area.name,
                        maxLines = 6,
                        overflow = TextOverflow.Ellipsis
                )
            }
        }
    }

    Divider(
            modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp)
    )
}