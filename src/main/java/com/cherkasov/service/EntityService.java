package com.cherkasov.service;

import com.cherkasov.entity.Entity;

import java.sql.SQLException;
import java.util.List;

public interface EntityService {
    void save(Entity entity);
    void delete(int id);
    void update(Entity entity);
    Entity get(int id);
    List<Entity> getAll() throws SQLException;
    List<Entity> getAllSorted(int column);
}
