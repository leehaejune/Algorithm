import java.util.*;

public class Practice07 {
	public void practice07_4() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int R = sc.nextInt();
            String S = sc.next();
            // nextLine() or next() 구분. nextLine은 공백까지 읽음.
            // 문제 예시 입출력 확인.
            for(int j=0; j<S.length(); j++){
                for(int k=0; k<R; k++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
	public void practice07_5() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        String S = sc.next();
        
        for(int i=0; i<S.length(); i++){
            if('A' <= S.charAt(i) && S.charAt(i) <= 'Z'){
                arr[S.charAt(i) - 'A']++;
            }
            
            else{
                arr[S.charAt(i) - 'a']++;
            }
        }
        
        int N = 0;
        // 관행상 음수 표기, 예외가 발생하지 않으면 어떤 숫자로 선언해도 상관x
        char ch = '?';
        // 출력 같으면 '?' 출력 그외 '알파벳 대문자' 출력 
        for(int i=0; i<26; i++){
            if(arr[i] > N){
                N = arr[i];
                ch = (char) (i+65);
                //char 타입 변수에 int와 char을 연산하여 저장할 경우 반드시 캐스팅해야함.
            }
            else if (arr[i] == N){
                ch ='?';
            }
        }
        System.out.print(ch);
}    
	public void practice07_6() {
        Scanner sc = new Scanner(System.in);        
        String S = sc.nextLine();
        sc.close();
        
        StringTokenizer st = new StringTokenizer(S," ");
        
        System.out.println(st.countTokens());
    }
    public void practice07_7() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        
        A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
        B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
        
        System.out.print(A > B ? A : B);
    }
    public void practice07_8() {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int count = 0;
        int N = S.length();
        
        for(int i=0; i<N; i++){
            switch(S.charAt(i)){
                    
                case 'A' : case 'B': case 'C' :
                    count +=3;
                    break;
                //다이얼1 = 2초 ABC = 3초
                case 'D' : case 'E': case 'F' :
                    count +=4;
                    break;                    
                case 'G' : case 'H': case 'I' :
                    count +=5;
                    break;
                case 'J' : case 'K': case 'L' :
                    count +=6;
                    break;
                case 'M' : case 'N': case 'O' :
                    count +=7;
                    break;
                case 'P' : case 'Q': case 'R' : case 'S' :
                    count +=8;
                    break;
                case 'T' : case 'U': case 'V' :
                    count +=9;
                    break;
                case 'W' : case 'X': case 'Y' : case 'Z' :
                    count +=10;
                    break;                    
            }
        }
        System.out.print(count);
    }
    public void practice07_9() {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int count =0;
        
        for(int i=0; i< S.length(); i++) {
            char ch = S.charAt(i);
            
            if(ch == 'c'){    // ch = c
                if(i < S.length() - 1){
                    if(S.charAt(i + 1) == '=') { // ch 다음 '=' 이면
                        i++; // i++
                }
                else if(S.charAt(i + 1) == '-') {
                    i++;
                }
            }
        }
            else if(ch == 'd') {
		        if(i < S.length() - 1) {
			        if(S.charAt(i + 1) == 'z') {
				        if(i < S.length() - 2) {
					        if(S.charAt(i + 2) == '=') {	// dz= 
						        i += 2;
					}
				}
			}
			else if(S.charAt(i + 1) == '-') {	// d- 
				i++;
			}
		}
	}
	        else if(ch == 'l') {
		        if(i < S.length() - 1) {
			        if(S.charAt(i + 1) == 'j') {	// lj 
				        i++;
			}
		}
	}
	        else if(ch == 'n') {
		        if(i < S.length() - 1) {
			        if(S.charAt(i + 1) == 'j') {	// nj 
				        i++;
			}
		}
	}
	        else if(ch == 's') {
		        if(i < S.length() - 1) {
			        if(S.charAt(i + 1) == '=') {	// s=
				        i++;
			}
		}
    }
	        else if(ch == 'z') {
		        if(i < S.length() - 1) {
			        if(S.charAt(i + 1) == '=') {	// z= 
				        i++;
			}
		}
	}
	    count++;     
      }
        System.out.print(count);
    }
    public void practice07_10() {
        static Scanner sc = new Scanner(System.in);
        //둘다 사용하기위에 처음에 선언
        public static void main(String[] args) {
            int count = 0;
            int N = sc.nextInt();
            
            for(int i=0; i< N; i++){
                if (check() == true){
                    count++;
                }
            }
            System.out.println(count);
        }
        public static boolean check() {
            boolean[] check = new boolean[26];
            int prev = 0;
            String str = sc.next();
            
            for(int i = 0; i < str.length(); i++) {
                int now = str.charAt(i);	
                if (prev != now) {		
                    if ( check[now - 'a'] == false ) {
                        check[now - 'a'] = true;		
                        prev = now;					
                    }
                    else {
                        return false;	
                    }
                }
                else {
                    continue;
                }
            }    
            return true;
        }
    }
}