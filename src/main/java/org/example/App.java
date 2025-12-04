package org.example;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {

    private Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== motivation 실행 ==");


//        String[][] boardArr = new String[3][];
// List 사용 ArrayList


        int lastId = 0;
        List<Motivation> motivations = new ArrayList<>();

        while (true) {
            System.out.print("명령어 ) ");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("exit")) {
                System.out.println("== motivation 종료 ==");
                break;
            } else if (cmd.length() == 0) {
                System.out.println("명령어가 입력되지 않았음");
                continue;
            }

            if (cmd.equals("add")) {
                System.out.print("motivation : ");
                String motivation = sc.nextLine();
                System.out.print("source : ");

                // 객체 조립

                // 객체 저장
                //if(){}
                // for each문

                String source = sc.nextLine();
                System.out.printf("%d번 motivation이 등록되었습니다\n", lastId);
                lastId++;
                count++;

            } else if (cmd.equals("list")) {
                System.out.println("=".repeat(40));
                System.out.printf("   번호   /    source    /    motivation   \n");

                for (int i = 0; i < count; i++) {
                    System.out.println(boardArr[i][0] + " " + boardArr[i][1] + " " + boardArr[i][2]);
                }
            }


        }

    }
// 객체 생성 Motivation
}

