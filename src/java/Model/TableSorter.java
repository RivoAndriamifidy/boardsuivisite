package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Workdev
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TableSorter {
    
    public static String sortTable(String html) {
        // Charger le document HTML
        Document doc = Jsoup.parse(html);

        // Récupérer les lignes du tableau
        Elements rows = doc.select("tr");

        // Convertir les lignes en objets TableRow
        List<TableRow> table = new ArrayList<>();
        for (int i = 1; i < rows.size(); i++) {
            Element row = rows.get(i);
            Elements cols = row.select("td");
            if (cols.size() == 57) {
                String idsite = cols.get(0).text();
                String SITE = cols.get(1).text();
                String PF = cols.get(3).text();
                String DS = cols.get(4).text();
                String MtchMPN = cols.get(5).text();
                String TOUS = cols.get(6).text();
                String EAN = cols.get(7).text();
                String SKU = cols.get(8).text();
                String MPN = cols.get(9).text();
                String MODEL = cols.get(10).text();
                String BRAND = cols.get(11).text();
                String TITLE = cols.get(12).text();
                String PATHURL = cols.get(13).text();
                String IMGURL = cols.get(14).text();
                String SKU_DISTINCT = cols.get(15).text();
                String EAN_DISTINCT = cols.get(16).text();
                String MPN_DISTINCT = cols.get(17).text();
                String MODEL_DISTINCT = cols.get(18).text();
                String BRAND_DISTINCT = cols.get(19).text();
                String PATHURL_DISTINCT = cols.get(20).text();
                String IMGURL_DISTINCT = cols.get(21).text();
                String SKU_VIDE = cols.get(22).text();
                String SKU_EGAL_MPN = cols.get(23).text();
                String SKU_EGAL_EAN = cols.get(24).text();
                String MPN_EAN = cols.get(25).text();
                String MODEL_EGAL_MPN = cols.get(26).text();
                String BRAND_EGAL_MPN = cols.get(27).text();
                String MODEL_EGAL_BRAND = cols.get(28).text();
                String EAN_DIFF_13 = cols.get(29).text();
                String SKU_INF_4 = cols.get(30).text();
                String MPN_INF_4 = cols.get(31).text();
                String PRICE_INFEGAL_0 = cols.get(32).text();
                String PREVIEWS_PRICE_INF_PRICE = cols.get(33).text();
                String DELIVERY_PRICE_SUP_PRICE = cols.get(34).text();
                String EAN_NON_DIGIT = cols.get(35).text();
                String MPN_NUMERIQ = cols.get(36).text();
                String MPN_ALPHABETIQUE = cols.get(37).text();
                String REVIEWS = cols.get(38).text();
                String RATING = cols.get(39).text();
                String REVIEW_COMMENT = cols.get(40).text();
                String REVIEWS_USER = cols.get(41).text();
                String REVIEW_TITLE = cols.get(42).text();
                String REVIEW_URL = cols.get(43).text();
                String REVIEW_DATE = cols.get(44).text();
                String SKU_DOUBLONS = cols.get(45).text();
                String EAN_DOUBLONS = cols.get(46).text();
                String MPN_DOUBLONS = cols.get(47).text();
                String MODEL_DOUBLONS = cols.get(48).text();
                String TITLE_DOUBLONS = cols.get(49).text();
                String PATHURL_DOUBLONS = cols.get(50).text();
                String IMG_URL = cols.get(51).text();
                String ATRAITER = cols.get(52).text();
                String DATES = cols.get(53).text();
                String idtable1 = cols.get(54).text();
                table.add(new TableRow( idsite, SITE, PF, DS, MtchMPN, TOUS, EAN, SKU, MPN, MODEL, BRAND, TITLE, PATHURL, IMGURL, SKU_DISTINCT, EAN_DISTINCT, MPN_DISTINCT, MODEL_DISTINCT, BRAND_DISTINCT, PATHURL_DISTINCT, IMGURL_DISTINCT, SKU_VIDE, SKU_EGAL_MPN, SKU_EGAL_EAN, MPN_EAN, MODEL_EGAL_MPN, BRAND_EGAL_MPN,  MODEL_EGAL_BRAND,  EAN_DIFF_13, SKU_INF_4, MPN_INF_4, PRICE_INFEGAL_0, PREVIEWS_PRICE_INF_PRICE,  DELIVERY_PRICE_SUP_PRICE,  EAN_NON_DIGIT,  MPN_NUMERIQ,  MPN_ALPHABETIQUE,  REVIEWS,  RATING,  REVIEW_COMMENT,  REVIEWS_USER, REVIEW_TITLE, REVIEW_URL, REVIEW_DATE, SKU_DOUBLONS, EAN_DOUBLONS, MPN_DOUBLONS,  MODEL_DOUBLONS, TITLE_DOUBLONS, PATHURL_DOUBLONS, IMG_URL, ATRAITER,  DATES, idtable1));
            }
        }

        // Trier la table par date
        Collections.sort(table);

        // Générer le code HTML correspondant à la table triée par mois et semaine
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<table>"
        + "<thead>"
          + "<tr>"
              + "<th >idsite</th>"
              + "<th >Site</th>"
              + "<th >Plateforme</th>"
              + "<th >Datasource</th>"
              + "<th >MtchMPN</th>"
              + "<th >TOUS</th>"
              + "<th >EAN</th>"
              + "<th >SKU</th>"
              + "<th >MPN</th>"
              + "<th >MODEL</th>"
              + "<th >BRAND</th>"
              + "<th >TITLE</th>"
              + "<th >PATHURL</th>"
              + "<th >IMGURL</th>"
              + "<th >SKU_DISTINCT</th>"
              + "<th >EAN_DISTINCT</th>"
              + "<th >MPN_DISTINCT</th>"
              + "<th >MODEL_DISTINCT</th>"
              + "<th >BRAND_DISTINCT</th>"
              + "<th >TITLE_DISTINCT</th>"
              + "<th >PATHURL_DISTINCT</th>"
              + "<th >IMGURL_DISTINCT</th>"
              + "<th >SKU_VIDE</th>"
              + "<th >SKU=MPN</th>"
              + "<th >SKU=EAN</th>"
              + "<th >MPN=EAN</th>"
              + "<th >MODEL=MPN</th>"
              + "<th >BRAND=MPN</th>"
              + "<th >MODEL=BRAND</th>"
              + "<th >EAN!=13</th>"
              + "<th >SKU<4</th>"
              + "<th >MPN<4</th>"
              + "<th >PRICE<=0</th>"
              + "<th >PREVIEWS_PRICE<PRICE</th>"
              + "<th >DELIVERY_PRICE>PRICE</th>"
              + "<th >EAN_NON_DIGIT</th>"
              + "<th >MPN_NUMERIQUE</th>"
              + "<th >MPN_ALPHABETIQUE</th>"
              + "<th >REVIEWS</th>"
              + "<th >RATING</th>"
              + "<th >REVIEW_COMMENT</th>"
              + "<th >REVIEW_USER</th>"
              + "<th >REVIEW_TITLE</th>"
              + "<th >REVIEW_URL</th>"
              + "<th >REVIEW_DATE</th>"
              + "<th >SKU%</th>"
              + "<th >EAN%</th>"
              + "<th >MPN%</th>"
              + "<th >MODEL%</th>"
              + "<th >TITLE%</th>"
              + "<th >PATHURL%</th>"
              + "<th >IMGURL%</th>"
              + "<th >A_TRAITER</th>"
              + "<th >Nombre_de_clients</th>"
              + "<th >DATE</th>"
              + "<th >#</th>"
            + "</tr>"
        + "</thead>");
        String currentMonth = "";
        int currentWeek = 0;
        for (TableRow row : table) {
            Date DATES = row.getDATES();
            String month = getMonthFromDate(DATES);
            int week = getWeekFromDate(DATES);
            if (!month.equals(currentMonth)) {
                // Ajouter une ligne pour le nom du mois
                htmlBuilder.append("<tr><td colspan=\"2\"><strong>").append(month).append("</strong></td></tr>");
                currentMonth = month;
                currentWeek = 0;
            }
            if (week != currentWeek) {
                // Ajouter une ligne pour le numéro de semaine
                htmlBuilder.append("<tr><td colspan=\"2\"><em>Week ").append(week).append("</em></td></tr>");
                currentWeek = week;
            }
            htmlBuilder.append("<tr>")
                
                .append("<td>").append(row.getIdsite()).append("</td>")
                .append("<td>").append(row.getSITE()).append("</td>")
                .append("<td>").append(row.getPF()).append("</td>")
                .append("<td>").append(row.getDS()).append("</td>")
                .append("<td>").append(row.getMtchMPN()).append("</td>")
                .append("<td>").append(row.getTOUS()).append("</td>")
                .append("<td>").append(row.getEAN()).append("</td>")
                .append("<td>").append(row.getSKU()).append("</td>")
                .append("<td>").append(row.getMPN()).append("</td>")
                .append("<td>").append(row.getMODEL()).append("</td>")
                .append("<td>").append(row.getBRAND()).append("</td>")
                .append("<td>").append(row.getTITLE()).append("</td>")
                .append("<td>").append(row.getPATHURL()).append("</td>")
                .append("<td>").append(row.getIMGURL()).append("</td>")
                .append("<td>").append(row.getSKU_DISTINCT()).append("</td>")
                .append("<td>").append(row.getEAN_DISTINCT() ).append("</td>")
                .append("<td>").append(row.getMPN_DISTINCT()).append("</td>")
                .append("<td>").append(row.getMODEL_DISTINCT()).append("</td>")
                .append("<td>").append(row.getBRAND_DISTINCT()).append("</td>")
                .append("<td>").append(row.getPATHURL_DISTINCT()).append("</td>")
                .append("<td>").append(row.getIMGURL_DISTINCT()).append("</td>")
                .append("<td>").append(row.getSKU_VIDE()).append("</td>")
                .append("<td>").append(row.getSKU_EGAL_MPN()).append("</td>")
                .append("<td>").append(row.getSKU_EGAL_EAN()).append("</td>")
                .append("<td>").append(row.getMPN_EAN()).append("</td>")
                .append("<td>").append(row.getMODEL_EGAL_MPN()).append("</td>")
                .append("<td>").append(row.getBRAND_EGAL_MPN()).append("</td>")
                .append("<td>").append(row.getMODEL_EGAL_BRAND()).append("</td>")
                .append("<td>").append(row.getEAN_DIFF_13()).append("</td>")
                .append("<td>").append(row.getSKU_INF_4()).append("</td>")
                .append("<td>").append(row.getMPN_INF_4()).append("</td>")
                .append("<td>").append(row.getPRICE_INFEGAL_0()).append("</td>")
                .append("<td>").append(row.getPREVIEWS_PRICE_INF_PRICE()).append("</td>")
                .append("<td>").append(row.getDELIVERY_PRICE_SUP_PRICE()).append("</td>")
                .append("<td>").append(row.getEAN_NON_DIGIT()).append("</td>")
                .append("<td>").append(row.getMPN_NUMERIQ()).append("</td>")
                .append("<td>").append(row.getMPN_ALPHABETIQUE()).append("</td>")
                .append("<td>").append(row.getREVIEWS()).append("</td>")
                .append("<td>").append(row.getRATING()).append("</td>")
                .append("<td>").append(row.getREVIEW_COMMENT()).append("</td>")
                .append("<td>").append(row.getREVIEW_TITLE()).append("</td>")
                .append("<td>").append(row.getREVIEW_URL()).append("</td>")
                .append("<td>").append(row.getREVIEW_DATE()).append("</td>")
                .append("<td>").append(row.getSKU_DOUBLONS()).append("</td>")
                .append("<td>").append(row.getEAN_DOUBLONS()).append("</td>")
                .append("<td>").append(row.getMPN_DOUBLONS()).append("</td>")
                .append("<td>").append(row.getMODEL_DOUBLONS()).append("</td>")
                .append("<td>").append(row.getTITLE_DOUBLONS()).append("</td>")
                .append("<td>").append(row.getPATHURL_DOUBLONS()).append("</td>")
                .append("<td>").append(row.getIMG_URL()).append("</td>")
                .append("<td>").append(row.getATRAITER()).append("</td>")
                .append("<td>").append(DATES).append("</td>")  
                .append("<td>").append(row.getIdtable1()).append("</td>")
                .append("<td>").append(row.getIdStatut()).append("</td>")
                .append("</tr>");
                }
        htmlBuilder.append("</table>");
        String sortedHtml = htmlBuilder.toString();

        return sortedHtml;
    }

    private static String getMonthFromDate(Date DATES) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse((CharSequence) DATES, formatter);
        return date.getMonth().toString();
    }
    
    private static int getWeekFromDate(Date DATES) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse((CharSequence) DATES, formatter);
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        return date.get(weekFields.weekOfYear());
    }

    private static class TableRow implements Comparable<TableRow> {
        String idsite;
        String SITE;
        String PF;
        String  DS;
        String MtchMPN;
        String TOUS;
        String EAN;
        String SKU;
        String MPN;
        String MODEL;
        String BRAND;
        String TITLE;
        String PATHURL;
        String IMGURL;
        String SKU_DISTINCT;
        String EAN_DISTINCT;
        String MPN_DISTINCT;
        String MODEL_DISTINCT;
        String BRAND_DISTINCT;
        String PATHURL_DISTINCT;
        String IMGURL_DISTINCT;
        String SKU_VIDE;
        String SKU_EGAL_MPN;
        String SKU_EGAL_EAN;
        String MPN_EAN;
        String MODEL_EGAL_MPN;
        String BRAND_EGAL_MPN;
        String MODEL_EGAL_BRAND;
        String EAN_DIFF_13;
        String SKU_INF_4;
        String MPN_INF_4;
        String PRICE_INFEGAL_0;
        String PREVIEWS_PRICE_INF_PRICE;
        String DELIVERY_PRICE_SUP_PRICE;
        String EAN_NON_DIGIT;
        String MPN_NUMERIQ;
        String MPN_ALPHABETIQUE;
        String REVIEWS;
        String RATING;
        String REVIEW_COMMENT;
        String REVIEWS_USER;
        String REVIEW_TITLE;
        String REVIEW_URL;
        String REVIEW_DATE;
        String SKU_DOUBLONS;
        String EAN_DOUBLONS;
        String MPN_DOUBLONS;
        String MODEL_DOUBLONS;
        String TITLE_DOUBLONS;
        String PATHURL_DOUBLONS;
        String IMG_URL;
        String ATRAITER;
        Date DATES;
        String idtable1;
        String idStatut;

        public TableRow(String idsite, String SITE, String PF, String DS, String MtchMPN, String TOUS, String EAN, String SKU, String MPN, String MODEL, String BRAND, String TITLE, String PATHURL, String IMGURL, String SKU_DISTINCT, String EAN_DISTINCT, String MPN_DISTINCT, String MODEL_DISTINCT, String BRAND_DISTINCT, String PATHURL_DISTINCT, String IMGURL_DISTINCT, String SKU_VIDE, String SKU_EGAL_MPN, String SKU_EGAL_EAN, String MPN_EAN, String MODEL_EGAL_MPN, String BRAND_EGAL_MPN, String MODEL_EGAL_BRAND, String EAN_DIFF_13, String SKU_INF_4, String MPN_INF_4, String PRICE_INFEGAL_0, String PREVIEWS_PRICE_INF_PRICE, String DELIVERY_PRICE_SUP_PRICE, String EAN_NON_DIGIT, String MPN_NUMERIQ, String MPN_ALPHABETIQUE, String REVIEWS, String RATING, String REVIEW_COMMENT, String REVIEWS_USER, String REVIEW_TITLE, String REVIEW_URL, String REVIEW_DATE, String SKU_DOUBLONS, String EAN_DOUBLONS, String MPN_DOUBLONS, String MODEL_DOUBLONS, String TITLE_DOUBLONS, String PATHURL_DOUBLONS, String IMG_URL, String ATRAITER, Date DATES, String idtable1, String idStatut) {
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
        }

        private TableRow(String idsite, String SITE, String PF, String DS, String MtchMPN, String TOUS, String EAN, String SKU, String MPN, String MODEL, String BRAND, String TITLE, String PATHURL, String IMGURL, String SKU_DISTINCT, String EAN_DISTINCT, String MPN_DISTINCT, String MODEL_DISTINCT, String BRAND_DISTINCT, String PATHURL_DISTINCT, String IMGURL_DISTINCT, String SKU_VIDE, String SKU_EGAL_MPN, String SKU_EGAL_EAN, String MPN_EAN, String MODEL_EGAL_MPN, String BRAND_EGAL_MPN, String MODEL_EGAL_BRAND, String EAN_DIFF_13, String SKU_INF_4, String MPN_INF_4, String PRICE_INFEGAL_0, String PREVIEWS_PRICE_INF_PRICE, String DELIVERY_PRICE_SUP_PRICE, String EAN_NON_DIGIT, String MPN_NUMERIQ, String MPN_ALPHABETIQUE, String REVIEWS, String RATING, String REVIEW_COMMENT, String REVIEWS_USER, String REVIEW_TITLE, String REVIEW_URL, String REVIEW_DATE, String SKU_DOUBLONS, String EAN_DOUBLONS, String MPN_DOUBLONS, String MODEL_DOUBLONS, String TITLE_DOUBLONS, String PATHURL_DOUBLONS, String IMG_URL, String ATRAITER, String DATES, String idtable1) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public String getIdsite() {
            return idsite;
        }

        public void setIdsite(String idsite) {
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

        public String getTOUS() {
            return TOUS;
        }

        public void setTOUS(String TOUS) {
            this.TOUS = TOUS;
        }

        public String getEAN() {
            return EAN;
        }

        public void setEAN(String EAN) {
            this.EAN = EAN;
        }

        public String getSKU() {
            return SKU;
        }

        public void setSKU(String SKU) {
            this.SKU = SKU;
        }

        public String getMPN() {
            return MPN;
        }

        public void setMPN(String MPN) {
            this.MPN = MPN;
        }

        public String getMODEL() {
            return MODEL;
        }

        public void setMODEL(String MODEL) {
            this.MODEL = MODEL;
        }

        public String getBRAND() {
            return BRAND;
        }

        public void setBRAND(String BRAND) {
            this.BRAND = BRAND;
        }

        public String getTITLE() {
            return TITLE;
        }

        public void setTITLE(String TITLE) {
            this.TITLE = TITLE;
        }

        public String getPATHURL() {
            return PATHURL;
        }

        public void setPATHURL(String PATHURL) {
            this.PATHURL = PATHURL;
        }

        public String getIMGURL() {
            return IMGURL;
        }

        public void setIMGURL(String IMGURL) {
            this.IMGURL = IMGURL;
        }

        public String getSKU_DISTINCT() {
            return SKU_DISTINCT;
        }

        public void setSKU_DISTINCT(String SKU_DISTINCT) {
            this.SKU_DISTINCT = SKU_DISTINCT;
        }

        public String getEAN_DISTINCT() {
            return EAN_DISTINCT;
        }

        public void setEAN_DISTINCT(String EAN_DISTINCT) {
            this.EAN_DISTINCT = EAN_DISTINCT;
        }

        public String getMPN_DISTINCT() {
            return MPN_DISTINCT;
        }

        public void setMPN_DISTINCT(String MPN_DISTINCT) {
            this.MPN_DISTINCT = MPN_DISTINCT;
        }

        public String getMODEL_DISTINCT() {
            return MODEL_DISTINCT;
        }

        public void setMODEL_DISTINCT(String MODEL_DISTINCT) {
            this.MODEL_DISTINCT = MODEL_DISTINCT;
        }

        public String getBRAND_DISTINCT() {
            return BRAND_DISTINCT;
        }

        public void setBRAND_DISTINCT(String BRAND_DISTINCT) {
            this.BRAND_DISTINCT = BRAND_DISTINCT;
        }

        public String getPATHURL_DISTINCT() {
            return PATHURL_DISTINCT;
        }

        public void setPATHURL_DISTINCT(String PATHURL_DISTINCT) {
            this.PATHURL_DISTINCT = PATHURL_DISTINCT;
        }

        public String getIMGURL_DISTINCT() {
            return IMGURL_DISTINCT;
        }

        public void setIMGURL_DISTINCT(String IMGURL_DISTINCT) {
            this.IMGURL_DISTINCT = IMGURL_DISTINCT;
        }

        public String getSKU_VIDE() {
            return SKU_VIDE;
        }

        public void setSKU_VIDE(String SKU_VIDE) {
            this.SKU_VIDE = SKU_VIDE;
        }

        public String getSKU_EGAL_MPN() {
            return SKU_EGAL_MPN;
        }

        public void setSKU_EGAL_MPN(String SKU_EGAL_MPN) {
            this.SKU_EGAL_MPN = SKU_EGAL_MPN;
        }

        public String getSKU_EGAL_EAN() {
            return SKU_EGAL_EAN;
        }

        public void setSKU_EGAL_EAN(String SKU_EGAL_EAN) {
            this.SKU_EGAL_EAN = SKU_EGAL_EAN;
        }

        public String getMPN_EAN() {
            return MPN_EAN;
        }

        public void setMPN_EAN(String MPN_EAN) {
            this.MPN_EAN = MPN_EAN;
        }

        public String getMODEL_EGAL_MPN() {
            return MODEL_EGAL_MPN;
        }

        public void setMODEL_EGAL_MPN(String MODEL_EGAL_MPN) {
            this.MODEL_EGAL_MPN = MODEL_EGAL_MPN;
        }

        public String getBRAND_EGAL_MPN() {
            return BRAND_EGAL_MPN;
        }

        public void setBRAND_EGAL_MPN(String BRAND_EGAL_MPN) {
            this.BRAND_EGAL_MPN = BRAND_EGAL_MPN;
        }

        public String getMODEL_EGAL_BRAND() {
            return MODEL_EGAL_BRAND;
        }

        public void setMODEL_EGAL_BRAND(String MODEL_EGAL_BRAND) {
            this.MODEL_EGAL_BRAND = MODEL_EGAL_BRAND;
        }

        public String getEAN_DIFF_13() {
            return EAN_DIFF_13;
        }

        public void setEAN_DIFF_13(String EAN_DIFF_13) {
            this.EAN_DIFF_13 = EAN_DIFF_13;
        }

        public String getSKU_INF_4() {
            return SKU_INF_4;
        }

        public void setSKU_INF_4(String SKU_INF_4) {
            this.SKU_INF_4 = SKU_INF_4;
        }

        public String getMPN_INF_4() {
            return MPN_INF_4;
        }

        public void setMPN_INF_4(String MPN_INF_4) {
            this.MPN_INF_4 = MPN_INF_4;
        }

        public String getPRICE_INFEGAL_0() {
            return PRICE_INFEGAL_0;
        }

        public void setPRICE_INFEGAL_0(String PRICE_INFEGAL_0) {
            this.PRICE_INFEGAL_0 = PRICE_INFEGAL_0;
        }

        public String getPREVIEWS_PRICE_INF_PRICE() {
            return PREVIEWS_PRICE_INF_PRICE;
        }

        public void setPREVIEWS_PRICE_INF_PRICE(String PREVIEWS_PRICE_INF_PRICE) {
            this.PREVIEWS_PRICE_INF_PRICE = PREVIEWS_PRICE_INF_PRICE;
        }

        public String getDELIVERY_PRICE_SUP_PRICE() {
            return DELIVERY_PRICE_SUP_PRICE;
        }

        public void setDELIVERY_PRICE_SUP_PRICE(String DELIVERY_PRICE_SUP_PRICE) {
            this.DELIVERY_PRICE_SUP_PRICE = DELIVERY_PRICE_SUP_PRICE;
        }

        public String getEAN_NON_DIGIT() {
            return EAN_NON_DIGIT;
        }

        public void setEAN_NON_DIGIT(String EAN_NON_DIGIT) {
            this.EAN_NON_DIGIT = EAN_NON_DIGIT;
        }

        public String getMPN_NUMERIQ() {
            return MPN_NUMERIQ;
        }

        public void setMPN_NUMERIQ(String MPN_NUMERIQ) {
            this.MPN_NUMERIQ = MPN_NUMERIQ;
        }

        public String getMPN_ALPHABETIQUE() {
            return MPN_ALPHABETIQUE;
        }

        public void setMPN_ALPHABETIQUE(String MPN_ALPHABETIQUE) {
            this.MPN_ALPHABETIQUE = MPN_ALPHABETIQUE;
        }

        public String getREVIEWS() {
            return REVIEWS;
        }

        public void setREVIEWS(String REVIEWS) {
            this.REVIEWS = REVIEWS;
        }

        public String getRATING() {
            return RATING;
        }

        public void setRATING(String RATING) {
            this.RATING = RATING;
        }

        public String getREVIEW_COMMENT() {
            return REVIEW_COMMENT;
        }

        public void setREVIEW_COMMENT(String REVIEW_COMMENT) {
            this.REVIEW_COMMENT = REVIEW_COMMENT;
        }

        public String getREVIEWS_USER() {
            return REVIEWS_USER;
        }

        public void setREVIEWS_USER(String REVIEWS_USER) {
            this.REVIEWS_USER = REVIEWS_USER;
        }

        public String getREVIEW_TITLE() {
            return REVIEW_TITLE;
        }

        public void setREVIEW_TITLE(String REVIEW_TITLE) {
            this.REVIEW_TITLE = REVIEW_TITLE;
        }

        public String getREVIEW_URL() {
            return REVIEW_URL;
        }

        public void setREVIEW_URL(String REVIEW_URL) {
            this.REVIEW_URL = REVIEW_URL;
        }

        public String getREVIEW_DATE() {
            return REVIEW_DATE;
        }

        public void setREVIEW_DATE(String REVIEW_DATE) {
            this.REVIEW_DATE = REVIEW_DATE;
        }

        public String getSKU_DOUBLONS() {
            return SKU_DOUBLONS;
        }

        public void setSKU_DOUBLONS(String SKU_DOUBLONS) {
            this.SKU_DOUBLONS = SKU_DOUBLONS;
        }

        public String getEAN_DOUBLONS() {
            return EAN_DOUBLONS;
        }

        public void setEAN_DOUBLONS(String EAN_DOUBLONS) {
            this.EAN_DOUBLONS = EAN_DOUBLONS;
        }

        public String getMPN_DOUBLONS() {
            return MPN_DOUBLONS;
        }

        public void setMPN_DOUBLONS(String MPN_DOUBLONS) {
            this.MPN_DOUBLONS = MPN_DOUBLONS;
        }

        public String getMODEL_DOUBLONS() {
            return MODEL_DOUBLONS;
        }

        public void setMODEL_DOUBLONS(String MODEL_DOUBLONS) {
            this.MODEL_DOUBLONS = MODEL_DOUBLONS;
        }

        public String getTITLE_DOUBLONS() {
            return TITLE_DOUBLONS;
        }

        public void setTITLE_DOUBLONS(String TITLE_DOUBLONS) {
            this.TITLE_DOUBLONS = TITLE_DOUBLONS;
        }

        public String getPATHURL_DOUBLONS() {
            return PATHURL_DOUBLONS;
        }

        public void setPATHURL_DOUBLONS(String PATHURL_DOUBLONS) {
            this.PATHURL_DOUBLONS = PATHURL_DOUBLONS;
        }

        public String getIMG_URL() {
            return IMG_URL;
        }

        public void setIMG_URL(String IMG_URL) {
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

        public String getIdtable1() {
            return idtable1;
        }

        public void setIdtable1(String idtable1) {
            this.idtable1 = idtable1;
        }

        public String getIdStatut() {
            return idStatut;
        }

        public void setIdStatut(String idStatut) {
            this.idStatut = idStatut;
        }

        @Override
        public int compareTo(TableRow other) {
            return DATES.compareTo(other.DATES);
        }
    }
}

