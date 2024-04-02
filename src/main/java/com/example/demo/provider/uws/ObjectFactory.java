package com.example.demo.provider.uws;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import lombok.NoArgsConstructor;

import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.provider.uws package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */

@NoArgsConstructor
@XmlRegistry
public class ObjectFactory {

    private static final String NAMESPACE_URI = "http://uws.provider.com/";

    private static final QName _CancelTransactionArguments_QNAME = new QName(NAMESPACE_URI, "CancelTransactionArguments");
    private static final QName _CancelTransactionResult_QNAME = new QName(NAMESPACE_URI, "CancelTransactionResult");
    private static final QName _CheckTransactionArguments_QNAME = new QName(NAMESPACE_URI, "CheckTransactionArguments");
    private static final QName _CheckTransactionResult_QNAME = new QName(NAMESPACE_URI, "CheckTransactionResult");
    private static final QName _GetInformationArguments_QNAME = new QName(NAMESPACE_URI, "GetInformationArguments");
    private static final QName _GetInformationResult_QNAME = new QName(NAMESPACE_URI, "GetInformationResult");
    private static final QName _GetStatementArguments_QNAME = new QName(NAMESPACE_URI, "GetStatementArguments");
    private static final QName _GetStatementResult_QNAME = new QName(NAMESPACE_URI, "GetStatementResult");
    private static final QName _PerformTransactionArguments_QNAME = new QName(NAMESPACE_URI, "PerformTransactionArguments");
    private static final QName _PerformTransactionResult_QNAME = new QName(NAMESPACE_URI, "PerformTransactionResult");
    private static final QName _ChangePasswordArguments_QNAME = new QName(NAMESPACE_URI, "ChangePasswordArguments");
    private static final QName _ChangePasswordResult_QNAME = new QName(NAMESPACE_URI, "ChangePasswordResult");

    public CancelTransactionArguments createCancelTransactionArguments() {
        return new CancelTransactionArguments();
    }

    public CancelTransactionResult createCancelTransactionResult() {
        return new CancelTransactionResult();
    }

    public CheckTransactionArguments createCheckTransactionArguments() {
        return new CheckTransactionArguments();
    }

    public CheckTransactionResult createCheckTransactionResult() {
        return new CheckTransactionResult();
    }

    public GetInformationArguments createGetInformationArguments() {
        return new GetInformationArguments();
    }

    public GetInformationResult createGetInformationResult() {
        return new GetInformationResult();
    }

    public GetStatementArguments createGetStatementArguments() {
        return new GetStatementArguments();
    }

    public GetStatementResult createGetStatementResult() {
        return new GetStatementResult();
    }

    public PerformTransactionArguments createPerformTransactionArguments() {
        return new PerformTransactionArguments();
    }

    public PerformTransactionResult createPerformTransactionResult() {
        return new PerformTransactionResult();
    }

    public ChangePasswordArguments createChangePasswordArguments() {
        return new ChangePasswordArguments();
    }

    public ChangePasswordResult createChangePasswordResult() {
        return new ChangePasswordResult();
    }

    public GenericArguments createGenericArguments() {
        return new GenericArguments();
    }

    public GenericResult createGenericResult() {
        return new GenericResult();
    }

    public GenericParam createGenericParam() {
        return new GenericParam();
    }


    public TransactionStatement createTransactionStatement() {
        return new TransactionStatement();
    }

    @XmlElementDecl(namespace = NAMESPACE_URI, name = "CancelTransactionArguments")
    public JAXBElement<CancelTransactionArguments> createCancelTransactionArguments(CancelTransactionArguments value) {
        return new JAXBElement<>(_CancelTransactionArguments_QNAME, CancelTransactionArguments.class, null, value);
    }

    @XmlElementDecl(namespace = NAMESPACE_URI, name = "CancelTransactionResult")
    public JAXBElement<CancelTransactionResult> createCancelTransactionResult(CancelTransactionResult value) {
        return new JAXBElement<>(_CancelTransactionResult_QNAME, CancelTransactionResult.class, null, value);
    }

    @XmlElementDecl(namespace = NAMESPACE_URI, name = "CheckTransactionArguments")
    public JAXBElement<CheckTransactionArguments> createCheckTransactionArguments(CheckTransactionArguments value) {
        return new JAXBElement<>(_CheckTransactionArguments_QNAME, CheckTransactionArguments.class, null, value);
    }

    @XmlElementDecl(namespace = NAMESPACE_URI, name = "CheckTransactionResult")
    public JAXBElement<CheckTransactionResult> createCheckTransactionResult(CheckTransactionResult value) {
        return new JAXBElement<>(_CheckTransactionResult_QNAME, CheckTransactionResult.class, null, value);
    }

    @XmlElementDecl(namespace = NAMESPACE_URI, name = "GetInformationArguments")
    public JAXBElement<GetInformationArguments> createGetInformationArguments(GetInformationArguments value) {
        return new JAXBElement<>(_GetInformationArguments_QNAME, GetInformationArguments.class, null, value);
    }

    @XmlElementDecl(namespace = NAMESPACE_URI, name = "GetInformationResult")
    public JAXBElement<GetInformationResult> createGetInformationResult(GetInformationResult value) {
        return new JAXBElement<>(_GetInformationResult_QNAME, GetInformationResult.class, null, value);
    }

    @XmlElementDecl(namespace = NAMESPACE_URI, name = "GetStatementArguments")
    public JAXBElement<GetStatementArguments> createGetStatementArguments(GetStatementArguments value) {
        return new JAXBElement<>(_GetStatementArguments_QNAME, GetStatementArguments.class, null, value);
    }

    @XmlElementDecl(namespace = NAMESPACE_URI, name = "GetStatementResult")
    public JAXBElement<GetStatementResult> createGetStatementResult(GetStatementResult value) {
        return new JAXBElement<>(_GetStatementResult_QNAME, GetStatementResult.class, null, value);
    }

    @XmlElementDecl(namespace = NAMESPACE_URI, name = "PerformTransactionArguments")
    public JAXBElement<PerformTransactionArguments> createPerformTransactionArguments(PerformTransactionArguments value) {
        return new JAXBElement<>(_PerformTransactionArguments_QNAME, PerformTransactionArguments.class, null, value);
    }

    @XmlElementDecl(namespace = NAMESPACE_URI, name = "PerformTransactionResult")
    public JAXBElement<PerformTransactionResult> createPerformTransactionResult(PerformTransactionResult value) {
        return new JAXBElement<>(_PerformTransactionResult_QNAME, PerformTransactionResult.class, null, value);
    }

    @XmlElementDecl(namespace = NAMESPACE_URI, name = "ChangePasswordArguments")
    public JAXBElement<ChangePasswordArguments> createChangePasswordArguments(ChangePasswordArguments value) {
        return new JAXBElement<>(_ChangePasswordArguments_QNAME, ChangePasswordArguments.class, null, value);
    }

    @XmlElementDecl(namespace = NAMESPACE_URI, name = "ChangePasswordResult")
    public JAXBElement<ChangePasswordResult> createChangePasswordResult(ChangePasswordResult value) {
        return new JAXBElement<>(_ChangePasswordResult_QNAME, ChangePasswordResult.class, null, value);
    }
}
