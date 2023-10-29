package chap6_classAndProperty

import java.util.Date

// constructor 생략가능 class ExampleClass (val name: String) { }
// 생성자 멤버 매개변수에 후행 쉼표 ( 맨 마지막 속성 뒤 , ) 사용 가능 - Trailing Commas , Final Commas
class ExampleClass constructor(
    val name: String,
    val dateTime: Date,
    ) {
    // 커스텀 게터
    val custom : String get() = "커스텀";

    // 커스텀 게터2
    val custom2 : String get() {
        return "커스텀2"
    }

    // 커스텀 세터
    var customSet : String = ""
        set(value) {
          if (value == "olive") {
              // 필드 식별자를 쓰지 않고 바로 할당하면 스택오버플로우가 발생한다.
              // FIXME customSet = "young";
              field = "young";
          }
        };
}

// 내용 없이 클래스 선언 가능
class ExampleSkipContentClass
fun main () {
    val exampleClass = ExampleClass("name", Date());
    exampleClass.customSet = "olive";

    println("Hello")
    println(exampleClass.customSet);

}