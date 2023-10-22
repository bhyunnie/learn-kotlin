package chap2_function;

// 코틀린에서의 DefaultParameterFunc 를 구현한 것
// 상대적으로 매우 길다.
class DefaultParameter {
    public void defaultParameterFun(String message) {
        if (message == null || message.isEmpty()) {
            System.out.println("Default Message");
        }

        System.out.println(message);
    }

    public static void Main (String[] args) {
        new DefaultParameter().defaultParameterFun(null);
        new DefaultParameter().defaultParameterFun("New Message");
    }
}

