import java.util.*;

public class Practice02 {
	public void practice02_1() {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();    
                    if(a > b)
                        System.out.print(">");
                    else if(a < b)
                        System.out.print("<");
                    else
                        System.out.print("==");
                }
	}
	public void practice02_2() {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                if( a >= 90)
                    System.out.print("A");
                else if( a >= 80)
                    System.out.print("B");
                else if( a >= 70)
                    System.out.print("C");
                else if( a >= 60)
                    System.out.print("D");
                else
                    System.out.print("F");
            }
	}
	public void practice02_3() {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                if(a%4 == 0){
                    if(a%400 != 0 && a%100 == 0)
                        System.out.print("0");
                    else
                        System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
	}
	public void practice02_4() {
                Scanner sc = new Scanner(System.in);
                int x = sc.nextInt();
                int y = sc.nextInt();
                if(x > 0){
                    if( y > 0){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("4");
                    }
                }
                else{
                    if( y > 0){
                        System.out.print("2");
                    }
                    else{
                        System.out.print("3");
                    }
                }
            }
	}
	public void practice02_5() {
                Scanner sc = new Scanner(System.in);
                int H = sc.nextInt();
                int M = sc.nextInt();
                if(M < 45){
                    H--;
                    M = ((60+M)-45);
                    if(H < 0){
                        H = 23;
                    }
                    System.out.print(H +" "+M);
                }
                else{
                    System.out.print(H +" "+(M-45));
                }
            }
	}
}