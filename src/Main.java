import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // More test cases are located in the tests directory.

        List<Meeting> meetings = new ArrayList<>();
        meetings.add(new Meeting(5, 10));
        meetings.add(new Meeting(10, 100));
        meetings.add(new Meeting(20, 100));

        int minimum = MinimumConferenceRoomsCalculator.determineMinimum(meetings);
        System.out.println(minimum);
    }
}
