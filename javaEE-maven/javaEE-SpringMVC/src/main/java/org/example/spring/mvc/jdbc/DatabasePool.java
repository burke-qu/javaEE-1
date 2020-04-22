package org.example.spring.mvc.jdbc;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DatabasePool {

    private static HikariDataSource hikariDataSource;
    /**
     * 加一个双层锁
     * @return
     */
    public static HikariDataSource getHikariDataSource(){
        if(hikariDataSource != null){
            return hikariDataSource;
        }
        synchronized (DatabasePool.class) {
            if(hikariDataSource == null ) {
                String driverName = "com.mysql.cj.jdbc.Driver";
                String url = "jdbc:mysql://127.0.0.1:3306/school";
                String allUrl = url + "?useSSL=false&serverTimezone=UTC";
                HikariConfig hikariConfig = new HikariConfig();
                hikariConfig.setUsername("root");
                hikariConfig.setPassword("209999girl");
                hikariConfig.setDriverClassName(driverName);
                hikariConfig.setJdbcUrl(allUrl);
                hikariDataSource = new HikariDataSource(hikariConfig);
                return hikariDataSource;
            }
        }
        return  null;
    }

//    public static void main(String[] args) {
//        while(true){
//            getHikariDataSource();
//           try{
//               Thread.sleep(1000);
//           } catch (InterruptedException e) {
//               e.printStackTrace();
//           }
//        }
//    }

}
