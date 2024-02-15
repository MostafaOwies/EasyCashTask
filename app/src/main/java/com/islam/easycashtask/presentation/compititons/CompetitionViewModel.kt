package com.islam.easycashtask.presentation.compititons

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.islam.easycashtask.domain.usecases.GetCompetitions
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class CompetitionViewModel @Inject constructor(
    private val getCompetitions: GetCompetitions,
) : ViewModel() {

    private val _state = MutableStateFlow(CompetitionViewState())
    val state: StateFlow<CompetitionViewState> = _state.asStateFlow()

    fun onEvent(event: CompetitionEvent) {
        when (event) {
            is CompetitionEvent.LoadCompetitions -> loadCompetitions()
        }
    }

    private fun loadCompetitions() {
        viewModelScope.launch(Dispatchers.IO) {
            val response = getCompetitions()
            _state.update { oldState ->
                oldState.copy(
                    returnMessage = response,
                )
            }
        }
    }
}