package com.example.demo.provider.uws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;


/**
 * <p>Java class for CheckTransactionArguments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckTransactionArguments"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://uws.provider.com/}GenericArguments"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="transactionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="parameters" type="{http://uws.provider.com/}GenericParam" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckTransactionArguments", propOrder = {
    "serviceId",
    "transactionId",
    "transactionTime",
    "parameters"
})
public class CheckTransactionArguments
    extends GenericArguments
{

    protected long serviceId;

    protected long transactionId;

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionTime;

    @XmlElement(nillable = true)
    protected List<GenericParam> parameters;

    public List<GenericParam> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<>();
        }
        return this.parameters;
    }

}
