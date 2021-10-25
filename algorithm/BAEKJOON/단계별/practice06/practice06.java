import java.util.*;

public class Practice06 {
	public void practice06_1() {
        long sum(int[] a) {
            long ans = 0; 
            for(int i=0; i< a.length; i++) {
                ans += a[i];
            }
            return ans;
        }
    }
	public void practice06_2() {
        int[] SelfNumber = new int[10001]; // 셀프넘버를 넣을 배열 선언
        
        for (int i=1; i<10001; i++){
            int n = d(i);
            if(n < 10001){
                SelfNumber[n]=1;
            }
        }
        for (int j=1; j<10001; j++){
            if (SelfNumber[j] == 0){
                System.out.println(j);
            }
        }
    public static int d(int num){
        int sum = num;
        
        while(num > 0){
            // 반복문을 통해 0이 될 때까지 검증
            sum = sum + (num % 10);
            // 1의 자리수를 더함.
            num = num / 10;
            // 10을 나눠서 1의 자리 수를 10의 자리수로 바꿈.
        }
        return sum;
    }
}    
	public void practice06_3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[] temp = new int[3];
        int count  = 0;
        for(int i=1; i<=n; i++){
            if(i < 100)
                count++;
            else {
                int a = i / 100;
                // 100의 자리
                int b = (i % 100) / 10;
                // 10의 자리
                int c = (i % 100) % 10;
                // 1의 자리
                if(a - b == b-c)
                    count++;
            }
        }
        
        System.out.println(count);
    }
}