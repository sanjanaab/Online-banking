package com.example.bankapp.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Accounts {
	
	@Id
	@GeneratedValue
	@Column(name="Account_no")
	private int accountNo;
	
	@Column(nullable=false)
	private String accountType;
	
	@Column(nullable=false)
	private int balance;
	
	@Column(nullable=false)
	private String branch;
	
	@Column(nullable=false)
	private String ifsc;
	
	@Column(nullable=false)
	private boolean isdisabled;
	
	@Column(nullable=false)
	private LocalDateTime openeingDate;
	
	@ManyToOne
	@JoinColumn(name="User_id")
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public boolean isIsdisabled() {
		return isdisabled;
	}

	public void setIsdisabled(boolean isdisabled) {
		this.isdisabled = isdisabled;
	}

	public LocalDateTime getOpeneingDate() {
		return openeingDate;
	}

	public void setOpeneingDate(LocalDateTime openeingDate) {
		this.openeingDate = openeingDate;
	}
	
	
	

}
