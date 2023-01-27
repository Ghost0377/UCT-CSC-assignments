import java.util.Scanner;
/**
 * The CarParkSim class contains the main car park simulation method.
 * It creates and manipulates the main objects, and handles user I/O.
 *
 * @author Stephan Jamieson and ...
 * @version 14/7/2019
 */
public class CarParkSim {
        
    public static void main(final String[] args) {
        final Scanner keyboard = new Scanner(System.in);
        Clock clock = new Clock(new Time("00:00:00"));
        Register register = new Register(); 
        // Declare variables to store a Clock and a Register object, create the relevant objects and assign them. 
        
        System.out.println("Car Park Simulator");
        Time currentTime = clock.examine();
        System.out.println("The current time is "+currentTime.toString()+".");
        // Print current time.
        System.out.println("Commands: advance {minutes}, arrive, depart, quit.");
        System.out.print(">");
        String input = keyboard.next().toLowerCase();
        while (!input.equals("quit")) {
            if (input.equals("advance")) {
                int advance = keyboard.nextInt();
                clock.advance(new Duration("minute",advance ));
                System.out.println("The current time is "+ clock.examine().toString()+".");
                // Advance the clock, print the current time.
            }
            else if (input.equals("arrive")) {
                String UID_One = UIDGenerator.makeUID();
                Time time = new Time(clock.examine().toString());
                Ticket ticket = new Ticket(time,UID_One );
                System.out.println("Ticket issued: "+ticket.toString()+".");
                register.add(ticket);
                // Create a new ticket, add it to the register, print details of ticket issued.
            }
            else if (input.equals("depart")) {
                String id  = keyboard.nextLine().trim();
                if (register.contains(id)==true){
                 Ticket retrievedTicket = register.retrieve(id);
                 System.out.println("Ticket details: "+retrievedTicket.toString()+".");
                 System.out.println("Current time: "+clock.examine()+".");
                 Duration d = retrievedTicket.age(clock.examine());
                 System.out.println("Duration of stay: "+Duration.format(d,"minute")+".");
                }
                else {
                 System.out.println("Invalid ticket ID.");
                }
                // Determine if ticket is valid, i.e. in the register.
                // If not, print error message.
                // If yes, retreive it, calculate duration of stay and print it.
            }
            else {
                System.out.println("That command is not recognised.");
                System.out.println("Commands: advance <minutes>, arrive, depart, quit.");
            }            
            System.out.print(">");
            input = keyboard.next().toLowerCase();
        }            
        System.out.println("Goodbye.");
    }

}
