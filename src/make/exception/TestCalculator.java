package make.exception;

import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args) {
        //사용자 정의 예외 테스트
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("나눌 값 : ");
            int a = scanner.nextInt();

            System.out.print("나눌 수 : ");
            int b = scanner.nextInt();

            int result = calculator.divide(a, b);
            System.out.println(a + "  / " + b + " = " + result);
        } catch (NotDivideZeroException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
