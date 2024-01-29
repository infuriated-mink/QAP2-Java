package Task1;

public class Money {
    private long dollars;
    private long cents;

    // Constructor to create Money from a double value
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = (long) ((amount - dollars) * 100);
    }

    // Copy constructor
    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    // Add method to add two Money objects
    public Money add(Money otherAmount) {
        long newCents = this.cents + otherAmount.cents;
        long newDollars = this.dollars + otherAmount.dollars + newCents / 100;
        newCents %= 100;
        return new Money(newDollars + newCents / 100.0);
    }

    // Subtract method to subtract two Money objects
    public Money subtract(Money otherAmount) {
        long totalCents1 = this.dollars * 100 + this.cents;
        long totalCents2 = otherAmount.dollars * 100 + otherAmount.cents;
        long diff = totalCents1 - totalCents2;
        return new Money(diff / 100.0);
    }

    // CompareTo method to compare two Money objects
    public int compareTo(Money otherObject) {
        long totalCents1 = this.dollars * 100 + this.cents;
        long totalCents2 = otherObject.dollars * 100 + otherObject.cents;
        return Long.compare(totalCents1, totalCents2);
    }

    // Equals method to check if two Money objects are equal
    public boolean equals(Money otherObject) {
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    // toString method to represent Money as a String
    @Override
    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents);
    }
}
