void main() {

    double initialSaving, monthlySaving, months, interestPercent;

    double totalSaving, interest, finalSaving;

    IO.print("Enter initial saving: ");

    initialSaving = Double.parseDouble(IO.readln());

    IO.print("Enter monthly saving: ");

    monthlySaving = Double.parseDouble(IO.readln());

    IO.print("Enter number of months: ");

    months = Double.parseDouble(IO.readln());

    IO.print("Enter interest percent: ");

    interestPercent = Double.parseDouble(IO.readln());

    totalSaving = initialSaving + (monthlySaving * months);

    interest = totalSaving * interestPercent / 100;

    finalSaving = totalSaving + interest;

    IO.println("Total saving before interest = %.2f baht".formatted(totalSaving));

    IO.println("Interest = %.2f baht".formatted(interest));

    IO.println("Final saving = %.2f baht".formatted(finalSaving));

}