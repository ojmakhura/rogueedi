package bw.co.roguesystems.edi.optimum.billing;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Lb_BlMt_Bill_Mast_T")
public class BillingMaster {
    
    @Column(name = "BlMt_Firm_Code")
    private String firmCode;
    
    @Column(name = "BlMt_Bill_No")
    private String billNo;
    
    @Column(name = "BlMt_Bill_Date")
    private LocalDateTime billDate;
    
    @Column(name = "BlMt_Bill_Type")
    private String billType;
    
    @Column(name = "BlMt_Year")
    private String year;
    
    @Column(name = "BlMt_Sid_No")
    private String sidNo;
    
    @Column(name = "BlMt_Sid_Date")
    private LocalDateTime sidDate;
    
    @Column(name = "BlMt_Bill_Amount")
    private String billingAmount;
    
    @Column(name = "BlMt_Pay_No")
    private String payNo;
    
    @Column(name = "BlMt_Pay_Date")
    private LocalDateTime payDate;
    
    @Column(name = "BlMt_Due_Amount")
    private String dueAmount;
    
    // @Column(name = "BlMt_Pay_Mode")
    // private String payMode;
    
    // @Column(name = "BlMt_Pay_Mode")
    // private String payMode;
    
    // @Column(name = "BlMt_Pay_Mode")
    // private String payMode;
    
    // @Column(name = "BlMt_Pay_Mode")
    // private String payMode;
    
    // @Column(name = "BlMt_Pay_Mode")
    // private String payMode;

}
