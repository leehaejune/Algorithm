import java.util.*;

public class Practice04 {
	public void practice04_1() {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            if(A == 0 && B ==0) {
                sc.close();
                break;
            }
            System.out.println(A+B);
        }
    }
	public void practice04_2() {
        Scanner sc = new Scanner(System.in);
    
        while(sc.hasNextInt()){
        
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
            }
        sc.close();
    }
	public void practice04_3() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        
        int cnt = 0;
        int num = N;
        
        while(true) {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            cnt++;
            
            if (num == N){
                break;
            }
        }
        System.out.println(cnt);
    }
	
}