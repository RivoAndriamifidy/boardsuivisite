/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DBconnect.config;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 *
 * @author Workdev
 */
public class afficheSite {
    int idsite;
    String SITE;
    String PF;
    String  DS;
    String MtchMPN;
    int TOUS;
    int EAN;
    int SKU;
    int MPN;
    int MODEL;
    int BRAND;
    int TITLE;
    int PATHURL;
    int IMGURL;
    int SKU_DISTINCT;
    int EAN_DISTINCT;
    int MPN_DISTINCT;
    int MODEL_DISTINCT;
    int BRAND_DISTINCT;
    int PATHURL_DISTINCT;
    int IMGURL_DISTINCT;
    int SKU_VIDE;
    int SKU_EGAL_MPN;
    int SKU_EGAL_EAN;
    int MPN_EAN;
    int MODEL_EGAL_MPN;
    int BRAND_EGAL_MPN;
    int MODEL_EGAL_BRAND;
    int EAN_DIFF_13;
    int SKU_INF_4;
    int MPN_INF_4;
    int PRICE_INFEGAL_0;
    int PREVIEWS_PRICE_INF_PRICE;
    int DELIVERY_PRICE_SUP_PRICE;
    int EAN_NON_DIGIT;
    int MPN_NUMERIQ;
    int MPN_ALPHABETIQUE;
    int REVIEWS;
    int RATING;
    int REVIEW_COMMENT;
    int REVIEWS_USER;
    int REVIEW_TITLE;
    int REVIEW_URL;
    int REVIEW_DATE;
    int SKU_DOUBLONS;
    int EAN_DOUBLONS;
    int MPN_DOUBLONS;
    int MODEL_DOUBLONS;
    int TITLE_DOUBLONS;
    int PATHURL_DOUBLONS;
    int IMG_URL;
    String ATRAITER;
    Date DATES;
    int idtable1;
    int idStatut;
    int idUser;

    public afficheSite(int idsite, String SITE, String PF, String DS, String MtchMPN, int TOUS, int EAN, int SKU, int MPN, int MODEL, int BRAND, int TITLE, int PATHURL, int IMGURL, int SKU_DISTINCT, int EAN_DISTINCT, int MPN_DISTINCT, int MODEL_DISTINCT, int BRAND_DISTINCT, int PATHURL_DISTINCT, int IMGURL_DISTINCT, int SKU_VIDE, int SKU_EGAL_MPN, int SKU_EGAL_EAN, int MPN_EAN, int MODEL_EGAL_MPN, int BRAND_EGAL_MPN, int MODEL_EGAL_BRAND, int EAN_DIFF_13, int SKU_INF_4, int MPN_INF_4, int PRICE_INFEGAL_0, int PREVIEWS_PRICE_INF_PRICE, int DELIVERY_PRICE_SUP_PRICE, int EAN_NON_DIGIT, int MPN_NUMERIQ, int MPN_ALPHABETIQUE, int REVIEWS, int RATING, int REVIEW_COMMENT, int REVIEWS_USER, int REVIEW_TITLE, int REVIEW_URL, int REVIEW_DATE, int SKU_DOUBLONS, int EAN_DOUBLONS, int MPN_DOUBLONS, int MODEL_DOUBLONS, int TITLE_DOUBLONS, int PATHURL_DOUBLONS, int IMG_URL, String ATRAITER, Date DATES, int idtable1, int idStatut, int idUser) {
        this.idsite = idsite;
        this.SITE = SITE;
        this.PF = PF;
        this.DS = DS;
        this.MtchMPN = MtchMPN;
        this.TOUS = TOUS;
        this.EAN = EAN;
        this.SKU = SKU;
        this.MPN = MPN;
        this.MODEL = MODEL;
        this.BRAND = BRAND;
        this.TITLE = TITLE;
        this.PATHURL = PATHURL;
        this.IMGURL = IMGURL;
        this.SKU_DISTINCT = SKU_DISTINCT;
        this.EAN_DISTINCT = EAN_DISTINCT;
        this.MPN_DISTINCT = MPN_DISTINCT;
        this.MODEL_DISTINCT = MODEL_DISTINCT;
        this.BRAND_DISTINCT = BRAND_DISTINCT;
        this.PATHURL_DISTINCT = PATHURL_DISTINCT;
        this.IMGURL_DISTINCT = IMGURL_DISTINCT;
        this.SKU_VIDE = SKU_VIDE;
        this.SKU_EGAL_MPN = SKU_EGAL_MPN;
        this.SKU_EGAL_EAN = SKU_EGAL_EAN;
        this.MPN_EAN = MPN_EAN;
        this.MODEL_EGAL_MPN = MODEL_EGAL_MPN;
        this.BRAND_EGAL_MPN = BRAND_EGAL_MPN;
        this.MODEL_EGAL_BRAND = MODEL_EGAL_BRAND;
        this.EAN_DIFF_13 = EAN_DIFF_13;
        this.SKU_INF_4 = SKU_INF_4;
        this.MPN_INF_4 = MPN_INF_4;
        this.PRICE_INFEGAL_0 = PRICE_INFEGAL_0;
        this.PREVIEWS_PRICE_INF_PRICE = PREVIEWS_PRICE_INF_PRICE;
        this.DELIVERY_PRICE_SUP_PRICE = DELIVERY_PRICE_SUP_PRICE;
        this.EAN_NON_DIGIT = EAN_NON_DIGIT;
        this.MPN_NUMERIQ = MPN_NUMERIQ;
        this.MPN_ALPHABETIQUE = MPN_ALPHABETIQUE;
        this.REVIEWS = REVIEWS;
        this.RATING = RATING;
        this.REVIEW_COMMENT = REVIEW_COMMENT;
        this.REVIEWS_USER = REVIEWS_USER;
        this.REVIEW_TITLE = REVIEW_TITLE;
        this.REVIEW_URL = REVIEW_URL;
        this.REVIEW_DATE = REVIEW_DATE;
        this.SKU_DOUBLONS = SKU_DOUBLONS;
        this.EAN_DOUBLONS = EAN_DOUBLONS;
        this.MPN_DOUBLONS = MPN_DOUBLONS;
        this.MODEL_DOUBLONS = MODEL_DOUBLONS;
        this.TITLE_DOUBLONS = TITLE_DOUBLONS;
        this.PATHURL_DOUBLONS = PATHURL_DOUBLONS;
        this.IMG_URL = IMG_URL;
        this.ATRAITER = ATRAITER;
        this.DATES = DATES;
        this.idtable1 = idtable1;
        this.idStatut = idStatut;
        this.idUser = idUser;
    }

