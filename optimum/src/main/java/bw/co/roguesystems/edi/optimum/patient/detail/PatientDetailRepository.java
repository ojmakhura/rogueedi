package bw.co.roguesystems.edi.optimum.patient.detail;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PatientDetailRepository extends 
                            JpaRepository<PatientDetail, PatientDetailId>, JpaSpecificationExecutor<PatientDetail> {
    
}
