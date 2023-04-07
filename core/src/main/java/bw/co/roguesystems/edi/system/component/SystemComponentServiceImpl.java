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
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
        // TODO implement protected  SystemComponent handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.system.component.SystemComponentService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.system.component.SystemComponentService#save(SystemComponent)
     */
    @Override
    protected SystemComponent handleSave(SystemComponent systemComponent)
        throws Exception
    {
        // TODO implement protected  SystemComponent handleSave(SystemComponent systemComponent)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.system.component.SystemComponentService.handleSave(SystemComponent systemComponent) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.system.component.SystemComponentService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.system.component.SystemComponentService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.system.component.SystemComponentService#getAll()
     */
    @Override
    protected Collection<SystemComponent> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<SystemComponent> handleGetAll()
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.system.component.SystemComponentService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.system.component.SystemComponentService#search(String)
     */
    @Override
    protected Collection<SystemComponent> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<SystemComponent> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.system.component.SystemComponentService.handleSearch(String criteria) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.system.component.SystemComponentService#getAll(Integer, Integer)
     */
    @Override
    protected Collection<SystemComponent> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Collection<SystemComponent> handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.system.component.SystemComponentService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

}