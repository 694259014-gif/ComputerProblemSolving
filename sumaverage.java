void main() {
       IO.print("Enter num1: ");
       int num1 = Integer.parseInt(IO.readln());

       IO.print("Enter num2: ");
       int num2 = Integer.parseInt(IO.readln());

       IO.print("Enter num3: ");
       int num3 = Integer.parseInt(IO.readln());

       IO.print("Enter num4: ");
       int num4 = Integer.parseInt(IO.readln());

       IO.print("Enter num5: ");
       int num5 = Integer.parseInt(IO.readln());

       int sum = num1 + num2 + num3 + num4 + num5;
       
       double average = sum / 5.0;

       IO.println("Sum = " + sum);
       IO.println("Average = " + average);
}