    public int getIdsite() {
        return idsite;
    }

    public void setIdsite(int idsite) {
        this.idsite = idsite;
    }

    public String getSITE() {
        return SITE;
    }

    public void setSITE(String SITE) {
        this.SITE = SITE;
    }

    public String getPF() {
        return PF;
    }

    public void setPF(String PF) {
        this.PF = PF;
    }

    public String getDS() {
        return DS;
    }

    public void setDS(String DS) {
        this.DS = DS;
    }

    public String getMtchMPN() {
        return MtchMPN;
    }

    public void setMtchMPN(String MtchMPN) {
        this.MtchMPN = MtchMPN;
    }

    public int getTOUS() {
        return TOUS;
    }

    public void setTOUS(int TOUS) {
        this.TOUS = TOUS;
    }

    public int getEAN() {
        return EAN;
    }

    public void setEAN(int EAN) {
        this.EAN = EAN;
    }

    public int getSKU() {
        return SKU;
    }

    public void setSKU(int SKU) {
        this.SKU = SKU;
    }

    public int getMPN() {
        return MPN;
    }

    public void setMPN(int MPN) {
        this.MPN = MPN;
    }

    public int getMODEL() {
        return MODEL;
    }

    public void setMODEL(int MODEL) {
        this.MODEL = MODEL;
    }

    public int getBRAND() {
        return BRAND;
    }

    public void setBRAND(int BRAND) {
        this.BRAND = BRAND;
    }

    public int getTITLE() {
        return TITLE;
    }

    public void setTITLE(int TITLE) {
        this.TITLE = TITLE;
    }

    public int getPATHURL() {
        return PATHURL;
    }

    public void setPATHURL(int PATHURL) {
        this.PATHURL = PATHURL;
    }

    public int getIMGURL() {
        return IMGURL;
    }

    public void setIMGURL(int IMGURL) {
        this.IMGURL = IMGURL;
    }

    public int getSKU_DISTINCT() {
        return SKU_DISTINCT;
    }

