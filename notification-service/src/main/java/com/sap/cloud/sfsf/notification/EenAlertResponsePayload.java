/**
 * Copyright 2016 SAP SE
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.09.26 at 11:44:06 AM EEST
//


package com.sap.cloud.sfsf.notification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for eenAlertResponsePayload complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="eenAlertResponsePayload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/>
 *         &lt;element name="statusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="statusDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlRootElement(name = "EenAlertResponsePayload")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eenAlertResponsePayload", propOrder = {
    "entityId",
    "errorCode",
    "errorMessage",
    "status",
    "statusDate",
    "statusDetails"
})
public class EenAlertResponsePayload {

    protected String entityId;
    protected String errorCode;
    protected String errorMessage;
    protected Integer status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusDate;
    protected String statusDetails;

    /**
     * Gets the value of the entityId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEntityId(final String value) {
        entityId = value;
    }

    /**
     * Gets the value of the errorCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorCode(final String value) {
        errorCode = value;
    }

    /**
     * Gets the value of the errorMessage property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorMessage(final String value) {
        errorMessage = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setStatus(final Integer value) {
        status = value;
    }

    /**
     * Gets the value of the statusDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getStatusDate() {
        return statusDate;
    }

    /**
     * Sets the value of the statusDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setStatusDate(final XMLGregorianCalendar value) {
        statusDate = value;
    }

    /**
     * Gets the value of the statusDetails property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatusDetails() {
        return statusDetails;
    }

    /**
     * Sets the value of the statusDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatusDetails(final String value) {
        statusDetails = value;
    }

}
