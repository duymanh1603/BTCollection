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
                name = sc.nextLine();


            }
        }
    }
}