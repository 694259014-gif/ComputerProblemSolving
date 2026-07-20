void main() {

    int num1 = Integer.parseInt(IO.readln("Enter first number: "));
    int num2 = Integer.parseInt(IO.readln("Enter second number: "));

    int result;

    if (num1 > num2) {
        result = num1 - num2;
    } else {
        result = num1 + num2;
    }

    IO.println("Result: " + result);
}