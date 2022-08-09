package com.dbs.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class data {
	
	@Id
	int customerID;
	String accountHolderName;
	int clearBalance;
	String transferType;
	String overDraft;
	
	public data() {
		super();
		// TODO Auto-generated constructor stub
	}

	public data(int customerID, String accountHolderName, int clearBalance, String transferType, String overDraft) {
		super();
		this.customerID = customerID;
		this.accountHolderName = accountHolderName;
		this.clearBalance = clearBalance;
		this.transferType = transferType;
		this.overDraft = overDraft;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getClearBalance() {
		return clearBalance;
	}

	public void setClearBalance(int clearBalance) {
		this.clearBalance = clearBalance;
	}

	public String getTransferType() {
		return transferType;
	}

	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}

	public String getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(String overDraft) {
		this.overDraft = overDraft;
	}
	
	
	
	
}
