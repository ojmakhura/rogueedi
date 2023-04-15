package bw.co.roguesystems.edi.optimum.patient.detail;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PatientDetailId implements Serializable {
    
    private String firmCode;
    
    private String year;
    
    private String sidNo;
    
    private String sidDate;


}
