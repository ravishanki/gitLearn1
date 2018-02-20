package test8cc;
import java.util.Date;
public class Payment {
	private Long id;
	private Double amount;
	private Date paymentDate;
	private String mode;
	private String status;
	public Payment(Long id, Double amount, Date paymentDate, String mode, String status) {
		super();
		this.id = id;
		this.amount = amount;
		this.paymentDate = paymentDate;
		this.mode = mode;
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
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
