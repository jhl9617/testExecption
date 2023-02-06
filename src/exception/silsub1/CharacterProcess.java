package exception.silsub1;

import java.sql.Array;
import java.util.Scanner;

public class CharacterProcess {

    public CharacterProcess() {
    }

    public int countAlpha(String s) throws CharCheckException {
        int count =0;
        char[] chars = s.toCharArray();
        for(int i =0; i < chars.length; i++){
            if(chars[i] == ' '){
                throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
            }else{
                System.out.print(chars[i]);
                count++;
            }
        }
        return count;

    }
}
