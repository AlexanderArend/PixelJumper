package com.grumman.character.select;

import com.grumman.schema.pixelcharselect.PixelCharSelectResponse;
import com.grumman.schema.pixelcharselect.PixelCharSelectRequest;

public interface SelectCharacter {
    public PixelCharSelectResponse makeCharacterSelection(PixelCharSelectRequest request, PixelCharSelectResponse response);
}
