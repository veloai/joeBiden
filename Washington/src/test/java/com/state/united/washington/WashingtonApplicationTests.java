package com.state.united.washington;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

@SpringBootTest
class WashingtonApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void dbConnection(){
        DataSource dataSource;
    }
}
