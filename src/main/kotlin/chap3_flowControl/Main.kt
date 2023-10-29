package chap3_flowControl
fun main () {

    // 코틀린에서 IF ... ELSE 는 표현식이다.
    // 따라서 삼항 연산자가 존재하지 않는다.
    // 표현식 = 값 자체로 이용 가능하다.
    // var a : int = if ( 2 > 1 ) 2 else 1; const a = 2>1 ? 2 : 1;

    // if
    val age = 28;

    if (age > 26) {
        println("20대 후반");
    }

    // 삼항 연산자 대체
    val str : String = if (age in 27 .. 30) "20대 후반" else if (age in 24..26) "20대 중반" else if (age in 20..23) "20대 초반" else "20대 아님"
    println(str);

    // swtich case then ( java )
    // when -> ( kotlin )
    val code = 0;

    // else 는 생략 가능
    // 콤마로 여러 조건 사용 가능
    when (code) {
        1 -> "a";
        2 -> "b";
        3,4 -> "c";
        else -> "e.t.c."
    }

    // 삼항 연산자 대체
    val whenArrow = when (code) {1 -> "lala"/**/ 2 -> "" else -> ""}

    // 반복문
    for (code in 1 .. 3) {
        println(code);
    }

    for (code in 1 until 3) {
       println(code);
    }

    for (code in 0 .. 3 step 2) {
        println (code)
    }

    val codes = arrayOf(1,2,3);

    for (code in codes) {
        println(code);
    }

    // while 문
    var x = 5;

    while (x > 0) {
        println(x);
        x--;
    }
}