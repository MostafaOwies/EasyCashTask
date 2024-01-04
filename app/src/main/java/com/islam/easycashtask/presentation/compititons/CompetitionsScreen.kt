package com.islam.easycashtask.presentation.compititons

import android.content.ContentValues
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.islam.easycashtask.CompetitionCard

@Composable
fun CompetitionsScreen(
    onEvent: (CompetitionEvent) -> Unit,
    onCompetitionClick: () -> Unit

) {
    onEvent(CompetitionEvent.LoadCompetitions)

    val competitionViewModel = hiltViewModel<CompetitionViewModel>()
    val state = competitionViewModel.state.collectAsState().value

    Log.d(ContentValues.TAG, "HomeScreen: ${state.competitions}")

    LazyColumn(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.surface)
            .padding(all = 12.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {

        items(
            items = state.competitions,
            key = { it.id }
        ) {
            CompetitionCard(
                competition = it,
                onCompetitionClick = onCompetitionClick

            )
        }
    }
}