package com.islam.easycashtask.presentation.competitionDetails

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.islam.easycashtask.presentation.compititons.CompetitionEvent
import com.islam.easycashtask.presentation.compititons.CompetitionViewModel
import com.islam.easycashtask.utils.ui.theme.customTextBody1
import com.islam.easycashtask.utils.ui.theme.customTextBody2

@Composable
fun CompetitionDetailsScreen(competitionId: Int) {
    val competitionViewModel = hiltViewModel<CompetitionViewModel>()
    competitionViewModel.onEvent(CompetitionEvent.LoadCompetitions)
    val state = competitionViewModel.state.collectAsState().value

    val competition = state.competitions.firstOrNull { competitionId == it.id }

    Log.i(TAG, "CompetitionDetailsScreen: $competition")

    Card {
        Surface(
                modifier = Modifier
                        .fillMaxSize(),
                color = MaterialTheme.colorScheme.surfaceColorAtElevation(5.dp),
        ) {

            Column(modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .padding(all = 8.dp)) {
                AsyncImage(
                        modifier = Modifier
                                .align(alignment = Alignment.CenterHorizontally)
                                .padding(all = 16.dp),
                        model = ImageRequest.Builder(LocalContext.current)
                                .data(competition?.emblem)
                                .crossfade(true)
                                .build(),
                        contentDescription = "competition_emblem",
                        contentScale = ContentScale.Fit
                )
                Row(
                        modifier = Modifier.padding(bottom = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                            text = "Name:",
                            maxLines = 1,
                            modifier = Modifier
                                    .padding(4.dp),
                            style = MaterialTheme.typography.customTextBody1
                    )

                    competition?.name?.let {
                        Text(
                                text = it,
                                modifier = Modifier.weight(1f),
                                style = MaterialTheme.typography.customTextBody2
                        )
                    }
                }

                Row(
                        modifier = Modifier.padding(bottom = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                            text = "Id:",
                            maxLines = 1,
                            modifier = Modifier
                                    .padding(4.dp),
                            style = MaterialTheme.typography.customTextBody1
                    )

                    competition?.id?.toString()?.let {
                        Text(
                                text = it,
                                modifier = Modifier.weight(1f),
                                style = MaterialTheme.typography.customTextBody2,
                        )
                    }
                }

                Row(
                        modifier = Modifier.padding(bottom = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                            text = "Code:",
                            maxLines = 1,
                            modifier = Modifier
                                    .padding(4.dp),
                            style = MaterialTheme.typography.customTextBody1
                    )

                    competition?.code?.let {
                        Text(
                                text = it,
                                modifier = Modifier.weight(1f),
                                style = MaterialTheme.typography.customTextBody2,
                        )
                    }
                }

                Row(
                        modifier = Modifier.padding(bottom = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                            text = "Plan:",
                            maxLines = 1,
                            modifier = Modifier
                                    .padding(4.dp),
                            style = MaterialTheme.typography.customTextBody1
                    )

                    competition?.plan?.let {
                        Text(
                                text = it,
                                modifier = Modifier.weight(1f),
                                style = MaterialTheme.typography.customTextBody2,
                        )
                    }
                }

                Row(
                        modifier = Modifier.padding(bottom = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                            text = "Type:",
                            maxLines = 1,
                            modifier = Modifier
                                    .padding(4.dp),
                            style = MaterialTheme.typography.customTextBody1
                    )

                    competition?.type?.let {
                        Text(
                                text = it,
                                modifier = Modifier.weight(1f),
                                style = MaterialTheme.typography.customTextBody2,
                        )
                    }
                }

                Row(
                        modifier = Modifier.padding(bottom = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                            text = "AvailableSeasons:",
                            maxLines = 1,
                            modifier = Modifier
                                    .padding(4.dp),
                            style = MaterialTheme.typography.customTextBody1
                    )

                    competition?.numberOfAvailableSeasons?.toString()?.let {
                        Text(
                                text = it,
                                modifier = Modifier.weight(1f),
                                style = MaterialTheme.typography.customTextBody2,
                        )
                    }
                }

                Row(
                        modifier = Modifier.padding(bottom = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                            text = "Last updated:",
                            maxLines = 1,
                            modifier = Modifier
                                    .padding(4.dp),
                            style = MaterialTheme.typography.customTextBody1
                    )

                    competition?.lastUpdated?.let {
                        Text(
                                text = it,
                                modifier = Modifier.weight(1f),
                                style = MaterialTheme.typography.customTextBody2,
                        )
                    }
                }

                Text(
                        text = "Area",
                        maxLines = 1,
                        modifier = Modifier
                                .align(alignment = Alignment.CenterHorizontally)
                                .padding(16.dp),
                        style = MaterialTheme.typography.titleMedium
                )

                Row(
                        modifier = Modifier.padding(bottom = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                            text = "Area's Name:",
                            maxLines = 1,
                            modifier = Modifier
                                    .padding(4.dp),
                            style = MaterialTheme.typography.customTextBody1
                    )

                    competition?.area?.name?.let {
                        Text(
                                text = it,
                                modifier = Modifier.weight(1f),
                                style = MaterialTheme.typography.customTextBody2,
                        )
                    }
                }

                Row(
                        modifier = Modifier.padding(bottom = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                            text = "Area's Code:",
                            maxLines = 1,
                            modifier = Modifier
                                    .padding(4.dp),
                            style = MaterialTheme.typography.customTextBody1
                    )

                    competition?.area?.code?.let {
                        Text(
                                text = it,
                                modifier = Modifier.weight(1f),
                                style = MaterialTheme.typography.customTextBody2,
                        )
                    }
                }

                Row(
                        modifier = Modifier.padding(bottom = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                            text = "Area's flag:",
                            maxLines = 1,
                            modifier = Modifier
                                    .padding(4.dp),
                            style = MaterialTheme.typography.customTextBody1
                    )

                    AsyncImage(
                            modifier = Modifier
                                    .weight(1f)
                                    .padding(all = 8.dp),
                            model = ImageRequest.Builder(LocalContext.current)
                                    .data(competition?.area?.flag)
                                    .crossfade(true)
                                    .build(),
                            contentDescription = "area_flag",
                            contentScale = ContentScale.Fit
                    )
                }

                Text(
                        text = "Current Season",
                        maxLines = 1,
                        modifier = Modifier
                                .align(alignment = Alignment.CenterHorizontally)
                                .padding(16.dp),
                        style = MaterialTheme.typography.titleMedium
                )

                Row(
                        modifier = Modifier.padding(bottom = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                            text = "Current MatchDay:",
                            maxLines = 1,
                            modifier = Modifier
                                    .padding(4.dp),
                            style = MaterialTheme.typography.customTextBody1
                    )

                    competition?.currentSeason?.currentMatchday?.toString()?.let {
                        Text(
                                text = it,
                                modifier = Modifier.weight(1f),
                                style = MaterialTheme.typography.customTextBody2,
                        )
                    }
                }

                Row(
                        modifier = Modifier.padding(bottom = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                            text = "Start Date:",
                            maxLines = 1,
                            modifier = Modifier
                                    .padding(4.dp),
                            style = MaterialTheme.typography.customTextBody1
                    )

                    competition?.currentSeason?.startDate?.let {
                        Text(
                                text = it,
                                modifier = Modifier.weight(1f),
                                style = MaterialTheme.typography.customTextBody2,
                        )
                    }
                }

                Row(
                        modifier = Modifier.padding(bottom = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                            text = "End Date:",
                            maxLines = 1,
                            modifier = Modifier
                                    .padding(4.dp),
                            style = MaterialTheme.typography.customTextBody1
                    )

                    competition?.currentSeason?.endDate?.let {
                        Text(
                                text = it,
                                modifier = Modifier.weight(1f),
                                style = MaterialTheme.typography.customTextBody2,
                        )
                    }
                }

                Row(
                        modifier = Modifier.padding(bottom = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                            text = "Winner:",
                            maxLines = 1,
                            modifier = Modifier
                                    .padding(4.dp),
                            style = MaterialTheme.typography.customTextBody1
                    )

                    competition?.currentSeason?.winner?.name?.let {
                        Text(
                                text = it,
                                modifier = Modifier.weight(1f),
                                style = MaterialTheme.typography.customTextBody2,
                        )
                    }
                }
            }
        }
    }
}