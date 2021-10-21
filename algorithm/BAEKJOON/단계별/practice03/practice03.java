import java.util.*;

public class Practice03 {
	public void practice03_1() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        for(int i=1; i<10; i++){
            System.out.println(x + " * " + i + " = " + (x * i));
        }
    }
	}
	public void practice03_2() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        
        for(int i=0; i< x; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a + b;
        }
        sc.close();
        
        for(int j : arr){
            System.out.println(j);
        }
    }
	}
	public void practice03_3() {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.close();
            
            System.out.print(((1+n)*n)/2);
	}
	public void practice03_4() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(br.readLine());
        
        StringTokenizer str;
        
        for (int i=0; i<a; i++) {
            str = new StringTokenizer(br.readLine(), " ");
            
            int A = Integer.parseInt(str.nextToken());
            int B = Integer.parseInt(str.nextToken());
            
            bw.write(A+B +"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
	}
	public void practice03_5() {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
           
            
            for(int i = 1; i <= x; ++i) {
                System.out.println(i);
            }
             sc.close();
}
	public void practice03_6() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
       
        
        for(int i = x; i > 0; --i) {
            System.out.println(i);
        }
         sc.close();
    }
}
	public void practice03_7() {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        
        for(int i=0; i<X; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
                System.out.println("Case #"+(i+1)+": "+(A+B));
        }
        sc.close();
    }
}
	public void practice03_8() {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        for(int i=1; i<= x; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println("Case #"+ i + ": "+ A + " + " + B + " = " +(A+B));
        }
        sc.close();
    }
}
	public void practice03_9() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
            
        for(int i=1; i<=x; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
        System.out.println();
        }
      }
}
	public void practice03_10() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        
        for(int i=1; i<=x; i++){
            for(int j=1; j<=x-i; j++){
                System.out.print(" ");
                }
            for(int k=0; k<i; k++){
                System.out.print("*");
                }
            System.out.println();
            }
    }
}
	public void practice03_10() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int arr[] = new int[N];
        
        for(int i=0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        sc.close();
        
        for(int i=0; i < N; i++){
            if(arr[i] < X){
                System.out.print(arr[i] + " ");
            }
        }
    }
}