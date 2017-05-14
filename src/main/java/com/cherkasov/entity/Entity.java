package com.cherkasov.entity;


public class Entity {
    private int id;
    private String name1;
    private String name2;

    public Entity() {
    }

    public Entity(int id, String name1, String name2) {
        this.id = id;
        this.name1 = name1;
        this.name2 = name2;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                ", name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                '}';
    }
}
