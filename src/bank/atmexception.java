package bank;

public class atmexception {

	public static void main(String[] args) {
		
		bankatm atm1 = new bankatm("br56789","Lloyds","Chelsea",82000.00); //object1
		bankatm atm2 = new bankatm("bf98403","Barclays","Lewisham",45000.00); //object2
		bankatm atm3 = new bankatm("bg86470","HSBC","Orpington",46000.00);//object3
		try {
			atm1.withdraw(45000.00);   // Amount to be withdrawn is greater than the balance using object1
			
		} catch (bankexception e) {
		
			e.printStackTrace(); //prints this throwable and its backtrace to the standard error stream
		}
		
	
		try {
			atm2.withdraw(30000.00); // withdrawing amount making Balance less 10000 limit using object 2
		} catch (bankexception e) {
		
			e.printStackTrace();//prints this throwable and its backtrace to the standard error stream
		}
		
		atm3.deposit(20000.00); //Depositing amount using object3
		

		try {
			atm3.withdraw(20000.00);  //Withdrawing amount lesser than balance using object3
		} catch (bankexception e) {
		
			e.printStackTrace();
		}
		
	}

}