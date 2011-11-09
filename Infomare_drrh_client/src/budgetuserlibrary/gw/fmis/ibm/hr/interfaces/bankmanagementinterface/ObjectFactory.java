
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.bankmanagementinterface;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the budgetuserlibrary.gw.fmis.ibm.hr.interfaces.bankmanagementinterface package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: budgetuserlibrary.gw.fmis.ibm.hr.interfaces.bankmanagementinterface
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateBank }
     * 
     */
    public CreateBank createCreateBank() {
        return new CreateBank();
    }

    /**
     * Create an instance of {@link ChangeBank }
     * 
     */
    public ChangeBank createChangeBank() {
        return new ChangeBank();
    }

    /**
     * Create an instance of {@link ChangeBankResponse }
     * 
     */
    public ChangeBankResponse createChangeBankResponse() {
        return new ChangeBankResponse();
    }

    /**
     * Create an instance of {@link RetrieveBankResponse }
     * 
     */
    public RetrieveBankResponse createRetrieveBankResponse() {
        return new RetrieveBankResponse();
    }

    /**
     * Create an instance of {@link CreateBankResponse }
     * 
     */
    public CreateBankResponse createCreateBankResponse() {
        return new CreateBankResponse();
    }

    /**
     * Create an instance of {@link RetrieveBank }
     * 
     */
    public RetrieveBank createRetrieveBank() {
        return new RetrieveBank();
    }

}
