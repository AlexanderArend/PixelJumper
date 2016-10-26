package com.grumman.service.pixel;

import java.util.Set;

import javax.jws.HandlerChain;
import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.Holder;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import com.gruman.coords.Coordinates;
import com.gruman.coords.MoveCoords;
import com.gruman.parse.ParseCoords;
import com.grumman.schema.pixel.ObjectFactory;
import com.grumman.schema.pixel.PixelRequest;
import com.grumman.schema.pixel.PixelResponse;

@WebService(portName = "PixelSOAP", serviceName = "Pixel", 
endpointInterface = "com.grumman.service.pixel.Pixel", 
targetNamespace = "http://www.grumman.com/service/Pixel/")
@HandlerChain(file="/handler-chain.xml")
public class PixelImpl implements Pixel, SOAPHandler<SOAPMessageContext> {

	@Override
	public PixelResponse pixel(PixelRequest pixelRequest, Holder<com.grumman.schema.pixelheader.PixelHeader> header) {
			System.out.println(header.value.getAuthenticationToken());
			ObjectFactory objectFactory = new ObjectFactory();
			PixelResponse response = objectFactory.createPixelResponse();
			Coordinates cords = ParseCoords.parseCoordinates(pixelRequest.getCoordinates());
			response.setNewCoordinates(MoveCoords.changeCoords(cords, pixelRequest.getDirection()).toString());
			response.setUserId(pixelRequest.getUserId());
			return response;
	
	}

	@Override
	public void close(MessageContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean handleFault(SOAPMessageContext arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean handleMessage(SOAPMessageContext messageContext) {
		SOAPMessage soapMessage =  messageContext.getMessage();
		SOAPPart soapPart = soapMessage.getSOAPPart();
		SOAPEnvelope soapEnvelope = null;
		try {
			soapEnvelope = soapPart.getEnvelope();
			
		} catch (SOAPException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			SOAPBody soapBody = soapEnvelope.getBody();
			System.out.println(soapBody.getNodeName());
		} catch (SOAPException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			SOAPHeader soapHeader = soapEnvelope.getHeader();
			System.out.println(soapHeader.getChildNodes().item(0).getNodeName());
		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return true;
	}

	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}



}
