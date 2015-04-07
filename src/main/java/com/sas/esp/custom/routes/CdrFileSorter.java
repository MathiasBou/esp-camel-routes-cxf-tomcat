package com.sas.esp.custom.routes;

/*
 * Custom comparator for sorting CDR files in Movistar Argentina
 * 
 * @author Henrique Danc (henrique.danc@sas.com)
 *
 *  We have to compare files with the following format
 *  	FN-20140129101837334748-SDPAR8-vlz3fedsdp1-GENCDR-2-0-1-9659
 *  
 *  and sort them based on the following fields
 * 		20140129101837334748 -> First 14 digits that represent the date as YYYYMMDDHHMISS
 *      9659                 -> Last n digits that represent a sequence number
 *  
 *  the other digits should be ignored
 * 
 * 
 */

import java.util.Comparator;

import org.apache.camel.component.file.GenericFile;

public class CdrFileSorter<T> implements Comparator<GenericFile<T>> {
	public int compare(GenericFile<T> o1, GenericFile<T> o2) {

		int result;

		long fileName1Date;
		long fileName2Date;

		long fileName1Seq;
		long fileName2Seq;


		// Get file names
		String fileName1 = o1.getFileNameOnly();
		String fileName2 = o2.getFileNameOnly();
		
		// Get keys from filenames separated by -
		String[] fileName1Fields = fileName1.split("-");
		String[] fileName2Fields = fileName2.split("-");

		// If filenames are valid, continue
		if (fileName1Fields.length >= 9 && 
				fileName2Fields.length >= 9) {
			
			try {

				// Extract needed keys
				fileName1Date = Long.parseLong(fileName1Fields[1].substring(0,  14));
				fileName2Date = Long.parseLong(fileName2Fields[1].substring(0,  14));

				fileName1Seq = Long.parseLong(fileName1Fields[8]);
				fileName2Seq = Long.parseLong(fileName2Fields[8]);
				
				// Compare keys
				int dateResult = Long.compare(fileName1Date, fileName2Date);

				// if the first key is equal, compare using the second key
				if (dateResult == 0L) {
					result = Long.compare(fileName1Seq, fileName2Seq);
				} else {
					result = dateResult;
				}

				// In case of error in parsing, compare the full file names
			} catch (Exception e) {
				result = fileName1.compareToIgnoreCase(fileName2);
			}

			// else compare the full file names
		} else {
			result = fileName1.compareToIgnoreCase(fileName2);
		}

		// return result
		return result;

	}

}
