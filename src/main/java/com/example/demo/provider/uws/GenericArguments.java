package com.example.demo.provider.uws;

import jakarta.xml.bind.annotation.*;
import lombok.Getter;
import lombok.Setter;


/**
 * <p>Java class for GenericArguments complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GenericArguments"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericArguments", propOrder = {
        "password",
        "username"
})
@XmlSeeAlso({
        CancelTransactionArguments.class,
        CheckTransactionArguments.class,
        GetInformationArguments.class,
        GetStatementArguments.class,
        PerformTransactionArguments.class,
        ChangePasswordArguments.class
})
public class GenericArguments {

    @XmlElement(required = true)
    protected String password;

    @XmlElement(required = true)
    protected String username;
}
