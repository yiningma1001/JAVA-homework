package src;
import java.util.Date;
public class ex9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a=10000;
		Date date=new Date(a);//新建一个日期
		System.out.println(a+":"+date.toString());//得到a的时间
		for(int i=1;i<8;i++) {
			a*=10;
			date.setTime(a);
			System.out.println(a+":"+date.toString());//依次得到i的10的n次方倍的时间
		}
	}
}
