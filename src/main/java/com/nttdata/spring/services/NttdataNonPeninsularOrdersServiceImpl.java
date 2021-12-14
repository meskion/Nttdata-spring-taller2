package com.nttdata.spring.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nttdata.spring.persistence.NttdataOrder;
import com.nttdata.spring.persistence.NttdataProduct;

@Service
@Qualifier("nonPeninsular")
public class NttdataNonPeninsularOrdersServiceImpl extends NttdataOrdersManagementServiceAbstract {

	@Override
	public void addOrder(NttdataOrder order, NttdataProduct... products) {

		List<NttdataProduct> prodList = Arrays.asList(products);
		prodList.forEach(p -> p.setPvpPrice(p.getTaxFreePrice() * (1 + 0.04)));
		order.setProducts(prodList);

		db.insert(order);

	}

}
