import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MinimumConferenceRoomsCalculatorTests {

    List<Meeting> meetings;

    @Before
    public void init() {
        meetings = new ArrayList<>();
    }

    @Test
    public void minimumShouldBe0IfListIsEmpty(){
        int actual = MinimumConferenceRoomsCalculator.determineMinimum(meetings);
        assertEquals(0, actual);
    }

    @Test
    public void minimumShouldBe1(){
        meetings.add(new Meeting(10, 15));
        meetings.add(new Meeting(5, 10));

        int actual = MinimumConferenceRoomsCalculator.determineMinimum(meetings);
        assertEquals(1, actual);
    }

    @Test
    public void minimumShouldBe2(){
        meetings.add(new Meeting(5, 10));
        meetings.add(new Meeting(10, 15));
        meetings.add(new Meeting(10, 20));

        int actual = MinimumConferenceRoomsCalculator.determineMinimum(meetings);
        assertEquals(2, actual);
    }

    @Test
    public void minimumShouldBe4(){
        meetings.add(new Meeting(5, 10));
        meetings.add(new Meeting(10, 100));
        meetings.add(new Meeting(20, 100));
        meetings.add(new Meeting(30, 50));
        meetings.add(new Meeting(35, 40));

        int actual = MinimumConferenceRoomsCalculator.determineMinimum(meetings);
        assertEquals(4, actual);
    }

    @Test
    public void minimumShouldBe5(){
        meetings.add(new Meeting(5, 10));
        meetings.add(new Meeting(10, 100));
        meetings.add(new Meeting(20, 100));
        meetings.add(new Meeting(30, 50));
        meetings.add(new Meeting(35, 45));
        meetings.add(new Meeting(40, 45));

        int actual = MinimumConferenceRoomsCalculator.determineMinimum(meetings);
        assertEquals(5, actual);
    }

}