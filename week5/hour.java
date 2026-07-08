void main() {
    int hours, minutes, totalMinutes;

    IO.print("Enter hours: ");
    hours = Integer.parseInt(IO.readln());

    IO.print("Enter minutes: ");
    minutes = Integer.parseInt(IO.readln());

    totalMinutes = (hours * 60) + minutes;

    IO.println("Total minutes = " + totalMinutes + " minutes");
}