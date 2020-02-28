import java.util.List;
import java.util.PriorityQueue;

public class MinimumConferenceRoomsCalculator {

    public static int determineMinimum(List<Meeting> meetings){
        if (meetings.size() == 0) return 0;

        meetings.sort( (a, b) -> a.startTime - b.startTime );
        PriorityQueue<Integer> endingTimes = new PriorityQueue<>();
        endingTimes.offer(meetings.get(0).endTime);
        int minimumNumberOfConferenceRooms = 1;

        for (int i = 1; i<meetings.size(); i++){
            Meeting currentMeeting = meetings.get(i);
            if (currentMeeting.startTime < endingTimes.peek()){
                minimumNumberOfConferenceRooms++;
            }
            // the meeting with the minimum end time has finished
            else endingTimes.poll();

            endingTimes.offer(currentMeeting.endTime);
        }
        return minimumNumberOfConferenceRooms;
    }
}
