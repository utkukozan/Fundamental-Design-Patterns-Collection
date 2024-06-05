public class CrispyCrust extends Pizza{

    public CrispyCrust(){
        desc = "Crispy Crust";
        price = 2.50;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
