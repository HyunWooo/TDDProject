package First;

public class Money {
	  protected int amount;
	  protected String currency;

	  Money(int amount, String currency) {
		  this.amount = amount;
		  this.currency = currency;
	  }
	  
	  static Dollar dollar(int amount) {
	    return new Dollar(amount, "USD");
	  }

	  static Franc franc(int amount) {
	    return new Franc(amount, "CHF");
	  }

	  public boolean equals(Object object) {
	    Money money = (Money) object;
	    return this.amount == money.amount
	            && currency().equals(money.currency());
	  }

	  public Money times(int multiplier) {
		  return new Money(amount * multiplier, currency);
	  }
	  
	  String currency() {
		  return currency;
	  }
	  
	  public String toString() {
		  return amount + " " + currency;
	  }
	}
