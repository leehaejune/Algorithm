import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double r =sc.nextDouble();
        
        sc.close();
        
        System.out.println(r * r * Math.PI);    // 유클리드 파이대신 값 3.14 ~~넣어두됨 다만 오차까지 써야함
        System.out.println(r * r * 2);          // 택시기하학
        
    }
}
