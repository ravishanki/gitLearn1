package test8cc;

public class Commodity {
	
	private Long commodityId;
	private Double weight;
	private Integer quantity;
	private Boolean hazardous;
	private Long containerId;
	public Commodity(Long commodityId, Double weight, Integer quantity, Boolean hazardous, Long containerId) {
		super();
		this.commodityId = commodityId;
		this.weight = weight;
		this.quantity = quantity;
		this.hazardous = hazardous;
		this.containerId = containerId;
	}
	public Long getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(Long commodityId) {
		this.commodityId = commodityId;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Boolean getHazardous() {
		return hazardous;
	}
	public void setHazardous(Boolean hazardous) {
		this.hazardous = hazardous;
	}
	public Long getContainerId() {
		return containerId;
	}
	public void setContainerId(Long containerId) {
		this.containerId = containerId;
	}
 
}
