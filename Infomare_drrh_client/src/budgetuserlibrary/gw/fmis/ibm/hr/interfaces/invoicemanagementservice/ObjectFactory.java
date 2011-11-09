
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.invoicemanagementservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the budgetuserlibrary.gw.fmis.ibm.hr.interfaces.invoicemanagementservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: budgetuserlibrary.gw.fmis.ibm.hr.interfaces.invoicemanagementservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChangeInvoice }
     * 
     */
    public ChangeInvoice createChangeInvoice() {
        return new ChangeInvoice();
    }

    /**
     * Create an instance of {@link ReverseInvoice }
     * 
     */
    public ReverseInvoice createReverseInvoice() {
        return new ReverseInvoice();
    }

    /**
     * Create an instance of {@link CreateInvoiceResponse }
     * 
     */
    public CreateInvoiceResponse createCreateInvoiceResponse() {
        return new CreateInvoiceResponse();
    }

    /**
     * Create an instance of {@link CreateInvoice }
     * 
     */
    public CreateInvoice createCreateInvoice() {
        return new CreateInvoice();
    }

    /**
     * Create an instance of {@link ChangeInvoiceResponse }
     * 
     */
    public ChangeInvoiceResponse createChangeInvoiceResponse() {
        return new ChangeInvoiceResponse();
    }

    /**
     * Create an instance of {@link ReverseInvoiceResponse }
     * 
     */
    public ReverseInvoiceResponse createReverseInvoiceResponse() {
        return new ReverseInvoiceResponse();
    }

}
