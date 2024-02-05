package ru.gb.oop.dz_task_2;

public class Robot extends Creator {
    public final int MAX_RUN_DISTANCE = 300;
    private final int MAX_JUMP_HEIGHT = 3;

    public Robot(String name) {
        super.name = name;
    }

    public int getMAX_RUN_DISTANCE() {
        return MAX_RUN_DISTANCE;
    }

    public int getMAX_JUMP_HEIGHT() {
        return MAX_JUMP_HEIGHT;
    }

    @Override
    void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(this.name + " пробежал " + distance + " м.");
        } else {
            System.out.println(this.name + " не пробежал" + distance + " м.");
        }
    }

    @Override
    void jump(int height) {
        if (height <= MAX_JUMP_HEIGHT) {
            System.out.println(this.name + " перепрыгнул препятствие " + height + " м.");
        } else {
            System.out.println(this.name + " не перепрыгнул препятствие " + height + " м.");
        }
    }
}
