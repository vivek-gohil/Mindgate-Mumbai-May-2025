package com.mindgate.main.service.impl;

import com.mindgate.main.service.PrintingService;
import com.mindgate.main.service.ScannerPlugin;

public class CanonAllInOne implements PrintingService, ScannerPlugin {

	@Override
	public void doScanning() {
		System.out.println("CanonAllInOne is Scanning");
	}

	@Override
	public void doPrint() {
		System.out.println("CanonAllInOne is Printing");

	}

}
