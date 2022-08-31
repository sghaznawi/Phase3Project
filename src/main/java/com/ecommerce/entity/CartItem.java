package com.ecommerce.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * This is NOT a Hibernate class or a table class. This is a POJO which is used internally within the app
 * @author oem
 *
 */
@Entity
@Table(name="cartitem")
public class CartItem { 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private	long	id;
	@Column(name="productId")
	private long productId;
	@Column(name="Name")
	private String name;
	@Column(name="Rate")
	private BigDecimal rate;
	@Column(name="Price")
	private BigDecimal price;
	@Column(name="Qty")
	private int qty;
	

	public long getProductId() {return this.productId; }  
	public String getName() { return this.name;} 
	public BigDecimal getPrice() { return this.price;} 
	public BigDecimal getRate() { return this.rate;} 
	public int getQty() { return this.qty;} 

	
	public void setProductId(long id) { this.productId= id;}
	public void setName(String value) { this.name = value;}
	public void setPrice(BigDecimal value) { this.price = value;}
	public void setRate(BigDecimal value) { this.rate = value;}
	public void setQty(int value) { this.qty = value;}
}
