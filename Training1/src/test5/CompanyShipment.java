package test5;
import java.util.Scanner;
public class CompanyShipment extends Shipment {
	

	private Double luxuryTax;
    private Double corporateTax;
    public CompanyShipment(String name, String source, String destination, double price,Double luxuryTax,Double corporateTax) {
		super(name, source, destination, price);
		this.luxuryTax =luxuryTax;
		this.corporateTax = corporateTax;
	}
    public double getLuxuryTax() {
        return luxuryTax;
    }

    public void setLuxuryTax(double luxuryTax) {
        this.luxuryTax = luxuryTax;
    }

    public Double getCorporateTax() {
        return corporateTax;
    }

    public void setCorporateTax(double corporateTax) {
        this.corporateTax = corporateTax;
    }
    
    @Override
    double calculateShipmentAmount()
    {
       return(price +((price*luxuryTax)/100)+ ((price*corporateTax)/100));
    }
    
    public static void main(String[] args) throws Exception {
        String name,source,destination;
        double price;
        Double total;
        int choice;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the shipment name :");
        name = reader.nextLine();
        System.out.println("Enter the source :");
        source = reader.nextLine();
        System.out.println("Enter the destination :");
        destination = reader.nextLine();
        System.out.println("Enter the price :");
        price =Double.parseDouble(reader.nextLine());
        System.out.println("1. Agent\n2. Company\nEnter your choice :");
        choice = Integer.parseInt(reader.nextLine());
        Shipment shipment;
        
        if(choice == 1)
        {
            double referalFee;
            System.out.println("Enter the referal fee :");
            referalFee = Double.parseDouble(reader.nextLine());
            System.out.println("Agent details :");
			AgentShipment as = new AgentShipment(name, source, destination, price, referalFee);
			total = as.calculateShipmentAmount();
            System.out.format("%-15s %-15s %-15s %s\n","Name","Source","Destination","Total Amount");
            System.out.format("%-15s %-15s %-15s %s\n",name,source,
            		destination,total.toString() );
        }
        else if(choice == 2)
        {
            double luxuryTax,corporateTax;
            System.out.println("Enter the luxury tax and corporate tax:");
            luxuryTax = Double.parseDouble(reader.nextLine());
            corporateTax = Double.parseDouble(reader.nextLine());
            System.out.println("Company details :");
            CompanyShipment as = new CompanyShipment(name, source, destination, price, luxuryTax,corporateTax);
			total = as.calculateShipmentAmount();
            System.out.format("%-15s %-15s %-15s %s\n","Name","Source","Destination","Total Amount");
            System.out.format("%-15s %-15s %-15s%s\n",name,source,
            		destination,total.toString() );
        }
    }

}
