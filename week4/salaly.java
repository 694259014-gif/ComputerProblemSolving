void main() {

    // 1. (รับข้อมูลเงินเดือน)
    IO.print("Enter Salary: ");
    double salary = Double.parseDouble(IO.readln());

    // 2. (คำนวณภาษี 10%)
    double tax = salary * 0.10;

    // 3. (แสดงผลลัพธ์ภาษีที่ต้องจ่าย)
    IO.println("Tax = " + tax);

}