import java.util.*;

public class Practice07 {
	public void practice07_1() {
        Scanner sc = new Scanner(System.in);
        int ch = sc.next().charAt(0);
        // string으로 입력받음
        // string > char 문자열을 잘라 문자로 변환
        // 아스키 코드값 저장
        System.out.println(ch);
    }
	public void practice07_2() {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        String a = sc.next();
        sc.close();
        
        int sum=0;
       
        for(int i=0; i<n; i++){
            sum += a.charAt(i)-48;
        }
        System.out.print(sum);
}    
	public void practice07_3() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        for(int i=0; i<arr.length; i++){
            arr[i] = -1;
        }
        String S = sc.nextLine();
        
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            
            if(arr[ch - 'a'] == -1){
                arr[ch - 'a'] = i;
            }
        }
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}