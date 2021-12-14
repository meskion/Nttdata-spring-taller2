package com.nttdata.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.persistence.NttdataOrder;
import com.nttdata.spring.persistence.NttdataProduct;
import com.nttdata.spring.services.NttdataOrdersManagementServiceAbstract;

@SpringBootApplication
public class NttDataSpringMain implements CommandLineRunner {

	@Autowired
	@Qualifier("peninsular")
	NttdataOrdersManagementServiceAbstract pService;

	@Autowired
	@Qualifier("nonPeninsular")
	NttdataOrdersManagementServiceAbstract npService;

	public static void main(String[] args) {
		SpringApplication.run(NttDataSpringMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		NttdataOrder order1 = new NttdataOrder();
		order1.setOrderId(1L);
		order1.setPeninsular(true);
		order1.setAdress("calle pepito 3");
		order1.setReciever("manue");

		NttdataOrder order2 = new NttdataOrder();
		order2.setOrderId(2L);
		order2.setPeninsular(true);
		order2.setAdress("calle pepito 10");
		order2.setReciever("ange");

		NttdataProduct p1 = new NttdataProduct();
		p1.setProductId(1L);
		p1.setProductName("chocolate");
		p1.setTaxFreePrice(1.);

		NttdataProduct p2 = new NttdataProduct();
		p2.setProductId(2L);
		p2.setProductName("Leche");
		p2.setTaxFreePrice(1.);

		pService.addOrder(order1, p1);
		npService.addOrder(order2, p2);

		pService.searchAll().forEach(System.out::println);
		
	}

}
