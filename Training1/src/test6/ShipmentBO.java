package test6;

public class ShipmentBO {
	public Boolean ValidateShipment(String p1,String p2,Port[] ports) throws InvalidPortException  {
		
		if(p1.equalsIgnoreCase(p2)){
			
				throw  new InvalidPortException("The port name is invalid");	
			
		}
		else{	
			return true;
		}

	}
	
	public  void displayShipmentDetails(Shipment shipmentObj,Port[] ports,String p1,String p2){
		Port depPort = null,arriPort = null;
		for(int i=0;i<ports.length;i++){
			if(p1.equalsIgnoreCase(ports[i].getName())){
				arriPort = ports[i];
			}
		}
		for(int i=0;i<ports.length;i++){
			if(p2.equalsIgnoreCase(ports[i].getName())){
				depPort = ports[i];
			}
		}
		shipmentObj.setDepartureport(depPort);
		shipmentObj.setArrivalport(arriPort);
		System.out.format("%-15s%-15s%-15s%-15s\n", shipmentObj.getId(),shipmentObj.getName(),
				shipmentObj.getArrivalport().getName()+"/"+shipmentObj.getArrivalport().getCountry(),
				shipmentObj.getDepartureport().getName()+"/"+shipmentObj.getDepartureport().getCountry());
		
	}
	
	

}
