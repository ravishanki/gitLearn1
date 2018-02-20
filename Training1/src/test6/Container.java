package test6;

import java.text.DecimalFormat;

public class Container {
	private String number;
	private Float containerWeight;
	private Commodity[] commoditie;
	public Container(String number, Float containerWeight, Commodity[] commoditie) {
		super();
		this.number = number;
		this.containerWeight = containerWeight;
		this.commoditie = commoditie;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Float getContainerWeight() {
		return containerWeight;
	}
	public void setContainerWeight(Float containerWeight) {
		this.containerWeight = containerWeight;
	}
	public Commodity[] getCommoditie() {
		return commoditie;
	}
	public void setCommoditie(Commodity[] commoditie) {
		this.commoditie = commoditie;
	}
	
	public void disaplyDetails(){
		DecimalFormat df = new DecimalFormat("#.#");
		for (int i=0;i<this.commoditie.length;i++){
		System.out.format("%-15s%-15s%s\n", commoditie[i].getCommodityId(),
				df.format(commoditie[i].getTotalWeight()).toString(),
				commoditie[i].getQuantity().toString());
	}
	}
	
}
