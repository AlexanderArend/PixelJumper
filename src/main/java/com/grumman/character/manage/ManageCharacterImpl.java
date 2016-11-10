package com.grumman.character.manage;

import com.grumman.schema.pixelchar.PixelCharRequest;
import com.grumman.schema.pixelchar.PixelCharResponse;

public class ManageCharacterImpl implements ManageCharacter {

	@Override
	public PixelCharResponse manageCharacterInteraction(final PixelCharRequest pixelCharRequest,
			final PixelCharResponse pixelCharResponse) {
		pixelCharResponse.setIsDead(isDead(pixelCharRequest.getCurrentHealth(),
				pixelCharRequest.getDeductedhealth())?"true":"false");
		pixelCharResponse.setUserId(pixelCharRequest.getUserId());
		pixelCharResponse.setCurrentHealth(calculateCurrentHealth(pixelCharRequest.getCurrentHealth(),
				pixelCharRequest.getDeductedhealth()));
		pixelCharResponse.setSuccessUpdating("true");
		return pixelCharResponse;
	}

	@Override
	public boolean isDead(final int healthRemaining,final  int damageDone) {
		
		return (healthRemaining-damageDone) <= 0;
	}

	@Override
	public int calculateCurrentHealth(final int healthRemaining,final int damageDone) {
		
		return ((healthRemaining-damageDone) < 0)?0:(healthRemaining-damageDone);
	}
	
	

}
