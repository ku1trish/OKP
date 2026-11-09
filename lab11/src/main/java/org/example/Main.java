package org.example;

public class Main {
    static void main() {
        Game gm = new Game("СТопЗемЛя", 10);
        System.out.println(gm);
        gm.play();
        gm.play(5);
        gm.play("Выживание");
        BoardGame bg = new BoardGame("Агент007(корова которая)", 5, 67);
        System.out.println(bg);
        bg.play(67, "RPG");
        VideoGame vg = new VideoGame("5 ночей в Кбипе", 18, "хоррор, бодихоррор, психологический триллер, трукрайм");
        System.out.println(vg);
        vg.play("VR");

    }
}

