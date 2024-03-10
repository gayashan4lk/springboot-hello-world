package com.gayashan.springboot.demo.datasource.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MockBankDataSourceTest {

    private val mockDataSource = MockBankDataSource()

    @Test
    fun `should provide a not null collection of banks`() {
        // given

        // when
        val banks = mockDataSource.retrieveBanks()

        // then
        assertThat(banks).isNotNull()

    }

    @Test
    fun `should provide a collection of banks`() {
        // given

        // when
        val banks = mockDataSource.retrieveBanks()

        // then
        assertThat(banks.size).isGreaterThan(0)
    }

    @Test
    fun `should provide mock data`() {
        // given

        // when
        val banks = mockDataSource.retrieveBanks()

        // then
        assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
        assertThat(banks).anyMatch { it.trust != 0.0 }
        assertThat(banks).anyMatch { it.transactionFee != 0 }
    }
}