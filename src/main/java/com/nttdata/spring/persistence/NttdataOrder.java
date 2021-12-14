package com.nttdata.spring.persistence;

import java.util.List;

public class NttdataOrder {
	
	private Long orderId;
	private String reciever, adress;
	private Boolean peninsular;
	private List<NttdataProduct> products;
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getReciever() {
		return reciever;
	}
	public void setReciever(String reciever) {
		this.reciever = reciever;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Boolean getPeninsular() {
		return peninsular;
	}
	public void setPeninsular(Boolean peninsular) {
		this.peninsular = peninsular;
	}
	public List<NttdataProduct> getProducts() {
		return products;
	}
	public void setProducts(List<NttdataProduct> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "NttdataOrder [orderId=" + orderId + ", reciever=" + reciever + ", adress=" + adress + ", peninsular="
				+ peninsular + ", products=" + products.stream().map(p-> p.toString()).reduce((a, p) -> a+ "\n" + p).get() + "]";
	}
	

	
}
