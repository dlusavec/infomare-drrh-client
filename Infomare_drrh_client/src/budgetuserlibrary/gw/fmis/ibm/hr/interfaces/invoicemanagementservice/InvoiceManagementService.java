package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.invoicemanagementservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2011-10-26T15:54:41.853+02:00
 * Generated source version: 2.4.0
 * 
 */
 
@WebService(targetNamespace = "http://hr.ibm.fmis.gw.BudgetUserLibrary/interfaces/InvoiceManagementService", name = "InvoiceManagementService")
@XmlSeeAlso({budgetuserlibrary.gw.fmis.ibm.hr.infotypes.ObjectFactory.class, ObjectFactory.class, budgetuserlibrary.gw.fmis.ibm.hr.messages.ObjectFactory.class, bufmisbudgetexecution.gw.fmis.ibm.hr.infotypes.ObjectFactory.class})
public interface InvoiceManagementService {

    @WebResult(name = "InvoiceResponseMsg", targetNamespace = "")
    @RequestWrapper(localName = "changeInvoice", targetNamespace = "http://hr.ibm.fmis.gw.BudgetUserLibrary/interfaces/InvoiceManagementService", className = "budgetuserlibrary.gw.fmis.ibm.hr.interfaces.invoicemanagementservice.ChangeInvoice")
    @WebMethod
    @ResponseWrapper(localName = "changeInvoiceResponse", targetNamespace = "http://hr.ibm.fmis.gw.BudgetUserLibrary/interfaces/InvoiceManagementService", className = "budgetuserlibrary.gw.fmis.ibm.hr.interfaces.invoicemanagementservice.ChangeInvoiceResponse")
    public budgetuserlibrary.gw.fmis.ibm.hr.messages.InvoiceResponseMsg changeInvoice(
        @WebParam(name = "InvoiceChangeRequestMsg", targetNamespace = "")
        budgetuserlibrary.gw.fmis.ibm.hr.messages.InvoiceChangeRequestMsg invoiceChangeRequestMsg
    );

    @WebResult(name = "InvoiceResponseMsg", targetNamespace = "")
    @RequestWrapper(localName = "reverseInvoice", targetNamespace = "http://hr.ibm.fmis.gw.BudgetUserLibrary/interfaces/InvoiceManagementService", className = "budgetuserlibrary.gw.fmis.ibm.hr.interfaces.invoicemanagementservice.ReverseInvoice")
    @WebMethod
    @ResponseWrapper(localName = "reverseInvoiceResponse", targetNamespace = "http://hr.ibm.fmis.gw.BudgetUserLibrary/interfaces/InvoiceManagementService", className = "budgetuserlibrary.gw.fmis.ibm.hr.interfaces.invoicemanagementservice.ReverseInvoiceResponse")
    public budgetuserlibrary.gw.fmis.ibm.hr.messages.InvoiceResponseMsg reverseInvoice(
        @WebParam(name = "InvoiceReverseRequestMsg", targetNamespace = "")
        budgetuserlibrary.gw.fmis.ibm.hr.messages.InvoiceReverseRequestMsg invoiceReverseRequestMsg
    );

    @WebResult(name = "InvoiceResponseMsg", targetNamespace = "")
    @RequestWrapper(localName = "createInvoice", targetNamespace = "http://hr.ibm.fmis.gw.BudgetUserLibrary/interfaces/InvoiceManagementService", className = "budgetuserlibrary.gw.fmis.ibm.hr.interfaces.invoicemanagementservice.CreateInvoice")
    @WebMethod
    @ResponseWrapper(localName = "createInvoiceResponse", targetNamespace = "http://hr.ibm.fmis.gw.BudgetUserLibrary/interfaces/InvoiceManagementService", className = "budgetuserlibrary.gw.fmis.ibm.hr.interfaces.invoicemanagementservice.CreateInvoiceResponse")
    public budgetuserlibrary.gw.fmis.ibm.hr.messages.InvoiceResponseMsg createInvoice(
        @WebParam(name = "InvoiceCreateRequestMsg", targetNamespace = "")
        budgetuserlibrary.gw.fmis.ibm.hr.messages.InvoiceCreateRequestMsg invoiceCreateRequestMsg
    );
}
