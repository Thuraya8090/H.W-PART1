import java.util.Arrays;

public class The1 {
//**************     داله تعكس عناصر المصفوفة     *******************


    public static int[] revers(int[] a)
    {
        int en = a.length-1;
        for (int i = 0; i <a.length/2 ; i++) {
            int the = a[i];
            a[i] = a[en-i];
            a[en-i] = the;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] i ={90,80,70,60,50,40};
        int [] j=i;
        System.out.println("befor"+ Arrays.toString(i));
        System.out.println( "after ="+Arrays.toString(revers(j)));
    }
}
