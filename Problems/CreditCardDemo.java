package Task1;

public class CreditCardDemo {
    public static void main(String[] args) {
        Money limit = new Money(1000);
        Money firstAmount = new Money(200);
        Money secondAmount = new Money(10.02);
        Money thirdAmount = new Money(25);
        Money fourthAmount = new Money(990);
        Person owner = new Person("Christie", "Diane", new Address("237J Harvey Hall", "Menomonie", "WI", "54751"));
        CreditCard visa = new CreditCard(owner, limit);

        System.out.println(visa.getPersonals());
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit Limit: " + visa.getCreditLimit());
        System.out.println();

        System.out.println("Attempt to charge " + firstAmount);
        visa.charge(firstAmount);
        System.out.println("Balance: " + visa.getBalance());

        System.out.println("Attempt to charge " + secondAmount);
        visa.charge(secondAmount);
        System.out.println("Balance: " + visa.getBalance());

        System.out.println("Attempt to pay " + thirdAmount);
        visa.payment(thirdAmount);
        System.out.println("Balance: " + visa.getBalance());

        System.out.println("Attempt to charge " + fourthAmount);
        visa.charge(fourthAmount);
        System.out.println("Balance: " + visa.getBalance());
    }
}
