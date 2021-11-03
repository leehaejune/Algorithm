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
    public void practice08_2() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int count = 1;
        int range = 2;

        if (A == 1){
            System.out.print(1);
        }

        else {
            while(range <= A) {
                range = range + (6 * count);
                count++;
            }
            System.out.print(count);
        }

// 1 1+6 1+6+12 1+6+12+18 1+6+12+18+24
// 1 7 19 37 61
// 1 2 3  4  5 
    }
    public void practice08_3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a =1; // 대각선 개수
        int b =0; // 칸의 개수
        
        while(true) {
        if (n <= a+b) {
            if( a % 2 == 1) { // 홀수
                System.out.print((a - (n - b - 1)) + "/" + (n - b));
                break;
            }
            
            else { // 짝수
                System.out.print((n - b) + "/" + (a - (n - b - 1)));
                break;
            }
        } else {
            b +=a;
            a++;
        }    
      }
    }
    public void practice08_4(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
    
        int day = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0)
            day++;
    
        System.out.println(day);
}
    //시간초과되서 bufferedReader 사용
}
    //분자 자리 분모자리 확인
    //X값을 받음, (n)
    //짝수 1/2 > 2/1 
    //홀수 3/1 > 2/2 > 1/3 순서 룰 확인
}