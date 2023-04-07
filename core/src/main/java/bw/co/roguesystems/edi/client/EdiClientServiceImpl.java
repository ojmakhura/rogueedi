// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::backend::bw.co.roguesystems.edi::client::EdiClientService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.edi.client;

import java.util.Collection;
import java.util.Set;

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
 * @see bw.co.roguesystems.edi.client.EdiClientService
 */
@Service("ediClientService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class EdiClientServiceImpl
    extends EdiClientServiceBase
{
    public EdiClientServiceImpl(
        EdiClientEntityDao ediClientEntity,
        EdiClientEntityRepository ediClientEntityRepository,
        MessageSource messageSource
    ) {
        
        super(
            ediClientEntity,
            ediClientEntityRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.edi.client.EdiClientService#findById(Long)
     */
    @Override
    protected EdiClient handleFindById(Long id)
        throws Exception
    {
        return getEdiClientEntityDao().toEdiClient(ediClientEntityRepository.getReferenceById(id));
    }

    /**
     * @see bw.co.roguesystems.edi.client.EdiClientService#save(EdiClient)
     */
    @Override
    protected EdiClient handleSave(EdiClient client)
        throws Exception
    {
        EdiClientEntity entity = ediClientEntityDao.ediClientToEntity(client);
        entity = ediClientEntityRepository.save(entity);

        return ediClientEntityDao.toEdiClient(entity);
    }

    /**
     * @see bw.co.roguesystems.edi.client.EdiClientService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        ediClientEntityRepository.deleteById(id);
        return true;
    }

    /**
     * @see bw.co.roguesystems.edi.client.EdiClientService#getAll()
     */
    @Override
    protected Collection<EdiClient> handleGetAll()
        throws Exception
    {
        return ediClientEntityDao.toEdiClientCollection(ediClientEntityRepository.findAll());
    }

    /**
     * @see bw.co.roguesystems.edi.client.EdiClientService#search(String)
     */
    @Override
    protected Collection<EdiClient> handleSearch(String criteria)
        throws Exception
    {
        Specification<EdiClientEntity> spec = null;
        if(StringUtils.isNotBlank(criteria)) {
            spec = RogueediSpecifications.<EdiClientEntity>findByAttributeContainingIgnoreCase("name", criteria)
                    .or(RogueediSpecifications.<EdiClientEntity>findByAttributeContainingIgnoreCase("name", criteria));
        }

        return ediClientEntityDao.toEdiClientCollection(ediClientEntityRepository.findAll(spec, Sort.by("name").ascending()));
    }

    /**
     * @see bw.co.roguesystems.edi.client.EdiClientService#getAll(Integer, Integer)
     */
    @Override
    protected Collection<EdiClient> handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        Pageable page = PageRequest.of(pageNumber, pageSize);
        return ediClientEntityDao.toEdiClientCollection(ediClientEntityRepository.findAll(page).getContent());
    }

    @Override
    protected Collection<EdiClient> handleFindAllById(Set<Long> ids) throws Exception {
        
        return ediClientEntityDao.toEdiClientCollection(ediClientEntityRepository.findAllById(ids));
    }

}