package bw.co.roguesystems.edi.optimum.patient.detail;

import org.springframework.stereotype.Service;

@Service
public class PatientDetailService {
    
    private PatientDetailRepository patientDetailRepository;

    public PatientDetailService(PatientDetailRepository patientDetailRepository) {
        this.patientDetailRepository = patientDetailRepository;
    }
}
