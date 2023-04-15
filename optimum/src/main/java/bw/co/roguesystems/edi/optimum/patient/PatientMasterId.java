package bw.co.roguesystems.edi.optimum.patient;

import java.io.Serializable;

public class PatientMasterId implements Serializable {

    private String firmCode;
    private String patientCode;

    public PatientMasterId(String firmCode, String patientCode) {
        this.firmCode = firmCode;
        this.patientCode = patientCode;
    }

    public String getFirmCode() {
        return firmCode;
    }

    public void setFirmCode(String firmCode) {
        this.firmCode = firmCode;
    }

    public String getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }

    @Override
    public String toString() {
        return "PatientMasterId [firmCode=" + firmCode + ", patientCode=" + patientCode + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firmCode == null) ? 0 : firmCode.hashCode());
        result = prime * result + ((patientCode == null) ? 0 : patientCode.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PatientMasterId other = (PatientMasterId) obj;
        if (firmCode == null) {
            if (other.firmCode != null)
                return false;
        } else if (!firmCode.equals(other.firmCode))
            return false;
        if (patientCode == null) {
            if (other.patientCode != null)
                return false;
        } else if (!patientCode.equals(other.patientCode))
            return false;
        return true;
    }

}
