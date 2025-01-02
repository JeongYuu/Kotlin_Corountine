package section2.code1

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//runBlocking 함수는 이 함수를 호출한 스레드를 사용해 실행되는 코루틴을 만들어냄
fun main() = runBlocking<Unit>{
    println("[${Thread.currentThread().name}] runBlocking 코루틴 실행")

    launch {
        println("[${Thread.currentThread().name}] launch 코루틴 실행")
    }
}
