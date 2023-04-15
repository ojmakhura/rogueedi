package bw.co.roguesystems.edi.optimum.patient;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Lb_PtMt_Patient_Mast_T")
@IdClass(PatientMasterId.class)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PatientMaster {
    
    @Id
    @Column(name = "PtMt_Firm_Code")
    private String firmCode;

    @Id
    @Column(name = "PtMt_Pt_Code")
    private String patientCode;

    @Column(name = "PtMt_Member_Code")
    private String memberCode;

    @Column(name = "PtMt_Title_Code")
    private String titleCode;

    @Column(name = "PtMt_FName")
    private String firstName;

    @Column(name = "PtMt_MName")
    private String middleName;

    @Column(name = "PtMt_LName")
    private String lastName;

    @Column(name = "PtMt_Dob")
    private Date dob;

    @Column(name = "PtMt_Medaid_No")
    private String medicalAidNo;

    @Column(name = "PtMt_Member_Name")
    private String memberName;

    @Column(name = "PtMt_Rel_Name")
    private String relationship;

}
