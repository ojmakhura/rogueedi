package bw.co.roguesystems.edi.optimum.patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PatientMasterRepository extends 
                        JpaRepository<PatientMaster, PatientMasterId>, JpaSpecificationExecutor<PatientMaster>  {
    
}
