package com.gayashan.springboot.demo.datasource

import com.gayashan.springboot.demo.model.Bank

interface BankDataSource {

    fun getBanks(): Collection<Bank>
}