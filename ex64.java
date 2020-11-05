package ex1;
import java.util.Scanner;
public class chap6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个数字");
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();//读取输入数字
		reverse (x);//调用方法
		input.close();
	}
		
		public static void reverse(int number) {
			String str="";//定义一个空字符串
			while(number!=0) {//在number非零的条件下
				str+=number%10;//从最后一位数开始通过取余放入字符串中
				number=number/10;
			}
            System.out.println("the reverse is:"+str);//打印反转后的数字
	}

}
