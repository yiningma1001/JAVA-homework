package src;
import java.util.ArrayList;
public class ex11 {
	
	public static void main(String[] args) {
		ArrayList<Number>list=new ArrayList<>();//构造数组
		list.add(34);
		list.add(3);
		list.add(4.5);
		list.add(6.7);
		list.add(3.56);//将数组中存入数据
		sort(list);//执行sort方法
		System.out.print(list.toString());
		}
	
	public static void sort(ArrayList<Number> list) {//定义一个排序的方法
		for(int i=0;i<list.size()-1;i++) {//通过依次寻找最小值完成排序
			Number min=list.get(i);
			int minindex=i;//首先令访问第一个数为最小值，i为最小下标
			
			for (int j=i+1;j<list.size();j++) {
				if(min.doubleValue()>list.get(j).doubleValue()) {
					Number temp=min;
					min=list.get(j);
					list.set(i, list.get(j));
					list.set(j, temp);//在i中，依次访问i之后的数据，如果有比i小的就和i交换位置，确保i存储了i及之后的最小值。
				}
			}
	
		}
	}
		
	
		

	}

