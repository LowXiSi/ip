package loafy.task;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Deadline extends Task {
    private final LocalDateTime date;

    public Deadline(String name, LocalDateTime date) {
        super(name);
        this.date = date;
    }

    public Deadline(boolean isDone, String name, LocalDateTime date) {
        super(isDone, name);
        this.date = date;
    }

    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy HHmm");
        return String.format(
                "[D]%s (by: %s)",
                super.toString(), this.date.format(formatter));
    }

    public String convertToTxt() {
        return String.format("%s,%s,%s","D", super.convertToTxt(), this.date);
    }
}
