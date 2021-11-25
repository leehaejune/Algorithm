import java.util.*;

public class Main{
    static char[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        arr = new char[n][n];
        
        star(0, 0, n, false);
        
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {
            for(int j=0; j<n; j++){
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
    public static void star(int x, int y, int n, boolean blank){
        //공란
        if(blank) {
            for(int i=x; i<x+n; i++){
                for(int j=y; i<j+n; j++){
                    arr[i][j]=' ';
                }
            }
            return;
        }
        //별
        if(n==1) {
            arr[x][y] ='*';
            return;
        }
        int size = n / 3;
        int count = 0;
        for(int i=x; i<x+n; i+=size){
            for(int j=y; j<y+n; j+=size){
                count++;
                if(count ==5){
                    star(i, j, size, true);
                } else {
                    star(i, j, size, false);
                }
            }
        }
    }
}



//n = 3 9개중 8개별 1개 가운데 공란
//n = 9 9의제곱(81)중 9개 공란 = 72(8x8+ 8공란) + 9공란
//n = 27


// 배열 사용 행x 열y  n=3 arr[1][1] = 공백 
// 9칸으로 구분 한뒤 x,y좌표에 따라 공백 또는 재귀 호출반복하여 나눌 칸이 없을 때까지 반복
// Scanner만 사용시 출력 시간 초과 (n=27 729, 개행포함 756출력) + StringBuilder 사용.
