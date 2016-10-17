package com.gruman.service.pixel;

import javax.jws.WebService;

import com.gruman.coords.Coordinates;
import com.gruman.coords.MoveCoords;
import com.gruman.parse.ParseCoords;
import com.grumman.schema.pixel.ObjectFactory;
import com.grumman.schema.pixel.PixelRequest;
import com.grumman.schema.pixel.PixelResponse;

@WebService(portName = "PixelSOAP", serviceName = "Pixel", 
endpointInterface = "com.gruman.service.pixel.Pixel", 
targetNamespace = "http://www.grumman.com/service/Pixel/")
public class PixelImpl implements Pixel {

	@Override
	public PixelResponse pixel(PixelRequest pixelRequest) {
		ObjectFactory objectFactory = new ObjectFactory();
		PixelResponse response = objectFactory.createPixelResponse();
		Coordinates cords = ParseCoords.parseCoordinates(pixelRequest.getCoordinates());
		response.setNewCoordinates(MoveCoords.changeCoords(cords, pixelRequest.getDirection()).toString());
		response.setUserId(pixelRequest.getUserId());
		return response;
	}

}
