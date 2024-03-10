package com.gayashan.springboot.demo.service

import com.gayashan.springboot.demo.datasource.BankDataSource
import com.gayashan.springboot.demo.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
}