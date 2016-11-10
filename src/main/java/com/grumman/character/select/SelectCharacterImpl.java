package com.grumman.character.select;

import com.grumman.characters.Dragon;
import com.grumman.characters.Gunman;
import com.grumman.characters.Hydra;
import com.grumman.domain.OtherUsersCoords;
import com.grumman.schema.pixelcharselect.PixelCharSelectResponse;
import com.grumman.schema.pixelcharselect.PixelCharSelectRequest;

public class SelectCharacterImpl implements SelectCharacter {

	private static final String FIRST_PERSON_COORDS = "0,500";
	private static final String SECOND_PERSON_COORDS = "1000,500";


	@Override
	public PixelCharSelectResponse makeCharacterSelection(PixelCharSelectRequest request,
			PixelCharSelectResponse response) {
		com.grumman.characters.Character character = null;
		if(request.getCharType().equals(1)){
			character = new Gunman();
		}
		else if (request.getCharType().equals(2)){
			character = new Dragon();
		}
		else if (request.getCharType().equals(3)){
			character = new Hydra();
		}
		else{

		}
		response.setCharId(request.getCharType());
		response.setUserId(response.getCharId() + request.getUserId());
		
		if(OtherUsersCoords.getAllUsersCoords().size() == 0)
			response.setCurrentLocation(FIRST_PERSON_COORDS);
		else
			response.setCurrentLocation(SECOND_PERSON_COORDS);


		response.setMovementFactor(character.getMovementFactor());
		response.setCurrentHealth(character.getMaxHealth());
		response.setMaxHealth(character.getMaxHealth());

		return response;
	}

}
