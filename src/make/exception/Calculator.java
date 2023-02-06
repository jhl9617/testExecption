package make.exception;

public class Calculator {
    public Calculator() {
    }

    public int divide(int a, int b) throws NotDivideZeroException {
        //나눌 수 b가 0이면 예외 발생시킴
        int result = 0;

        if(b == 0)
            throw new NotDivideZeroException("0 나누기 못 함");
        else
            result = a / b;
        return  result;
    }
}
