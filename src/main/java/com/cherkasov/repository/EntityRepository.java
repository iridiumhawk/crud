package com.cherkasov.repository;

import com.cherkasov.entity.Entity;

import java.sql.SQLException;
import java.util.List;

public interface EntityRepository {
    Entity save(Entity entity);

    boolean delete(int id);

    Entity get(int id);

    List<Entity> getAll() throws SQLException;

    List<Entity> getOrdered(int column);
}
