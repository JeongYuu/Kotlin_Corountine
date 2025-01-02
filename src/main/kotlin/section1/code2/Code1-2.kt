package section1.code2

class ExampleThread : Thread(){
    override fun run() {
        println("[${Thread.currentThread().name}] 시작")
        Thread.sleep(2000L)
        println("[${Thread.currentThread().name}] 종료")
    }
}

fun main(){
    println("[${Thread.currentThread().name}] 시작")
    ExampleThread().start() //ExampleThread 생성자를 통해 스레드 생성, start로 스레드 시작
    Thread.sleep(1000L)
    println("[${Thread.currentThread().name}] 종료")
}