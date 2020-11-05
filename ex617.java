package ex1;

import java.util.Scanner;

public class ex614 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter n：");
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();//得到输入值
		printmatrix(x);//调用方法
		input.close();
	}
	public static void printmatrix(int num) {
		int[][]matrix=new int[num][num];//定义一个行列长都为num的矩阵
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				matrix[i][j]=(int)(10*Math.random())%2;//随机产生0或1对矩阵中元素赋值
			}
		}
				for(int i=0;i<matrix.length;i++) {
					for(int j=0;j<matrix[i].length;j++) {		
				System.out.print(matrix[i][j]+" ");	
			}
			System.out.println();		//打印矩阵
			
		}
	
		

	}

}
