void main() {
    String gender = IO.readln("Enter gender (M/F): ");
    double weight = Double.parseDouble(IO.readln("Enter weight (kg): "));
    double height = Double.parseDouble(IO.readln("Enter height (cm): "));

    double age = Double.parseDouble(IO.readln("Enter age (years): "));

    double bmr = 0;

    if (gender.equalsIgnoreCase("M")) {
        bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
    } else if (gender.equalsIgnoreCase("F")) {
        bmr = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
    } else {
        IO.println("Invalid gender input!");
        return;
    }

    IO.println("BMR: " + bmr);
}