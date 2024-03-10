package com.gayashan.springboot.demo.datasource.mock

import com.gayashan.springboot.demo.datasource.BankDataSource
import com.gayashan.springboot.demo.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    val banks = listOf(Bank("", 0.0, 1))

    override fun getBanks(): Collection<Bank> = banks
}