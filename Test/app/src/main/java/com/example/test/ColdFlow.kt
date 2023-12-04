//import android.database.Observable
//import android.util.Log.d
//import kotlinx.coroutines.*
//import kotlinx.coroutines.flow.*
//
//fun getNumbersColdFlow() = flow {
//    for (i in 1..5) {
//        delay(1000)
//        emit(i)
//    }
//}
//
//fun main() = runBlocking {
//    val numbersColdFlow = getNumbersColdFlow()
//
//    println("1st Collector:")
//    numbersColdFlow.collect { value ->
//        println(value)
//    }
//
//    delay(2500)
//
//    println("2nd Collector:")
//    numbersColdFlow.collect { value ->
//        println(value)
//    }
//}



