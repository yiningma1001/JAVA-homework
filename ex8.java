package ex1;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		Scanner input=new Scanner(System.in);//引入输入函数
		double[][]arr=new double[4][4];//定义新数组
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=input.nextDouble();//用输入值给新数组赋值
			}
		}
        summajordiagnal(arr);//运行方法
	

}
	public static double summajordiagnal(double[][]array) {
		double sum=0;//定义一个变量为0
		for(int i=0;i<array.length;i++) {
			sum+=array[i][i];//将对角线上元素逐个加入求和变量中
		}
		System.out.println("sum of elements in the major diagonal is "+String.format("%.1f",sum));//输出主对角线的和并保留一位小数
		return sum;//返回求和的值
	}
}
