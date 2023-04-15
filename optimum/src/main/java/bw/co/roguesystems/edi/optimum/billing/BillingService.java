package bw.co.roguesystems.edi.optimum.billing;

import org.springframework.stereotype.Service;

@Service
public class BillingService {
    
    private final BillingMasterRepository billingMasterRepository;

    public BillingService(BillingMasterRepository billingMasterRepository) {
        this.billingMasterRepository = billingMasterRepository;
    }
}
