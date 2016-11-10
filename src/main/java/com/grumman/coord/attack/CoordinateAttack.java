package com.grumman.coord.attack;

import com.grumman.schema.pixelattack.PixelAttackRequest;
import com.grumman.schema.pixelattack.PixelAttackResponse;

public interface CoordinateAttack {
	
	public boolean wasUserHitByAttack(final String currentCords);
	public String  getUserHitByAttack();
	public String calculateNewCoords(final String direction, final String coords,final int movementFactor);
	public int damageDone(final int charId);
	public int calculateRangeRemaining(final int movementType,final int range);
	public PixelAttackResponse implementAttack(final PixelAttackRequest pixelAttackRequest, final PixelAttackResponse pixelAttackResponse);
}
