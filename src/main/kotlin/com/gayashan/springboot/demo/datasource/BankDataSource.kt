package com.gayashan.springboot.demo.datasource

import com.gayashan.springboot.demo.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>

    fun retrieveBank(accountNumber: String):Bank
}