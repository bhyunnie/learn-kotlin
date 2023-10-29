package chap5_exception

import java.lang.IllegalArgumentException

fun main () {
    try {
        throw Exception();
    } catch (e: Exception) {
        println(e);
    } finally {
        println("finally 실행 !");
    }

    val a = try {
        "1234".toInt();
    } catch(e: Exception) {
        println("예약 발견")
    }
    println(a);

    throw Exception("예약 발견");

    failFast("예약 발견");
}

fun failFast(message: String) {
    throw IllegalArgumentException(message);
}