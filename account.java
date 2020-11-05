package src;
import java.util.Date;
public class account {
	private int id=0;
	private double balance=0;
	private double annualInterestRate=0;
	private java.util.Date dateCreat;
	public account() {
		this.dateCreat = new Date();
	}
	public account(int id,double balance) {
		this.id=id;
		this.balance=balance;
		this.dateCreat= new Date();//初始化id,balance和开户日期
	}
	public int getid() {
		return id;//访问id
	}
	public void setid(int newid) {
		id=newid;//修改id
	}
	public double getbalance() {
		return balance;//访问balance
	}
	public void setbalance(double newbalance) {
		balance=newbalance;//修改balance
	}
	public double getannalinterestrate() {
		return annualInterestRate/100;//访问年利率
	}
	public void setannualInterestRate(double newannualInterestRate) {
		annualInterestRate=newannualInterestRate;//重设年利率
	}
	public String getdateCreat(){
		return dateCreat.toString();//访问开户日期
	}
	public double getMonthlyInterestrate() {
		return annualInterestRate/12/100;//访问月利率
	}
	public double getmonthlyinterest() {
		return balance*getMonthlyInterestrate();//月利率计算
	}
	public double withdraw(double x) {
	    if (x<=balance) {
	    	balance-=x;
	    }
	    else System.out.println("余额不足，无法提现");
		return balance;
		//提出金额x
	}
	
	public double deposit(double x) {
		balance+=x;
		return balance;//存入金额x
	}
	//构造用例来测试结果
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		account a=new account();
		a.setbalance(20000);
		a.setid(1122);
		a.setannualInterestRate(4.5);
		a.withdraw(2500);
		a.deposit(3000);
		System.out.println("账户余额为:"+a.getbalance());
		System.out.println("月利息为："+a.getmonthlyinterest());
		System.out.println("开户日期为:"+a.getdateCreat());

	}
}
