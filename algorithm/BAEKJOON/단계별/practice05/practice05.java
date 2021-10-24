import java.util.*;

public class Practice03 {
	public void practice05_1() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[x];
       
        for (int i=0; i<x; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        System.out.print(arr[0] + " " +arr[x - 1]);
    }
	public void practice05_2() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0;
        int cnt =0;
        
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max) {
                max = arr[i];
                cnt = i+1;
            }
        }
        System.out.println(max);
        System.out.println(cnt);
    }
	public void practice05_3() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
        
        int[] counts = new int[10];
        int number = A * B * C;
        while (number > 0){
            counts[number % 10]++;
            number /= 10;
        }
        for (int i=0; i< counts.length; i++) {
            System.out.println(counts[i]);
        }
    }
    public void practice05_4() {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int count =0;
        int counts[] = new int[42];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0; i<arr.length; i++){
            counts[arr[i]%42]++;
        }
        for(int i=0; i<counts.length; i++){
            if(counts[i] !=0) {
                count++;
            }
        }
        System.out.println(count);
    }
    public void practice05_5() {
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int total=0;
            int max=0;
            int score;
            for (int i=0; i < N; i++){
                score = sc.nextInt();
                total += score;
                if (score > max) {
                    max = score;
                }
            }
            sc.close();
            
            double avg = 0;
            avg = (100.0 * total / max / N);
            System.out.printf("%.2f", avg);
    }
    public void practice05_6() {
        Scanner sc = new Scanner(System.in);
        
        String arr[] = new String[sc.nextInt()];
        
        for(int i=0; i <arr.length; i++){
            arr[i] = sc.next();
        }
        sc.close();
        
        for(int i=0; i <arr.length; i++) {
            
            int count = 0;
            int sum = 0;
            
            for (int j=0; j<arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O'){
                    count++;
                }
                else{
                    count=0;
                }
                sum +=count;
            }
            System.out.println(sum);
        }
    }
    public void practice05_7() {
        Scanner sc = new Scanner(System.in);
        
        int C = sc.nextInt();
        int N = 0;
        double avg = 0;
        int arr[] = new int[1000];
        
        for (int i=0; i<C; i++){
            N = sc.nextInt();
            int total = 0;
            int count = 0;
            
            for (int j=0; j<N; j++){
                arr[j] = sc.nextInt();
                total += arr[j];
            }
            avg = (double)total / N;
            
            for(int j=0; j < N; j++){
                if(arr[j] > avg) {
                    count++;
                }
            }
            System.out.printf("%.3f", 100.0 * count / N);
            System.out.println("%");
        }
        sc.close();
}