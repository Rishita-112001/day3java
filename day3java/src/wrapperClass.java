import java.util.ArrayList;

public class wrapperClass {
    public static void main(String[] args){
        int x = 5;
        float f = 2.9F;
        long l = 1000L;
        ArrayList<Integer> AR = new ArrayList();

        System.out.println(x);

        Integer iobj = x;
        Float fobj = (float) x;
        Long lobj = (long)x;
        System.out.println(iobj.byteValue());
        System.out.println(fobj);
        System.out.println(lobj);
    }
}
