package bw.co.roguesystems.edi.optimum.billing;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BillingMasterRepository extends 
                        JpaRepository, JpaSpecificationExecutor<BillingMaster> {
    
}
