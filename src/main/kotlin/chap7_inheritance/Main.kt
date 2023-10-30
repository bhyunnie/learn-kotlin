package chap7_inheritance

// 자바에서 final class 는 상속을 금지 시킨다.
// 코틀린은 기본적으로 모든 클래스가 파이널 클래스이다.
// open 키워드를 사용해서 상속을 허용 할 수 있다.
open class Dog {
    open var age: Int = 0;

    open fun bark () {
        println("mung mung")
    }
}

open class BullDog(final override var age: Int = 0): Dog() {
    override fun bark() {
        println("bull bull")
    }
}

class ChildBullDog(): BullDog() {
    // FIXME 컴파일 에러가 난다 override var age: Int = 1
    override fun bark() {
        super.bark();
    }
}

// 추상 클래스
abstract class Developer() {
    // abstract 를 다 써야된다
    abstract val position: String;
    abstract fun coding(language: String);
}

class BackendDeveloper (): Developer() {
    override val position: String = "Backend";
    override fun coding(language: String) {
        println(language);
    }
}

fun main () {
    val dog = BullDog(age = 2);
    println(dog.age);
    dog.bark();
}
