package test5;


 abstract class WaterCarrier {
	protected String carrierName;
	protected String carrierCode;
	protected String carrierType;
	protected String iataCode;
	protected String carrierAddress;
	
	public WaterCarrier(){
		
	}
	
	public WaterCarrier(String carrierName, String carrierCode, String iataCode, String carrierAddress,String carrierType) {
		super();
		this.carrierName = carrierName;
		this.carrierCode = carrierCode;
		this.iataCode = iataCode;
		this.carrierAddress = carrierAddress;
		this.carrierType = carrierType;
	}

	public String getCarrierType() {
		return carrierType;
	}

	public void setCarrierType(String carrierType) {
		this.carrierType = carrierType;
	}

	public String getCarrierAddress() {
		return carrierAddress;
	}

	public void setCarrierAddress(String carrierAddress) {
		this.carrierAddress = carrierAddress;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getCarrierCode() {
		return carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	public String getIataCode() {
		return iataCode;
	}

	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}
	
	abstract  void displayShipDetails();
	
	static WaterCarrier createShip(String carrierName, String carrierCode, String iataCode, String carrierAddress,String carrierType,Integer capacity){
		String type  = carrierType;
		 WaterCarrier wc = null;
		switch(type){
		case "BulkShip":
			wc = new BulkShip(carrierName, carrierCode, iataCode, carrierAddress, carrierType,capacity);
			break;
		case "ContainerShip":
			wc = new ContainerShip(carrierName, carrierCode, iataCode, carrierAddress, carrierType,capacity);
			break;
		case "Ferry":
			wc = new Ferry(carrierName, carrierCode, iataCode, carrierAddress, carrierType,capacity);
			break;
			default:
				wc = new Ferry(carrierName, carrierCode, iataCode, carrierAddress, carrierType,capacity);
				break;
		
		}
		return wc;
	}
	static String returnOwner(WaterCarrier waterCarrier){
		String type = waterCarrier.getCarrierType();
		if (type.equals("BulkShip") || type.equals("ContainerShip")){
			return "Company";
		}
		else{
			return "Agent";
		}
	}
}

