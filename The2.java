import java.util.Arrays;

public class The2 {
//**************     داله تنسخ المصفوفة     *******************

    public static int[] copy() {
        int[] original = {1,2,3,4,5};
        int[] TheCopy ;
        TheCopy = original;
        return TheCopy;
    }

    public static void main(String[] args) {
        System.out.println( "This is The CopyArray ="+ Arrays.toString(copy()));
    }
}
