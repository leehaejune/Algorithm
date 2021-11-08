import java.util.*;
import java.math.*;

public class Main{

    public static void main(String[] args) {
            
        //숫자가 초과하기에 bigInteger 사용
            Scanner sc = new Scanner(System.in);
        
            BigInteger A = new BigInteger(sc.next());
            BigInteger B = new BigInteger(sc.next());
        
            A = A.add(B);
        
            System.out.println(A.toString());
    }
}
