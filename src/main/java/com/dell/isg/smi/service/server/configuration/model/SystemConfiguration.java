/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.02 at 04:49:32 PM CDT 
//

package com.dell.isg.smi.service.server.configuration.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Component" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Attribute" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Component" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Component" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Attribute" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="FQDD" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Attribute" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="FQDD" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="FQDD" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Model" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ServiceTag" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeStamp" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "serverComponents" })
@XmlRootElement(name = "SystemConfiguration")
public class SystemConfiguration {

    @XmlElement(name = "Component", required = true)
    protected List<ServerComponent> serverComponents;
    @XmlAttribute(name = "Model", required = true)
    protected String model;
    @XmlAttribute(name = "ServiceTag", required = true)
    protected String serviceTag;
    @XmlAttribute(name = "TimeStamp", required = true)
    protected String timeStamp;


    /**
     * Gets the value of the component property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the component property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link SystemConfiguration.Component }
     * 
     * 
     */
    // public List<ServerComponent> getComponent() {
    // if (component == null) {
    // component = new ArrayList<ServerComponent>();
    // }
    // return this.component;
    // }

    /**
     * @return the serverComponents
     */
    public List<ServerComponent> getServerComponents() {
        if (serverComponents == null) {
            serverComponents = new ArrayList<ServerComponent>();
        }
        return this.serverComponents;
    }


    /**
     * @param serverComponents the serverComponents to set
     */
    public void setServerComponents(List<ServerComponent> serverComponents) {
        this.serverComponents = serverComponents;
    }


    /**
     * Gets the value of the model property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getModel() {
        return model;
    }


    /**
     * Sets the value of the model property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setModel(String value) {
        this.model = value;
    }


    /**
     * Gets the value of the serviceTag property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getServiceTag() {
        return serviceTag;
    }


    /**
     * Sets the value of the serviceTag property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setServiceTag(String value) {
        this.serviceTag = value;
    }


    /**
     * Gets the value of the timeStamp property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
    }

}