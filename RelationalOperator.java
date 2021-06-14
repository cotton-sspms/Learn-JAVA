public class RelationalOperator {
    public static void main(String[] args){
        //การเปรียบเทียบซ้าย ขวา ให้ค่าเป็น boolean

        int x = 5, y = 2; 

        System.out.println(x + " < " + y + " is " + (x<y));  // x น้อยกว่า y
        System.out.println(x + " <= " + y + " is " + (x<=y)); // x น้อยกว่าเท่ากับ y 
        System.out.println(x + " > " + y + " is " + (x>y)); // x มากกว่า y 
        System.out.println(x + " >= " + y + " is " + (x>=y)); // x มากกว่าเท่ากับ y
        System.out.println(x + " != " + y + " is " + (x!=y)); // x ไม่เท่ากับ y
        System.out.println(x + " = " + y + " is " + (x==y)); // x เท่ากับ y
    }
}
