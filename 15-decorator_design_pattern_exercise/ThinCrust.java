public class ThinCrust extends Pizza{

    public ThinCrust(){
        desc = "Thin Crust";
        price = 2.05;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
