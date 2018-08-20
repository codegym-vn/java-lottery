package com.codegym;

import jdk.nashorn.internal.runtime.NumberToString;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Khai báo các biến sử dụng trong chương trình
        String lottery, guessDigit1, guessDigit2, firstPrize, secondPrize;

        // Nhập vào số đầu tiên của dự đoán
        System.out.println("Enter the first number: ");
        guessDigit1 = input.nextLine();

        // Nhập vào số thứ hai của dự đoán
        System.out.println("Enter the second number: ");
        guessDigit2 = input.nextLine();

        // Số trúng giải nhất
        firstPrize = guessDigit1.concat(guessDigit2);

        // Số trúng giải nhì
        secondPrize = guessDigit2.concat(guessDigit1);

        // Sinh ra số ngẫu nhiên(0 - 99) và lưu vào biến lottery
        lottery = Integer.toString(GetRandom());

        // Nếu số ngẫu nhiên nằm trong khoảng (0 - 9), ta thêm số 0 đằng trước, ví dụ "05"
        if (lottery.trim().length() == 1) {
            lottery = "0" + lottery;
        }

        // In ra kết quả xổ số
        System.out.printf("Lottery results are: %s \n", lottery);

        // Kiểm tra các số nhập vào và hiển thị kết quả xổ số
        if (lottery.equals(firstPrize)) {
            System.out.println("Congratulations, the prize is $ 10,000 !");
        } else if (lottery.equals(secondPrize)) {
            System.out.println("Congratulations, the prize is $ 3,000 !");
        } else if (lottery.contains(guessDigit1) || lottery.contains(guessDigit2)) {
            System.out.println("Congratulations, the prize is $ 1,000 !");
        } else {
            System.out.println("Wish you luck next time !");
        }

    }

    public static int GetRandom() {
        Random res = new Random();
        int low = 00;
        int high = 99;
        int result = res.nextInt(high - low) + low;
        return result;
    }
}
