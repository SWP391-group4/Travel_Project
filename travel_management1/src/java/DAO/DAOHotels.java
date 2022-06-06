/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DBContext.connectDB;
import Entity.Hotels;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nam
 */
public class DAOHotels extends connectDB{
    public List<Hotels> ListHotel(){
      List<Hotels> ve = new ArrayList<>();
       String query = "select * from hotels";
        ResultSet rs = getData(query);
try {
   
    while (rs.next()) {
                  String hotel_id = rs.getString(1);
                String hotel_name = rs.getString(2);
                String address_id = rs.getString(3);
                String service_id = rs.getString(4);
                String img = rs.getString(5);
                Hotels ht = new Hotels(hotel_id, hotel_name, address_id, service_id, img);
                ve.add(ht);
                System.out.println(ht);
            }
        } catch (Exception e) {
             e.printStackTrace();
        }
        return ve;
    }
    public static void main(String[] args) {
        DAOHotels dao = new DAOHotels();
             dao.ListHotel();
    }
}