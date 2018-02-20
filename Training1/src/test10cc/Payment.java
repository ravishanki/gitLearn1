package test10cc;



import java.util.Date;

public class Payment {
    private Long id;
    private Double amount;
    private Date createdDate;
    private Date paymentDate;
    private Integer mode; //1 - Credit Card, 2 - Cheque
    private CreditCard card;
    private Cheque cheque;
    private String status; //SUCCESS or FAILED

    public Payment(Long id, Double amount,Date createdDate,Date paymentDate,Integer mode,CreditCard card,Cheque cheque,String status) {
        this.id = id;
        this.amount = amount;
        this.createdDate = createdDate;
        this.paymentDate = paymentDate;
        this.mode = mode;
        this.card = card;
        this.cheque = cheque;
        this.status = status;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public CreditCard getCard() {
        return card;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }

    public Cheque getCheque() {
        return cheque;
    }

    public void setCheque(Cheque cheque) {
        this.cheque = cheque;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}

