package guvi_set911;
import java.util.*;
public class Pgm14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();	
	}
System.out.println(arr[k-1]);
	}

}
