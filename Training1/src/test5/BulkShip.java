package test5;

public class BulkShip extends WaterCarrier{
	private Integer noOfcargoes;
	public BulkShip(){
		
	}
	
	public BulkShip(String carrierName, String carrierCode, String iataCode, String carrierAddress, String carrierType,
			Integer noOfcargoes) {
		super(carrierName, carrierCode, iataCode, carrierAddress, carrierType);
		this.noOfcargoes = noOfcargoes;
	}

	public Integer getNoOfcargoes() {
		return noOfcargoes;
	}

	public void setNoOfcargoes(Integer noOfcargoes) {
		this.noOfcargoes = noOfcargoes;
	}

	
	public void displayShipDetails() {
		
		String owner = returnOwner(this);

		System.out.format( "%-20s%-15s%-15s%-15s%-15s%-25s%s\n","BulkShip",
				carrierName,carrierCode,iataCode,carrierAddress,noOfcargoes.toString()+" Cargoes",owner);
		
	}
}

