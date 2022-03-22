import java.util.Arrays;
import java.util.Random;

public class The3 {
    //**************     داله تقوم با   Random   *******************

    public static int[] rendom(int[] x)
    {
        Random t = new Random();
        int index = t.nextInt(x.length-1);
        System.out.println(index);
        for (int i = 0; i < x.length; i++) {
            if (index <= i )
            {
                x[i] = -1;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int[] a = {20,30,40,50,60};
        System.out.println( Arrays.toString(rendom(a)));
    }

}
