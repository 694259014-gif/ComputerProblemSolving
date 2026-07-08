void main() {
    double score1, score2, score3, bonus;
    double total, totalWithBonus, average;

    IO.print("Enter score 1: ");
    score1 = Double.parseDouble(IO.readln());

    IO.print("Enter score 2: ");
    score2 = Double.parseDouble(IO.readln());

    IO.print("Enter score 3: ");
    score3 = Double.parseDouble(IO.readln());

    IO.print("Enter bonus score: ");
    bonus = Double.parseDouble(IO.readln());

    total = score1 + score2 + score3;
    totalWithBonus = total + bonus;
    average = totalWithBonus / 3;

    IO.println("Total score = " + (int) total + " points");
    IO.println("Total with bonus = " + (int) totalWithBonus + " points");
    IO.println("Average of totalWithBonus(" + (int) totalWithBonus + ") = %.2f points".formatted(average));
}