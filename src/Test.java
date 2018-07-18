import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println(Solution("1234"));
//        Test2 a= new Test2("1233");
//       Test2 b= new Test2(1,2);
//       Test2 c=new Test2(2,3,4);


    }

    public static boolean Solution(String s) {
        boolean answer = true;
        if (s.length() == 4 || s.length() == 6) {
            try {
                int a = Integer.parseInt(s);
            } catch (Exception e) {
                answer = false;
            }
        } else {
            answer=false;
        }
        return answer;
    }
}

//static 메모리에 등록
//valueOf 데이터형 변환 숫자를 문자로
//Integer.parselnt 문자를 숫자로 바꿀 때
//예외 처리 try{}Catch(Exception e){}