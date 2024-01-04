package com.islam.easycashtask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import com.islam.easycashtask.utils.ui.theme.EasyCashTaskTheme
import com.islam.easycashtask.presentation.compititons.CompetitionViewModel
import com.islam.easycashtask.utils.navigations.NavGraph
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EasyCashTaskTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    val competitionViewModel = hiltViewModel<CompetitionViewModel>()

                    NavGraph(
                        navController = navController,
                        competitionViewModel = competitionViewModel
                    )
                }
            }
        }
    }
}




