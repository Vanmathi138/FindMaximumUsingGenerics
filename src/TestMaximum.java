public class TestMaximum {
    public static void main(String[] args) {
        System.out.println("***** Integer Test Case Using Generic Class *****");
        FindMax<Integer> intTest = new FindMax<>(100, 20, 30);
        System.out.println("Expected: 100 | Actual: " + intTest.testMaximum());

        System.out.println("\n***** Double Test Case Using Generic Class *****");
        FindMax<Double> doubleTest = new FindMax<>(43.5, 894.33, 2.34);
        System.out.println("Expected: 894.33 | Actual: " + doubleTest.testMaximum());

        System.out.println("\n***** String Test Case Using Generic Class *****");
        FindMax<String> stringTest = new FindMax<>("Apple", "Peach", "Banana");
        System.out.println("Expected: Peach | Actual: " + stringTest.testMaximum());
    }
}
