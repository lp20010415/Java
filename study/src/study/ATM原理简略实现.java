package study;

import java.util.Date;
import java.util.Scanner;
public class ATMԭ�����ʵ��{
	public static void main(String[] args) {
		ATMԭ�����ʵ��.setInterest(0.03);
		System.out.println("������:"+ATMԭ�����ʵ��.getInterest());
		String account;
		String name;
		String id;
		String address;
		double balance;
		Scanner input = new Scanner(System.in);
		System.out.println("�������˺�:");
		account = input.next();
		System.out.println("����������:");
		name = input.next();
		System.out.println("�������֤��:");
		id = input.next();
		System.out.println("�������ַ:");
		address = input.next();
		System.out.println("��������:");
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
				System.out.println("лл����ʹ��!");
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
		this.name = "����";
		this.id = "321123201006060012";
		this.address = "������";
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
		System.out.println("= = = = = = =���= = = = = = =");
		System.out.println("���Ŀ���:"+this.account);
		System.out.println("��������:"+this.name);
		System.out.println("ԭ�����:"+this.balance);
		System.out.println("�ִ���:"+cash);
		this.DWAmount = cash;
		balance = this.balance+cash;
		System.out.println("�������:"+this.balance);
		this.DWDate = new Date();
		System.out.println("�������:"+this.DWDate);
	}
	public void withdraw(double cash) {
		System.out.println("= = = = = = =ȡ��= = = = = = =");
		System.out.println("���Ŀ���:"+this.account);
		System.out.println("��������:"+this.name);
		System.out.println("ԭ�����:"+this.balance);
		System.out.println("��ȡ��:"+cash);
		this.DWAmount = cash;
		if((this.balance - cash) > 0 ) {
			this.balance = this.balance - cash;
			System.out.println("�������:"+this.balance);
		}else {
			System.out.println("ȡ������̫��!���������롣");
		}
		this.DWDate = new Date();
		System.out.println("ȡ������:"+this.DWDate);
	}
	public void query() {
		System.out.println("= = = = = = =��ѯ= = = = = = =");
		System.out.println("���Ŀ���:"+this.account);
		System.out.println("��������:"+this.name);
		System.out.println("���������:"+this.balance);
		this.DWDate = new Date();
		System.out.println("��ѯ����:"+this.DWDate);
	}
	public void purchase(double payment) {
		System.out.println("= = = = = = =����= = = = = = =");
		System.out.println("���Ŀ���:"+this.account);
		System.out.println("��������:"+this.name);
		System.out.println("ԭ�����:"+this.balance);
		System.out.println("�ָ���:"+cash);
		this.DWAmount = payment;
		if((this.balance - cash) > 0 ) {
			this.balance = this.balance - cash;
			System.out.println("�������:"+this.balance);
		}else {
			System.out.println("û���㹻�����!");
		}
		this.DWDate = new Date();
		System.out.println("��������:"+this.DWDate);
	}
}