    public void setSKU_DISTINCT(int SKU_DISTINCT) {
        this.SKU_DISTINCT = SKU_DISTINCT;
    }

    public int getEAN_DISTINCT() {
        return EAN_DISTINCT;
    }

    public void setEAN_DISTINCT(int EAN_DISTINCT) {
        this.EAN_DISTINCT = EAN_DISTINCT;
    }

    public int getMPN_DISTINCT() {
        return MPN_DISTINCT;
    }

    public void setMPN_DISTINCT(int MPN_DISTINCT) {
        this.MPN_DISTINCT = MPN_DISTINCT;
    }

    public int getMODEL_DISTINCT() {
        return MODEL_DISTINCT;
    }

    public void setMODEL_DISTINCT(int MODEL_DISTINCT) {
        this.MODEL_DISTINCT = MODEL_DISTINCT;
    }

    public int getBRAND_DISTINCT() {
        return BRAND_DISTINCT;
    }

    public void setBRAND_DISTINCT(int BRAND_DISTINCT) {
        this.BRAND_DISTINCT = BRAND_DISTINCT;
    }

    public int getPATHURL_DISTINCT() {
        return PATHURL_DISTINCT;
    }

    public void setPATHURL_DISTINCT(int PATHURL_DISTINCT) {
        this.PATHURL_DISTINCT = PATHURL_DISTINCT;
    }

    public int getIMGURL_DISTINCT() {
        return IMGURL_DISTINCT;
    }

    public void setIMGURL_DISTINCT(int IMGURL_DISTINCT) {
        this.IMGURL_DISTINCT = IMGURL_DISTINCT;
    }

    public int getSKU_VIDE() {
        return SKU_VIDE;
    }

    public void setSKU_VIDE(int SKU_VIDE) {
        this.SKU_VIDE = SKU_VIDE;
    }

    public int getSKU_EGAL_MPN() {
        return SKU_EGAL_MPN;
    }

    public void setSKU_EGAL_MPN(int SKU_EGAL_MPN) {
        this.SKU_EGAL_MPN = SKU_EGAL_MPN;
    }

    public int getSKU_EGAL_EAN() {
        return SKU_EGAL_EAN;
    }

    public void setSKU_EGAL_EAN(int SKU_EGAL_EAN) {
        this.SKU_EGAL_EAN = SKU_EGAL_EAN;
    }

    public int getMPN_EAN() {
        return MPN_EAN;
    }

    public void setMPN_EAN(int MPN_EAN) {
        this.MPN_EAN = MPN_EAN;
    }

    public int getMODEL_EGAL_MPN() {
        return MODEL_EGAL_MPN;
    }

    public void setMODEL_EGAL_MPN(int MODEL_EGAL_MPN) {
        this.MODEL_EGAL_MPN = MODEL_EGAL_MPN;
    }

    public int getBRAND_EGAL_MPN() {
        return BRAND_EGAL_MPN;
    }

    public void setBRAND_EGAL_MPN(int BRAND_EGAL_MPN) {
        this.BRAND_EGAL_MPN = BRAND_EGAL_MPN;
    }

    public int getMODEL_EGAL_BRAND() {
        return MODEL_EGAL_BRAND;
    }

    public void setMODEL_EGAL_BRAND(int MODEL_EGAL_BRAND) {
        this.MODEL_EGAL_BRAND = MODEL_EGAL_BRAND;
    }

    public int getEAN_DIFF_13() {
        return EAN_DIFF_13;
    }

    public void setEAN_DIFF_13(int EAN_DIFF_13) {
        this.EAN_DIFF_13 = EAN_DIFF_13;
    }

    public int getSKU_INF_4() {
        return SKU_INF_4;
    }

    public void setSKU_INF_4(int SKU_INF_4) {
        this.SKU_INF_4 = SKU_INF_4;
    }

    public int getMPN_INF_4() {
        return MPN_INF_4;
    }

    public void setMPN_INF_4(int MPN_INF_4) {
        this.MPN_INF_4 = MPN_INF_4;
    }

    public int getPRICE_INFEGAL_0() {
        return PRICE_INFEGAL_0;
    }

    public void setPRICE_INFEGAL_0(int PRICE_INFEGAL_0) {
        this.PRICE_INFEGAL_0 = PRICE_INFEGAL_0;
    }

