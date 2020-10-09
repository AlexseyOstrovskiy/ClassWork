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
        int circleCounter = 0;
        Rider crew1 = riders.get(0);
        Rider crew2 = riders.get(1);
        Rider crew3 = riders.get(2);
        System.out.println("Start!");
        int counter1=1;
        int counter2=1;
        int counter3=1;
        while (circleCounter != 5) {
            String step = "*";
            String twoStep = "*";
            int winNum = (int) (Math.random() * 3) + 1;
            circleCounter= circleCounter + 1;

            if (winNum == 1) {
                System.out.println("");
                System.out.println("ROUND # " + circleCounter);
                System.out.println(crew1.getName() + crew1.getAge() + crew1.getHorse());
                counter1=counter1+1;
               // System.out.println("test win num 1/1 --"+winNum+" counter1 " +counter1 + "counter2 "+counter2+"counter3 "+counter3);
                for (int i = 0; i < counter1; i++) {
                    System.out.print(twoStep);
                }
                System.out.println("");
                System.out.println(crew2.getName() + crew2.getAge() + crew2.getHorse());
                for (int i = 0; i < counter2; i++) {
                    System.out.print(step);
                }
                System.out.println("");
                System.out.println(crew3.getName() + crew3.getAge() + crew3.getHorse());
                for (int i = 0; i < counter3; i++) {
                    System.out.print(step);
                }
            }
             if (winNum == 2) {
                System.out.println("");
                System.out.println("ROUND # " + circleCounter);
                System.out.println(crew1.getName() + crew1.getAge() + crew1.getHorse());
                for (int i = 0; i < counter1; i++) {
                    System.out.print(step);
                }
                System.out.println("");
                System.out.println(crew2.getName() + crew2.getAge() + crew2.getHorse());
                counter2=counter2+1;
                // System.out.println("test win num 2/2--"+winNum+" counter1 " +counter1 + "counter2 "+counter2+"counter3 "+counter3);
                for (int i = 0; i < counter2; i++) {
                    System.out.print(twoStep);
                }
                System.out.println("");
                System.out.println(crew3.getName() + crew3.getAge() + crew3.getHorse());
                for (int i = 0; i < counter3; i++) {
                    System.out.print(step);
                }
            }
             if(winNum == 3) {
                System.out.println("");
                System.out.println("ROUND # " + circleCounter);
                System.out.println(crew1.getName() + crew1.getAge() + crew1.getHorse());

                for (int i = 0; i < counter1; i++) {
                    System.out.print(step);
                }
                System.out.println("");
                System.out.println(crew2.getName() + crew2.getAge() + crew2.getHorse());
                    for (int i = 0; i < counter2; i++) {
                        System.out.print(step);
                    }
                System.out.println("");
                System.out.println(crew3.getName() + crew3.getAge() + crew3.getHorse());
                counter3=counter3+1;
                // System.out.println("test win num 3/3--"+winNum+" counter1 " +counter1 + "counter2 "+counter2+"counter3 "+counter3);
                        for (int i = 0; i < counter3; i++) {
                            System.out.print(twoStep);
                        }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("FINISH!!!");
        String winner;
        if(counter1>counter2 & counter1>counter3){
             winner = (crew1.getName()+" "+ crew1.getAge()+" "+crew1.getHorse());
        }
        else if(counter2>counter3){
             winner = (crew2.getName()+" "+crew2.getAge()+" "+crew2.getHorse());
        }
        else {
            winner = (crew3.getName()+" "+crew3.getAge()+" "+crew3.getHorse());
        }
        System.out.println("Winner: "+winner );
    }
}
