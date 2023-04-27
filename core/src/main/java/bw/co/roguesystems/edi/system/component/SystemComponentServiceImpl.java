// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.roguesystems.edi::system::component::SystemComponentService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.edi.system.component;

import java.util.Collection;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import bw.co.roguesystems.edi.RogueediSpecifications;

/**
 * @see bw.co.roguesystems.edi.system.component.SystemComponentService
 */
@Service("systemComponentService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class SystemComponentServiceImpl
    extends SystemComponentServiceBase
{
    public SystemComponentServiceImpl(
        SystemComponentEntityDao systemComponentEntity,
        SystemComponentEntityRepository systemComponentEntityRepository,
        MessageSource messageSource
    ) {
        
        super(
            systemComponentEntity,
            systemComponentEntityRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.edi.system.component.SystemComponentService#findById(Long)
     */
    @Override
    protected SystemComponent handleFindById(Long id)
        throws Exception
    {
        return systemComponentEntityDao.toSystemComponent(systemComponentEntityRepository.getReferenceById(id));
    }

    /**
     * @see bw.co.roguesystems.edi.system.component.SystemComponentService#save(SystemComponent)
     */
    @Override
    protected SystemComponent handleSave(SystemComponent systemComponent)
        throws Exception
    {
        SystemComponentEntity component = systemComponentEntityDao.systemComponentToEntity(systemComponent);
        return systemComponentEntityDao.toSystemComponent(systemComponentEntityRepository.save(component));
    }

    /**
     * @see bw.co.roguesystems.edi.system.component.SystemComponentService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        systemComponentEntityRepository.deleteById(id);
        return true;
    }

    /**
     * @see bw.co.roguesystems.edi.system.component.SystemComponentService#getAll()
     */
    @Override
    protected Collection<SystemComponent> handleGetAll()
        throws Exception
    {
        return systemComponentEntityDao.toSystemComponentCollection(systemComponentEntityRepository.findAll());
    }

    /**
     * @see bw.co.roguesystems.edi.system.component.SystemComponentService#search(String)
     */
    @Override
    protected Collection<SystemComponent> handleSearch(String criteria)
        throws Exception
    {

        Specification<SystemComponentEntity> specs = null;

        if(StringUtils.isNotEmpty(criteria)) {
            specs = RogueediSpecifications.<SystemComponentEntity>findByAttributeContainingIgnoreCase("name", criteria)
                    .or(RogueediSpecifications.<SystemComponentEntity>findByAttributeContainingIgnoreCase("identifier", criteria));
        }

        return systemComponentEntityDao.toSystemComponentCollection(systemComponentEntityRepository.findAll(specs, Sort.by("name").ascending()));

    }

    /**
     * @see bw.co.roguesystems.edi.system.component.SystemComponentService#getAll(Integer, Integer)
     */
    @Override
    protected Collection<SystemComponent> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by("name").ascending());
        return systemComponentEntityDao.toSystemComponentCollection(systemComponentEntityRepository.findAll(pageable).getContent());
    }

}