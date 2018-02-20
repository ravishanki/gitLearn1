package test10cc;




public class Item {

    private Long itemId;
    private String name;
    private String provider;
    private Double price;
    private Double rating;
    
    public Item(Long itemId,String name,String provider,Double price,Double rating) {
        this.itemId = itemId;
        this.name = name;
        this.provider = provider;
        this.price = price;
        this.rating = rating;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
    
    public String toString() {
        return this.getItemId() +"\t" + this.getProvider() + "\t" + this.getPrice()+"\t"+this.getRating();
    }
    
}

