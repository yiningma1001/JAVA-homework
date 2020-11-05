package src;

public class course implements Cloneable {//构建带有克隆接口的类
	private String courseName;
	private String[]students=new String[100];
	private int numberofstudents;
	
	public course(String courseName) {
		this.courseName=courseName;//构造函数
	}
	public void addstudent(String student) {
		students[numberofstudents]=student;
		numberofstudents++;//增加学生函数
	}
	public String[]getstudents(){
		return students;//访问学生函数
	}
    public int getnumberofstudents(){
    	return numberofstudents;//访问学生数量
    }
    public String gercoursName() {
    	return courseName;//访问课程名称
    }
    

    public Object clone() {//重写克隆接口
    	try {
    		course c=(course)super.clone();
    		c.students=(String[])(c.students.clone());//对学生数据域深度复制
    	    return c;
    	}
    	catch(CloneNotSupportedException ex) {//捕捉报错
    		return null;
    	}
    }
    //构造用例来测试
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		course course1=new course("datastructure");
    	course1.addstudent("peter");
    	course1.addstudent("john");//新建一个course并添加学生名字
    	course c=(course)course1.clone();//通过复制course1得到c
    	c.addstudent("yining");//改变c中student的值
    	System.out.println((c.getstudents()==course1.getstudents())?"浅层复制":"深层复制");//通过判断course1和c是否仍一致来测试是否完成了深度复制
    }
   
  
}
