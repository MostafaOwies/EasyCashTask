package com.islam.easycashtask.presentation.compititons

import android.content.ContentValues
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.islam.easycashtask.model.competition.Competition

@Composable
fun CompetitionsScreen(
    onCompetitionClick: (Competition) -> Unit

) {

    val competitionViewModel = hiltViewModel<CompetitionViewModel>()
    competitionViewModel.onEvent(CompetitionEvent.LoadCompetitions)
    val state = competitionViewModel.state.collectAsState().value

    Log.d(ContentValues.TAG, "HomeScreen: ${state.workStatus}")


    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = MaterialTheme.colorScheme.surfaceColorAtElevation(5.dp),
    ) {

    }
}
