public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    // Default constructor setting time to midnight
    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Constructor that takes hours, minutes, and seconds as input
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Increment function to increase time by a specified number of seconds
    public void increment(int secondsToAdd) {
        this.seconds += secondsToAdd;
        this.minutes += this.seconds / 60;
        this.seconds %= 60;
        this.hours += this.minutes / 60;
        this.minutes %= 60;
        this.hours %= 24;
    }

    // Print function to print time in 24-hour or 12-hour AM/PM format
    public void print(boolean military) {
        if (military) {
            System.out.printf("%02d:%02d:%02d\n", this.hours, this.minutes, this.seconds);
        } else {
            int displayHours = this.hours % 12;
            if (displayHours == 0) {
                displayHours = 12;
            }
            String period = (this.hours < 12) ? "AM" : "PM";
            System.out.printf("%d:%02d:%02d %s\n", displayHours, this.minutes, this.seconds, period);
        }
    }

    // Static function to create Time object from string in "HH:MM:SS" format
    public static Time fromString(String timeString) {
        String[] parts = timeString.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);
        return new Time(hours, minutes, seconds);
    }
}