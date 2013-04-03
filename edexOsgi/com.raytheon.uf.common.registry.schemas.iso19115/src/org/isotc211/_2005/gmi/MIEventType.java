//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.10 at 10:31:13 AM CST 
//


package org.isotc211._2005.gmi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.DateTimePropertyType;
import org.isotc211._2005.gmd.MDIdentifierPropertyType;


/**
 * Description: identification of a significant collection point within an operation - shortName: Event
 * 
 * <p>Java class for MI_Event_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MI_Event_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType"/>
 *         &lt;element name="trigger" type="{http://www.isotc211.org/2005/gmi}MI_TriggerCode_PropertyType"/>
 *         &lt;element name="context" type="{http://www.isotc211.org/2005/gmi}MI_ContextCode_PropertyType"/>
 *         &lt;element name="sequence" type="{http://www.isotc211.org/2005/gmi}MI_SequenceCode_PropertyType"/>
 *         &lt;element name="time" type="{http://www.isotc211.org/2005/gco}DateTime_PropertyType"/>
 *         &lt;element name="relatedPass" type="{http://www.isotc211.org/2005/gmi}MI_PlatformPass_PropertyType" minOccurs="0"/>
 *         &lt;element name="relatedSensor" type="{http://www.isotc211.org/2005/gmi}MI_Instrument_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="expectedObjective" type="{http://www.isotc211.org/2005/gmi}MI_Objective_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MI_Event_Type", propOrder = {
    "identifier",
    "trigger",
    "context",
    "sequence",
    "time",
    "relatedPass",
    "relatedSensor",
    "expectedObjective"
})
public class MIEventType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected MDIdentifierPropertyType identifier;
    @XmlElement(required = true)
    protected MITriggerCodePropertyType trigger;
    @XmlElement(required = true)
    protected MIContextCodePropertyType context;
    @XmlElement(required = true)
    protected MISequenceCodePropertyType sequence;
    @XmlElement(required = true)
    protected DateTimePropertyType time;
    protected MIPlatformPassPropertyType relatedPass;
    protected List<MIInstrumentPropertyType> relatedSensor;
    protected List<MIObjectivePropertyType> expectedObjective;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setIdentifier(MDIdentifierPropertyType value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the trigger property.
     * 
     * @return
     *     possible object is
     *     {@link MITriggerCodePropertyType }
     *     
     */
    public MITriggerCodePropertyType getTrigger() {
        return trigger;
    }

    /**
     * Sets the value of the trigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link MITriggerCodePropertyType }
     *     
     */
    public void setTrigger(MITriggerCodePropertyType value) {
        this.trigger = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link MIContextCodePropertyType }
     *     
     */
    public MIContextCodePropertyType getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIContextCodePropertyType }
     *     
     */
    public void setContext(MIContextCodePropertyType value) {
        this.context = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link MISequenceCodePropertyType }
     *     
     */
    public MISequenceCodePropertyType getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISequenceCodePropertyType }
     *     
     */
    public void setSequence(MISequenceCodePropertyType value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePropertyType }
     *     
     */
    public DateTimePropertyType getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePropertyType }
     *     
     */
    public void setTime(DateTimePropertyType value) {
        this.time = value;
    }

    /**
     * Gets the value of the relatedPass property.
     * 
     * @return
     *     possible object is
     *     {@link MIPlatformPassPropertyType }
     *     
     */
    public MIPlatformPassPropertyType getRelatedPass() {
        return relatedPass;
    }

    /**
     * Sets the value of the relatedPass property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIPlatformPassPropertyType }
     *     
     */
    public void setRelatedPass(MIPlatformPassPropertyType value) {
        this.relatedPass = value;
    }

    /**
     * Gets the value of the relatedSensor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedSensor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedSensor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MIInstrumentPropertyType }
     * 
     * 
     */
    public List<MIInstrumentPropertyType> getRelatedSensor() {
        if (relatedSensor == null) {
            relatedSensor = new ArrayList<MIInstrumentPropertyType>();
        }
        return this.relatedSensor;
    }

    /**
     * Gets the value of the expectedObjective property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expectedObjective property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpectedObjective().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MIObjectivePropertyType }
     * 
     * 
     */
    public List<MIObjectivePropertyType> getExpectedObjective() {
        if (expectedObjective == null) {
            expectedObjective = new ArrayList<MIObjectivePropertyType>();
        }
        return this.expectedObjective;
    }

}
