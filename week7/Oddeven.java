void main() {
    int number = Integer.parseInt(IO.readln("Enter a number: "));

    if (number % 2 == 0) {
        IO.println("The number " + number + " is Even.");
    } else {
        IO.println("The number " + number + " is Odd");
    }
}