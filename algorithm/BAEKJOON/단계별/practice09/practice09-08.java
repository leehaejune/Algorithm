import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] a = {sc.nextInt(), sc.nextInt()};
        int[] b = {sc.nextInt(), sc.nextInt()};
        int[] c = {sc.nextInt(), sc.nextInt()};
        
        sc.close();
        
        int x;
        int y;
        
        // x 값 3개 중 겹치는 2개 제외 나머지 값 저장 
        if(a[0] == b[0]) {
            x = c[0];
        }
        else if(a[0] == c[0]){
            x = b[0];
        }
        else {
            x = a[0];
        }
        
        // y값 동일
        if(a[1] == b[1]) {
            y = c[1];
        }
        else if(a[1] == c[1]){
            y = b[1];
        }
        else {
            y = a[1];
        }
        
        System.out.println(x + " " + y);
    }
}
