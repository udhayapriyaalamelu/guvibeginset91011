package guvi_set911;
import java.util.*;
class Pgm20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int pro=1;
while(n!=0)
{
	pro*=n%10;
	n=n/10;
}
System.out.println(pro);
	}

}
