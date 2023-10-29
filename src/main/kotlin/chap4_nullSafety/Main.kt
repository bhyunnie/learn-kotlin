package chap4_nullSafety

fun main () {
    // val a : String = null; // FIXME : 에러 발생
    var b : String = "aabbcc";
    var c : String? = null;

    var a : String? = null;
    // println(a.length); // FIXME : 에러 발생
    println(a?.length); // js 와 같은 널 체크 기능

    val d : Int = if (a != null) a.length else 0
    println(d);

    // 엘비스 연산자
    val e = a?.length ?: 0 // 좌변이 null 인 경우 우변을 리턴
    println(e);
}