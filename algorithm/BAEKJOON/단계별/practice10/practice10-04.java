import java.util.*;

public class Main{

    public static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        //Hanoi(n) = 2 * Hanoi(n-1) + 1
        //
        sb.append((int) (Math.pow(2, n) - 1)).append('\n');
        
        Hanoi(n,1,2,3);
        System.out.print(sb);
    }
    public static void Hanoi(int n, int start, int mid, int to){
        if(n == 1){
            sb.append(start + " " + to + "\n");
            return;
        }
        // 1. n-1개를 a에서 b로
        Hanoi(n - 1, start, to, mid);
        // 2. 1개를 a에서 c로
        sb.append(start + " "+ to +"\n");
        // 3. n-1개를 b에서 c로
        Hanoi(n - 1, mid, start, to);
    }
}