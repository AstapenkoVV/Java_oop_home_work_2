package ru.gb.oop.dz_task_2;

public class RunningTrack extends Obstacles {
    protected Integer distance;

    public RunningTrack(Integer distance) {
        this.distance = distance;
    }

    public Integer getDistance() {
        return distance;
    }
}
