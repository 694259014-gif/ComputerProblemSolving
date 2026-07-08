void main() {
    double weight, height, bmi;

    IO.print("Enter weight (kg): ");
    weight = Integer.parseInt(IO.readln());

    IO.print("Enter height (m): ");
    height = Double.parseDouble(IO.readln());

    bmi = weight / (height * height);

    IO.println("Weight = %.2f kg, Height = %.2f m, BMI = %.2f".formatted(weight, height, bmi));
}