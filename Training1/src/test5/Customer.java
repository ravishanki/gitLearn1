package test5;

public class Customer extends ShipmentEntity {
	private Integer id;
    private String name;
    
    public Customer(String shipmentEntityName, String identificationNumber,Integer id,String name){
    	super(shipmentEntityName, identificationNumber);
    	this.id = id;
    	this.name = name;
    }

    public void setId(Integer id){
      this.id = id;
    }
    
    public Integer getId(){
    return id;
    }
    
    public void setName(String name){
      this.name = name;
    }
    
    public String getName(){
    return name;
    }
    @Override
    void display(){
    	System.out.format("%-15s %-25s %-15s %-15s\n",shipmentEntityName,identificationNumber,id,name);
    }

}
