package bank;

public class bankatm {
private String atmID;
private String bankName;
private String location;
private double balance;
//Constructor to initialize properties
bankatm(String atmId,String bankName,String location,double balance){
	this.atmID=atmId;
	this.bankName=bankName;
	this.location=location;
	this.balance=balance;
	
}

public void withdraw(double amt) throws bankexception{  
	if(amt>this.balance)  //if the balance is less than the amount to be withdrawn throw exception
		throw new bankexception("Amount to be withdrawn is greater than balance");
	
	if(( this.balance-amt)<10000 || this.balance<10000 ) //If the balance is less than 10000 or the balabce after withdrawl will be less than 10000 thrown exception
		throw new bankexception("Minimum Balance should be 10000");
	
	this.balance = this.balance-amt;  //balance after withdrawl
	System.out.println("Withdrawl Balance is :" + this.balance);
	
}

public void deposit(double amt){ //method for depositing amount
	this.balance= this.balance+amt; 
	System.out.println("Balance after deposit is :"+ this.balance);
}

}
