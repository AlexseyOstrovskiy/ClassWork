package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
public class TrackManager {

    private List<Rider> riders;

    public TrackManager(List<Rider> riders) {
        this.riders = riders;
    }

    public void run() {
//        Rider test =  riders.get(1);
//        System.out.println(test.getHorse());
        int circleCounter = 0;
        Rider crew1 = riders.get(0);
        Rider crew2 = riders.get(1);
        Rider crew3 = riders.get(2);
        //while (circleCounter != 5) {
            String step = "_1";
            String twoStep = "_ _1";
            System.out.println("Start!");
           // int winNum = (int) (Math.random() * 3) + 1;
            int winNum = 3;
            circleCounter= circleCounter + 1;
            if (winNum == 1) {
                System.out.println(crew1.getName() + crew1.getAge() + crew1.getHorse());
                for (int i = 0; i < circleCounter; i++ ) {
                    System.out.print(twoStep);
                }
                System.out.println(crew2.getName() + crew2.getAge() + crew2.getHorse());
                for (int i = 0; i < circleCounter; ) {
                    System.out.print(step);
                }
                System.out.println(crew3.getName() + crew3.getAge() + crew3.getHorse());
                for (int i = 0; i < circleCounter; ) {
                    System.out.print(step);
                }
            }
            else if (winNum == 2) {
                System.out.println(crew1.getName() + crew1.getAge() + crew1.getHorse());
                for (int i = 0; i < circleCounter; ) {
                    System.out.print(step);
                }
                System.out.println(crew2.getName() + crew2.getAge() + crew2.getHorse());
                for (int i = 0; i < circleCounter; ) {
                    System.out.print(twoStep);
                }
                System.out.println(crew3.getName() + crew3.getAge() + crew3.getHorse());
                for (int i = 0; i < circleCounter; ) {
                    System.out.print(step);
                }
            } else {
                System.out.println(crew1.getName() + crew1.getAge() + crew1.getHorse());
                for (int i = 0; i < circleCounter; ) {
                    System.out.print(step);
                }
                System.out.println(crew2.getName() + crew2.getAge() + crew2.getHorse());
                for (int i = 0; i < circleCounter; ) {
                    System.out.print(step);
                }
                System.out.println(crew3.getName() + crew3.getAge() + crew3.getHorse());
                for (int i = 0; i < circleCounter; ) {
                    System.out.print(twoStep);
                }

            }

        }
   // }
}
