package study;

import java.util.Date;
import java.util.Scanner;
public class ATM原理简略实现{
	public static void main(String[] args) {
		ATM原理简略实现.setInterest(0.03);
		System.out.println("年利率:"+ATM原理简略实现.getInterest());
		String account;
		String name;
		String id;
		String address;
		double balance;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入账号:");
		account = input.next();
		System.out.println("请输入姓名:");
		name = input.next();
		System.out.println("输入身份证号:");
		id = input.next();
		System.out.println("请输入地址:");
		address = input.next();
		System.out.println("请输入金额:");
		balance = input.nextDouble();
		AccountCard wang = AccountCard(account,name,id,address,balance);
		int choice;
		double cash;
		do {
			wang.menu();
			Scanner input2 = new Scanner(System.in);
			choice = input2.nextInt();
			switch(choice) {
			case1:
				cash = input2.nextDouble();
				wang.desposit(cash);
				break;
			case2:
				cash = input2.nextDouble();
				wang.withdraw(cash);
				break;
			case3:
				cash = input2.nextDouble();
				wang.withdraw(cash);
				break;
			case4:
				wang.query();
				break;
			case5:
				System.out.println("谢谢您的使用!");
				System.exit(1);
			}
		}while(choice != 5);
	}

	
}

package study;

import java.util.Date;
public class AccountCard{
	private static double interest;
	private static account;
	private static name;
	private static id;
	private static address;
	private double DWAmount;
	private Date DWDate;
	private double balance;
	public AccountCard() {
		super();
		this.account = "11111111111";
		this.name = "土匪";
		this.id = "321123201006060012";
		this.address = "土匪窝";
		this.balance = 0;
	}
	public AccountCard(String account,String name, String id, String address,double balance) {
		super();
		this.account = account;
		this.name = name;
		this.id = id;
		this.address = address;
		this.balance = balance;
		
	}
	public static double getInterest() {
		getter();
		return interest;
	}
	public static void setInterest(double interest) {
		setter();
		AccountCard.interest = interest;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount (String account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public void deposit(double cash) {
		System.out.println("= = = = = = =存款= = = = = = =");
		System.out.println("您的卡号:"+this.account);
		System.out.println("您的姓名:"+this.name);
		System.out.println("原有余额:"+this.balance);
		System.out.println("现存入:"+cash);
		this.DWAmount = cash;
		balance = this.balance+cash;
		System.out.println("最终余额:"+this.balance);
		this.DWDate = new Date();
		System.out.println("存款日期:"+this.DWDate);
	}
	public void withdraw(double cash) {
		System.out.println("= = = = = = =取款= = = = = = =");
		System.out.println("您的卡号:"+this.account);
		System.out.println("您的姓名:"+this.name);
		System.out.println("原有余额:"+this.balance);
		System.out.println("现取出:"+cash);
		this.DWAmount = cash;
		if((this.balance - cash) > 0 ) {
			this.balance = this.balance - cash;
			System.out.println("最终余额:"+this.balance);
		}else {
			System.out.println("取出数额太大!请重新输入。");
		}
		this.DWDate = new Date();
		System.out.println("取款日期:"+this.DWDate);
	}
	public void query() {
		System.out.println("= = = = = = =查询= = = = = = =");
		System.out.println("您的卡号:"+this.account);
		System.out.println("您的姓名:"+this.name);
		System.out.println("最终余额有:"+this.balance);
		this.DWDate = new Date();
		System.out.println("查询日期:"+this.DWDate);
	}
	public void purchase(double payment) {
		System.out.println("= = = = = = =购物= = = = = = =");
		System.out.println("您的卡号:"+this.account);
		System.out.println("您的姓名:"+this.name);
		System.out.println("原有余额:"+this.balance);
		System.out.println("现付出:"+cash);
		this.DWAmount = payment;
		if((this.balance - cash) > 0 ) {
			this.balance = this.balance - cash;
			System.out.println("最终余额:"+this.balance);
		}else {
			System.out.println("没有足够的余额!");
		}
		this.DWDate = new Date();
		System.out.println("付款日期:"+this.DWDate);
	}
}

