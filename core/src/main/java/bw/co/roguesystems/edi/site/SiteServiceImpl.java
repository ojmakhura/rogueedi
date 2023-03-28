// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.roguesystems.edi::site::SiteService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.edi.site;

import java.util.Collection;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.edi.site.SiteService
 */
@Service("siteService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class SiteServiceImpl
    extends SiteServiceBase
{
    public SiteServiceImpl(
        SiteEntityDao siteEntity,
        SiteEntityRepository siteEntityRepository,
        MessageSource messageSource
    ) {
        
        super(
            siteEntity,
            siteEntityRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.edi.site.SiteService#findById(Long)
     */
    @Override
    protected Site handleFindById(Long id)
        throws Exception
    {
        // TODO implement protected  Site handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.site.SiteService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.site.SiteService#save(Site)
     */
    @Override
    protected Site handleSave(Site site)
        throws Exception
    {
        // TODO implement protected  Site handleSave(Site site)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.site.SiteService.handleSave(Site site) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.site.SiteService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.site.SiteService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.site.SiteService#getAll()
     */
    @Override
    protected Collection<Site> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<Site> handleGetAll()
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.site.SiteService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.site.SiteService#search(String)
     */
    @Override
    protected Collection<Site> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<Site> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.site.SiteService.handleSearch(String criteria) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.edi.site.SiteService#getAll(Integer, Integer)
     */
    @Override
    protected Collection<Site> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Collection<Site> handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.site.SiteService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

}