    public int getPREVIEWS_PRICE_INF_PRICE() {
        return PREVIEWS_PRICE_INF_PRICE;
    }

    public void setPREVIEWS_PRICE_INF_PRICE(int PREVIEWS_PRICE_INF_PRICE) {
        this.PREVIEWS_PRICE_INF_PRICE = PREVIEWS_PRICE_INF_PRICE;
    }

    public int getDELIVERY_PRICE_SUP_PRICE() {
        return DELIVERY_PRICE_SUP_PRICE;
    }

    public void setDELIVERY_PRICE_SUP_PRICE(int DELIVERY_PRICE_SUP_PRICE) {
        this.DELIVERY_PRICE_SUP_PRICE = DELIVERY_PRICE_SUP_PRICE;
    }

    public int getEAN_NON_DIGIT() {
        return EAN_NON_DIGIT;
    }

    public void setEAN_NON_DIGIT(int EAN_NON_DIGIT) {
        this.EAN_NON_DIGIT = EAN_NON_DIGIT;
    }

    public int getMPN_NUMERIQ() {
        return MPN_NUMERIQ;
    }

    public void setMPN_NUMERIQ(int MPN_NUMERIQ) {
        this.MPN_NUMERIQ = MPN_NUMERIQ;
    }

    public int getMPN_ALPHABETIQUE() {
        return MPN_ALPHABETIQUE;
    }

    public void setMPN_ALPHABETIQUE(int MPN_ALPHABETIQUE) {
        this.MPN_ALPHABETIQUE = MPN_ALPHABETIQUE;
    }

    public int getREVIEWS() {
        return REVIEWS;
    }

    public void setREVIEWS(int REVIEWS) {
        this.REVIEWS = REVIEWS;
    }

    public int getRATING() {
        return RATING;
    }

    public void setRATING(int RATING) {
        this.RATING = RATING;
    }

    public int getREVIEW_COMMENT() {
        return REVIEW_COMMENT;
    }

    public void setREVIEW_COMMENT(int REVIEW_COMMENT) {
        this.REVIEW_COMMENT = REVIEW_COMMENT;
    }

    public int getREVIEWS_USER() {
        return REVIEWS_USER;
    }

    public void setREVIEWS_USER(int REVIEWS_USER) {
        this.REVIEWS_USER = REVIEWS_USER;
    }

    public int getREVIEW_TITLE() {
        return REVIEW_TITLE;
    }

    public void setREVIEW_TITLE(int REVIEW_TITLE) {
        this.REVIEW_TITLE = REVIEW_TITLE;
    }

    public int getREVIEW_URL() {
        return REVIEW_URL;
    }

    public void setREVIEW_URL(int REVIEW_URL) {
        this.REVIEW_URL = REVIEW_URL;
    }

    public int getREVIEW_DATE() {
        return REVIEW_DATE;
    }

    public void setREVIEW_DATE(int REVIEW_DATE) {
        this.REVIEW_DATE = REVIEW_DATE;
    }

    public int getSKU_DOUBLONS() {
        return SKU_DOUBLONS;
    }

    public void setSKU_DOUBLONS(int SKU_DOUBLONS) {
        this.SKU_DOUBLONS = SKU_DOUBLONS;
    }

    public int getEAN_DOUBLONS() {
        return EAN_DOUBLONS;
    }

    public void setEAN_DOUBLONS(int EAN_DOUBLONS) {
        this.EAN_DOUBLONS = EAN_DOUBLONS;
    }

    public int getMPN_DOUBLONS() {
        return MPN_DOUBLONS;
    }

    public void setMPN_DOUBLONS(int MPN_DOUBLONS) {
        this.MPN_DOUBLONS = MPN_DOUBLONS;
    }

    public int getMODEL_DOUBLONS() {
        return MODEL_DOUBLONS;
    }

    public void setMODEL_DOUBLONS(int MODEL_DOUBLONS) {
        this.MODEL_DOUBLONS = MODEL_DOUBLONS;
    }

    public int getTITLE_DOUBLONS() {
        return TITLE_DOUBLONS;
    }

    public void setTITLE_DOUBLONS(int TITLE_DOUBLONS) {
        this.TITLE_DOUBLONS = TITLE_DOUBLONS;
    }

    public int getPATHURL_DOUBLONS() {
        return PATHURL_DOUBLONS;
    }

