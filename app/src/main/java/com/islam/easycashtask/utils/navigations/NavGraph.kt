package com.islam.easycashtask.utils.navigations

import android.content.ContentValues
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.assessmenttask.utils.Constants.COMPETITION_DETAILS_SCREEN
import com.example.assessmenttask.utils.Constants.COMPETITION_SCREEN
import com.islam.easycashtask.presentation.competitionDetails.CompetitionDetailsScreen
import com.islam.easycashtask.presentation.compititons.CompetitionsScreen

@Composable
fun NavGraph() {
    Log.d(ContentValues.TAG, "Nav Screen Log")


    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = COMPETITION_SCREEN) {

        composable(COMPETITION_SCREEN) {

            CompetitionsScreen(
                    onCompetitionClick = { competition ->
                       /* val id = competition.id

                        navController.navigate("$COMPETITION_DETAILS_SCREEN/$id")*/
                    }
            )
        }

        composable(
                route = "$COMPETITION_DETAILS_SCREEN/{id}",
                arguments = listOf(
                        navArgument(name = "id") {
                            type = NavType.IntType
                        }
                )
        ) { backStackEntry ->
            CompetitionDetailsScreen(backStackEntry.arguments!!.getInt("id"))
        }
    }
}