package test;

import utilities.Config;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCExample {


    public static void main(String[] args) throws SQLException {
    // host    ec2-18-221-212-33.us-east-2.compute.amazonaws.com for jdbc we add in front of url "jdbc:oracle:thin:@" and ":port nr:xe;
        //hr
        //hr
        // port 1521
        // xe

    // We have 3 main classes in JDBC
    //1. Connection
    //2. Statement
    //3. ResultSet
        String oracleURL = Config.getProperty("oracleUrl");
        String oracleUsername = Config.getProperty("oracleUsername");
        String oraclePassword = Config.getProperty("oraclePassword");

        Connection connection = DriverManager.getConnection(oracleURL, oracleUsername, oraclePassword);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("select employee_id, first_name, last_name from employees");
        resultSet.next();
//        System.out.println("First row: "+ resultSet.getObject(1));
//        System.out.println("First row: "+ resultSet.getObject(2));
//        System.out.println("First row: "+ resultSet.getObject(3));
       //while(resultSet.next()){
           // System.out.println(resultSet.getObject(2) + " "+ resultSet.getObject(3));
       // }
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        List<Map<String, Object>> table = new ArrayList<>();
        while(resultSet.next()) {
            Map<String, Object> map = new HashMap<>();
            for (int i = 1; i <= columnCount; i++) {
                map.put(metaData.getColumnName(i), resultSet.getObject(i));
            }
            table.add(map);
        }
        for (Map m: table) {
            System.out.println(m);
        }




        resultSet.close();
        statement.close();
        connection.close();



    }

    public static List<Map<String, Object>> expectedResult(){
        List<Map<String, Object>> table = new ArrayList<>();



//        Map<String, Object> map1 = new HashMap<>();
//        map1.put("employee_id",100);
//        map1.put("first_name","Steven");
//        map1.put("last_name","King");
//        map1.put("salary",24000);
//
//        Map<String, Object> map2 = new HashMap<>();
//        map1.put("employee_id",101);
//        map1.put("first_name","Neen");
//        map1.put("last_name","Kochhar");
//        map1.put("salary",17000);
//
//        Map<String, Object> map3 = new HashMap<>();
//        map1.put("employee_id",102);
//        map1.put("first_name","Lex");
//        map1.put("last_name","Da Haan");
//        map1.put("salary",17000);
//
//        table.add(map1);
//        table.add(map2);
//        table.add(map2);
//        table.add(map3);


        return table;

    }
}
