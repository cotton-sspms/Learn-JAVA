class Variable {
    public static void main(String[] args){

        /*Widening Casting
        int numInt = 10;
        double numDouble =numInt; //ไม่ต้องใส่ (Type) ให้ข้างหน้าตัวแปร มันแปลงได้อัตโนมัติ

        System.out.println(numInt);
        System.out.println(numDouble);
        */

        /*Narrowing Casting
        double numDouble = 10.0;
        int numInt = (int)numDouble;   //ต้องใส่ (Type) ให้ข้างหน้าตัวแปร เพื่อเป็นการบอกว่าจะเปลี่ยน
        System.out.println(numInt);
        */

        /* 
        String คือ ชนิดข้อมูลที่เก็บชุดข้อความ ที่เขียนใน Symbol = " "
        Char เก็บตัวอักษร ที่เขียนใน Symbol = ' '
        การนำ Char มาเรียงต่อกัน 2ตัวขึ้นไปเรียก String 
        */

        char a = 'A';
        System.out.println(a);

        String b = "abc";
        System.out.println(b);

    }
}
