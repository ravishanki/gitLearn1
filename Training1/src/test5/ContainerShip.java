package test5;

    public class ContainerShip extends WaterCarrier{
	private Integer noOfContainers;
	

	public ContainerShip(){
		
	}
	
	public ContainerShip(String carrierName, String carrierCode, String iataCode, String carrierAddress,
			String carrierType, Integer noOfContainers) {
		super(carrierName, carrierCode, iataCode, carrierAddress, carrierType);
		this.noOfContainers = noOfContainers;
	}

	public Integer getNoOfContainers() {
		return noOfContainers;
	}

	public void setNoOfContainers(Integer noOfContainers) {
		this.noOfContainers = noOfContainers;
	}

	
	public void displayShipDetails() {
	
		String owner = WaterCarrier.returnOwner(this);

		System.out.format( "%-20s%-15s%-15s%-15s%-15s%-25s%s\n",this.carrierType,
				carrierName,carrierCode,iataCode,carrierAddress,noOfContainers.toString()+" Containers",owner);
		
	}
}
