package com.data.BaiTap.Bai4;

public class Student {
    private int id;
    private String name;
    private String address;
    private double score;

    public Student(int id, String name, String address, double score) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.score = score;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", score=" + score +
                '}';
    }
}
