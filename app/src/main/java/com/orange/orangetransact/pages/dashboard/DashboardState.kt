package com.orange.orangetransact.pages.dashboard

import com.orange.orangetransact.business.models.SavingsData
import com.orange.orangetransact.business.models.TransactionData
import com.orange.orangetransact.business.models.UserData

data class DashboardState(
    val userData: UserData? = null,
    val savings: List<SavingsData> = emptyList(),
    val transactions: List<TransactionData> = emptyList(),
    val solde: Double = 0.0,
    val isLoading: Boolean = false
    )
