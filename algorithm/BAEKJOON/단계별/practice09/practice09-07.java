import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        int min_x = Math.min(x, w-x); // x축 최소
        int min_y = Math.min(y, h-y); // y축 최소
        
        System.out.println(Math.min(min_x, min_y));
        
    }
}
