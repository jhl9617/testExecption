package test.exception;

import java.io.FileWriter;
import java.io.IOException;

public class TestException2 {
    public static void main(String[] args) throws IOException {
        //throws 사용 테스트
        new TestException2().methodA();
    }

    public void methodA() throws IOException {
        methodB();
    }

    public void methodB() throws IOException {
        methodC();
    }

    public void methodC() throws IOException {
        FileWriter fw = new FileWriter("sample2.txt");

    }


}
