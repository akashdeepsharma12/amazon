package com.spring.amazon.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "product_id")
	private long productId;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "product_cost")
	private double productCost;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductCost() {
		return productCost;
	}

	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}

	public Product() {

	}

	public Product(long id, long productId, String productName, double productCost) {
		this.id = id;
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Long.valueOf(id), Double.valueOf(productCost), Long.valueOf(productId), productName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id && Double.doubleToLongBits(productCost) == Double.doubleToLongBits(other.productCost)
				&& productId == other.productId && Objects.equals(productName, other.productName);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productId=" + productId + ", productName=" + productName + ", productCost="
				+ productCost + "]";
	}
}