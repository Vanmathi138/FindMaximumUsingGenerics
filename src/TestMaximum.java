public class TestMaximum {
    public static void main(String[] args) {
        System.out.println("********** INTEGER TEST CASES **********");

        FindMax<Integer> intTest1 = new FindMax<>(100, 20, 30);
        System.out.println("Max Integer at 1st position: Expected: 100 | Actual: " + intTest1.findMaximum());

        FindMax<Integer> intTest2 = new FindMax<>(20, 228, 1);
        System.out.println("Max Integer at 2nd position: Expected: 228 | Actual: " + intTest2.findMaximum());

        FindMax<Integer> intTest3 = new FindMax<>(122, 8, 989);
        System.out.println("Max Integer at 3rd position: Expected: 989 | Actual: " + intTest3.findMaximum());

        System.out.println("\n********** DOUBLE TEST CASES **********");

        FindMax<Double> doubleTest1 = new FindMax<>(43.5, 4.33, 2.34);
        System.out.println("Max Double at 1st position: Expected: 43.5 | Actual: " + doubleTest1.findMaximum());

        FindMax<Double> doubleTest2 = new FindMax<>(43.5, 894.33, 2.34);
        System.out.println("Max Double at 2nd position: Expected: 894.33 | Actual: " + doubleTest2.findMaximum());

        FindMax<Double> doubleTest3 = new FindMax<>(43.5, 4.33, 200.34);
        System.out.println("Max Double at 3rd position: Expected: 200.34 | Actual: " + doubleTest3.findMaximum());

        System.out.println("\n********** STRING TEST CASES **********");

        FindMax<String> stringTest1 = new FindMax<>("Peach", "Apple", "Banana");
        System.out.println("Max String at 1st position: Expected: Peach | Actual: " + stringTest1.findMaximum());

        FindMax<String> stringTest2 = new FindMax<>("Apple", "Peach", "Banana");
        System.out.println("Max String at 2nd position: Expected: Peach | Actual: " + stringTest2.findMaximum());

        FindMax<String> stringTest3 = new FindMax<>("Apple", "Banana", "Peach");
        System.out.println("Max String at 3rd position: Expected: Peach | Actual: " + stringTest3.findMaximum());

    }
}