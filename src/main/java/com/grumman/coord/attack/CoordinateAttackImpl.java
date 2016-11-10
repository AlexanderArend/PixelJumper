package com.grumman.coord.attack;

import java.util.Map.Entry;

import com.grumman.coords.Coordinates;
import com.grumman.coords.MoveCoords;
import com.grumman.domain.OtherUsersCoords;
import com.grumman.parse.ParseCoords;
import com.grumman.schema.pixelattack.PixelAttackRequest;
import com.grumman.schema.pixelattack.PixelAttackResponse;

public class CoordinateAttackImpl implements CoordinateAttack{
	private String userIdHit;

	@Override
	public PixelAttackResponse implementAttack(final PixelAttackRequest pixelAttackRequest,
		 final	PixelAttackResponse pixelAttackResponse) {
		pixelAttackResponse.setUserId(pixelAttackRequest.getUserId());
		pixelAttackResponse.setAttackId(pixelAttackRequest.getAttackId());
		pixelAttackResponse.setDamageDone(damageDone(Integer.parseInt(pixelAttackRequest.getUserId().substring(0))));
		pixelAttackResponse.setNewCoords(calculateNewCoords(pixelAttackRequest.getDirection(),pixelAttackRequest.getCurrentCoords(),pixelAttackRequest.getMovementType()));
		pixelAttackResponse.setHitTrue(wasUserHitByAttack(pixelAttackRequest.getCurrentCoords())?"true":"false");
		pixelAttackResponse.setUserIdHitByAttack(getUserHitByAttack());
		pixelAttackResponse.setRangeRemaining(calculateRangeRemaining(pixelAttackRequest.getMovementType(), pixelAttackRequest.getRange()));
	
		return pixelAttackResponse;
	}
	
	@Override
	public String getUserHitByAttack() {
		return userIdHit;
	}

	@Override
	public String calculateNewCoords(final String direction,final String coords,final int movementFactor) {
		
		Coordinates cords = ParseCoords.parseCoordinates(coords);
		return MoveCoords.changeCoords(cords,direction, movementFactor).toString();
	}

	@Override
	public int damageDone(final int charId) {
		switch(charId){
		case 1:
			return 5;
		case 2:
			return 10;
		case 3:
			return 15;
			
		}
		return 0;
	}


	@Override
	public boolean wasUserHitByAttack(final String currentCords) {
		for (Entry coords: OtherUsersCoords.getAllUsersCoords().entrySet()){
			if(coords.getValue().equals(currentCords))
					{
					userIdHit = coords.getKey().toString();
					return true;
					}
		}
		return false;
	}

	@Override
	public int calculateRangeRemaining(final int movementType,final int range) {
		return movementType - range;
	}



}
