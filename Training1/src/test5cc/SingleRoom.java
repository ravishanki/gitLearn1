package test5cc;

public class SingleRoom extends Room {
	
	  	private Double cost;
	    private Integer length;
	    private Integer breadth;

	public Double getCost() {
		return cost;
	}


	public void setCost(Double cost) {
		this.cost = cost;
	}


	public Integer getLength() {
		return length;
	}


	public void setLength(Integer length) {
		this.length = length;
	}


	public Integer getBreadth() {
		return breadth;
	}


	public void setBreadth(Integer breadth) {
		this.breadth = breadth;
	}


	public SingleRoom(Double cost, Integer length, Integer breadth) {
		super(cost, length, breadth);
		this.cost = cost;
		this.length = length;
		this.breadth = breadth;
	}

	
	public Double calculateTotalCost(int noOfPersons, int noOfDays) {
		Double totalCost  = cost*noOfPersons*noOfDays;
		return totalCost;
	}

}
