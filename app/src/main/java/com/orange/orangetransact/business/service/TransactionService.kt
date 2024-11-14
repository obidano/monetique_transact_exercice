package com.orange.orangetransact.business.service

import com.orange.orangetransact.business.models.SavingsData
import com.orange.orangetransact.business.models.TransactionData
import com.orange.orangetransact.business.models.UserData

interface TransactionService {
    suspend fun recupererSolde(): Double
    suspend fun recupererSavings(): List<SavingsData>
    suspend fun recupererTransaction(): List<TransactionData>
    suspend fun recupererIdentite(): UserData
}