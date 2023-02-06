package exception.silsub1;

public class NumberProcess {
    public boolean checkDouble(int a, int b) throws NumberRangeException {
        if(a > 100 || a < 1 || b > 100 || b < 1)
            throw new NumberRangeException("1부터 100사이의 값이 아닙니다.");
        boolean result = false;
        if(b % a != 0){
            result = true;
        }
        return result;
    }

}
