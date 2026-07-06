void main() {

    // 1.(รับข้อมูลน้ำหนักและความสูง)
    IO.print("Enter weight (kg): ");
    double weight = Double.parseDouble(IO.readln());

    IO.print("Enter height (m): ");
    double height = Double.parseDouble(IO.readln());

    // 2.(คำนวณค่า BMI)
    double bmi = weight / (height * height);

    // 3.(แสดงผลลัพธ์จัดรูปแบบตามโจทย์)
    IO.println("Weight = %.2f kg, Height = %.2f m, BMI = %.2f".formatted(weight, height, bmi));
}