import java.util.Scanner;

public class Main {
    
    public static boolean[] prime = new boolean[10001];
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        get_prime();
        
        int T = sc.nextInt();
        
        while(T-- > 0) {
            int n = sc.nextInt();
            int a = n / 2;
            int b = n / 2;
            
            while(true) {
                //둘다 아닌(소수) 경우
                if(!prime[a] && !prime[b]) {
                    System.out.println(a + " " + b);
                    break;
                }
                a--;
                b++;
            }
        }
    }
    public static void get_prime() {
        prime[0]=prime[1] = true;
        
        for(int i = 2; i <= Math.sqrt(prime.length); i++){
            if(prime[i])
                continue;
            for(int j = i * i; j < prime.length; j += i){
                prime[j] = true;
            }
        }
    }
}