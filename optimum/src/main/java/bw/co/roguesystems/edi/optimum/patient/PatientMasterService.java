package bw.co.roguesystems.edi.optimum.patient;

import org.springframework.stereotype.Service;

@Service
public class PatientMasterService {
    
    private final PatientMasterRepository patientMasterRepository;

    public PatientMasterService(PatientMasterRepository patientMasterRepository) {

        this.patientMasterRepository = patientMasterRepository;
    }

}
