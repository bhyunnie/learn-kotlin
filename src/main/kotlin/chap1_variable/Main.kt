package chap1_variable

// Top Level
// 클래스나 함수에 속하지 않는다.
var h = 5;

fun main() {
    val a: Int = 1;
    val b = 1;

    // 지연 할당
    val c : Int;
    c = 3;

    // 지연 할당 시 반드시 타입을 명시 해줘야 한다.
    val d : Int;
    d = 123;

    // val ( val ) : 상수
    // var ( variable ) : 가변 변수
    val e : String = "Hello";
    // e = "world"; // FIXME : 컴파일 에러

    // var 는 값 변경이 가능하다.
    var f : String = "Hello";
    f = "world"

    // FIXME : 타입 변경은 불가능
    var g = "String"
    // g = 123; // FIXME : 컴파일 에러

    // Top Level 값을 변경 할 수 있다.
    h += 1;
    println(h) // Print 6
}
