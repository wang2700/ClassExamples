package Class1;

import java.util.Arrays;

public class FirstDemo {
    public static void main(String[] args) {
        int integer = 12;
        System.out.println(integer);
        String str = "Hello";
        System.out.println(str);
        str = str + " World";
        System.out.println(str);

        String s1;
        s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        int[] arr1 = new int[10];
        Arrays.fill(arr1, 10);
        int[] arr2 = new int[] {1, 2, 3, 4, 5};

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2.length);

        int[][] mat = new int[5][5];
        mat[1][2] = 5;
        System.out.println(mat[1][2]);
        System.out.println(Arrays.toString(mat));
    }
}
