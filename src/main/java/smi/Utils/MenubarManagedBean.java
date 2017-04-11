/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template domi, choose Tools | Templates
 * and dash the template in the ddmdeor.
 */
package smi.Utils;

import smi.model.securite.AbnClient;
import smi.model.securite.Client;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSeparator;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;
import javax.faces.bean.RequestScoped;
import smi.Config.donneegenerale;

@ManagedBean
@RequestScoped
public class MenubarManagedBean {

    private MenuModel menubar = new DefaultMenuModel();
    private String url = "http://localhost:7258/SMI_Server";
    private donneegenerale donneegenerale = new donneegenerale();
    private final Short codeBanque = donneegenerale.getCodeBanque();
    private String libBanque = donneegenerale.getLibBanque();

    public String getUser() {
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        Map<String, Object> sessionMap = externalContext.getSessionMap();
        String user = sessionMap.get("user").toString();
        return user;
    }

    public List<String> getAllStickers() {
        List<String> allStickers = new ArrayList<>();
        ResteasyClient client = new ResteasyClientBuilder().build();
        //Client client = ClientBuilder.newClient();
        GenericType<ArrayList<String>> list = new GenericType<ArrayList<String>>() {
        };
        String user = getUser();
        ResteasyWebTarget target = client.target(url + "/sec/getAbonnmentClient")
                .queryParam("typeP", 3)
                .queryParam("login", user)
                .queryParam("pwd", "2222");

        allStickers = target.request(MediaType.APPLICATION_JSON).get(list);

        return allStickers;
    }

    public List<AbnClient> getAllabn() {
        List<AbnClient> allStickers = new ArrayList<>();
        ResteasyClient client = new ResteasyClientBuilder().build();
        //Client client = ClientBuilder.newClient();
        GenericType<ArrayList<AbnClient>> list = new GenericType<ArrayList<AbnClient>>() {
        };
        String user = getUser();
        ResteasyWebTarget target = client.target(url + "/sec/ListAbonnmentClient")
                .queryParam("typeP", 3)
                .queryParam("login", user)
                .queryParam("pwd", "2222");

        allStickers = target.request(MediaType.APPLICATION_JSON).get(list);

        return allStickers;
    }

    private Client cl = null;

    public Client getCl() {
        List<AbnClient> allStickers = new ArrayList<>();
        ResteasyClient clients = new ResteasyClientBuilder().build();
        //Client client = ClientBuilder.newClient();
        GenericType<Client> list = new GenericType<Client>() {
        };
        String user = getUser();
        ResteasyWebTarget target = clients.target(url + "/sec/getclient")
                .queryParam("typeP", 3)
                .queryParam("login", user)
                .queryParam("pwd", "2222");

        cl = target.request(MediaType.APPLICATION_JSON).get(list);
        return cl;
    }

    public void setCl(Client cl) {
        this.cl = cl;
    }

//        public  Client getclient() {
//        List<AbnClient> allStickers = new ArrayList<>();
//        ResteasyClient clients = new ResteasyClientBuilder().build();
//        //Client client = ClientBuilder.newClient();
//        GenericType<Client> list = new GenericType<Client>() {
//        };
//        String user = getUser();
//        ResteasyWebTarget target = clients.target("http://localhost:1111/Server-App-STB-11/sec/getclient")
//                .queryParam("typeP", 3)
//                .queryParam("login", user)
//                .queryParam("pwd","2222");
//
//        cl = target.request(MediaType.APPLICATION_JSON).get(list);
//        return cl;
//    }
//    
    public MenubarManagedBean() {

        List<AbnClient> l = new ArrayList<>();
        l = getAllabn();

        String var = "";
        String var4 = "";
        String var3 = "";
        String nb = "";
        String nb1 = "";

        DefaultSubMenu serv = new DefaultSubMenu("Service");
        serv.setIcon("ui-icon-folder-open");
        //DefaultSubMenu notif = new DefaultSubMenu("Notification");

        DefaultMenuItem notif = new DefaultMenuItem("Notification");
        notif.setIcon("ui-icon-info");
        notif.setUrl("./SwiftsR.xhtml");

        DefaultSubMenu swifts = new DefaultSubMenu("Swifts");
        swifts.setIcon("ui-icon-comment");
        DefaultMenuItem swiftsR = new DefaultMenuItem("Swifts Récus");
        swiftsR.setUrl("./SwiftsR.xhtml");
        swiftsR.setTarget("content");
        swiftsR.setIcon("ui-icon-comment");
        DefaultMenuItem swiftsE = new DefaultMenuItem("Swifts Envoyés");
        swiftsE.setUrl("./SwiftsE.xhtml");
        swiftsE.setTarget("content");
        swiftsE.setIcon("ui-icon-comment");

        swifts.addElement(swiftsR);
        swifts.addElement(swiftsE);

        for (int i = 0; i < l.size(); i++) {
            nb = l.get(i).getCodepds();
            if (nb.equalsIgnoreCase("200")) {

                // Create submenus required
                DefaultSubMenu domi = new DefaultSubMenu("Domiciliation");
                domi.setIcon("ui-icon-clock");
                //Dash
                DefaultSubMenu dash = new DefaultSubMenu("Dashbord");
                dash.setIcon("ui-icon-clock");
                // Create menuitems required
                DefaultMenuItem ddmde = new DefaultMenuItem("Dmde. Dom/Dépôts");
                ddmde.setUrl("./DemandeDomFDExp.xhtml");
                ddmde.setTarget("content");
                ddmde.setIcon("ui-icon-clock");
                ddmde.setDisabled(true);
                // Create menuitems required
                DefaultMenuItem Consl = new DefaultMenuItem("Cons. TCEs/Dépôts");
                Consl.setUrl("./ListeTceDom.xhtml");
                Consl.setIcon("	ui-icon-comment");
                Consl.setTarget("content");

                DefaultMenuItem stat = new DefaultMenuItem("Statistiques");
                stat.setUrl("./faces/statistique.xhtml");
                stat.setIcon("ui-icon-image");
                stat.setTarget("content");

                dash.addElement(Consl);

                dash.addElement(stat);

                // Associate dash submenu with domi submenu
                domi.addElement(dash);
                domi.addElement(ddmde);
                domi.addElement(new DefaultSeparator());
                serv.addElement(domi);
                // Associate submenus with the menubar

            }
            if (nb.equalsIgnoreCase("22")) {
                // Create submenus required
                DefaultSubMenu tr = new DefaultSubMenu(l.get(i).getLibelleOperation());
                tr.setIcon("fa fa-edit");
                //Demande transfert

                DefaultMenuItem ddmdetr = new DefaultMenuItem("Demande de transfért");
                ddmdetr.setUrl("./DemandeTransF.xhtml");
                ddmdetr.setTarget("content");
                ddmdetr.setIcon("ui-icon-clockui-icon-document-b");

                tr.addElement(ddmdetr);
                tr.addElement(new DefaultSeparator());
                serv.addElement(tr);
                // Associate submenus with the menubar
            }

        }
        this.menubar.addElement(serv);
        this.menubar.addElement(notif);
        this.menubar.addElement(swifts);
    }

    public donneegenerale getDonneegenerale() {
        return donneegenerale;
    }

    public Short getCodeBanque() {
        return codeBanque;
    }

    public String getLibBanque() {
        return libBanque;
    }

    public MenuModel getMenubar() {
        return menubar;
    }

    public void setMenubar(MenuModel menubar) {
        this.menubar = menubar;
    }

    public String ajaxAction() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Ajax Update"));
        return "";
    }

    public String nonAjaxAction() {
        return "";
    }

    public void invalide() {

    }

}
