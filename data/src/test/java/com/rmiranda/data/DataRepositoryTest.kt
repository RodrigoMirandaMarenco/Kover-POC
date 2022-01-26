package com.rmiranda.data

import junit.framework.TestCase
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Created by rodrigomiranda on 25/1/22.
 * Applaudo Studios
 */
@RunWith(JUnit4::class)
class DataRepositoryTest : TestCase() {

    private val dataRepository = DataRepository()

    @Test
    fun calculateValueTest() {
        Assert.assertEquals(50, dataRepository.calculateValue())
    }
}