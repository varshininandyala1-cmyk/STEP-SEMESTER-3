public class Duplicate1 {public class Main {
    public static void main(String[] args) {

        int[] seats = {101, 102, 103, 102, 105};

        for (int i = 0; i < seats.length; i++) {
            for (int j = i + 1; j < seats.length; j++) {

                if (seats[i] == seats[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seats[i]);
                }
            }
        }
    }
}
    
}
