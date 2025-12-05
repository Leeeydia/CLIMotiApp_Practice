package org.example.motivation.controller;

import org.example.motivation.entity.Motivation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotivationController {

    int lastId = 0; // 몇 번까지 썼더라?
    List<Motivation> motivations = new ArrayList<>(); // motivation 저장소

    private Scanner sc;

    public MotivationController(Scanner sc) {
        this.sc = sc;
    }

    public void add() {
        int id = lastId + 1;
        System.out.print("body : ");
        String body = sc.nextLine();
        System.out.print("source : ");
        String source = sc.nextLine();

        Motivation motivation = new Motivation(id, body, source);

        motivations.add(motivation);

        System.out.printf("%d번 motivation이 등록되었습니다\n", id);
        lastId++;
    }

    public void list() {
        System.out.println("=".repeat(40));
        System.out.printf("   번호   /    source      /    body   \n");

        if (motivations.size() == 0) {
            System.out.println("등록된거 없음 xxxxx");
            return;
        }
        for (int i = motivations.size() - 1; i >= 0; i--) {
            Motivation motivation = motivations.get(i);

            if (motivation.getSource().length() > 7) {
                System.out.printf("   %d     /    %s   /    %s   \n", motivation.getId(), motivation.getSource().substring(0, 7) + "...", motivation.getBody());
                continue;
            }
            System.out.printf("   %d     /    %s     /    %s   \n", motivation.getId(), motivation.getSource(), motivation.getBody());
        }
        System.out.println("=".repeat(40));
    }

    public void delete() {
        int id = lastId = 1;
        if (motivations.size() == 1) {
            System.out.println("삭제할거 없음 xxxxx");
        }

        if (motivations.get(motivations.size() - 1).getId() == id) {
            motivations.remove(motivations.size() - 1);
        }

        motivations.remove(motivations.size() - 1);


        System.out.printf("%d번 motivation이 삭제되었습니다\n", id);
        lastId++;

    }

    public void update() {
        int id = lastId = 1;
        if (motivations.size() == 1) {
            System.out.println("수정할 거 없음");
        }
        for (Motivation m : motivations) {
            if (m.getId() == id) {
                System.out.print("body :"); m.setBody(sc.nextLine());
                System.out.print("source :"); m.setSource(sc.nextLine());

                System.out.printf("%d번 motivation이 수정되었습니다\n", id);
            }
        }

    }
}