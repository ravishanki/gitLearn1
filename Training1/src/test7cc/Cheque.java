package test7cc;

import java.util.Date;

public class Cheque {
	private  String bankName;
	private String chequeNumber;
	private Date chequeDate;
	public Cheque(String bankName, String chequeNumber, Date chequeDate) {
		super();
		this.bankName = bankName;
		this.chequeNumber = chequeNumber;
		this.chequeDate = chequeDate;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getChequeNumber() {
		return chequeNumber;
	}
	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
	public Date getChequeDate() {
		return chequeDate;
	}
	public void setChequeDate(Date chequeDate) {
		this.chequeDate = chequeDate;
	}
	
}
