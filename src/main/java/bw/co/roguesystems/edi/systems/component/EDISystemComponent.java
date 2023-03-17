package bw.co.roguesystems.edi.systems.component;

import java.util.Collection;

import bw.co.roguesystems.edi.systems.component.element.ComponentElement;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "edi_system_component")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EDISystemComponent {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EDI_SYSTEM_COMPONENT_SEQ")
    @SequenceGenerator(name="EDI_SYSTEM_COMPONENT_SEQ", sequenceName="EDI_SYSTEM_COMPONENT_SEQ", allocationSize=1)
    private Long id;

    private String path;

    @Column(name = "TYPE", unique = false, nullable = false, insertable = true, updatable = true)
    @Enumerated(EnumType.STRING)
    private SystemComponentType type;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "componentElement")
    private Collection<ComponentElement> componentElements;
}
