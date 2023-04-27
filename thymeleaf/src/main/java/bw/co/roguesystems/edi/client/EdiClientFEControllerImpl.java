// license-header java merge-point
// Generated by andromda-thymeleaf cartridge (controllers\ControllerImpl.java.vsl)
package bw.co.roguesystems.edi.client;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @see bw.co.roguesystems.edi.client.EdiClientFEController
 */
@Controller
@RequestMapping("/client")
public class EdiClientFEControllerImpl
        extends EdiClientFEControllerBase {
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 8095160191412822097L;

    public EdiClientFEControllerImpl(EdiClientService ediClientService) {

        super(
                ediClientService);
    }

    /**
     * @see bw.co.roguesystems.edi.client.EdiClientFEController#doInitialiseEditScreen(java.lang.Long
     *      id, EdiClient ediClient)
     */
    @Override
    public void doInitialiseEditScreen(DoInitialiseEditScreenForm form, Model model) {
         
        if (form.getId() != null) {
            form.setEdiClient(ediClientService.findById(form.getId()));
        } else {

            // populating value with dummy instance
            EdiClient ediClient = new EdiClient();
            ediClient.setCreatedBy(null);
            ediClient.setUpdatedBy(null);
            ediClient.setCreatedDate(null);
            ediClient.setUpdatedDate(null);
            ediClient.setStatus(null);
            ediClient.setName(null);
            ediClient.setDescription(null);
            ediClient.setAlias(null);
            ediClient.setTradingAs(null);
            ediClient.setContactNo(null);
            ediClient.setContactEmail(null);
            ediClient.setAddress(null);
            ediClient.setEdiSystems(null);
            form.setEdiClient(ediClient);
        }

    }

    /**
     * @see bw.co.roguesystems.edi.client.EdiClientFEController#doDelete(EdiClient
     *      ediClient)
     */
    @Override
    public void doDelete(DoDeleteForm form, Model model) {

        if(form.getEdiClient() != null && form.getEdiClient().getId() != null) {
            ediClientService.remove(form.getEdiClient().getId());

            // populating value with dummy instance
            EdiClient ediClient = new EdiClient();
            ediClient.setCreatedBy(null);
            ediClient.setUpdatedBy(null);
            ediClient.setCreatedDate(null);
            ediClient.setUpdatedDate(null);
            ediClient.setStatus(null);
            ediClient.setName(null);
            ediClient.setDescription(null);
            ediClient.setAlias(null);
            ediClient.setTradingAs(null);
            ediClient.setContactNo(null);
            ediClient.setContactEmail(null);
            ediClient.setAddress(null);
            ediClient.setEdiSystems(null);
            form.setEdiClient(ediClient);

            model.addAttribute("editClientForm", form);
            
        }
    }

    /**
     * @see bw.co.roguesystems.edi.client.EdiClientFEController#doSave(EdiClient
     *      ediClient)
     */
    @Override
    public void doSave(DoSaveForm form, Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        // populating value with dummy instance
        EdiClient ediClient = form.getEdiClient();

        if (ediClient.getId() == null) {
            ediClient.setCreatedDate(LocalDateTime.now());
            ediClient.setCreatedBy(authentication.getName());
        } else {
            ediClient.setUpdatedDate(LocalDateTime.now());
            ediClient.setUpdatedBy(authentication.getName());
        }

        ediClient = ediClientService.save(ediClient);

        form.setEdiClient(ediClient);
        model.addAttribute("editClientForm", form);
    }

    /**
     * @see bw.co.roguesystems.edi.client.EdiClientFEController#doInitialiseSearchScreen()
     */
    @Override
    public void doInitialiseSearchScreen(Model model) {
        if (!model.containsAttribute("ediClients")) {
            getEditClientSearchForm().setEdiClients(ediClientService.getAll());
        } 
    }

    /**
     * @see bw.co.roguesystems.edi.client.EdiClientFEController#doSearch(java.lang.String
     *      criteria)
     */
    @Override
    public void doSearch(DoSearchForm form, Model model) {
        Collection<EdiClient> clients = 
            StringUtils.isNotEmpty(form.getCriteria()) ?
            ediClientService.search(form.getCriteria()) :
            ediClientService.getAll();
        SearchClientsSearchFormImpl fm = (SearchClientsSearchFormImpl)form;
        fm.setEdiClients(clients);
    }

    /**
     * @see bw.co.roguesystems.edi.client.EdiClientFEController#doEditGroup(java.lang.Long
     *      id)
     */
    @Override
    public void doEditGroup(DoEditGroupForm form, Model model) {
    }

    /**
     * This dummy variable is used to populate the "ediClients" table.
     * You may delete it when you add you own code in this controller.
     */
    private static final EdiClient[] ediClients = new EdiClient[] {
            new EdiClient(null, "createdBy-1", "updatedBy-1", LocalDateTime.now(), LocalDateTime.now(), null, "name-1",
                    "description-1", "alias-1", "tradingAs-1", "contactNo-1", "contactEmail-1", "address-1", null),
            new EdiClient(null, "createdBy-2", "updatedBy-2", LocalDateTime.now(), LocalDateTime.now(), null, "name-2",
                    "description-2", "alias-2", "tradingAs-2", "contactNo-2", "contactEmail-2", "address-2", null),
            new EdiClient(null, "createdBy-3", "updatedBy-3", LocalDateTime.now(), LocalDateTime.now(), null, "name-3",
                    "description-3", "alias-3", "tradingAs-3", "contactNo-3", "contactEmail-3", "address-3", null),
            new EdiClient(null, "createdBy-4", "updatedBy-4", LocalDateTime.now(), LocalDateTime.now(), null, "name-4",
                    "description-4", "alias-4", "tradingAs-4", "contactNo-4", "contactEmail-4", "address-4", null),
            new EdiClient(null, "createdBy-5", "updatedBy-5", LocalDateTime.now(), LocalDateTime.now(), null, "name-5",
                    "description-5", "alias-5", "tradingAs-5", "contactNo-5", "contactEmail-5", "address-5", null)
    };
}