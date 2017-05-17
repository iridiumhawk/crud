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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entity entity = (Entity) o;

        if (id != entity.id) return false;
        if (!name1.equals(entity.name1)) return false;
        return name2.equals(entity.name2);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name1.hashCode() * 31;
        result = 31 * result + name2.hashCode() + 1;
        return result;
    }

    @Override
    public String toString() {
        return
                "{id=" + id + "test" +
                ", name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' + "}" ;
    }
}
