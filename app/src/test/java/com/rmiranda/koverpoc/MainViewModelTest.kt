package com.rmiranda.koverpoc

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
class MainViewModelTest : TestCase() {

    private val viewModel = MainViewModel()

    @Test
    fun snackBarTextTest() {
        Assert.assertEquals("test", viewModel.snackBarText())
    }
}