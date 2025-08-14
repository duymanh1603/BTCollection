package com.data.BaiTap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> num = new ArrayList<>();

        System.out.println("Nhập 5 số nguyên:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Số " + i + ": ");
            num.add(sc.nextInt()); // thêm vào list
        }

        // Tính tổng
        int sum = 0;
        for (int nums : num) {
            sum += nums;
        }
        System.out.println("Danh sách số đã nhập: " + num);
        System.out.println("Tổng các số: " + sum);
        sc.close();
    }
}