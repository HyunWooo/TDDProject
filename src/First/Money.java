package First;

public class Money {
	protected static int amount;
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount;
	}
	
}
