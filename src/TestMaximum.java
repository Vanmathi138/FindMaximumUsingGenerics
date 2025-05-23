public class TestMaximum {
    public static void main(String[] args) {
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

    }
}