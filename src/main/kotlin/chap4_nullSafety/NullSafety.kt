package chap4_nullSafety

fun getNullStr() : String? = null;

fun getLengthIfNotNull(str : String) = str?.length;

fun main () {
    val nullableStr = getNullStr();

    // val nullableStrLength = nullableStr.length; // FIXME : NPE
    val nullableStrLength = nullableStr?.length ?: 0;
    print(nullableStrLength);

    // 단언 연산자
    val c : String? = null;
    val d = c!!.length; // null이던 아니던 컴파일러가 null 체크를 안하고 넘어가는 거라 쓰면 안됨
}