package chap9_enum

enum class PaymentStatus (val label: String) {
    UNPAID("미지급"){
        override fun isPayable(): Boolean = false
    },
    PAID("지급완료") {
        override fun isPayable(): Boolean = true
    },
    FAILED("지급실패") {
        override fun isPayable(): Boolean = false
    },
    REFUND("환불") {
        override fun isPayable(): Boolean = false
    };
    abstract fun isPayable(): Boolean
}

interface Payable {
    fun isPayable() : Boolean;
}

fun main () {
//    if(PaymentStatus.PAID.isPayable()) {
//        println(PaymentStatus.PAID.label);
//    }
    val paymentStatus = PaymentStatus.valueOf("PAID");
    println(paymentStatus.label);

    if (paymentStatus == PaymentStatus.PAID) {
        println("결제 완료")
    }

    for (status in PaymentStatus.values()) {
        println("[${status}](${status.label}) : ${status.ordinal}")
    }
}

