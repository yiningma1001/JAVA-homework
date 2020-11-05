package ex1;
import java.util.Scanner;
public class ex710 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 10 numbers: ");
		Scanner input=new Scanner(System.in);//读取输入的数字
		double[]arr=new double[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextDouble();//将数字放入数组中
		}
		indexofsmallestelements(arr);//执行方法
		input.close();
		
	}
	
    public static int indexofsmallestelements(double[] array) {
    	double imin=array[0];//假定最小值为数组第一个数
    	int indexofimin=0;//假定最小值的index为0
    	for(int i=0;i<array.length;i++) {
    		if (array[i]<imin) {
    			imin=array[i];
    		    indexofimin=i;//如果数组中元素小于最小值就将最小值更新为当前元素并将index更新为当前index
    		}
    	}
    	System.out.println("the index of the minimun number is "+indexofimin);//打印数组中的最小值的index
    	
    			return indexofimin;//返回最小值的index
    	}
    	
    }

