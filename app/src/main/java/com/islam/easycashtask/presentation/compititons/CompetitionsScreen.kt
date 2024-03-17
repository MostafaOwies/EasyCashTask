package com.islam.easycashtask.presentation.compititons

import android.content.ContentValues
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun CompetitionsScreen() {

    val competitionViewModel = hiltViewModel<CompetitionViewModel>()
    competitionViewModel.onEvent(CompetitionEvent.LoadCompetitions)
    val state = competitionViewModel.state.collectAsState().value

    Log.d(ContentValues.TAG, "HomeScreen: ${state.details}")
}
