/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Workdev
 */
public class ticket {
    int idTicket;
    String Num_Ticket;

    public ticket(int idTicket, String Num_Ticket) {
        this.idTicket = idTicket;
        this.Num_Ticket = Num_Ticket;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public String getNum_Ticket() {
        return Num_Ticket;
    }

    public void setNum_Ticket(String Num_Ticket) {
        this.Num_Ticket = Num_Ticket;
    }

    
    public static void InsertTicket(String Num_Ticket, Connection con) throws Exception{
        Statement st =  con.createStatement();
        String sql = "INSERT INTO ticket values (null,'"+Num_Ticket+"')";
        st.executeUpdate(sql);
    }
}
