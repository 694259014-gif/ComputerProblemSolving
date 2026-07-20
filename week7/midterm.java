void main() {
    int midterm = Integer.parseInt(IO.readln("Enter your midterm score: "));
    int finalScore = Integer.parseInt(IO.readln("Enter your final score: "));

    int total = midterm + finalScore;

    if (total >= 50) {
        IO.println("Your total score is " + total + " . The result is Pass!!");
    } else {
        IO.println("Your total score is " + total + " . The result is Fail!!");
    }
}