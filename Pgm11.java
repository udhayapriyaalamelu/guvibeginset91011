package guvi_set911;
import java.util.*;
public class Pgm11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int len=sc.nextInt();
int bre=sc.nextInt();
int hei=sc.nextInt();
int sur=0;
int vol=0;
vol=len*bre*hei;
sur=(2*(len*bre)+2*(len*hei)+2*(hei*bre));
System.out.println(sur+" "+vol);
	}

}
