
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
 *         &lt;element name="successUpdating" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isDead" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="currentHealth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "successUpdating",
    "isDead",
    "userId",
    "currentHealth"
})
@XmlRootElement(name = "pixelCharResponse")
public class PixelCharResponse {

    @XmlElement(required = true)
    protected String successUpdating;
    @XmlElement(required = true)
    protected String isDead;
    @XmlElement(required = true)
    protected String userId;
    protected int currentHealth;

    /**
     * Gets the value of the successUpdating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessUpdating() {
        return successUpdating;
    }

    /**
     * Sets the value of the successUpdating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessUpdating(String value) {
        this.successUpdating = value;
    }

    /**
     * Gets the value of the isDead property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDead() {
        return isDead;
    }

    /**
     * Sets the value of the isDead property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDead(String value) {
        this.isDead = value;
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

}
