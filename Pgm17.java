package guvi_set911;
import java.util.*;
public class Pgm17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int s=0;;
while(n!=0) {
	int t=n%10;
    s=s*10+t;
    n=n/10;
}
	System.out.println(s);
	}	
}
