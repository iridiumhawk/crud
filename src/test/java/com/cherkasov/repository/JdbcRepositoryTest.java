package com.cherkasov.repository;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.logging.Logger;


/**
 * Created by hawk on 23.04.2017.
 */
@ContextConfiguration("classpath:spring-app.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Sql("classpath:db/populateDB.sql")
public class JdbcRepositoryTest {

    private static final Logger logger = Logger.getLogger(JdbcRepositoryTest.class.toString());


    @Autowired
    EntityRepository jdbcRepository ;

    @Before
    public void setUp() throws Exception {
//        jdbcRepository = new JdbcRepository();

    }

    @Test
    public void save() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }

    @Test
    public void get() throws Exception {

    }

    @Test
    public void getAll() throws Exception {

        System.out.println(jdbcRepository.getAll());
    }

    @Test
    public void getOrdered() throws Exception {

    }

}