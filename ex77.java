package ex1;

public class ex77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[]arr=new int[100];//定义一个长度为100的数组
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(10*Math.random());//随机产生数组内元素
		}
		int[]counts=new int[10];//定义一个用于判断每个数个数的数组
        for(int j=0;j<counts.length;j++) {
        	 int count=0;//定义累和变量
        	for(int k=0;k<arr.length;k++) {
    		 if(arr[k]==j) {
    			 count++;//在数组里判断如果相等则累和加一
    		 }
        	}
        	counts[j]=count;//将每个数的累和放入数组中并打印
            System.out.print(counts[j]+" ");
        }
        
	}
  
    	
    	 
}

