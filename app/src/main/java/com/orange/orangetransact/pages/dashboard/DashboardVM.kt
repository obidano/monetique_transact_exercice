package com.orange.orangetransact.pages.dashboard

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.orange.orangetransact.business.service.TransactionService
import kotlinx.coroutines.launch

class DashboardVM (val service: TransactionService): ViewModel() {

    val state = mutableStateOf(DashboardState())

    fun recupererSolde(){
        viewModelScope.launch {
            state.value= state.value.copy(isLoading = true)
            val solde = service.recupererSolde()
            state.value= state.value.copy(solde=solde,
                isLoading = false)
        }
    }

    fun recupererSavings(){
        viewModelScope.launch {
            state.value= state.value.copy(isLoading = true)
            val data = service.recupererSavings()
            state.value= state.value.copy(savings =data,
                isLoading = false)
        }
    }

    fun recupererTransactions(){
        viewModelScope.launch {
            state.value= state.value.copy(isLoading = true)
            val data = service.recupererTransaction()
            state.value= state.value.copy(transactions = data,
                isLoading = false)
        }
    }

    fun recupererIdentite(){
        viewModelScope.launch {
            state.value= state.value.copy(isLoading = true)
            val data = service.recupererIdentite()
            state.value= state.value.copy(userData = data,
                isLoading = false)
        }
    }
}