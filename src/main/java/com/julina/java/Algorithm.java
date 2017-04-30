package com.julina.java;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by jmaharjan on 2/6/17.
 */
public class Algorithm {

    public static class Driver{
        private List<String> list = Arrays.asList("D1", "D2", "D3");
        private String driver;
        private int index = 0;

        public Driver(){
            this.driver = list.get(index);
        }

        public void next(){
            if(index == (list.size()-1)){
                index =0;
            }
            else index++;
            this.driver = list.get(index);
        }

    }

    public static class Officer{
        private List<String> list = Arrays.asList("A", "B", "C", "D");
        public enum Shift{
            FIRST,
            SECOND;
        }

        private String dayOfficer;
        private String nightOfficer;
        private Shift shift;

        public Officer(){
            this.dayOfficer = list.get(0);
            this.nightOfficer = list.get(1);
            this.shift = Shift.FIRST;
        }

        public void next(){
            if(this.shift == Shift.SECOND) {
                String newOfficer = getNextOfficer(this.nightOfficer);
                this.dayOfficer = this.nightOfficer;
                this.nightOfficer = newOfficer;
                this.shift = Shift.FIRST;
            }
            else {
                this.shift = Shift.SECOND;
            }
        }

        private String getNextOfficer(String nightOfficer){
            int indexOfNightOfficer = 0 ;
            for (int i = 0; i < list.size(); i++) {
                 if(list.get(i).equalsIgnoreCase(nightOfficer)) {
                     indexOfNightOfficer = i;
                     break;
                 }
            }
            if (indexOfNightOfficer == (list.size()-1)){
                indexOfNightOfficer = -1;
            }
            return list.get(++indexOfNightOfficer);
        }
    }

    public static Date addDays(Date date, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);
        return cal.getTime();
    }

    public static void main(String[] args) {
        Date currentDate = new Date();
        Driver driver = new Driver();
        Officer officer = new Officer();
        for (int i = 0; i < 10; i++) {
            System.out.println("Date: " +currentDate);
            System.out.println("Driver: " + driver.driver);
            System.out.println("Day Officer: " + officer.dayOfficer);
            System.out.println("Night Officer: " + officer.nightOfficer);
            System.out.println();
            driver.next();
            officer.next();
            currentDate = addDays(currentDate, 1);
        }

    }
}
