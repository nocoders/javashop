package com.enation.app.shop.core.order.model;

import java.math.BigDecimal;
import java.util.Date;

public class Esacc implements java.io.Serializable  {
    // 资金的id
	private Integer bill_id;
	// 账单编号
	private String bill_code;
	//账单日期
	private Long  bill_date;
	// 部门
	private String  department;
   
	//账单摘要
	private String bill_remark;
	
	//收入金额
	private Double bill_in;
	//支出金额
	private Double bill_out;
	// 余额
	private Double bill_balance;
	// 科目，用途
	private String account;
	// 会员id
	private Integer member_id;
	
	
	public String getBill_code() {
		return bill_code;
	}
	public void setBill_code(String bill_code) {
		this.bill_code = bill_code;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getBill_remark() {
		return bill_remark;
	}
	public void setBill_remark(String bill_remark) {
		this.bill_remark = bill_remark;
	}
	
	public Double getBill_in() {
		return bill_in;
	}
	public void setBill_in(Double bill_in) {
		this.bill_in = bill_in;
	}
	public Double getBill_out() {
		return bill_out;
	}
	public void setBill_out(Double bill_out) {
		this.bill_out = bill_out;
	}
	public Double getBill_balance() {
		return bill_balance;
	}
	public void setBill_balance(Double bill_balance) {
		this.bill_balance = bill_balance;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public Integer getBill_id() {
		return bill_id;
	}
	public void setBill_id(Integer bill_id) {
		this.bill_id = bill_id;
	}
	public Long getBill_date() {
		return bill_date;
	}
	public void setBill_date(Long bill_date) {
		this.bill_date = bill_date;
	}
}
