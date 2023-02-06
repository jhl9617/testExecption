package make.exception;

//사용자가 만드는 예외 클래스(사용자 정의 예외 클래스)
//1. java.lang.Exception을 상속 받는다.
public class NotDivideZeroException extends Exception{
    public NotDivideZeroException(String message) {
        super(message);
    }
}
