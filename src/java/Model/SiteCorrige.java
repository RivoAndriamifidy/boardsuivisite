/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Workdev
 */
public class SiteCorrige {
    private String idSiteCorrige;
    private String site;
    private String ds;
    private String pf;
    private String nomStatut;
    private String ticket;
    private String commentaire;
    private String username;
    private Date dateTerminer;

    /*public SiteCorrige(String idSiteCorrige, String site, String ds, String pf, String nomStatut, String ticket, String commentaire, String username, Date dateTerminer) {
        this.idSiteCorrige = idSiteCorrige;
        this.site = site;
        this.ds = ds;
        this.pf = pf;
        this.nomStatut = nomStatut;
        this.ticket = ticket;
        this.commentaire = commentaire;
        this.username = username;
        this.dateTerminer = dateTerminer;
    }*/

    public String getIdSiteCorrige() {
        return idSiteCorrige;
    }

    public void setIdSiteCorrige(String idSiteCorrige) {
        this.idSiteCorrige = idSiteCorrige;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    public String getPf() {
        return pf;
    }

    public void setPf(String pf) {
        this.pf = pf;
    }

    public String getNomStatut() {
        return nomStatut;
    }

    public void setNomStatut(String nomStatut) {
        this.nomStatut = nomStatut;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDateTerminer() {
        return dateTerminer;
    }

    public void setDateTerminer(Date dateTerminer) {
        this.dateTerminer = dateTerminer;
    }

    // Ajoutez ici les constructeurs, getters et setters nécessaires
    
    // Exemple d'implémentation toString() pour faciliter le débogage
    @Override
    public String toString() {
        return "SiteCorrige{" +
                "idSiteCorrige='" + idSiteCorrige + '\'' +
                ", site='" + site + '\'' +
                ", ds='" + ds + '\'' +
                ", pf='" + pf + '\'' +
                ", nomStatut='" + nomStatut + '\'' +
                ", ticket='" + ticket + '\'' +
                ", commentaire='" + commentaire + '\'' +
                ", username='" + username + '\'' +
                ", dateTerminer=" + dateTerminer +
                '}';
    }
}

