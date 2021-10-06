package Class1;

public class SwtichStatement {

    static String whatStuff (int yearInCollege) {
        String stuff = "You will be given";
        switch (yearInCollege) {
            case 1:
                stuff = stuff + "new gloves";
            case 2:
                stuff = stuff + "new coat";
                break;
            case 3: case 4:
                stuff = stuff + "new backpack";
                break;
            default:
                stuff = stuff + "nothing";
                break;
        }
        return stuff;
    }

    public static void main(String[] args) {
        System.out.println(whatStuff(1));
        System.out.println(whatStuff(2));
        System.out.println(whatStuff(3));
        System.out.println(whatStuff(4));
    }


}
