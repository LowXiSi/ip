public class Deadline extends Task {
    private String date;

    Deadline(String name, String date) {
        super(name);
        this.date = date;
    }
    public String toString() {
        return "[D]" + super.toString() + "(by: " + this.date + ")";
    }
}
