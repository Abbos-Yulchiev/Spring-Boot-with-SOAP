package com.example.demo.provider.uws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;


/**
 * <p>Java class for CheckTransactionResult complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CheckTransactionResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://uws.provider.com/}GenericResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="providerTrnId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="transactionState" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="transactionStateErrorStatus" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="transactionStateErrorMsg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckTransactionResult", propOrder = {
        "providerTrnId",
        "transactionState",
        "transactionStateErrorStatus",
        "transactionStateErrorMsg"
})
public class CheckTransactionResult extends GenericResult {

    protected long providerTrnId;

    protected int transactionState;

    protected int transactionStateErrorStatus;

    @XmlElement(required = true)
    protected String transactionStateErrorMsg;
}
