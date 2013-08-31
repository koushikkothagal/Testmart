package org.koushik.javabrains;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
public class ShopInfo {
	
	@WebMethod
	@WebResult(partName="lookupOutput")
	public String getShopInfo(@WebParam(partName="lookupInput") String property) {
		String response = "Invalid property";
		if ("shopName".equals(property)) {
			response = "Test Mart";
		}
		else if ("since".equals(property)) {
			response = "since 2012";
		}
		
		return response;
	}
	
	
}
