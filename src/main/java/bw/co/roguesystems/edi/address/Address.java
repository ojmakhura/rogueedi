package bw.co.roguesystems.edi.address;

import java.io.Serializable;

import bw.co.roguesystems.edi.site.EDISite;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

public class Address implements Serializable, Comparable<Address> {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EDI_SITE_SEQ")
    @SequenceGenerator(name="EDI_SITE_SEQ", sequenceName="EDI_SITE_SEQ", allocationSize=1)
    private Long id;

    @OneToOne(mappedBy = "address")
    private EDISite ediSite;

    @Override
    public int compareTo(Address arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
    
}
