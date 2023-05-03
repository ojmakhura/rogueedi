package bw.co.roguesystems.edi.medscheme;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class MedschemeClient extends WebServiceGatewaySupport {

    public ClaimRequest processClaim(ClaimRequest request, String url) {
        
        return (ClaimRequest) getWebServiceTemplate()
                .marshalSendAndReceive(url, request);
    }
}
