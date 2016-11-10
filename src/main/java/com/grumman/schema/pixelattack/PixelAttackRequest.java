
package com.grumman.schema.pixelattack;

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
 *         &lt;element name="currentCoords" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="coordinatesAffected" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="direction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="movementType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="range" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="attackId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "currentCoords",
    "coordinatesAffected",
    "direction",
    "movementType",
    "range",
    "attackId",
    "userId"
})
@XmlRootElement(name = "pixelAttackRequest")
public class PixelAttackRequest {

    @XmlElement(required = true)
    protected String currentCoords;
    @XmlElement(required = true)
    protected String coordinatesAffected;
    @XmlElement(required = true)
    protected String direction;
    protected int movementType;
    protected int range;
    @XmlElement(required = true)
    protected String attackId;
    @XmlElement(required = true)
    protected String userId;

    /**
     * Gets the value of the currentCoords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentCoords() {
        return currentCoords;
    }

    /**
     * Sets the value of the currentCoords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentCoords(String value) {
        this.currentCoords = value;
    }

    /**
     * Gets the value of the coordinatesAffected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordinatesAffected() {
        return coordinatesAffected;
    }

    /**
     * Sets the value of the coordinatesAffected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinatesAffected(String value) {
        this.coordinatesAffected = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the movementType property.
     * 
     */
    public int getMovementType() {
        return movementType;
    }

    /**
     * Sets the value of the movementType property.
     * 
     */
    public void setMovementType(int value) {
        this.movementType = value;
    }

    /**
     * Gets the value of the range property.
     * 
     */
    public int getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     */
    public void setRange(int value) {
        this.range = value;
    }

    /**
     * Gets the value of the attackId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttackId() {
        return attackId;
    }

    /**
     * Sets the value of the attackId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttackId(String value) {
        this.attackId = value;
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
