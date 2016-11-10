
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
 *         &lt;element name="newCoords" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userIdHitByAttack" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="damageDone" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="hitTrue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="attackId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rangeRemaining" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "newCoords",
    "userIdHitByAttack",
    "damageDone",
    "hitTrue",
    "attackId",
    "userId",
    "rangeRemaining"
})
@XmlRootElement(name = "pixelAttackResponse")
public class PixelAttackResponse {

    @XmlElement(required = true)
    protected String newCoords;
    @XmlElement(required = true)
    protected String userIdHitByAttack;
    protected int damageDone;
    @XmlElement(required = true)
    protected String hitTrue;
    @XmlElement(required = true)
    protected String attackId;
    @XmlElement(required = true)
    protected String userId;
    protected int rangeRemaining;

    /**
     * Gets the value of the newCoords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCoords() {
        return newCoords;
    }

    /**
     * Sets the value of the newCoords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCoords(String value) {
        this.newCoords = value;
    }

    /**
     * Gets the value of the userIdHitByAttack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIdHitByAttack() {
        return userIdHitByAttack;
    }

    /**
     * Sets the value of the userIdHitByAttack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIdHitByAttack(String value) {
        this.userIdHitByAttack = value;
    }

    /**
     * Gets the value of the damageDone property.
     * 
     */
    public int getDamageDone() {
        return damageDone;
    }

    /**
     * Sets the value of the damageDone property.
     * 
     */
    public void setDamageDone(int value) {
        this.damageDone = value;
    }

    /**
     * Gets the value of the hitTrue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHitTrue() {
        return hitTrue;
    }

    /**
     * Sets the value of the hitTrue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHitTrue(String value) {
        this.hitTrue = value;
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

    /**
     * Gets the value of the rangeRemaining property.
     * 
     */
    public int getRangeRemaining() {
        return rangeRemaining;
    }

    /**
     * Sets the value of the rangeRemaining property.
     * 
     */
    public void setRangeRemaining(int value) {
        this.rangeRemaining = value;
    }

}
