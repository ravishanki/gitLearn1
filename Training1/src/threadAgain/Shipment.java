package threadAgain;



import java.util.Date;

public class Shipment {

    private Long id;
    private String name;
    private Long bookingNumber;
    private String executedPlace;
    private Date executedDate;
    private Date departureDate;
    private Date arrivalDate;
    private Integer totalWeight;
    private Integer shipmentStatus;
    private Integer carrierId;

    public Shipment(Long id,String name,Long bookingNumber,String executedPlace,Date executedDate,Date departureDate,Date arrivalDate,Integer totalWeight,Integer shipmentStatus,Integer carrierId) {
        this.id = id;
        this.name = name;
        this.bookingNumber = bookingNumber;
        this.executedPlace = executedPlace;
        this.executedDate = executedDate;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.totalWeight = totalWeight;
        this.shipmentStatus = shipmentStatus;
        this.carrierId = carrierId;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(Long bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public String getExecutedPlace() {
        return executedPlace;
    }

    public void setExecutedPlace(String executedPlace) {
        this.executedPlace = executedPlace;
    }

    public Date getExecutedDate() {
        return executedDate;
    }

    public void setExecutedDate(Date executedDate) {
        this.executedDate = executedDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Integer getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Integer totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Integer getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(Integer shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

    public Integer getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(Integer carrierId) {
        this.carrierId = carrierId;
    }
    
    
}

