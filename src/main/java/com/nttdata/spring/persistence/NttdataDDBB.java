package com.nttdata.spring.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class NttdataDDBB {
	
	private List<NttdataOrder> orders;
	
	public NttdataDDBB() {
		orders = new ArrayList<NttdataOrder>();
	}

	
	public void insert(NttdataOrder order) {
		orders.add(order);
	}


	public List<NttdataOrder> getOrders() {
		return orders;
	}
	
	
}
