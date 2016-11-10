
package com.grumman.schema.pixelchar;

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
 *         &lt;element name="deductedhealth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="movementFactory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="currentLocation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "deductedhealth",
    "movementFactory",
    "currentLocation",
    "userId"
})
@XmlRootElement(name = "pixelCharRequest")
public class PixelCharRequest {

    protected int maxHealth;
    protected int currentHealth;
    protected int deductedhealth;
    @XmlElement(required = true)
    protected String movementFactory;
    @XmlElement(required = true)
    protected String currentLocation;
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
     * Gets the value of the deductedhealth property.
     * 
     */
    public int getDeductedhealth() {
        return deductedhealth;
    }

    /**
     * Sets the value of the deductedhealth property.
     * 
     */
    public void setDeductedhealth(int value) {
        this.deductedhealth = value;
    }

    /**
     * Gets the value of the movementFactory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementFactory() {
        return movementFactory;
    }

    /**
     * Sets the value of the movementFactory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementFactory(String value) {
        this.movementFactory = value;
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
