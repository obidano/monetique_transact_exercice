package com.orange.orangetransact.framework

import com.orange.orangetransact.business.models.SavingsData
import com.orange.orangetransact.business.models.TransactionData
import com.orange.orangetransact.business.models.TransactionType
import com.orange.orangetransact.business.models.UserData
import com.orange.orangetransact.business.service.TransactionService
import kotlinx.coroutines.delay
import java.time.LocalDateTime

class TransactionServiceTestImpl: TransactionService {
    override suspend fun recupererSolde(): Double {
        delay(1000)
        return 1000.0
    }

    override suspend fun recupererSavings(): List<SavingsData> {
        delay(1000)
        return listOf(
            SavingsData("Savings 1", 1000.0, 1500.0, 0.5f),
            SavingsData("Savings 2", 2000.0, 2100.0, 0.8f),
            SavingsData("Savings 3", 2500.0, 2600.0, 0.7f),
        )
    }

    override suspend fun recupererTransaction(): List<TransactionData> {
        delay(1000)
        return listOf(
            TransactionData("Transaction 1", "Uber Eats",
                1000.0,LocalDateTime.now(),   TransactionType.Retrait),
            TransactionData("Transaction 2", "Joe PMI",
                2000.0,LocalDateTime.now(),   TransactionType.Depot),
            TransactionData("Transaction 3", "Vanessa Machine Booléenne",
                5000.0,LocalDateTime.now(),   TransactionType.Depot),
        )
    }

    override suspend fun recupererIdentite(): UserData {
        delay(1000)
        return UserData("John Doe", "123456789@gmail.com")
    }
}