package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {

    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/kata_test";
    private static final SessionFactory hibernateSessionFactory;
    private static Connection connection;


    private Util() {
        throw new IllegalStateException("Utility class");
    }


    static {
        try {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static {
        Properties properties = new Properties();
        properties.setProperty("hibernate.connection.username", USER_NAME);
        properties.setProperty("hibernate.connection.password", PASSWORD);
        properties.setProperty("hibernate.connection.url", URL);
        properties.setProperty("default_schema", "kata_test");
        properties.setProperty("dialect", "org.hibernate.dialect.MySQLDialect");
        properties.setProperty("show_sql", "true");
        properties.setProperty("hibernate.format_sql", "true");
        properties.setProperty("hibernate.current_session_context_class", "thread");
        hibernateSessionFactory = new Configuration()
                .addProperties(properties)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();
    }

    public static Connection getConnection() {
        return connection;
    }

    public static SessionFactory getHibernateSessionFactory() {
        return hibernateSessionFactory;
    }

    //Вариант с методом для отдельного соединения JDBC для каждого запроса (трансзакции)
    /*public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }*/

    //Вариант с методом для отдельной фабрики hibernate для каждой сессии (соединения)
    /*public static SessionFactory getHibernateSessionFactory() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.connection.username", USER_NAME);
        properties.setProperty("hibernate.connection.password", PASSWORD);
        properties.setProperty("hibernate.connection.url", URL);
        properties.setProperty("default_schema", "kata_test");
        properties.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
        properties.setProperty("dialect", "org.hibernate.dialect.MySQLDialect");
        properties.setProperty("show_sql", "true");
        properties.setProperty("hibernate.format_sql", "true");
        properties.setProperty("hibernate.current_session_context_class", "thread");

        hibernateSessionFactory = new Configuration().addProperties(properties).buildSessionFactory();
        return hibernateSessionFactory;
    }*/
}
