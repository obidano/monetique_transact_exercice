package com.orange.orangetransact.business.models

import java.time.LocalDateTime


data class TransactionData(
    val id: String,
    val compte: String,
    val montant: Double,
    val date: LocalDateTime,
    val type: TransactionType
)
