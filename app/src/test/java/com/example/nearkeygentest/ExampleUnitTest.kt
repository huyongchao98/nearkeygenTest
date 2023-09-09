package com.example.nearkeygentest

import keygen.Hook
import keygen.Keygen
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class CustomeHook: Hook {
    override fun dealSuccessResult(p0: String?, p1: String?) {
        print(p0 + " " + p1)
    }
}

class ExampleUnitTest {
    @Test
    fun startClientAccountKeygen() {
        val customeHook = CustomeHook();
        Keygen.startClientAccountKeygen(
            "tstat232",
            "tcp://emqx:1883",
            customeHook
        )
    }
}