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
        private List<String> list = Arrays.asList("D1", "D2");
        private String driver;

        public Driver(){
            this.driver = list.get(0);
        }

        public void next(){
            this.driver = this.driver.equalsIgnoreCase(list.get(0))? list.get(1) : list.get(0);
        }

    }

    public static class Officer{
        private List<String> list = Arrays.asList("A", "B", "C");
        public enum Shift{
            FIRST,
            SECOND;

            @Override
            public String toString() {
                return super.toString();
            }
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
                String newOfficer = getThird(this.dayOfficer, this.nightOfficer);
                this.dayOfficer = this.nightOfficer;
                this.nightOfficer = newOfficer;
                this.shift = Shift.FIRST;
            }
            else {
                this.shift = Shift.SECOND;
            }
        }

        private String getThird(String dayOfficer, String nightOfficer){
            for (String s : list) {
                if(!s.equalsIgnoreCase(dayOfficer) && !s.equalsIgnoreCase(nightOfficer))
                    return s;
            }
            return null;
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
