//package com.example.test
//import kotlinx.coroutines.*
//import kotlinx.coroutines.flow.*
//
//
//    fun getNumbersHotFlow(): MutableSharedFlow<Int> {
//        val sharedFlow = MutableSharedFlow<Int>(5)
//        runBlocking {
//            launch {
//                for (i in 1..5) {
//                    delay(1000)
//                    sharedFlow.emit(i)
//                }
//            }
//        }
//        return sharedFlow
//    }
//
//    suspend fun main() {
//        val numbersHotFlow = getNumbersHotFlow().asSharedFlow()
//
//        println("1st Collector:")
//        numbersHotFlow.collect { value ->
//            println(value)
//        }
//
//        delay(2500)
//
//        println("2nd Collector:")
//        numbersHotFlow.collect { value ->
//            println(value)
//        }
//    }