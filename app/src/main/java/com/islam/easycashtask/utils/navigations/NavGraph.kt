package com.islam.easycashtask.utils.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.assessmenttask.utils.Constants.COMPETITION_DETAILS_SCREEN
import com.islam.easycashtask.presentation.compititons.CompetitionViewModel
import com.islam.easycashtask.presentation.compititons.CompetitionsScreen

@Composable
fun NavGraph(
    navController: NavHostController,
    competitionViewModel: CompetitionViewModel,
) {
    


    CompetitionsScreen(onEvent = { event ->
        competitionViewModel.onEvent(event)
    },
        onCompetitionClick = { navController.navigate(COMPETITION_DETAILS_SCREEN) }
    )
}