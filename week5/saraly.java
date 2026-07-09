void main() {
    double salary, deductionPercent;
    double deduction, netSalary;

    // 1. ส่วนรับข้อมูล (Input) ตามสไตล์อาจารย์
    IO.print("Enter salary: ");
    salary = Double.parseDouble(IO.readln());

    IO.print("Enter deduction percent: ");
    deductionPercent = Double.parseDouble(IO.readln());

    // 2. ส่วนการประมวลผลคำนวณ (Process)
    deduction = salary * deductionPercent / 100;
    netSalary = salary - deduction;

    // 3. ส่วนการแสดงผลลัพธ์ (Output) แปลง cast เป็น (int) หรือแสดงทศนิยมตรงตามโจทย์
    IO.println("Deduction = %.1f baht".formatted(deduction));
    IO.println("Net salary = %.1f baht".formatted(netSalary));
}