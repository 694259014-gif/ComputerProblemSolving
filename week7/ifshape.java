void main() {
    int choice = Integer.parseInt(IO.readln("Enter a number: "));

    if (choice == 1) {
        double base = Double.parseDouble(IO.readln("Enter the base of the triangle: "));
        double height = Double.parseDouble(IO.readln("Enter the height of the triangle: "));

        double area = 0.5 * base * height;

        IO.println("Area of the triangle: " + area + " square units");

    } else if (choice == 2) {
        double weight = Double.parseDouble(IO.readln("Enter your weight in kilograms: "));
        double height = Double.parseDouble(IO.readln("Enter your height in meters: "));

        double bmi = weight / (height * height);

        IO.println("Your BMI for weight = " + weight + " kg and height = " + height + " meters is: " + bmi + " bmi.");
    }
}