import java.util.Scanner;
public class disk_scheduling {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Input number of disk requests
            System.out.print("Enter number of disk requests: ");
            int n = sc.nextInt();

            int[] request = new int[n];

            // Input disk request sequence
            System.out.println("Enter disk request sequence:");
            for (int i = 0; i < n; i++) {
                request[i] = sc.nextInt();
            }

            // Input initial head position
            System.out.print("Enter initial head position: ");
            int head = sc.nextInt();

            int totalSeekTime = 0;

            System.out.println("\nSeek Sequence is:");

            // FCFS Disk Scheduling
            for (int i = 0; i < n; i++) {

                int currentTrack = request[i];

                // Calculate seek time
                int seekTime = Math.abs(currentTrack - head);

                totalSeekTime += seekTime;

                System.out.println("Move from " + head + " to " + currentTrack +
                        " with seek time " + seekTime);

                // Update head position
                head = currentTrack;
            }

            // Display total seek time
            System.out.println("\nTotal Seek Time = " + totalSeekTime);

            sc.close();
        }

}
