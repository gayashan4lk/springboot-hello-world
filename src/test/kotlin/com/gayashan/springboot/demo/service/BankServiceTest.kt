package com.gayashan.springboot.demo.service

import com.gayashan.springboot.demo.datasource.BankDataSource
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BankServiceTest{
    private val dataSource : BankDataSource = mockk()
    private val bankService = BankService(dataSource)

    @Test
    fun `should call data source to retrieve banks`() {
        // give
        every { dataSource.retrieveBanks() } returns emptyList()

        // when
        val banks = bankService.getBanks()

        // then
        verify(exactly = 1) { dataSource.retrieveBanks() }
    }
}
