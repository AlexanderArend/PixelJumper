
package com.grumman.schema.pixel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newCoordinates" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pixelMovementAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "newCoordinates",
    "pixelMovementAmount",
    "userId"
})
@XmlRootElement(name = "pixelResponse")
public class PixelResponse {

    @XmlElement(required = true)
    protected String newCoordinates;
    @XmlElement(required = true)
    protected String pixelMovementAmount;
    @XmlElement(required = true)
    protected String userId;

    /**
     * Gets the value of the newCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCoordinates() {
        return newCoordinates;
    }

    /**
     * Sets the value of the newCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCoordinates(String value) {
        this.newCoordinates = value;
    }

    /**
     * Gets the value of the pixelMovementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPixelMovementAmount() {
        return pixelMovementAmount;
    }

    /**
     * Sets the value of the pixelMovementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPixelMovementAmount(String value) {
        this.pixelMovementAmount = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

}
