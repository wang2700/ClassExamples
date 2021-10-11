package Class2;

public class ThrowException {

//    public static void main(String[] args) throws CustomException {
//        throwException();
//    }

    public static void main(String[] args) {
        try {
            throwException();
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    public static void throwException() throws CustomException {
        throw new CustomException("Custom Exception!!!");
    }
}
