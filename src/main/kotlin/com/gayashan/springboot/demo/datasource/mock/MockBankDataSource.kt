package com.gayashan.springboot.demo.datasource.mock

import com.gayashan.springboot.demo.datasource.BankDataSource
import com.gayashan.springboot.demo.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    val banks = listOf(
        Bank("1234", 1.1, 1),
        Bank("abcd", 0.0, 1),
        Bank("ab12", 1.1, 0)
    )

    override fun retrieveBanks(): Collection<Bank> = banks
    override fun retrieveBank(accountNumber: String): Bank {
        return banks.first {it.accountNumber == accountNumber}
    }
}