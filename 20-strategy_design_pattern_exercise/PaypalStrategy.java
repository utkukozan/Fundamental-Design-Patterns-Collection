public class PaypalStrategy implements PaymentStrategy{
    private String emailid,password;
    public PaypalStrategy(String emailid,String password){
        this.emailid = emailid;
        this.password = password;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with paypal");
    }
}
