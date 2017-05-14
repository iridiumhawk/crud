package com.cherkasov.service;

import com.cherkasov.entity.Entity;
import com.cherkasov.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ServiceImpl implements EntityService {

    @Autowired
    private EntityRepository repository;

    public void save(Entity entity) {
        repository.save(entity);
    }

    public void delete(int id) {
        repository.delete(id);
    }

    public void update(Entity entity) {
        repository.save(entity);
    }

    public Entity get(int id) {

        return repository.get(id);
    }

    public List<Entity> getAll() throws SQLException {
        return repository.getAll();
    }

    public List<Entity> getAllSorted(int column) {

        return repository.getOrdered(column);
    }
}
