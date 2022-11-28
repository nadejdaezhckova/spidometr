import java.util.Random;
public class Car extends Thread {
    public void go (int km ) throws InterruptedException {
        int sr;
        Random ran = new Random();
        int p = 0;
        int t = 0;
        int sec;
        float speed = 1;
        float r;

        for (float i = km * 1000; i > 0; i -= r) {
            speed += ran.nextInt(8);

            while (speed > 120) {
                speed -= 1;
            }
            p += speed;
            sr = p / t;
            t ++;

            r = (float) (speed * 0.28);
            sec = (int) (i / (speed * 0.28));

            System.out.println("Скорость (км/ч): Средняя скорость (км/ч): Оставшийся путь (км): Оставшееся время (сек):" + " Время пути (сек):");
            System.out.println(" " + speed + " " + sr + " " + i / 1000 +  " " + sec + " " + t);
            System.out.println();

            Thread.sleep(1000);

        }
    }

}