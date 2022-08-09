package com.nilendu.neueda.model;

/**
 * 
 */

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author nilendu
 *
 */

@Entity
@Table(name="stocks")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},allowGetters = true)
public class Stocks implements Serializable {
	
	//the id is auto generated
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private Date buyDate;
	
	private Date sellDate;

	private int quantity;

	private double totalPrice;
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public double getTotalPrice() {
		return this.totalPrice;
	}
	
	public Date getBuyDate() {
		return this.buyDate;
	}
	
	public Date getSellDate() {
		return this.sellDate;
	}
	
	public String getName() {
		return this.name;
	}
	

}