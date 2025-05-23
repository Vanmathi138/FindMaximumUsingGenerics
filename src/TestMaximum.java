public class TestMaximum {
    public static void main(String[] args) {
        System.out.println("*************Test cases for INTEGER************");
        //Text case 1
        Integer a = 100, b = 20, c = 30;
        Integer result1 = FindMax.findMaximum(a, b, c);
        System.out.println("Max number at 1st position");
        System.out.println("Expected: " + a);
        System.out.println("Actual result: " + result1);

        if (a.equals(result1)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        System.out.println("=============================");

        //Test case 2
        Integer d = 20, e = 228, f = 1;
        Integer result2 = FindMax.findMaximum(d, e, f);
        System.out.println("Max number at 2nd position");
        System.out.println("Expected: " + e);
        System.out.println("Actual result: " + result2);

        if (e.equals(result2)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        System.out.println("=============================");

        //Test case 3
        Integer g = 122, h = 8, i = 989;
        Integer result3 = FindMax.findMaximum(g, h, i);
        System.out.println("Max number at 3rd position");
        System.out.println("Expected: " + i);
        System.out.println("Actual result: " + result3);

        if (i.equals(result3)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        System.out.println("=============================");

        System.out.println();
        System.out.println("*************Test cases for DOUBLE************");
        Double a1 = 43.5, a2 = 4.33, a3 = 2.34;
        Double r1 = FindMax.findMaximum(a1, a2, a3);
        System.out.println("Max double at 1st position");
        System.out.println("Expected: "+a1);
        System.out.println("Actual result: "+r1);

        if(a1.equals(r1)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test Failed");
        }
        System.out.println("=============================");

        Double b1 = 43.5, b2 = 894.33, b3 = 2.34;
        Double r2 = FindMax.findMaximum(b1,b2, b3);
        System.out.println("Max double at 2nd position");
        System.out.println("Expected: "+b2);
        System.out.println("Actual result: "+r2);

        if(b2.equals(r2)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test Failed");
        }
        System.out.println("=============================");

        Double c1 = 43.5, c2 = 4.33, c3 = 200.34;
        Double r3 = FindMax.findMaximum(c1,c2, c3);
        System.out.println("Max double at 3rd position");
        System.out.println("Expected: "+c3);
        System.out.println("Actual result: "+r3);

        if(c3.equals(r3)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test Failed");
        }

    }
}