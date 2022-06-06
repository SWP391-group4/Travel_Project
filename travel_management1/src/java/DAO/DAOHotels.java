/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DBContext.connectDB;
import Entity.Hotels;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nam
 */
public class DAOHotels  extends connectDB{

    public List<Hotels> ListHotel(){
      List<Hotels> ve = new ArrayList<>();
       String query = "select h.HotelId,h.HotelName, h.ServiceId,h.[Image],ha.city,ha.District,ha.Specific,ha.Ward from Hotels h\n" +
"inner join HotelAddresses ha on h.AddressId=ha.AddressId";
        ResultSet rs = getData(query);
try {
        
            while (rs.next()) {
                  String hotelID=rs.getString(1);
                   String hotelName=rs.getString(2);
                    
                     String ServiceId=rs.getString(3);
                      String image=rs.getString(4);
                     
                       String city=rs.getString(5);
                       String district=rs.getString(6);
                       String specific=rs.getString(7);
                        String ward=rs.getString(7);
                Hotels ht = new Hotels(hotelID, hotelName, ServiceId, image,city, district, specific, ward);
                ve.add(ht);
                System.out.println(ht);
            }
        } catch (Exception e) {
             e.printStackTrace();
        }
        return ve;
    }
    public List<Hotels> ListHotel_name_id(){
        List<Hotels> ve = new ArrayList<>();
        String query="select HotelId,Hotelname from Hotels";
           ResultSet rs = getData(query);
try {
         
            while (rs.next()) {
                String hotel_id = rs.getString(1);
                String hotel_name = rs.getString(2);
                
                Hotels ht = new Hotels(hotel_id, hotel_name);
                ve.add(ht);
                System.out.println(ht);
            }
        } catch (Exception e) {
             e.printStackTrace();
        }
        return ve;
    }
    public List<Hotels> Hotel_address(){
        List<Hotels> ve = new ArrayList<>();
        String query="select * from HotelAddresses inner join Hotels\n" +
"on HotelAddresses.AddressId=Hotels.AddressId";
         ResultSet rs = getData(query);
         try{
      
            while (rs.next()) {
                String AdrressID = rs.getString(2);
                String Provine = rs.getString(1);
                   String City = rs.getString(3);
                 String Street = rs.getString(4);
                  String Disstrict = rs.getString(5);
                   String HotelId = rs.getString(6);
                    String HotelName = rs.getString(7);
                     String ServiceID = rs.getString(8);
                      String img = rs.getString(9);
                Hotels ht = new Hotels(Provine, AdrressID, City, Street,Disstrict, HotelId, HotelName, ServiceID, img);
                ve.add(ht);
                System.out.println(ht);
            }
        } catch (Exception e) {
             e.printStackTrace();
        }
        return ve;
    }
   public Hotels SearchbyProvince(String Province){
        String sql = "select * from HotelAddresses inner join Hotels  on HotelAddresses.AddressId = Hotels.AddressId  where Province like N'" +Province+ "'";
        ResultSet rs = getData(sql);
        try {
            
            while (rs.next()) {
                Province = rs.getString(1);
                String AddressID = rs.getString(2);
                String City = rs.getString(3);
                String Street = rs.getString(4);
         ;
                String Hotel_id = rs.getString(5);
               String Hotel_Name = rs.getString(6);
              String  Service_id=rs.getString(7);
                String image = rs.getString(8);
                return new Hotels(Hotel_id, Hotel_Name, AddressID, Service_id, image, City, Street, City, image);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

            
    
    public static void main(String[] args) {
        DAOHotels dao = new DAOHotels();
             List<Hotels> list=dao.ListHotel();
             for (Hotels hotels : list) {
                 System.out.println(hotels);
        }
    }
    }


