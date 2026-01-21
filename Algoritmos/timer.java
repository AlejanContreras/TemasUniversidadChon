package Algoritmos;

import java.util.Timer;
import java.util.TimerTask;

public class timer {
    public static void main(String[] args) {
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
        public void run() {
            try {
                System.out.println("3 Seg para ejecutar");
                Thread.sleep(5000);
                System.out.println("Ejecutado tras pausa de 5 seg");
            } catch (InterruptedException e) {
            }
        }
        }, 3000);

    }
}
