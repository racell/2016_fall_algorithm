package clockandfloor;

/**
 * Created by SeongJung on 2016-10-12.
 */
public class ClockAngle {
    private double hourAngle;
    private double minuteAngle;
    private double angle;

    public ClockAngle() {
        this.hourAngle = 0;
        this.minuteAngle = 0;
        this.angle = 0;
    }

    public double calcAngle(int hour, int minute) {
        if (hour == 12) {
            hour = 0;
        }
        this.hourAngle = hour * 30 + minute * 0.5;
        this.minuteAngle = minute * 6;

        if (minuteAngle > hourAngle) {
            this.angle = minuteAngle - hourAngle;
        }
        else {
            this.angle = hourAngle - minuteAngle;
        }

        if (angle > 180) {
            return 360 - angle;
        }
        else {
            return angle;
        }
    }
}
