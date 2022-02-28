package io.timly;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Intersections {

    private static final HashMap<String, Double> timezones = new HashMap<>();

    private final List<Range> intervals;

    private Range intersection = null;

    public Intersections(List<Time> intervals) throws Exception{
        if (intervals == null) throw new IllegalArgumentException("Argument can not be null");
        
        this.intervals = convertToRange(intervals);
        populateTimzeZones();
    }

    private List<Range> convertToRange(List<Time> list) {
        List<Range> rangeList = new ArrayList<>(list.size());
        for(Time time : list) {
            rangeList.add(new Range(time.getStartTime(), time.getEndTime(), time.getTimezone()));
        }

        return rangeList;
    }

    private void populateTimzeZones() {
        timezones.put("EEST", 3.0);
        timezones.put("IST", 5.5);
        timezones.put("GMT", 0.0);
        timezones.put("WAT", 1.0);
    }

    public boolean findIntersection() {
        if (this.intervals.size() == 0) return false;

        long l = this.intervals.get(0).start;
        long r = this.intervals.get(0).end;

        for (int i = 1; i < this.intervals.size(); i++) {

            // no intersection exists
            if (this.intervals.get(i).start > r || this.intervals.get(i).end < l) {
                return false;
            }

            // update the intersection
            else {
                l = Math.max(l, this.intervals.get(i).start);
                r = Math.min(r, this.intervals.get(i).end);
            }
        }
        this.intersection =  new Range(toTime(l), toTime(r), "GMT");

        return true;
    }

    private String toTime(long time) {
        long hrs = time % 60;
        long min = time / 60;

        String hrStr = String.valueOf(hrs);
        if (hrStr.length() < 2)
            hrStr = "0" + hrStr;

        String minStr = String.valueOf(min);
        if (minStr.length() < 2) 
            minStr = "0" + minStr;

        return new StringBuilder().append(hrStr).append(":").append(minStr).toString();
    }

    private long toLong(String time, String zone) {
        String[] tokens = time.split(":");
        String hrs = tokens[0].trim();
        String mins = tokens[1].trim();

        return Integer.valueOf(hrs) * 60 +  Integer.valueOf(mins) + (long)(timezones.getOrDefault(zone, 0.0) * 60); // returns zero as the timezone offset if it can not find it
    }


    public String getTime() {
        if (this.intersection == null) return null;

        return this.intersection.toString();
    }

    


    private class Range {

        private final long start;
        private final long end;

        public Range(String start, String stop, String zone) {
            this.start = toLong(start, zone);
            this.end = toLong(stop, zone);
        }
        

        @Override
        public String toString() {
            return (new StringBuilder()).append(toTime(start)).append(" - ").append(toTime(end)).toString();
        }
    }
    
}
