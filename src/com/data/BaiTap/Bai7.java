package com.data.BaiTap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> universities = new ArrayList<>();

        System.out.print("Nhập số lượng trường đại học: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String name;
            while (true) {
                System.out.print("Nhập tên trường thứ " + (i + 1) + ": ");
                name = sc.nextLine().trim();

                if (name.isEmpty()) {
                    System.out.println("Tên trường không được để trống. Nhập lại!");
                } else if (name.matches("\\d+")) {
                    System.out.println("Tên trường không được chỉ chứa số. Nhập lại!");
                } else {
                    universities.add(name);
                    break;
                }
            }
        }

        // In danh sách
        System.out.println("\nDanh sách các trường đại học:");
        for (String uni : universities) {
            System.out.println("- " + uni);
        }

        sc.close();
    }
}