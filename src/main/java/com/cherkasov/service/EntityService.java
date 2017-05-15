package com.cherkasov.service;

import com.cherkasov.entity.Entity;

import java.sql.SQLException;
import java.util.List;

public interface EntityService {
    /**
     *
     * @param entity
     */
    void save(Entity entity);

    /**
     *
     * @param id
     */
    void delete(int id);

    /**
     *
     * @param entity
     */
    void update(Entity entity);

    /**
     *
     * @param id
     * @return Entity
     */
    Entity get(int id);

    /**
     *
     * @return
     * @throws SQLException
     */
    List<Entity> getAll() throws SQLException;

    /**
     *
     * @param column
     * @return list
     */
    List<Entity> getAllSorted(int column);
}
