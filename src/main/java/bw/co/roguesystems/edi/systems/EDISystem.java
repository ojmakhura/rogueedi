package bw.co.roguesystems.edi.systems;

import java.io.Serializable;

import bw.co.roguesystems.edi.site.EDISite;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "edi_system", uniqueConstraints= {
    @UniqueConstraint(name="edi_system_unique", columnNames={"URL", "EDI_SITE_FK"})
})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class EDISystem implements Serializable, Comparable<EDISystem> {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EDI_SYSTEM_SEQ")
    @SequenceGenerator(name="EDI_SYSTEM_SEQ", sequenceName="EDI_SYSTEM_SEQ", allocationSize=1)
    private Long id;

    @Column(name = "NAME", unique = true, nullable = false)
    private String name;
    private String description;

    @Column(name = "URL", unique = true, nullable = false)
    private String url;

    @ManyToOne(optional = false,  fetch = FetchType.LAZY)
    @JoinColumn(name = "EDI_SITE_FK", unique = false)
    private EDISite ediSite;
    
    @Override
    public int compareTo(EDISystem arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
    
}
