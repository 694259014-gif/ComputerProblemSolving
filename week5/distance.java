void main() {
    double distance, efficiency, price;
    double fuelUsed, totalCost;

    IO.print("Enter distance (km): ");
    distance = Double.parseDouble(IO.readln());

    IO.print("Enter fuel efficiency (km/liter): ");
    efficiency = Double.parseDouble(IO.readln());

    IO.print("Enter fuel price per liter: ");
    price = Double.parseDouble(IO.readln());

    fuelUsed = distance / efficiency;
    totalCost = fuelUsed * price;

    IO.println("Fuel used = " + fuelUsed + " liters");
    IO.println("Total cost = " + totalCost + " baht");
}