
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.responsemessagehandlerservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import budgetuserlibrary.gw.fmis.ibm.hr.interfaces.responsemessagehandlerservice.binding2.ResponseMessageHandlerServiceExportResponseMessageHandlerServiceHttpService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2011-12-05T12:37:56.862+01:00
 * Generated source version: 2.4.0
 * 
 */
public final class ResponseMessageHandlerService_ResponseMessageHandlerServiceExportResponseMessageHandlerServiceHttpPort_Client {

    private static final QName SERVICE_NAME = new QName("http://hr.ibm.fmis.gw.BudgetUserLibrary/interfaces/ResponseMessageHandlerService/Binding2", "ResponseMessageHandlerServiceExport_ResponseMessageHandlerServiceHttpService");

    private ResponseMessageHandlerService_ResponseMessageHandlerServiceExportResponseMessageHandlerServiceHttpPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = ResponseMessageHandlerServiceExportResponseMessageHandlerServiceHttpService.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ResponseMessageHandlerServiceExportResponseMessageHandlerServiceHttpService ss = new ResponseMessageHandlerServiceExportResponseMessageHandlerServiceHttpService(wsdlURL, SERVICE_NAME);
        ResponseMessageHandlerService port = ss.getResponseMessageHandlerServiceExportResponseMessageHandlerServiceHttpPort();  
        
