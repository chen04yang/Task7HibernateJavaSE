package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fund")
public class Fund {
	private int fund_id;
	private String name;
	private String symbol;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fund_id")
	public int getFund_id() {
		return fund_id;
	}
	
	public void setFund_id(int fund_id) {
		this.fund_id = fund_id;
	}
	
	@Column(name = "name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "symbol")
	public String getSymbol() {
		return symbol;
	}
	
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
}
