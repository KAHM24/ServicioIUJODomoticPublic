package net.kahmsoft.project.iot.iujo.iotiujo.db;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class main {

    public static void main(String[] args) {
        ConexionDB  con = new ConexionDB();
        //javaPostgreSQLBasic.connectDatabase();
        Connection conn;
        conn = con.connectDatabase("ec2-3-229-252-6.compute-1.amazonaws.com",
                "5432",
                "dbtndoh00jicv3",
                "bxwypvvdgjhias",
                "e92b9f45a95ecc3acbbc9a12a67fcd1cf4f6bc555a36f9f9726d266213a45ab1");

        try
        {
            /* CallableStatement stmt = con.prepareCall("{call helloworld()}"); */
            PreparedStatement stmt = conn.prepareStatement("call helloworld()");
            stmt.execute();
            System.out.println("Stored Procedure executed successfully");
            //conn.close();
        }
        catch(Exception err)
        {
            err.printStackTrace();
        }

        try
        {
            /* CallableStatement stmt = con.prepareCall("{call helloworld()}"); */
            PreparedStatement stmt = conn.prepareCall("call insertEstudiantes(?,?,?,?)");
            stmt.setString(1, "KAHMTest2");
            stmt.setString(2, "55511122");
            stmt.setString(3, "karina_2_kahm@hotmail.com");
            stmt.setInt(4, 5);
            stmt.execute();
            stmt.close();
            System.out.println("Stored Procedure executed successfully");
            conn.close();
        }
        catch(Exception err)
        {
            err.printStackTrace();
        }
    }
}
