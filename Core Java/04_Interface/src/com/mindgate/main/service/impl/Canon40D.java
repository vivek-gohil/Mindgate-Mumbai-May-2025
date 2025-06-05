package com.mindgate.main.service.impl;

import com.mindgate.main.service.PrintingService;

public class Canon40D implements PrintingService {

	@Override
	public void doPrint() {
		System.out.println("Canon40D is printing");
	}

}
