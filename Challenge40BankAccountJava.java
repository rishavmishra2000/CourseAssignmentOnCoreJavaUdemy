// Bank Account Challenge
class BankAccount{
	private String accountNo;
	private double balance;
	private String custName;
	private String email;
	private String mobNo;
	
	public void setAccountNo(String accountNo){
		this.accountNo = accountNo;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public void setCustName(String custName){
		this.custName = custName; 
	}
	
	public void setEmail(String email){
		this.email = email; 
	}
	
	public void setMobNumber(String mobNo){
		this.mobNo = mobNo;
	}
	
	public String getAccountNo(){
		return this.accountNo;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public String getCustName(){
		return this.custName; 
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public String getMobNumber(){
		return this.mobNo;
	}
	
	public void fundDeposit(double balance){
	    if(balance < 0){
	        System.out.println("******************AMOUNT DEPOSITED FAILED******************");
	        System.out.println("Deposited Amount Error");
	    } else {
		    System.out.println("******************AMOUNT DEPOSITED ALERT******************");
		    this.balance += balance;
		    System.out.println("Amount Deposited: " + balance);
		    System.out.println("Available Balance: " + getBalance());
	    }
	}
	
	public void fundWithdraw(double balance){
		if(balance > this.balance){
			System.out.println("******************LOW BALANCE ALERT******************");
			System.out.println("Dear " + this.getCustName() + ", \nYour Account having insufficient balance. Please refill your account.\n");
			System.out.println("Available Balance: " + getBalance());
			System.out.println("Amout to be withdrawal: " + balance + " (Transaction Failed)");
		} else {
			System.out.println("******************AMOUT WITHDRAWAL ALERT******************");
			this.balance -= balance;
			System.out.println("Amount Withdrawal: " + balance + " (Transaction Success)");
			System.out.println("Available Balance: " + getBalance());
			
			if(this.balance <= 2500){
			    System.out.println("Please refill you account with atleast Rs.2500 to avoid low balance charges and deactivaiton of account.");
			}
		}
	}
}

public class Bank{
	public static void main(String []args){
		BankAccount b = new BankAccount();
		b.setAccountNo("0000101083639127");
		b.setBalance(10000);
		b.setCustName("Rishav Kumar Mishra");
		b.setEmail("my-gmail@gmail.com");
		b.setMobNumber("8888888888");
		
		System.out.println("\n\nAccount No: " + b.getAccountNo());
		System.out.println("Name: " + b.getCustName());
		System.out.println("Balance: " + b.getBalance()); 
		System.out.println("Email: " + b.getEmail()); 
		System.out.println("Mobile No.: " + b.getMobNumber());
		
		System.out.println("\n");
		
		b.fundDeposit(-30000);
		
		System.out.println("\n");
		
		b.fundDeposit(30000);
		
		System.out.println("\n");
		
		b.fundWithdraw(5000);
		
		System.out.println("\n");
		
		b.fundWithdraw(60000);
	}
}