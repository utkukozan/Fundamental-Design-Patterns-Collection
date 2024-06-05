public class ThickCrust extends Pizza {

    public ThickCrust(){
        desc = "Thick Crust";
        price = 3.05;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
