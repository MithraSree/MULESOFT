package com.company;

import java.sql.*;

public class InsertRecordIntoDb {
    public static void main(String[] args) {
        try {

            Connection con = null;
            Statement stmt = null;

            con = DriverManager
                    .getConnection("jdbc:sqlite:/C:\\sqlite\\java\\connect\\net\\sqlitetutorial\\Mulesoft\\MoviesDatabase.db");

            System.out.println("Database Connection Successful !!");

            stmt = con.createStatement(); // Create Statement

            String query0 = "INSERT INTO MyMovies values ('Whistle','Vijay','Nayantara', 2019,'Atlee');";
            stmt.executeUpdate(query0); // Create Query-0

            String query1 = "INSERT INTO MyMovies values ('RRR','Ram charan','Alia Bhatt', 2022,'S S Rajamouli');";
            stmt.executeUpdate(query1); // Create Query-1

            String query2 = "INSERT INTO MyMovies values ('Eega','Nani','Samantha',2012,'S S Rajamouli');";
            stmt.executeUpdate(query2); // Create Query-2

            String query3 = "INSERT INTO MyMovies values ('Maharshi','Mahesh Babu','Pooja Hegde',2019,'Vamshi Paidipally');";
            stmt.executeUpdate(query3); // Create Query-3

            String query4 = "INSERT INTO MyMovies values ('Temper','NTR','Kajal',2015,'Puri Jaganadh');";
            stmt.executeUpdate(query4); // Create Query-4

            String query5 = "INSERT INTO MyMovies values ('Racha','Ram Charan','Tamannah',2012,'Sampath Nandi');";
            stmt.executeUpdate(query5);
            stmt.close();

            con.close();                //Close Connection
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Record  Insertion successful");
    }
}