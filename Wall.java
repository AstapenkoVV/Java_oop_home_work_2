package ru.gb.oop.dz_task_2;

public class Wall extends Obstacles {
    protected Integer height;

    public Wall(Integer height) {
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }
}
