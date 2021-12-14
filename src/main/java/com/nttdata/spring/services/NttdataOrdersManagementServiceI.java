package com.nttdata.spring.services;

import java.util.List;

import com.nttdata.spring.persistence.NttdataOrder;
import com.nttdata.spring.persistence.NttdataProduct;

public interface NttdataOrdersManagementServiceI {

	void addOrder(NttdataOrder order, NttdataProduct... products);
	
	List<NttdataOrder> searchAll();

}
