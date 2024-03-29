class ElectronicDevice{
    String brand;
    double price;
    public ElectronicDevice(String brand, double price){
        this.brand=brand;
        this.price=price;
    }
    public void displayInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("\nPrice:$ "+price);
    }
}
class smartphone extends ElectronicDevice{
    String model;
    String os;
    private final String imei;
    public smartphone(String brand, double price,String model, String os, String imei){
        super(brand, price);
        this.model=model;
        this.os=os;
        this.imei=imei;
    }

    public String getImei() {
        return imei;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Model: "+model);
        System.out.println("imei: "+imei);
        System.out.println("os: "+os);
    }
}
