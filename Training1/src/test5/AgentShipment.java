package test5;

public class AgentShipment extends Shipment {
	
	 	private double referalFee;
	 	
	 	public AgentShipment(String name, String source, String destination, double price,double referalFee)
	 	{
			super(name, source, destination, price);
			this.referalFee = referalFee;
		}

	   
	    
	    public double getReferalFee() {
	        return referalFee;
	    }

	    public void setReferalFee(double referalFee) {
	        this.referalFee = referalFee;
	    }
	    
	    @Override
	    double calculateShipmentAmount()
	    {
	        return(price+referalFee);
	        
	    }
}
