package com.sg.base

import com.sg.base.view.LoginActivityTest

import org.junit.runner.RunWith

import org.junit.runners.Suite

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(Suite::class)
@Suite.SuiteClasses(
    LoginActivityTest::class
)
class InstrumentedTestSuite