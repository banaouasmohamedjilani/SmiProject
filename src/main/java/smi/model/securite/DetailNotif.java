/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smi.model.securite;

/**
 *
 * @author ZEMNI
 */
public class DetailNotif {

    private String objet;
    private String texte;
    private String lib_importance;
    private String code_importance;

    public DetailNotif(String objet, String texte, String lib_importance, String code_importance, String couleur_importance, String lus_o_n, String code_service, String date_notif, String lib_service, String sigle_service, String couleur_service, String texteRed, String ref_notif) {
        this.objet = objet;
        this.texte = texte;
        this.lib_importance = lib_importance;
        this.code_importance = code_importance;
        this.couleur_importance = couleur_importance;
        this.lus_o_n = lus_o_n;
        this.code_service = code_service;
        this.date_notif = date_notif;
        this.lib_service = lib_service;
        this.sigle_service = sigle_service;
        this.couleur_service = couleur_service;
        this.texteRed = texteRed;
        this.ref_notif = ref_notif;
    }

  
    
    private String couleur_importance;
    private String lus_o_n;
    private String code_service;
    private String date_notif;
    private String lib_service;
    private String sigle_service;
    private String couleur_service;
    private String texteRed;
    private String ref_notif;

    public String getRef_notif() {
        return ref_notif;
    }

    public void setRef_notif(String ref_notif) {
        this.ref_notif = ref_notif;
    }

    
    
    
    public String getTexteRed() {
        return texteRed;
    }

    public void setTexteRed(String texteRed) {
        this.texteRed = texteRed;
    }

    public DetailNotif() {
    }

    public String getCouleur_service() {
        return couleur_service;
    }

    public void setCouleur_service(String couleur_service) {
        this.couleur_service = couleur_service;
    }

    public String getSigle_service() {
        return sigle_service;
    }

    public void setSigle_service(String sigle_service) {
        this.sigle_service = sigle_service;
    }

    public String getLib_service() {
        return lib_service;
    }

    public void setLib_service(String lib_service) {
        this.lib_service = lib_service;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public String getLib_importance() {
        return lib_importance;
    }

    public void setLib_importance(String lib_importance) {
        this.lib_importance = lib_importance;
    }

    public String getCode_importance() {
        return code_importance;
    }

    public void setCode_importance(String code_importance) {
        this.code_importance = code_importance;
    }

    public String getCouleur_importance() {
        return couleur_importance;
    }

    public void setCouleur_importance(String couleur_importance) {
        this.couleur_importance = couleur_importance;
    }

    public String getLus_o_n() {
        return lus_o_n;
    }

    public void setLus_o_n(String lus_o_n) {
        this.lus_o_n = lus_o_n;
    }

    public String getCode_service() {
        return code_service;
    }

    public void setCode_service(String code_service) {
        this.code_service = code_service;
    }

    public String getDate_notif() {
        return date_notif;
    }

    public void setDate_notif(String date_notif) {
        this.date_notif = date_notif;
    }

}
