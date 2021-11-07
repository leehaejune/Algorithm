import java.util.*;

public class Main{

    public static void main(String[] args) {
            // 봉지갯수     3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
            // 봉지갯수/5   0 0 1 1 1 1 1 2  2  2  2  2  3  3  3  3  3  4  4  4  4  4  5
            // 봉지갯수%5   3 4 0 1 2 3 4 0  1  2  3  4  0  1  2  3  4  0  1  2  3  4  0
            // 봉지갯수/3   1 0 0 2 0 0 3 0  0  4  0  0  5  0  0  6  0  0  7  0  0  8  0
            // 봉지갯수3+5  1 x 1 2 x 2 3 2  3  4  3  4  3  4  5  4  5  4  5  6  5  6  5
            Scanner sc = new Scanner(System.in);
        
            int N = sc.nextInt();
            
            if(N == 4 || N == 7) {
                System.out.println(-1);
            }
            else if(N % 5 == 0){
                System.out.println(N / 5);
            }
            else if(N % 5 == 1 || N % 5 == 3) {
                System.out.println((N / 5) + 1);
            }
            else if(N % 5 == 2 || N % 5 == 4) {
                System.out.println((N / 5) + 2);
            }
    }
}
