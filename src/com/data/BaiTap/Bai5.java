package com.data.BaiTap;

import java.util.ArrayList;
import java.util.List;

public class Bai5 {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();

        numbers.add(1.1);
        numbers.add(2.2);
        numbers.add(3.3);
        numbers.add(4.4);
        numbers.add(5.5);
        numbers.add(6.6);
        numbers.add(7.7);
        numbers.add(8.8);

        System.out.println("Danh sách ban đầu: " + numbers);
        numbers.remove(0);
        System.out.println("Danh sách sau khi xóa phần tử thứ 0: " + numbers);
    }
}

