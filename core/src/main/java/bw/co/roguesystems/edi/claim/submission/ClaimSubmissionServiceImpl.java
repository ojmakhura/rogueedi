// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.roguesystems.edi::claim::submission::ClaimSubmissionService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.edi.claim.submission;

import java.util.Collection;
import java.util.Set;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.edi.claim.submission.ClaimSubmissionService
 */
@Service("claimSubmissionService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class ClaimSubmissionServiceImpl
    extends ClaimSubmissionServiceBase
{
    public ClaimSubmissionServiceImpl(
        ClaimSubmissionEntityDao claimSubmissionEntity,
        ClaimSubmissionEntityRepository claimSubmissionEntityRepository,
        MessageSource messageSource
    ) {
        
        super(
            claimSubmissionEntity,
            claimSubmissionEntityRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.edi.claim.submission.ClaimSubmissionService#findById(Long)
     */
    @Override
    protected ClaimSubmission handleFindById(Long id)
        throws Exception
    {
        // TODO implement protected  ClaimSubmission handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.claim.submission.ClaimSubmissionService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.claim.submission.ClaimSubmissionService#save(ClaimSubmission)
     */
    @Override
    protected ClaimSubmission handleSave(ClaimSubmission claimSubmission)
        throws Exception
    {
        // TODO implement protected  ClaimSubmission handleSave(ClaimSubmission claimSubmission)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.claim.submission.ClaimSubmissionService.handleSave(ClaimSubmission claimSubmission) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.claim.submission.ClaimSubmissionService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.claim.submission.ClaimSubmissionService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.claim.submission.ClaimSubmissionService#getAll()
     */
    @Override
    protected Collection<ClaimSubmission> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<ClaimSubmission> handleGetAll()
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.claim.submission.ClaimSubmissionService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.claim.submission.ClaimSubmissionService#search(String)
     */
    @Override
    protected Collection<ClaimSubmission> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<ClaimSubmission> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.claim.submission.ClaimSubmissionService.handleSearch(String criteria) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.claim.submission.ClaimSubmissionService#getAll(Integer, Integer)
     */
    @Override
    protected Collection<ClaimSubmission> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Collection<ClaimSubmission> handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.claim.submission.ClaimSubmissionService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.claim.submission.ClaimSubmissionService#findAllById(Set<Long>)
     */
    @Override
    protected Collection<ClaimSubmission> handleFindAllById(Set<Long> ids)
        throws Exception
    {
        // TODO implement protected  Collection<ClaimSubmission> handleFindAllById(Set<Long> ids)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.claim.submission.ClaimSubmissionService.handleFindAllById(Set<Long> ids) Not implemented!");
    }

}