public class Typingaccuracy2 {
  
    public static void main(String[] args) {

        String original = "hello world";
        String typed = "hello worlt";

        int count = 0;
        int first = -1;

        for (int i = 0; i < original.length(); i++) {

            if (original.charAt(i) == typed.charAt(i)) {
                count++;
            } else if (first == -1) {
                first = i;
            }
        }

        double accuracy = (count * 100.0) / original.length();

        System.out.println("Matched: " + count);
        System.out.println("Accuracy: " + accuracy + "%");

        if (first == -1)
            System.out.println("No Mismatches");
        else
            System.out.println("First Mismatch at position: " + (first + 1));
    }
}
    

