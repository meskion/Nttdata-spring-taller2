package com.nttdata.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nttdata.spring.persistence.NttdataDDBB;
import com.nttdata.spring.persistence.NttdataOrder;
import com.nttdata.spring.persistence.NttdataProduct;

public abstract class NttdataOrdersManagementServiceAbstract implements NttdataOrdersManagementServiceI {
	
	@Autowired
	protected NttdataDDBB db;
	
	@Override
	public List<NttdataOrder> searchAll(){
		
		return db.getOrders();
	}
	@Override
	public abstract void addOrder(NttdataOrder order1, NttdataProduct... products);
	
}
