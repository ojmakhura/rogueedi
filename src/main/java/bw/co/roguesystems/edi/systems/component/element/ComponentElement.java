package bw.co.roguesystems.edi.systems.component.element;

import bw.co.roguesystems.edi.systems.component.EDISystemComponent;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "component_element")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ComponentElement {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COMPONENT_ELEMENT_SEQ")
    @SequenceGenerator(name="COMPONENT_ELEMENT_SEQ", sequenceName="COMPONENT_ELEMENT_SEQ", allocationSize=1)
    private Long id;
    
    private String name;

    private String description;

    private ComponentElementType elementType;

    @ManyToOne(optional = false,  fetch = FetchType.LAZY)
    @JoinColumn(name = "EDI_SYSTEM_COMPONENT_FK", unique = false)
    private EDISystemComponent systemComponent;
}
