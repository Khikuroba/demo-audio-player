package dev.gopro.se.android.mp3clone;

public class TimeHandler {
    public static String miliSecondsToTimer(long ms) {
        String timeString = "";

        int minutes = (int) (ms / 60000);
        int seconds = (int) ((ms % 60000) / 1000);

        timeString += minutes + ":" + (seconds < 10 ? "0" + seconds : "" + seconds);

        return timeString;
    }
}
