package exception.silsub1;

import java.util.Scanner;

public class TestSilsub {
    public static void main(String[] args) {
        try {
            new TestSilsub().silsub2();
        } catch (NumberRangeException e) {
            throw new RuntimeException(e);
        }
    }

    public void silsub1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력 :");
        String string = scanner.next();
        try {
            new CharacterProcess().countAlpha(string);
        } catch (CharCheckException e) {
            throw new RuntimeException(e);
        }
    }

    public void silsub2() throws NumberRangeException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a :");
        int a = scanner.nextInt();
        System.out.print("b :");
        int b = scanner.nextInt();

        System.out.println(new NumberProcess().checkDouble(a, b));
    }
}
