import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException1 {

    public void testMethod1() {
        FileReader fr = null;

        //fr = new FileReader("sample.txt");
        //해당 생성자에 throws FileNotFoundExection 있음

        try {
            //예외(코드구문으로 해결할 수 있는 에러) 발생 가능성이 있는 구문이나 반드시 예외처리 해야 하는 구문은
            //모두 try {} 블럭 안에 작성 하면 됨
            fr = new FileReader("sample.txt");
            //해당 생성자에 throws FileNotFoundException 있음

            //파일로 부터 테이터 읽어와서 콘솔에 출력
            int data = -1;
            while((data = fr.read()) != -1) {
                System.out.print((char)data);
            }
            System.out.println();
            System.out.println("파일 읽기 완료!");


        }catch(FileNotFoundException e) {
            //예외(에러)가 발생했을 때의 처리내용 작성
            System.out.println("catch FileNotFoundException.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch(IOException e) {
            //read() 메소드에 대한 예외처리임
            e.printStackTrace();
        }catch (Exception e) {
            //제시된 예외가 아닌 에러가 발생 한 경우에 작동됨
            e.printStackTrace();
            //얘를 맨 위에 쓰면 모든 에러가 얘를 받아버림

        }finally {
            //예외가 발생 하든 안 하든 반드시 실행 할 구문을 작성
            System.out.println("finally");
            try {
                fr.close();
            }catch (IOException e) {
                e.printStackTrace();
            }

        }


    }

    public static void main(String[] args) {
        //예외처리 테스트
        TestException1 te = new TestException1();

        te.testMethod1();


    }
}
