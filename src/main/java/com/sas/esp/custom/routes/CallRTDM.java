package com.sas.esp.custom.routes;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.sas.o2.cep.EspDataItem;

public class CallRTDM implements Processor {

	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		
		ArrayList<EspDataItem> fields = (ArrayList<EspDataItem>) exchange.getIn().getBody();
		
		for (Iterator iterator = fields.iterator(); iterator.hasNext();) {
			EspDataItem espDataItem = (EspDataItem) iterator.next();
			System.out.println(espDataItem.getIndex() + "  " + espDataItem.getName() + "  " + espDataItem.getValue()) ;
			
		}

	}

}
