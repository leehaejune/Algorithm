import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.close();
        
        int sum = factorial(n);
        System.out.println(sum);
    }
    public static int factorial(int n){
        if(n <= 1) return 1; 
        return n * factorial(n - 1);
    }
}
//    n의 범위 0~12 int 가능 13을 넘어가면 13! = 6227020800이므로 long타입사용
//    재귀 함수 사용 , 반복문 X
//    재귀 : 자신을 정의할 때 자기 자신을 재 참조하는 방법.