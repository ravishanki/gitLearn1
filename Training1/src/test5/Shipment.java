package test5;

public class Shipment {
	protected String name;
    protected String source;
    protected String destination;
    protected double price;

    public Shipment(String name, String source, String destination, double price) {
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    double calculateShipmentAmount()
    {
        return Double.NaN;
    }
}
