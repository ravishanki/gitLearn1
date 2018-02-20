package test6;

public class Commodity {
	
	private String commodityId;
	private Float totalWeight;
	private Integer quantity;
	public Commodity(String commodityId, Float totalWeight, Integer quantity) {
		super();
		this.commodityId = commodityId;
		this.totalWeight = totalWeight;
		this.quantity = quantity;
	}
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public Float getTotalWeight() {
		return totalWeight;
	}
	public void setTotalWeight(Float totalWeight) {
		this.totalWeight = totalWeight;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
