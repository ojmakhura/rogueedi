package bw.co.roguesystems.edi.site;

import java.io.Serializable;
import java.util.Collection;

import bw.co.roguesystems.edi.address.Address;
import bw.co.roguesystems.edi.systems.EDISystem;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "edi_site")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EDISite implements Serializable, Comparable<EDISite> {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EDI_SITE_SEQ")
    @SequenceGenerator(name="EDI_SITE_SEQ", sequenceName="EDI_SITE_SEQ", allocationSize=1)
    private Long id;

    @Column(name = "NAME", unique = true, nullable = false)
    private String name;
    private String description;

    @OneToOne(optional = false,  fetch = FetchType.EAGER)
    @JoinColumn(name = "ADDRESS_FK", unique = false)
    private Address address;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "ediSite")
    private Collection<EDISystem> ediSystems;

    @Override
    public int compareTo(EDISite arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}
