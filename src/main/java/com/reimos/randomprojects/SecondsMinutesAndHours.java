package com.reimos.randomprojects;

public class SecondsMinutesAndHours {

    public static final int ONE_HOUR_IN_MINUTES = 60;
    public static final int ONE_MINUTE_IN_SECONDS = 60;

    public static void main(String[] args) {

        System.out.println(getDurationString(-5000));
        System.out.println(getDurationString(-150, 59));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid data for seconds (" + seconds
                    + "), must be a positive integer number";
        }

        int minutes = seconds / ONE_MINUTE_IN_SECONDS;

        return getDurationString(seconds / ONE_MINUTE_IN_SECONDS,
                seconds % ONE_MINUTE_IN_SECONDS);
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "Invalid data for minutes (" + minutes
                    + "), must be a positive integer value";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid data for seconds (" + seconds + "), must be between 0 and 59";
        }

        int hours = minutes / ONE_HOUR_IN_MINUTES;
        int remainingMinutes = minutes % ONE_HOUR_IN_MINUTES;

        return String.format("%02dh %02dm %02ds",
                hours,
                remainingMinutes,
                seconds);
    }
}
