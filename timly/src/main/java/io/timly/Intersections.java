package io.timly;

import java.util.List;

public class Intersections {

    private final List<Range> intervals;

    private Range intersection = null;
    

    public Intersections(List<Time> intervals) throws Exception{
        if (intervals == null) throw new IllegalArgumentException("Argument can not be null");
        this.intervals = convertToRange(intervals);
    }

    private List<Range> convertToRange(List<Time> list) {
        throw new UnsupportedOperationException();
    }

    public boolean findIntersection() {
        if (this.intervals.size() == 0) return false;

        long l = this.intervals.get(0).start;
        long r = this.intervals.get(0).end;

        for (int i = 1; i < this.intervals.size(); i++) {

            // no intersection exists
            if (this.intervals.get(
                    i).start > r ||
                    this.intervals.get(i).end < l) {
                return false;
            }

            // update the intersection
            else {
                l = Math.max(l, this.intervals.get(i).start);
                r = Math.min(r, this.intervals.get(i).end);
            }
        }
        this.intersection =  new Range(toTime(l), toTime(r));

        return true;
    }

    private String toTime(long time) {
        throw new UnsupportedOperationException();
    }

    private long toLong(String time) {
        throw new UnsupportedOperationException();
    }


    public String getTime() {
        if (this.intersection == null) return null;

        return this.intersection.toString();
    }

    


    private class Range {

        private final long start;
        private final long end;

        public Range(String start, String stop) {
            this.start = toLong(start);
            this.end = toLong(stop);
        }
        

        @Override
        public String toString() {
            return (new StringBuilder()).append(toTime(start)).append(" - ").append(toTime(end)).toString();
        }
    }
    
}
