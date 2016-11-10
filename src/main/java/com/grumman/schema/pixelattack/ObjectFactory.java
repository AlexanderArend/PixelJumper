
package com.grumman.schema.pixelattack;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.grumman.schema.pixelattack package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.grumman.schema.pixelattack
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PixelAttackRequest }
     * 
     */
    public PixelAttackRequest createPixelAttackRequest() {
        return new PixelAttackRequest();
    }

    /**
     * Create an instance of {@link PixelAttackResponse }
     * 
     */
    public PixelAttackResponse createPixelAttackResponse() {
        return new PixelAttackResponse();
    }

}
