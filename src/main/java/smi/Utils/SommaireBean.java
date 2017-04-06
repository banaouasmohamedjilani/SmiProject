/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template domi, choose Tools | Templates
 * and dash the template in the ddmdeor.
 */
package smi.Utils;

import smi.model.securite.AbnClient;
import smi.model.securite.Client;
import smi.model.securite.DetailNotif;
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

@ManagedBean
@RequestScoped
public class SommaireBean {

    String url = "http://localhost:7258/SMI_Server";
    private MenuModel menubar = new DefaultMenuModel();
    private int msgUnread = 0;

    public int getMsgUnread() {
        ResteasyClient clients = new ResteasyClientBuilder().build();

        GenericType<Integer> list = new GenericType<Integer>() {
        };
        String user = getUser();
        ResteasyWebTarget target = clients.target(url + "/sec/NotifUnread")
                .queryParam("login", user);

        msgUnread = target.request(MediaType.APPLICATION_JSON).get(list);
        return msgUnread;
    }

    public void setMsgUnread(int msgUnread) {
        this.msgUnread = msgUnread;
    }

    public String getUser() {
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        Map<String, Object> sessionMap = externalContext.getSessionMap();
        String user = sessionMap.get("user").toString();
        return user;
    }

    public List<DetailNotif> getAllNotifs() {
        List<DetailNotif> allNotifs = new ArrayList<>();
        ResteasyClient client = new ResteasyClientBuilder().build();
        GenericType<ArrayList<DetailNotif>> list = new GenericType<ArrayList<DetailNotif>>() {
        };
        String user = getUser();
        ResteasyWebTarget target = client.target(url + "/sec/LesNotifss")
                .queryParam("login", user);

        allNotifs = target.request(MediaType.APPLICATION_JSON).get(list);

        return allNotifs;
    }

    public List<String> getAllAbonn() {
        List<String> allAbn = new ArrayList<>();
        ResteasyClient client = new ResteasyClientBuilder().build();
        GenericType<ArrayList<String>> list = new GenericType<ArrayList<String>>() {
        };
        String user = getUser();
        ResteasyWebTarget target = client.target(url + "/sec/getAbonnmentClient")
                .queryParam("typeP", 3)
                .queryParam("login", user)
                .queryParam("pwd", "2222");

        allAbn = target.request(MediaType.APPLICATION_JSON).get(list);

        return allAbn;
    }

    public List<AbnClient> getAllabn() {
        List<AbnClient> allAbn = new ArrayList<>();
        ResteasyClient client = new ResteasyClientBuilder().build();
        GenericType<ArrayList<AbnClient>> list = new GenericType<ArrayList<AbnClient>>() {
        };
        String user = getUser();
        ResteasyWebTarget target = client.target(url + "/sec/ListAbonnmentClient")
                .queryParam("typeP", 3)
                .queryParam("login", user)
                .queryParam("pwd", "2222");

        allAbn = target.request(MediaType.APPLICATION_JSON).get(list);

        return allAbn;
    }

    private Client cl = null;

    public Client getCl() {

        ResteasyClient clients = new ResteasyClientBuilder().build();

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

    public SommaireBean() {

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

//                DefaultMenuItem Consldep = new DefaultMenuItem("Liste des dépots");
//                Consldep.setUrl("./ListeTceDepot.xhtml");
//                Consldep.setIcon("ui-icon-comment");
//                Consldep.setTarget("content");
//                DefaultMenuItem time = new DefaultMenuItem("Timeline");
//                time.setUrl("./faces/time.xhtml");
//                time.setIcon("	ui-icon-clock");
//                time.setTarget("content");
//                DefaultMenuItem ddj = new DefaultMenuItem("Ddes de la journée");
//                ddj.setUrl("./ListeTceJJ.xhtml");
//                ddj.setIcon("ui-icon-comment");
//                ddj.setTarget("content");
//                DefaultMenuItem Lisnn = new DefaultMenuItem("Ddes non validés");
//                Lisnn.setUrl("./faces/ListeTceNV.xhtml");
//                //Lisnn.setStyle(nb1);
//                Lisnn.setIcon("	ui-icon-comment");
//                Lisnn.setTarget("content");
                DefaultMenuItem stat = new DefaultMenuItem("Statistiques");
                stat.setUrl("./faces/statistique.xhtml");
                stat.setIcon("ui-icon-image");
                stat.setTarget("content");

                // Associate menuitems with dash submenu
                dash.addElement(Consl);
                // dash.addElement(Consldep);
                //dash.addElement(time);
                //dash.addElement(ddj);
                //dash.addElement(Lisnn);
                dash.addElement(stat);
                // Associate menuitems with help submenu
//		help.addElement(about);
//		help.addElement(contactUs);
//		help.addElement(new DefaultSeparator());
//		help.addElement(helpMenuItem);

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

                DefaultMenuItem ddmdetr = new DefaultMenuItem("Demande de transf�rt");
                ddmdetr.setUrl("./DemandeTransF.xhtml");
                ddmdetr.setTarget("content");
                ddmdetr.setIcon("ui-icon-clockui-icon-document-b");

                tr.addElement(ddmdetr);
                tr.addElement(new DefaultSeparator());
                serv.addElement(tr);
                // Associate submenus with the menubar
            }
            if (nb.equalsIgnoreCase("108")) {
                // Create submenus required
                DefaultSubMenu tr = new DefaultSubMenu(l.get(i).getLibelleOperation());
                tr.setIcon("fa fa-edit");
                //Demande transfert

                DefaultMenuItem dava = new DefaultMenuItem("Demande d'allocation de voyage d'affaire");
                dava.setUrl("./AVA.xhtml");
                dava.setTarget("content");
                dava.setIcon("ui-icon-clockui-icon-document-b");

                tr.addElement(dava);
                tr.addElement(new DefaultSeparator());
                serv.addElement(tr);
                // Associate submenus with the menubar
            }
        }
        this.menubar.addElement(serv);
        this.menubar.addElement(notif);
        this.menubar.addElement(swifts);
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

    public int NotifUnread() {
        ResteasyClient clients = new ResteasyClientBuilder().build();

        GenericType<Integer> list = new GenericType<Integer>() {
        };
        String user = getUser();
        ResteasyWebTarget target = clients.target(url + "/sec/getclient")
                .queryParam("login", user);

        int a = target.request(MediaType.APPLICATION_JSON).get(list);
        return a;
    }

}
