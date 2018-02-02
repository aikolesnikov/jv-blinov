package introduction;

import java.time.LocalDateTime;
import java.time.Month;

public class Intro_1_6 {


    // 1. 6. Вывести фамилию разработчика, дату и время получения задания,
    // а также дату и время сдачи задания

    // DateStart = 02.02.2018 17:41
    // DateFinish = currentTime

    public static void main(String[] args) {
        System.out.println("Task has been received on " + LocalDateTime.of(2018, Month.FEBRUARY, 2, 17, 41));
        System.out.println("Task has been completed on " + LocalDateTime.now());
    }
}
