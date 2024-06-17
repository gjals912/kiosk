package com.example.kiosk2

fun main() {

    println("원하시는 메뉴를 선택하여 주세요")
    var num = readLine()!!.toInt()

    var bunsik = Bunsik()

    println("U picked ${bunsik.order(num)}")

}

class Bunsik {
    fun order(pick:Int): String {

        var one = menuOne()
//    var two = menuTwo()
//    var three = menuThree()
//    var four = menuFour()
//    var five = menuFive()
//    var six = menuSix()
        var result:String

        when(pick) {
            1-> result = (one.order(pick.toString()))
            2-> result = println("2번 메뉴").toString()
            3-> result = println("3번 메뉴").toString()
            4-> result = println("4번 메뉴").toString()
            5-> result = println("5번 메뉴").toString()//1~5 입력시 다음 코드를 출력 하도록 작성
            6-> result = println("처음으로 돌아가기").toString()//readLine 복귀
            0-> result = println("주문 취소").toString()//0 입력시 터미널 종료
            else-> result = println("처음으로 돌아가기").toString()
        }
        return result
    }
}

class menuOne {
    fun order(pick: String): String {

        var result: String = ("${pick}번 메뉴 상세 블라블라").toString()
        return result
    }
}