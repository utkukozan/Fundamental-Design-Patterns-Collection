public abstract class Pizza {
    String desc = "Unknown";
    double price;
    
    public String getDesc() {
        return desc;
    }
    
    public abstract double getPrice();
}
