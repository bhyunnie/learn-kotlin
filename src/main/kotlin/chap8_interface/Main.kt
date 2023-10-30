package chap8_interface

class Product(val name: String, val price: Int)

interface Wheel {
    fun roll ();
}
interface Cart: Wheel {
    var coin : Int

    val weight : Int
        get() = 20;
    fun add (product : Product)
    fun rent () {
        if (coin > 0) {
            println("카트 대여")
        }
    }

    fun printId() = println("1234")
}
interface Order {
    fun add (product: Product) {
        println(product);
    }

    fun printId() = println("1234")
}
// 인터페이스를 구현하는 것은 클래스를 상속 받는것과 다르게 괄호가 안들어간다.
class MyCart(override var coin: Int) : Cart, Order {
    override fun add (product: Product) {
        if (coin <= 0) println("코인을 넣어주세요")
        else println("${product.name}이(가) 카트에 추가 됐습니다.");

        // 동일한 함수가 있다면 인터페이스를 명시해준다.
        super<Order>.add(product);
    }

    override fun roll () {
        println("뒹구르르르르르");
    }

    // 중복되는 디폴트 함수가 존재 한다면 구현을 강제하게 된다.
    override fun printId() {
        println("강제")
        // 그냥 선택을 해도 되긴 한다
        super<Order>.printId();
    }

}



fun main () {
    val cart = MyCart(coin = 100)
    cart.rent();
    cart.add(Product(name = "장난감", price = 200))
}