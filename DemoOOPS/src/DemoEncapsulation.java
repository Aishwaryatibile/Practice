class Bank{
	private long acc_no;  
	private String name;  
	private float amount;
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}  
	
	
}
public class DemoEncapsulation {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.setAcc_no(123);
		bank.setName("Sunita Patil");
		bank.setAmount(95000);
		
		System.out.println("--------The account details are-------- ");
		System.out.println("Account number : "+bank.getAcc_no()+"\nName : "+bank.getName()+"\nAmount : "+bank.getAmount());
	}
	
	


}
