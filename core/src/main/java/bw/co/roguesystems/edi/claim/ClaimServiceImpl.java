// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.roguesystems.edi::claim::ClaimService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.edi.claim;

import java.util.Collection;
import java.util.Set;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.edi.claim.ClaimService
 */
@Service("claimService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class ClaimServiceImpl
    extends ClaimServiceBase
{
    public ClaimServiceImpl(
        ClaimEntityDao claimEntity,
        ClaimEntityRepository claimEntityRepository,
        MessageSource messageSource
    ) {
        
        super(
            claimEntity,
            claimEntityRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.edi.claim.ClaimService#findById(Long)
     */
    @Override
    protected Claim handleFindById(Long id)
        throws Exception
    {
        // TODO implement protected  Claim handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.claim.ClaimService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.claim.ClaimService#save(Claim)
     */
    @Override
    protected Claim handleSave(Claim claim)
        throws Exception
    {
        // TODO implement protected  Claim handleSave(Claim claim)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.claim.ClaimService.handleSave(Claim claim) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.claim.ClaimService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.claim.ClaimService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.claim.ClaimService#getAll()
     */
    @Override
    protected Collection<Claim> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<Claim> handleGetAll()
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.claim.ClaimService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.claim.ClaimService#search(String)
     */
    @Override
    protected Collection<Claim> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<Claim> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.claim.ClaimService.handleSearch(String criteria) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.claim.ClaimService#getAll(Integer, Integer)
     */
    @Override
    protected Collection<Claim> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Collection<Claim> handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.claim.ClaimService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.claim.ClaimService#findAllById(Set<Long>)
     */
    @Override
    protected Collection<Claim> handleFindAllById(Set<Long> ids)
        throws Exception
    {
        // TODO implement protected  Collection<Claim> handleFindAllById(Set<Long> ids)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.claim.ClaimService.handleFindAllById(Set<Long> ids) Not implemented!");
    }

}