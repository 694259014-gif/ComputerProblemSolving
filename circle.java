void main() {
       IO.print("Enter radius: ");
       double radius = Double.parseDouble(IO.readln());

       double area = 3.14159 * radius * radius;

       IO.println("Area of circle that has radius = " + radius + " meters is " + area + " square meters.");
}