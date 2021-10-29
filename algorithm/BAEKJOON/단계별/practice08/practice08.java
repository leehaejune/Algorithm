import java.util.*;

public class Practice08 {
	public void practice08_1() {
                Scanner sc = new Scanner(System.in);
                int A = sc.nextInt();
                // 고정 비용
                int B = sc.nextInt();
                // 1대 생산비용
                int C = sc.nextInt();
                // 노트북 판매 가격
                
                //(count * c ) > (a + (b * count)) 일떄 출력
                // (count * c)-(b * count)  = a
                // count *(c-b) = a
                // count = a/(c-b) 동일가격.
                // count +1 = (a/(c-b))+1 손익분기점
                
                // count 변수 선언해서 for문을 돌릴려고 했다가 if문으로 변수3개만 선언.
                if(C <= B) {
                    System.out.println("-1");
                }
                else{
                    System.out.println(((A/(C-B))+1));
                }
                
	}
}