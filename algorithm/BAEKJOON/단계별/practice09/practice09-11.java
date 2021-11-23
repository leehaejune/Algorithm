import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while(T--> 0){
            
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();
            
            System.out.println(target(x1, y1, r1, x2, y2, r2));
        }
    }
    public static int target(int x1, int y1, int r1, int x2, int y2, int r2){
        int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // 중점간의 거리의 제곱값
        // case 1 : 중점이 같고, 반지름도 같다
        if(x1 == x2 && y1 == y2 && r1 == r2){
            return -1;
        }
        // case 2 : 두 원의 반지름의 합 < 중점간의 거리
        else if(distance_pow > Math.pow(r1 + r2, 2)){
            return 0;
        }
        // case 3 : 원 안에 원이 있으나 내접 x
        else if(distance_pow < Math.pow(r2 - r1, 2)){
            return 0;
        }
        // case 4 : 내접
        else if(distance_pow == Math.pow(r2 - r1, 2)){
            return 1;
        }
        // case 5 : 외접
        else if(distance_pow == Math.pow(r1 + r2, 2)){
            return 1;
        }
        else {
            return 2;
        }
    }
}
