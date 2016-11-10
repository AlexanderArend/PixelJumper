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
import org.springframework.beans.factory.annotation.Autowired;
import com.grumman.character.manage.ManageCharacterImpl;
import com.grumman.character.select.SelectCharacterImpl;
import com.grumman.coord.attack.CoordinateAttackImpl;
import com.grumman.coords.Coordinates;
import com.grumman.coords.MoveCoords;
import com.grumman.domain.OtherUsersCoords;
import com.grumman.parse.ParseCoords;
import com.grumman.schema.pixel.ObjectFactory;
import com.grumman.schema.pixel.PixelRequest;
import com.grumman.schema.pixel.PixelResponse;
import com.grumman.schema.pixelattack.PixelAttackRequest;
import com.grumman.schema.pixelattack.PixelAttackResponse;
import com.grumman.schema.pixelchar.PixelCharRequest;
import com.grumman.schema.pixelchar.PixelCharResponse;
import com.grumman.schema.pixelcharselect.PixelCharSelectRequest;
import com.grumman.schema.pixelcharselect.PixelCharSelectResponse;
import com.grumman.schema.pixelheader.PixelHeader;

@WebService(portName = "PixelSOAP", serviceName = "Pixel", 
endpointInterface = "com.grumman.service.pixel.Pixel", 
targetNamespace = "http://www.grumman.com/service/Pixel/")
@HandlerChain(file="/handler-chain.xml")
public class PixelImpl implements Pixel, SOAPHandler<SOAPMessageContext> {
	@Autowired
	CoordinateAttackImpl coordinateAttack;
	
	@Autowired
	ManageCharacterImpl manageCharacter;
	
	@Autowired 
	SelectCharacterImpl selectCharacter;

	@Override
	public PixelResponse pixel(PixelRequest pixelRequest, Holder<PixelHeader> header) {
		System.out.println(header.value.getAuthenticationToken());
		ObjectFactory objectFactory = new ObjectFactory();
		PixelResponse response = objectFactory.createPixelResponse();
		Coordinates cords = ParseCoords.parseCoordinates(pixelRequest.getCoordinates());
		String coords = MoveCoords.changeCoords(cords, pixelRequest.getDirection(), pixelRequest.getMovementTypeFactor()).toString();
		response.setNewCoordinates(coords);

		response.setUserId(pixelRequest.getUserId());
		OtherUsersCoords.addOrUpdateCoords(pixelRequest.getUserId(), coords);
		return response;

	}

	@Override
	public PixelCharResponse pixelCharUpdate(PixelCharRequest pixelCharRequest, Holder<PixelHeader> pixelHeader) {
		com.grumman.schema.pixelchar.ObjectFactory objectFactory = new com.grumman.schema.pixelchar.ObjectFactory();
		PixelCharResponse response = objectFactory.createPixelCharResponse();
		
		return manageCharacter.manageCharacterInteraction(pixelCharRequest, response);
	}

	@Override
	public PixelCharSelectResponse pixelCharSelect(PixelCharSelectRequest pixelCharSelectRequest,
			Holder<PixelHeader> pixelHeader) {
		System.out.println(pixelHeader.value.getAuthenticationToken());
		com.grumman.schema.pixelcharselect.ObjectFactory objectFactory = new com.grumman.schema.pixelcharselect.ObjectFactory();
		PixelCharSelectResponse response = objectFactory.createPixelCharSelectResponse();
		
		return selectCharacter.makeCharacterSelection(pixelCharSelectRequest, response);
	}

	@Override
	public PixelAttackResponse pixelAttack(PixelAttackRequest pixelAttackRequest, Holder<PixelHeader> pixelHeader) {

		System.out.println(pixelHeader.value.getAuthenticationToken());
		com.grumman.schema.pixelattack.ObjectFactory factory = new com.grumman.schema.pixelattack.ObjectFactory();
		PixelAttackResponse pixelAttackResponse = factory.createPixelAttackResponse() ;
		
		return coordinateAttack.implementAttack(pixelAttackRequest, pixelAttackResponse);
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
