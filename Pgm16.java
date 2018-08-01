package guvi_set911;
import java.util.*;
public class Pgm16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int d=sc.nextInt();
int sum=0;
for(int i=0;i<3;i++)
	sum=sum+a;
    a=a+d;
    System.out.println(sum);
	}

}
