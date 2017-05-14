package com.cherkasov.repository;

import com.cherkasov.entity.Entity;

import java.util.List;

public class HibernateRepository implements EntityRepository {
    public Entity save(Entity entity) {
        return null;
    }

    public boolean delete(int id) {
        return false;
    }

    public Entity get(int id) {
        return null;
    }

    public List<Entity> getAll() {
        return null;
    }

    public List<Entity> getOrdered(int column) {
        return null;
    }
}
