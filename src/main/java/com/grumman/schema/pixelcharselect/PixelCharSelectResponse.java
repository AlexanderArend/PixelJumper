
package com.grumman.schema.pixelcharselect;

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
 *         &lt;element name="maxHealth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="currentHealth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="movementFactor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="currentLocation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="charId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "maxHealth",
    "currentHealth",
    "movementFactor",
    "currentLocation",
    "charId",
    "userId"
})
@XmlRootElement(name = "pixelCharSelectResponse")
public class PixelCharSelectResponse {

    protected int maxHealth;
    protected int currentHealth;
    protected int movementFactor;
    @XmlElement(required = true)
    protected String currentLocation;
    @XmlElement(required = true)
    protected String charId;
    @XmlElement(required = true)
    protected String userId;

    /**
     * Gets the value of the maxHealth property.
     * 
     */
    public int getMaxHealth() {
        return maxHealth;
    }

    /**
     * Sets the value of the maxHealth property.
     * 
     */
    public void setMaxHealth(int value) {
        this.maxHealth = value;
    }

    /**
     * Gets the value of the currentHealth property.
     * 
     */
    public int getCurrentHealth() {
        return currentHealth;
    }

    /**
     * Sets the value of the currentHealth property.
     * 
     */
    public void setCurrentHealth(int value) {
        this.currentHealth = value;
    }

    /**
     * Gets the value of the movementFactor property.
     * 
     */
    public int getMovementFactor() {
        return movementFactor;
    }

    /**
     * Sets the value of the movementFactor property.
     * 
     */
    public void setMovementFactor(int value) {
        this.movementFactor = value;
    }

    /**
     * Gets the value of the currentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentLocation() {
        return currentLocation;
    }

    /**
     * Sets the value of the currentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentLocation(String value) {
        this.currentLocation = value;
    }

    /**
     * Gets the value of the charId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharId() {
        return charId;
    }

    /**
     * Sets the value of the charId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharId(String value) {
        this.charId = value;
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
