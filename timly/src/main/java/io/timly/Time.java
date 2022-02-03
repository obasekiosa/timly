package io.timly;

public class Time {
    private String startTime;
    private String endTime;
    private String timezone;

    public Time(String startTime, String endTime, String timezone) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.timezone = timezone;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getTimezone() {
        return timezone;
    }
}
