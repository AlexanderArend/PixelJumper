package com.grumman.character.manage;

import com.grumman.schema.pixelchar.PixelCharRequest;
import com.grumman.schema.pixelchar.PixelCharResponse;

public interface ManageCharacter {

	public PixelCharResponse manageCharacterInteraction(final PixelCharRequest pixelCharRequest,final PixelCharResponse pixelCharResponse );
	public boolean isDead(final int healthRemaining,final int damageDone);
	public int calculateCurrentHealth(final int healthRemaining,final int damageDone);
}
