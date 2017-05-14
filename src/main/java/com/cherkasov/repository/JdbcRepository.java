package com.cherkasov.repository;

import com.cherkasov.entity.Entity;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class JdbcRepository implements EntityRepository {

    @Autowired
    private DataSource dataSource;

    public Entity save(Entity entity) {
        return null;
    }

    public boolean delete(int id) {
        return false;
    }

    public Entity get(int id) {
        return null;
    }

    public List<Entity> getAll() throws SQLException {

        Connection conn = dataSource.getConnection();

        Statement statement = conn.createStatement();

        String sql = "SELECT * FROM table_name";
        ResultSet resultSet = statement.executeQuery(sql);
        List<Entity> list = new ArrayList<Entity>();
        while (resultSet.next()) {
            list.add(new Entity(resultSet.getInt("id"), resultSet.getString("name1"), resultSet.getString("name2")));
        }
        resultSet.close();
        return list;
    }

    public List<Entity> getOrdered(int column) {
        return null;
    }
}
