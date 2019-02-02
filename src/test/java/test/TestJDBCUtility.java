package test;

import utilities.DBType;
import utilities.DBUtility;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class TestJDBCUtility {


    public static void main(String[] args) throws SQLException {
        List<Map<String, Object>> resultTable;
        String query = "select employee_id, first_name, last_name from employees where rownum<=3";
        DBUtility.openConnection(DBType.ORACLE );
        resultTable = DBUtility.executeSQLQuery(query);
        DBUtility.closeConnection();

        for(Map map : resultTable){
            System.out.println(map);
        }


    }
}
