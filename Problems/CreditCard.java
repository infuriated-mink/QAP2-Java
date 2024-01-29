package Task1;

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Constructor
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit); // Using copy constructor
        this.balance = new Money(0); // Initialize balance to zero
    }

    // Accessor method to get the balance
    public Money getBalance() {
        return new Money(balance); // Using copy constructor
    }

    // Accessor method to get the credit limit
    public Money getCreditLimit() {
        return new Money(creditLimit); // Using copy constructor
    }

    // Accessor method to get the owner's information
    public String getPersonals() {
        return owner.toString();
    }

    // Method to charge an amount to the credit card
    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount);
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    // Method to make a payment on the credit card
    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
