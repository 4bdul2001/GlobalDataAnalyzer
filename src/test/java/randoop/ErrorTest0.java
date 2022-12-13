package randoop;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        WbApi.Response response0 = new WbApi.Response();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = response0.getSize();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        WbApi.Response response0 = new WbApi.Response();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Double double2 = response0.getValue((-1));
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        WbApi.Response response0 = new WbApi.Response();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Double double2 = response0.getValue((int) (short) 0);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        WbApi.Response response0 = new WbApi.Response();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Double double2 = response0.getValue((int) (byte) -1);
    }
}

