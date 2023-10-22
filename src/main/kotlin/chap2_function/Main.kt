package chap2_function

fun main () {
    // 기본적인 선언 방식
    // fun 함수명 (인자) : 타입 { 내용 }
    fun funcStandard (arg: Int) : String {
        return ""
    }

    // 표현식 스타일
    fun expressionFunc (arg: Int, arg2: Int) : Int = arg + arg2;

    // 반환 타입 생략 및 표현식 방식
    fun skipTypeAndExpressionFunc (arg: Int) = arg;

    // FIXME 반환 타입 생략만 할 경우 컴파일 에러
    /*
    fun skipTypeFunc (arg: Int) {
        return arg;
    }
    */

    // 반환 타입만 생략할 경우 Unit(유닛) 이라는 타입을 반환한다.
    // U Int 아님
    // 자바의 void 와 유사하다.
    // 컴파일 에러 안난다.
    fun skipTypeFunc (arg: Int) {
        println("arg : $arg"); // JS의 백틱 형태 제공
    }

    // Default Parameter 제공
    fun defaultParameterFun (arg: String = "Default Value") {
        println(arg);
    }

    defaultParameterFun(); // Default Value
    defaultParameterFun("New Value") // New Value

    // Named Argument
    fun namedArgumentFun (key :String = "defaultKey", value: Int = 0) {

    }

    namedArgumentFun(value=28,key="age");
    namedArgumentFun("age",23);
    namedArgumentFun(key="age", 25)
    // FIXME 컴파일 에러
    // namedArgumentFun(value=25,"age");


}