package ru.gb.oop.dz_task_2;

public class Human extends Creator {
    private final int MAX_RUN_DISTANCE = 200;
    private final int MAX_JUMP_HEIGHT = 2;

    public Human(String name) {
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