        {
        System.out.println("Invoking getPaymentExecutionListStartingWithMessageId...");
        java.lang.String _getPaymentExecutionListStartingWithMessageId_logicalSystemName = "_getPaymentExecutionListStartingWithMessageId_logicalSystemName848007126";
        java.lang.Long _getPaymentExecutionListStartingWithMessageId_messageId = Long.valueOf(2259185400731745442l);
        java.lang.Object _getPaymentExecutionListStartingWithMessageId__return = port.getPaymentExecutionListStartingWithMessageId(_getPaymentExecutionListStartingWithMessageId_logicalSystemName, _getPaymentExecutionListStartingWithMessageId_messageId);
        System.out.println("getPaymentExecutionListStartingWithMessageId.result=" + _getPaymentExecutionListStartingWithMessageId__return);


        }
        {
        System.out.println("Invoking getPurchaseOrderResponseListStartingWithMessageId...");
        java.lang.String _getPurchaseOrderResponseListStartingWithMessageId_logicalSystemName = "_getPurchaseOrderResponseListStartingWithMessageId_logicalSystemName1882240435";
        java.lang.Long _getPurchaseOrderResponseListStartingWithMessageId_messageId = Long.valueOf(3285879925812762154l);
        java.lang.Object _getPurchaseOrderResponseListStartingWithMessageId__return = port.getPurchaseOrderResponseListStartingWithMessageId(_getPurchaseOrderResponseListStartingWithMessageId_logicalSystemName, _getPurchaseOrderResponseListStartingWithMessageId_messageId);
        System.out.println("getPurchaseOrderResponseListStartingWithMessageId.result=" + _getPurchaseOrderResponseListStartingWithMessageId__return);


        }
        {
        System.out.println("Invoking getVendorUpdatesListStartingWithMessageId...");
        java.lang.String _getVendorUpdatesListStartingWithMessageId_logicalSystemName = "_getVendorUpdatesListStartingWithMessageId_logicalSystemName-1736969764";
        java.lang.Long _getVendorUpdatesListStartingWithMessageId_messageId = Long.valueOf(1572614188513467936l);
        java.lang.Object _getVendorUpdatesListStartingWithMessageId__return = port.getVendorUpdatesListStartingWithMessageId(_getVendorUpdatesListStartingWithMessageId_logicalSystemName, _getVendorUpdatesListStartingWithMessageId_messageId);
        System.out.println("getVendorUpdatesListStartingWithMessageId.result=" + _getVendorUpdatesListStartingWithMessageId__return);


        }
        {
        System.out.println("Invoking getReservationResponseListStartingWithMessageId...");
        java.lang.String _getReservationResponseListStartingWithMessageId_logicalSystemName = "_getReservationResponseListStartingWithMessageId_logicalSystemName2002244944";
        java.lang.Long _getReservationResponseListStartingWithMessageId_messageId = Long.valueOf(2956841501748727704l);
        java.lang.Object _getReservationResponseListStartingWithMessageId__return = port.getReservationResponseListStartingWithMessageId(_getReservationResponseListStartingWithMessageId_logicalSystemName, _getReservationResponseListStartingWithMessageId_messageId);
        System.out.println("getReservationResponseListStartingWithMessageId.result=" + _getReservationResponseListStartingWithMessageId__return);


        }
        {
        System.out.println("Invoking getContractResponseList...");
        java.lang.String _getContractResponseList_logicalSystemName = "_getContractResponseList_logicalSystemName103292902";
        java.lang.Object _getContractResponseList__return = port.getContractResponseList(_getContractResponseList_logicalSystemName);
        System.out.println("getContractResponseList.result=" + _getContractResponseList__return);


        }
        {
        System.out.println("Invoking getBankUpdatesList...");
        java.lang.String _getBankUpdatesList_logicalSystemName = "_getBankUpdatesList_logicalSystemName1390253176";
        java.lang.Object _getBankUpdatesList__return = port.getBankUpdatesList(_getBankUpdatesList_logicalSystemName);
        System.out.println("getBankUpdatesList.result=" + _getBankUpdatesList__return);


        }
        {
        System.out.println("Invoking getBankUpdatesListStartingWithMessageId...");
        java.lang.String _getBankUpdatesListStartingWithMessageId_logicalSystemName = "_getBankUpdatesListStartingWithMessageId_logicalSystemName-809029705";
        java.lang.Long _getBankUpdatesListStartingWithMessageId_messageId = Long.valueOf(7976208711176604334l);
        java.lang.Object _getBankUpdatesListStartingWithMessageId__return = port.getBankUpdatesListStartingWithMessageId(_getBankUpdatesListStartingWithMessageId_logicalSystemName, _getBankUpdatesListStartingWithMessageId_messageId);
        System.out.println("getBankUpdatesListStartingWithMessageId.result=" + _getBankUpdatesListStartingWithMessageId__return);


        }
        {
        System.out.println("Invoking getVendorUpdatesList...");
        java.lang.String _getVendorUpdatesList_logicalSystemName = "_getVendorUpdatesList_logicalSystemName1474709840";
        java.lang.Object _getVendorUpdatesList__return = port.getVendorUpdatesList(_getVendorUpdatesList_logicalSystemName);
        System.out.println("getVendorUpdatesList.result=" + _getVendorUpdatesList__return);


        }
        {
        System.out.println("Invoking getInvoiceResponseList...");
        java.lang.String _getInvoiceResponseList_logicalSystemName = "_getInvoiceResponseList_logicalSystemName-1340223544";
        java.lang.Object _getInvoiceResponseList__return = port.getInvoiceResponseList(_getInvoiceResponseList_logicalSystemName);
        System.out.println("getInvoiceResponseList.result=" + _getInvoiceResponseList__return);


        }
        {
        System.out.println("Invoking getAllResponseList...");
        java.lang.String _getAllResponseList_logicalSystemName = "_getAllResponseList_logicalSystemName-972104159";
        java.lang.Object _getAllResponseList__return = port.getAllResponseList(_getAllResponseList_logicalSystemName);
        System.out.println("getAllResponseList.result=" + _getAllResponseList__return);


        }
        {
        System.out.println("Invoking getReservationResponseList...");
        java.lang.String _getReservationResponseList_logicalSystemName = "_getReservationResponseList_logicalSystemName1570575293";
        java.lang.Object _getReservationResponseList__return = port.getReservationResponseList(_getReservationResponseList_logicalSystemName);
        System.out.println("getReservationResponseList.result=" + _getReservationResponseList__return);


        }
        {
        System.out.println("Invoking getInvoiceResponseListStartingWithMessageId...");
        java.lang.String _getInvoiceResponseListStartingWithMessageId_logicalSystemName = "_getInvoiceResponseListStartingWithMessageId_logicalSystemName1221341342";
        java.lang.Long _getInvoiceResponseListStartingWithMessageId_messageId = Long.valueOf(187458634149059774l);
        java.lang.Object _getInvoiceResponseListStartingWithMessageId__return = port.getInvoiceResponseListStartingWithMessageId(_getInvoiceResponseListStartingWithMessageId_logicalSystemName, _getInvoiceResponseListStartingWithMessageId_messageId);
        System.out.println("getInvoiceResponseListStartingWithMessageId.result=" + _getInvoiceResponseListStartingWithMessageId__return);


        }
        {
        System.out.println("Invoking getContractResponseListStartingWithMessageId...");
        java.lang.String _getContractResponseListStartingWithMessageId_logicalSystemName = "_getContractResponseListStartingWithMessageId_logicalSystemName1493212423";
        java.lang.Long _getContractResponseListStartingWithMessageId_messageId = Long.valueOf(4005418455449478403l);
        java.lang.Object _getContractResponseListStartingWithMessageId__return = port.getContractResponseListStartingWithMessageId(_getContractResponseListStartingWithMessageId_logicalSystemName, _getContractResponseListStartingWithMessageId_messageId);
        System.out.println("getContractResponseListStartingWithMessageId.result=" + _getContractResponseListStartingWithMessageId__return);


        }
        {
        System.out.println("Invoking getPurchaseOrderResponseList...");
        java.lang.String _getPurchaseOrderResponseList_logicalSystemName = "_getPurchaseOrderResponseList_logicalSystemName1186393356";
        java.lang.Object _getPurchaseOrderResponseList__return = port.getPurchaseOrderResponseList(_getPurchaseOrderResponseList_logicalSystemName);
        System.out.println("getPurchaseOrderResponseList.result=" + _getPurchaseOrderResponseList__return);


        }
        {
        System.out.println("Invoking getPaymentExecutionList...");
        java.lang.String _getPaymentExecutionList_logicalSystemName = "_getPaymentExecutionList_logicalSystemName-743724591";
        java.lang.Object _getPaymentExecutionList__return = port.getPaymentExecutionList(_getPaymentExecutionList_logicalSystemName);
        System.out.println("getPaymentExecutionList.result=" + _getPaymentExecutionList__return);


        }
        {
        System.out.println("Invoking getAllResponseListStartingWithMessageId...");
        java.lang.String _getAllResponseListStartingWithMessageId_logicalSystemName = "_getAllResponseListStartingWithMessageId_logicalSystemName314994187";
        java.lang.Long _getAllResponseListStartingWithMessageId_messageId = Long.valueOf(-4192823889397524263l);
        java.lang.Object _getAllResponseListStartingWithMessageId__return = port.getAllResponseListStartingWithMessageId(_getAllResponseListStartingWithMessageId_logicalSystemName, _getAllResponseListStartingWithMessageId_messageId);
        System.out.println("getAllResponseListStartingWithMessageId.result=" + _getAllResponseListStartingWithMessageId__return);


        }

        System.exit(0);
    }

}
