// Generated by hibernate/SpringHibernateDaoImpl.vsl in andromda-spring-cartridge on $springUtils.date.
// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package bw.co.roguesystems.edi.system.component;

import bw.co.roguesystems.edi.system.EdiSystemEntityRepository;
import org.springframework.stereotype.Repository;

/**
 * @see SystemComponentEntity
 */
@Repository("systemComponentEntityDao")
public class SystemComponentEntityDaoImpl
    extends SystemComponentEntityDaoBase
{
    
    public SystemComponentEntityDaoImpl(
        EdiSystemEntityRepository ediSystemEntityRepository,
        SystemComponentEntityRepository systemComponentEntityRepository
    ) {

        super(
            ediSystemEntityRepository,
            systemComponentEntityRepository
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void toSystemComponent(
        SystemComponentEntity source,
        SystemComponent target)
    {
        // TODO verify behavior of toSystemComponent
        super.toSystemComponent(source, target);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemComponent toSystemComponent(final SystemComponentEntity entity)
    {
        // TODO verify behavior of toSystemComponent
        return super.toSystemComponent(entity);
    }

    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private SystemComponentEntity loadSystemComponentEntityFromSystemComponent(SystemComponent systemComponent)
    {
        // TODO implement loadSystemComponentEntityFromSystemComponent
        throw new UnsupportedOperationException("bw.co.roguesystems.edi.system.component.loadSystemComponentEntityFromSystemComponent(SystemComponent) not yet implemented.");

        /* A typical implementation looks like this:
        if (systemComponent.getId() == null)
        {
            return  SystemComponentEntity.Factory.newInstance();
        }
        else
        {
            return this.load(systemComponent.getId());
        }
        */
    }

    /**
     * {@inheritDoc}
     */
    public SystemComponentEntity systemComponentToEntity(SystemComponent systemComponent)
    {
        // TODO verify behavior of systemComponentToEntity
        SystemComponentEntity entity = this.loadSystemComponentEntityFromSystemComponent(systemComponent);
        this.systemComponentToEntity(systemComponent, entity, true);
        return entity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void systemComponentToEntity(
        SystemComponent source,
        SystemComponentEntity target,
        boolean copyIfNull)
    {
        // TODO verify behavior of systemComponentToEntity
        super.systemComponentToEntity(source, target, copyIfNull);
    }
}