package com.nttdata.spring.persistence;

public class NttdataProduct {

	private Long productId;
	private String productName;
	private Double pvpPrice, taxFreePrice;
	
	
	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPvpPrice() {
		return pvpPrice;
	}

	public void setPvpPrice(Double pvpPrice) {
		this.pvpPrice = pvpPrice;
	}

	public Double getTaxFreePrice() {
		return taxFreePrice;
	}

	public void setTaxFreePrice(Double taxFreePrice) {
		this.taxFreePrice = taxFreePrice;
	}

	@Override
	public String toString() {
		return "NttdataProduct [productId=" + productId + ", productName=" + productName + ", pvpPrice=" + pvpPrice
				+ ", taxFreePrice=" + taxFreePrice + "]";
	}
	
	
	
}
