package guvi_set911;
import java.util.*;
public class Pgm7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int c=0;
for(int i=1;i<=n&&i<=m;i++)
{
	if(n%i==0&&m%i==0)
		c=i;
}
System.out.println(c);
	}

}
