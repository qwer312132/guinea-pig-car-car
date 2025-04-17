package models;

import java.util.ArrayList;

public class RunRunGuineaPigCarCarRace {
    public ArrayList<GuineaPigCarCar> contestants;

    public RunRunGuineaPigCarCarRace(ArrayList<GuineaPigCarCar> contestants) {
        this.contestants = contestants;
    }

    // 跑道長度可能會改
    final static int RUNWAY_LENGTH = 4000;

    // on 1 sec passed
    private void onTime() {
        for (int i = 0; i < contestants.size(); i++) {
            contestants.get(i).move();
        }
    }

    private void on10Sec() {
        int first = 0, last = 0;
        int firstDist = -1, lastDist = RUNWAY_LENGTH;
        for (int i = 0; i < contestants.size(); i++) {
            GuineaPigCarCar current = contestants.get(i);
            if (current.getDistance() > firstDist) {
                firstDist = current.getDistance();
                first = i;
            }
            if (current.getDistance() < lastDist) {
                lastDist = current.getDistance();
                last = i;
            }
        }
        contestants.get(first).eat_lettuce();
        contestants.get(last).eat_carrot();
    }

    // 每秒進行一次時間前進 + 比賽邏輯
    public void run_race() {
        int t = 0;
        boolean racing = true;

        while (racing) {
            for (int i = 0; i < contestants.size(); i++) {
                GuineaPigCarCar current = contestants.get(i);
                int d = current.getDistance();
                if (d >= RUNWAY_LENGTH) {
                    racing = false;
                    break;
                }
            }

            t = incrementTime(t);

            // this.onTime(); <- 先加速再移動
            if (t % 10 == 0) {
                this.on10Sec();
            }
            this.onTime();
        }

        // 比賽結束，印出距離
        for (int i = 0; i < this.contestants.size(); i++) {
            GuineaPigCarCar current = contestants.get(i);
            System.out.println(this.contestants.get(i).getName() + ": " + Integer.toString(current.getDistance()));
        }

        // 判斷冠軍
        for (int i = 0; i < this.contestants.size(); i++) {
            GuineaPigCarCar current = contestants.get(i);
            if (current.getDistance() >= RUNWAY_LENGTH) {
                System.out.println("冠軍得主是:" + this.contestants.get(i).getName());
                break;
            } else {
                // do nothing ...
            }
        }
    }
    private int incrementTime(int time) {
        return time + 1;
    }
}


