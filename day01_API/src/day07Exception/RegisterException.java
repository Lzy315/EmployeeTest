package day07Exception;
//登录异常类
public class RegisterException extends /*Exception*/ RuntimeException{
    public RegisterException() {
    }

    public RegisterException(String message) {
//        有参构造，交给父类处理异常
        super(message);
    }
}
