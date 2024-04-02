package com.example.demo.provider.uws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for GetStatementResult complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetStatementResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://uws.provider.com/}GenericResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="statements" type="{http://uws.provider.com/}TransactionStatement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStatementResult", propOrder = {
        "statements"
})
public class GetStatementResult extends GenericResult {

    @XmlElement(nillable = true)
    protected List<TransactionStatement> statements;

    public List<TransactionStatement> getStatements() {
        if (statements == null) {
            statements = new ArrayList<>();
        }
        return this.statements;
    }

}
