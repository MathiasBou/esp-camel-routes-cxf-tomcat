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
		// String jsonString =
		// "{\"clientTimeZone\": \"EST\",\"inputs\":{\"MSISDN\":,\"TOPUP_TYPE\":,\"TOPUP_AMOUNT\":,\"TOPUP_TIER\":}}";
		// buffer.append("{\"clientTimeZone\": \"EST\",\"inputs\":{\"MSISDN\":");
		buffer.append("{\"clientTimeZone\": \"EST\",\"inputs\":{\"");
		// int count = 0;
		for (Iterator<EspDataItem> iterator = fields.iterator(); iterator
				.hasNext();) {
			EspDataItem espDataItem = iterator.next();
			System.out.println(espDataItem.toString());

			/*
			 * if (espDataItem.getName().equalsIgnoreCase("MSISDN")) {
			 * buffer.append("\"").append(espDataItem.getValue()).append("\"");
			 * } else if (espDataItem.getName().equalsIgnoreCase("TOPUP_TYPE"))
			 * { buffer.append(",\"TOPUP_TYPE\":").append("\"")
			 * .append(espDataItem.getValue()).append("\""); } else if
			 * (espDataItem.getName().equalsIgnoreCase("TOPUP_AMOUNT")) {
			 * buffer.append(",\"TOPUP_AMOUNT\":").append(
			 * espDataItem.getValue()); } else if
			 * (espDataItem.getName().equalsIgnoreCase("TOPUP_TIER")) {
			 * buffer.append(",\"TOPUP_TIER\":").append("\"")
			 * .append(espDataItem.getValue()).append("\"") .append("}}"); }
			 */
			// count++;

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

	/**
	 * public static ArrayList<String> getFieldNames(String engineUrl) {
	 * 
	 * dfESPclientHandler handler = new dfESPclientHandler();
	 * handler.init(Level.WARNING); ArrayList<String> fieldNames = new
	 * ArrayList<>(); ArrayList<String> schemaVector = null;
	 * 
	 * String schemaUrl = engineUrl.substring(0, engineUrl.indexOf('?')) +
	 * "?get=schema"; String schema = "";
	 * 
	 * try { schemaVector = handler.queryMeta(schemaUrl); schema =
	 * schemaVector.get(0).toString().replace("*", ""); StringTokenizer stSchema
	 * = new StringTokenizer(schema, ","); while (stSchema.hasMoreElements()) {
	 * String element = stSchema.nextElement().toString(); //
	 * System.out.println("output: " + element);
	 * 
	 * StringTokenizer stField = new StringTokenizer(element, ":");
	 * 
	 * String fieldName = stField.nextElement().toString(); String fieldFormat =
	 * stField.nextElement().toString(); System.out.println("  field name: " +
	 * fieldName);
	 * 
	 * System.out.println("  field format: " + fieldFormat);
	 * fieldNames.add(fieldName); } System.err.println(schema); //
	 * System.out.println("schemaUrl: " + schemaUrl); } catch
	 * (UnknownHostException e1) { // TODO Auto-generated catch block
	 * e1.printStackTrace(); }
	 * 
	 * return fieldNames;
	 * 
	 * }
	 **/

}
