// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.roguesystems.edi::system::EdiSystemService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.edi.system;

import java.util.Collection;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.edi.system.EdiSystemService
 */
@Service("ediSystemService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class EdiSystemServiceImpl
    extends EdiSystemServiceBase
{
    public EdiSystemServiceImpl(
        EdiSystemEntityDao ediSystemEntity,
        EdiSystemEntityRepository ediSystemEntityRepository,
        MessageSource messageSource
    ) {
        
        super(
            ediSystemEntity,
            ediSystemEntityRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.edi.system.EdiSystemService#findById(Long)
     */
    @Override
    protected EdiSystem handleFindById(Long id)
        throws Exception
    {
        // TODO implement protected  EdiSystem handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.system.EdiSystemService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.system.EdiSystemService#save(EdiSystem)
     */
    @Override
    protected EdiSystem handleSave(EdiSystem ediSystem)
        throws Exception
    {

        System.out.println("---------------------------------");

        EdiSystemEntity entity = getEdiSystemEntityDao().ediSystemToEntity(ediSystem);
        System.out.println("--");
        entity = getEdiSystemEntityRepository().save(entity);
        System.out.println("::");

        return getEdiSystemEntityDao().toEdiSystem(entity);
        // TODO implement protected  EdiSystem handleSave(EdiSystem ediSystem)
        // throw new UnsupportedOperationException("bw.co.roguesystems.edi.system.EdiSystemService.handleSave(EdiSystem ediSystem) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.system.EdiSystemService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.system.EdiSystemService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.system.EdiSystemService#getAll()
     */
    @Override
    protected Collection<EdiSystem> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<EdiSystem> handleGetAll()
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.system.EdiSystemService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.system.EdiSystemService#search(String)
     */
    @Override
    protected Collection<EdiSystem> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<EdiSystem> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.system.EdiSystemService.handleSearch(String criteria) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.system.EdiSystemService#getAll(Integer, Integer)
     */
    @Override
    protected Collection<EdiSystem> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Collection<EdiSystem> handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.system.EdiSystemService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

}