package com.blusmart.driver.Database;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BlusmartDevDb {

    static int lport=5656;
    static String rhost="blusmart-dev-db.cabibx6lsq5g.ap-south-1.rds.amazonaws.com";
    static String host="13.127.137.247";
    static int rport=3306;
    static String user="VTQA0004";
    static String password="c26b177f3ed1";
    static String privateKey = "src/VTQA0004";

    static String dbuserName = "VTQA0004";
    static String dbpassword = "c26b177f3ed1";
    static String url = "jdbc:mysql://localhost:"+lport+"/blusmartDevDb";
    static String driverName="com.mysql.cj.jdbc.Driver";
    public static Connection conn ;
    static Session session= null;

    public static void dbConnect() throws SQLException {

        try{
            //Set StrictHostKeyChecking property to no to avoid UnknownHostKey issue
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            JSch jsch = new JSch();
            jsch.addIdentity(privateKey);
            session=jsch.getSession(user, host, 22);
            session.setPassword(password);
            session.setConfig(config);
            session.connect();
            System.out.println("Connected");
            int assinged_port=session.setPortForwardingL(lport, rhost, rport);
            System.out.println("localhost:"+assinged_port+" -> "+rhost+":"+rport);
            System.out.println("Port Forwarded");

            //mysql database connectivity
            Class.forName(driverName).newInstance();
            conn = DriverManager.getConnection (url, dbuserName, dbpassword);
            System.out.println ("Database connection established");
            System.out.println("DONE");
//            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
//            create.update(com.blusmart_dev.database.Tables.DRIVERS).set(com.blusmart_dev.database.Tables.DRIVERS.LAST_NAME,"Test").where(com.blusmart_dev.database.Tables.DRIVERS.FIRST_NAME.eq("Ahsan")).execute();
//            Result<Record> result = create.select().from(com.blusmart_dev.database.Tables.DRIVERS).where(com.blusmart_dev.database.Tables.DRIVERS.FIRST_NAME.eq("Ahsan")).fetch();
//            System.out.println(result);
        }

        catch(Exception e){
            e.printStackTrace();
        }
//        finally{
//            if(conn != null && !conn.isClosed()){
//                System.out.println("Closing Database Connection");
//                conn.close();
//            }
//            if(session !=null && session.isConnected()){
//                System.out.println("Closing SSH Connection");
//                session.disconnect();
//            }
//        }

    }
}
