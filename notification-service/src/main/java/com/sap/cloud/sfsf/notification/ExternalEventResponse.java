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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalEventResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ExternalEventResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responsePayload" type="{http://notification.event.successfactors.com}eenAlertResponsePayload" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlRootElement(name ="ExternalEventResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalEventResponse", propOrder = {
    "responsePayload"
})
public class ExternalEventResponse {

    protected EenAlertResponsePayload responsePayload;

    /**
     * Gets the value of the responsePayload property.
     *
     * @return
     *     possible object is
     *     {@link EenAlertResponsePayload }
     *
     */
    public EenAlertResponsePayload getResponsePayload() {
        return responsePayload;
    }

    /**
     * Sets the value of the responsePayload property.
     *
     * @param value
     *     allowed object is
     *     {@link EenAlertResponsePayload }
     *
     */
    public ExternalEventResponse setResponsePayload(final EenAlertResponsePayload value) {
        responsePayload = value;
        return this;
    }

}