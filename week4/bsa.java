void main() {

    IO.print("Enter width: ");
    double width = Double.parseDouble(IO.readln());

    IO.print("Enter length: ");
    double length = Double.parseDouble(IO.readln());

    double bsa = (width * length) / 360;

    IO.println("Body Surface Area = " + bsa);

}