    public void setPATHURL_DOUBLONS(int PATHURL_DOUBLONS) {
        this.PATHURL_DOUBLONS = PATHURL_DOUBLONS;
    }

    public int getIMG_URL() {
        return IMG_URL;
    }

    public void setIMG_URL(int IMG_URL) {
        this.IMG_URL = IMG_URL;
    }

    public String getATRAITER() {
        return ATRAITER;
    }

    public void setATRAITER(String ATRAITER) {
        this.ATRAITER = ATRAITER;
    }

    public Date getDATES() {
        return DATES;
    }

    public void setDATES(Date DATES) {
        this.DATES = DATES;
    }

    public int getIdtable1() {
        return idtable1;
    }

    public void setIdtable1(int idtable1) {
        this.idtable1 = idtable1;
    }

    public int getIdStatut() {
        return idStatut;
    }

    public void setIdStatut(int idStatut) {
        this.idStatut = idStatut;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public static ResultSet test(int SKU_VIDE, int SKU_EGAL_MPN, int SKU_EGAL_EAN, int MPN_EAN, int MODEL_EGAL_MPN, int BRAND_EGAL_MPN, int MODEL_EGAL_BRAND, int EAN_DIFF_13, int SKU_INF_4, int MPN_INF_4, int PRICE_INFEGAL_0, int PREVIEWS_PRICE_INF_PRICE, int DELIVERY_PRICE_SUP_PRICE, int EAN_NON_DIGIT, int MPN_NUMERIQ, int MPN_ALPHABETIQUE, int idStatut, Connection Conn) throws Exception {
        String sql =  "SELECT * "
                + "FROM table1 "
                + "LEFT JOIN user ON table1.idUser = user.iduser "
                + "WHERE (SKU_VIDE <> 0 OR SKU_EGAL_MPN <> 0 OR SKU_EGAL_EAN <> 0 OR MPN_EAN <> 0 "
                + "OR MODEL_EGAL_MPN <> 0 OR BRAND_EGAL_MPN <> 0 OR MODEL_EGAL_BRAND <> 0 "
                + "OR EAN_DIFF_13 <> 0 OR SKU_INF_4 <> 0 OR MPN_INF_4 <> 0 OR PRICE_INFEGAL_0 <> 0 "
                + "OR PREVIEWS_PRICE_INF_PRICE <> 0 OR DELIVERY_PRICE_SUP_PRICE <> 0 OR EAN_NON_DIGIT <> 0 "
                + "OR MPN_NUMERIQ <> 0 OR MPN_ALPHABETIQUE <> 0) AND idStatut <> 4";
        Statement st = Conn.createStatement();
        ResultSet res = st.executeQuery(sql);
        return res;
    }



    public static ResultSet afficheStatut(String idtable1, Connection cn) throws Exception{
        String sql = "SELECT * FROM table1 INNER JOIN statut ON statut.idStatut = table1.idStatut WHERE idtable1 = '"+idtable1+"'";
        Statement st = cn.createStatement();
        ResultSet res = st.executeQuery(sql);
        return res;
    }
    public static ResultSet afficheetatsite(int idStatut, Connection cn)throws Exception{
        String sql = "SELECT * FROM table1 WHERE idStatut <> 4 ";
        Statement st = cn.createStatement();
        ResultSet res = st.executeQuery(sql);
        return res;
    }
    public static void updateStatut(String idUser,String idStatut,String idtable1, Connection con) throws Exception{
        String sql ="UPDATE table1 SET  idStatut= ?, idUser = ? WHERE idtable1 = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, idtable1);
        pst.setString(2, idStatut);
        pst.setString(3, idUser);
        
        pst.executeUpdate();
        pst.close();
    }
    public static void updateStatutannuler(String idStatut, String idtable,  Connection con) throws Exception {
    String sql = "UPDATE table1 SET idStatut = ? WHERE idtable1 = ?";
    PreparedStatement pst = con.prepareStatement(sql);
    pst.setString(1, idStatut);
    pst.setString(2, idtable);

    pst.executeUpdate();
    pst.close();
    }

    public static void DeleteetatSite(String idtable1, Connection con) throws Exception {
        String sql = "DELETE FROM sitecorrige WHERE idtable1=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, idtable1);

        pst.executeUpdate();
        pst.close();
    }

 

}
