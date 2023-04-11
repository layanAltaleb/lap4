package com.example.lapw5;

public class StudentMod {
    private String name;
    private int id;
    private int age;



    public StudentMod(int id, String name, int age) {
        this.name = name;
        this.age=age;
        this.id=id;
    }

    @Override
    public String toString() {
        return "StudentMod{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
