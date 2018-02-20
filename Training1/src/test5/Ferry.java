package test5;

public class Ferry extends WaterCarrier{
	private Integer maxLoad;
	WaterCarrier waterCarrier;

	public Ferry(){
		
	}
	
	public Ferry(String carrierName, String carrierCode, String iataCode, String carrierAddress, String carrierType,
			Integer maxLoad) {
		super(carrierName, carrierCode, iataCode, carrierAddress, carrierType);
		this.maxLoad = maxLoad;
	}

	public Integer getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(Integer maxLoad) {
		this.maxLoad = maxLoad;
	}

	
	public void  displayShipDetails() {
		
		String owner = returnOwner(this);

		System.out.format( "%-20s%-15s%-15s%-15s%-15s%-25s%s\n","Ferry",
				carrierName,carrierCode,iataCode,carrierAddress,maxLoad.toString()+" Kilograms",owner);
		
	}
}
