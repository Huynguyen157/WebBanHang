package com.devpro.shop13.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_saleorder_products")
public class SaleorderProductEntity extends BaseEntity{
        
//	@Column(name="product_id",nullable=false)
//	private Integer product_id;
	@Column(name="quality",nullable=false)
	private Integer quality;
	
	 @ManyToOne(fetch= FetchType.EAGER)
	 @JoinColumn(name="saleorder_id")
	 private SaleOrderEntity saleorder;
	 
	 @ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "product_id")
		private ProductEntity productEntity;
		
public ProductEntity getProductEntity() {
		return productEntity;
	}
	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}
	//	public Integer getProduct_id() {
//		return product_id;
//	}
//	public void setProduct_id(Integer product_id) {
//		this.product_id = product_id;
//	}
	public Integer getQuality() {
		return quality;
	}
	public void setQuality(Integer quality) {
		this.quality = quality;
	}
	public SaleOrderEntity getSaleorder() {
		return saleorder;
	}
	public void setSaleorder(SaleOrderEntity saleorder) {
		this.saleorder = saleorder;
	}
	
}
