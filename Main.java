package ru.gb.oop.dz_task_2;

/**
 * 1) Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса,
 * но есть общий класс родитель. Эти классы должны уметь бегать и прыгать, все также с выводом
 * информации о действии в консоль.
 * 2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
 * должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
 * печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
 * (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
 * 3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
 * этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
 * списку препятствий он не идет.
 */

public class Main {
    public static void main(String[] args) {

        Creator[] creators = {new Human("Иван"), new Cat("Варсик"), new Robot("Robot")};
        Obstacles[] obstacles = {
                new RunningTrack(30),
                new Wall(1),
                new RunningTrack(90),
                new Wall(2),
                new RunningTrack(190)
        };
        for (Creator creator : creators) {
            System.out.println(creator);
            for (int i = 0; i < obstacles.length; i++) {
                if (obstacles[i] instanceof RunningTrack &&
                        (((RunningTrack) obstacles[i]).distance) <= creator.getMAX_RUN_DISTANCE()) {
                    creator.run(((RunningTrack) obstacles[i]).distance);
                } else if (obstacles[i] instanceof Wall &&
                (((Wall) obstacles[i]).height) <= creator.getMAX_JUMP_HEIGHT()) {
                    creator.jump(((Wall) obstacles[i]).height);
                }
            }
        }
    }
}