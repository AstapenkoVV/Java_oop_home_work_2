package ru.gb.oop.dz_task_2;

public abstract class Creator {
    protected String name;
    private int MAX_RUN_DISTANCE;
    private int MAX_JUMP_HEIGHT;

    public Creator(String name, int MAX_RUN_DISTANCE, int MAX_JUMP_HEIGHT) {
        this.name = name;
        this.MAX_RUN_DISTANCE = MAX_RUN_DISTANCE;
        this.MAX_JUMP_HEIGHT = MAX_JUMP_HEIGHT;
    }

    public Creator() {
    }


    abstract void run(int distance);

    abstract void jump(int height);

    public String getName() {
        return name;
    }

    public int getMAX_RUN_DISTANCE() {
        return MAX_RUN_DISTANCE;
    }

    public int getMAX_JUMP_HEIGHT() {
        return MAX_JUMP_HEIGHT;
    }

    @Override
    public String toString() {
        return "\nУчастник забега: " + name + "\n";
    }
}
