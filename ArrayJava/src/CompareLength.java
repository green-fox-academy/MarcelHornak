public class CompareLength {
    public static void main(String[] args) {
        int [] firstArrayOfNumbers = new int[] {1, 2, 3};
        int [] secondArrayOfNumbers = new int[] {4, 5};
        if (secondArrayOfNumbers.length > firstArrayOfNumbers.length){
            System.out.println("secondArrayOfNumbers is longer than firstArrayOfNumbers");
        }
        else {
            System.out.println("firstArrayOfNumbers is the longer one");
        }
    }
}

