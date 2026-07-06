void main() {

    // 1. (รับข้อมูลอุณหภูมิฟาเรนไฮต์)
    IO.print("Enter Fahrenheit: ");
    double fahrenheit = Double.parseDouble(IO.readln());

    // 2. (คำนวณแปลงค่าเป็นองศาเซลเซียส)
    double celsius = (5.0 / 9.0) * (fahrenheit - 32);

    // 3. (แสดงผลลัพธ์)
    IO.println("Celsius = " + celsius);

}