package com.mindgate.main;

import com.mindgate.main.service.PrintingService;
import com.mindgate.main.service.ScannerPlugin;
import com.mindgate.main.service.impl.CanonAllInOne;
import com.mindgate.main.service.impl.HP4390PrintingServiceImpl;

public class PrintingMain {

	public static void main(String[] args) {
		PrintingService printingService ;

		printingService = new HP4390PrintingServiceImpl();
		printingService.doPrint();

		printingService = new CanonAllInOne();
		printingService.doPrint();

		ScannerPlugin scannerPlugin = new CanonAllInOne();
		scannerPlugin.doScanning();

	}

}
