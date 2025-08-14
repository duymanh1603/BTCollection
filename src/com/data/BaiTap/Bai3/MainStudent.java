package com.data.BaiTap.Bai3;

import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Nam", "Hà Nội", 8.5));
        students.add(new Student(2, "Lan", "Đà Nẵng", 7.2));
        students.add(new Student(3, "Hùng", "Hải Phòng", 9.0));
        students.add(new Student(4, "Mai", "Huế", 6.8));
        students.add(new Student(5, "Tuấn", "Sài Gòn", 8.0));

        System.out.println("Số lượng sinh viên trong danh sách: " + students.size());

        System.out.println("\nDanh sách sinh viên:");
        for (Student s : students) {
            System.out.println(s);
        }

        if (!students.isEmpty()) {
            System.out.println("\nSinh viên cuối cùng trong danh sách:");
            System.out.println(students.get(students.size() - 1));
        }
    }
}
