public class CreditCardStrategy implements PaymentStrategy{
    private String name,cardNumber,cvv,dateofExpiry;
    public CreditCardStrategy(String name,String cardNumber, String cvv, String dateofExpiry){
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateofExpiry = dateofExpiry;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card");
    }
}
