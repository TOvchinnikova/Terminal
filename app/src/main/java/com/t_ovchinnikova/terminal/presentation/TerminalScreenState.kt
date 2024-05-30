package com.t_ovchinnikova.terminal.presentation

import com.t_ovchinnikova.terminal.data.Bar

sealed class TerminalScreenState {

    object Initial : TerminalScreenState()

    object Loading : TerminalScreenState()

    data class Content(val barList: List<Bar>, val timeFrame: TimeFrame) : TerminalScreenState()
}