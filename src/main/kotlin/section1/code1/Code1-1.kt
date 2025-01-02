package section1.code1

fun main(){ //main 스레드
    println("[${Thread.currentThread().name}] 시작") //현재 스레드 이름 출력
    Thread.sleep(1000L) //1초 기다리기
    println("[${Thread.currentThread().name}] 종료")
}