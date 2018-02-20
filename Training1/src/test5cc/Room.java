package test5cc;

public abstract class Room {
    
    private static Double cost;
    private Integer length;
    private Integer breadth;

    public Room(Double cost, Integer length, Integer breadth) {
        this.cost = cost;
        this.length = length;
        this.breadth = breadth;
    }

    public  Double getCost() {
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
     
    
    public abstract Double calculateTotalCost(int noOfPersons, int noOfDays);
    
    public Integer calculateArea(){
    	Integer area  = length*breadth;
    	return area;
    }
}

