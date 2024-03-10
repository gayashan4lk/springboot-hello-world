package com.gayashan.springboot.demo.datasource.mock

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MockBankDataSourceTest {

    private val mockDataSource = MockBankDataSource()

    @Test
    fun `should provide a not null collection of banks`() {
        // given

        // when
        val banks = mockDataSource.getBanks()

        // then
        assertNotNull(banks)
    }

    @Test
    fun `should provide a collection of banks`() {
        // given

        // when
        val banks = mockDataSource.getBanks()

        // then
        assertTrue(banks.isNotEmpty())
    }
}