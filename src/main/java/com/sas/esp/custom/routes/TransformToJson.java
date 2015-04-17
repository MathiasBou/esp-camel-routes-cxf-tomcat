package com.sas.esp.custom.routes;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.sas.o2.cep.EspDataItem;

public class TransformToJson implements Processor {

	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<EspDataItem> fields = (ArrayList<EspDataItem>) exchange
				.getIn().getBody();

		// CamelContext context = exchange.getContext();

		// String espEndpoint = exchange.getFromEndpoint().getEndpointUri();

		// ArrayList<String> fieldsNameList = getFieldNames(espEndpoint);

		StringBuffer buffer = new StringBuffer();

		buffer.append("{\"clientTimeZone\": \"EST\",\"inputs\":{\"");

		for (Iterator<EspDataItem> iterator = fields.iterator(); iterator
				.hasNext();) {
			EspDataItem espDataItem = iterator.next();
			System.out.println(espDataItem.toString());

			if (espDataItem.getIndex() == 0) {
				buffer.append(espDataItem.getName()).append("\":\"")
						.append(espDataItem.getValue()).append("\"");
				continue;

			} else if (espDataItem.getIndex() == (fields.size() - 1)) {
				buffer.append(",\"").append(espDataItem.getName())
						.append("\":\"").append(espDataItem.getValue())
						.append("\"").append("}}");
				continue;
			} else {
				buffer.append(",\"").append(espDataItem.getName())
						.append("\":\"").append(espDataItem.getValue())
						.append("\"");
				continue;
			}

		}

		exchange.getOut().setBody(buffer.toString());

	}

}
