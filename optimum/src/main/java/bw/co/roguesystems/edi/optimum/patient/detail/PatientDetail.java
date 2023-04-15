package bw.co.roguesystems.edi.optimum.patient.detail;

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
@Table(name = "Lb_PtDt_Patient_Detail_T")
@IdClass(PatientDetailId.class)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PatientDetail {
    
    @Id
    @Column(name = "PtDt_Firm_Code")
    private String firmCode;
    
    @Id
    @Column(name = "PtDt_Year")
    private String year;
    
    @Id
    @Column(name = "PtDt_Sid_No")
    private String sidNo;
    
    @Id
    @Column(name = "PtDt_Sid_Date")
    private String sidDate;

    @Column(name = "PtDt_Pt_Firm_Code")
    private String patientFirmCode;

    @Column(name = "PtDt_Amount")
    private String amount;

    @Column(name = "PtDt_Discount")
    private String discount;

    @Column(name = "PtDt_Vat_Percent")
    private String vatPercent;

    @Column(name = "PtDt_Vat_Amount")
    private String vatAmount;

    @Column(name = "PtDt_Advance")
    private String advance;

    @Column(name = "PtDt_Guar_Advance")
    private String guarAdvance;

    @Column(name = "PtDt_Due")
    private String due;

    @Column(name = "PtDt_Guar_Due")
    private String guarDue;

    @Column(name = "PtDt_Inv_No")
    private String invoiceNo;

    @Column(name = "PtDt_Inv_Date")
    private String invoiceDate; 

    @Column(name = "PtDt_Doctor_Practise_No")
    private String doctorPracticeNo;

    @Column(name = "PtDt_Phy_Code")
    private String phyCode;

    @Column(name = "PtDt_Ref_Type")
    private String referenceType;

    @Column(name = "PtDt_Ref_Code")
    private String referenceCode;

    @Column(name = "PtDt_Price_Value")
    private String priceValue;

    @Column(name = "PtDt_Pay_Vat")
    private String payVat;

    @Column(name = "PtDt_Medaid_No")
    private String medicalAidNo;

    @Column(name = "PtDt_Barcode")
    private String barcode;
    
}
