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
       TariffTable tariffTable = new TariffTable(10);
       final Currency currency = new Currency("R", "ZAR", 100);
       
       final TimePeriod p1 = new TimePeriod(new Duration("minute", 0), new Duration("minute", 30)); 
       tariffTable.addTariff(p1, new Money("R10", currency));
       final TimePeriod p2 = new TimePeriod(new Duration("minute", 30), new Duration("minute", 60)); 
       tariffTable.addTariff(p2, new Money("R15", currency));
       final TimePeriod p3 = new TimePeriod(new Duration("minute", 60), new Duration("minute", 180)); 
       tariffTable.addTariff(p3, new Money("R20", currency));
       final TimePeriod p4 = new TimePeriod(new Duration("minute", 180), new Duration("minute", 240)); 
       tariffTable.addTariff(p4, new Money("R30", currency));
       final TimePeriod p5 = new TimePeriod(new Duration("minute", 240), new Duration("minute", 300)); 
       tariffTable.addTariff(p5, new Money("R40", currency));
       final TimePeriod p6 = new TimePeriod(new Duration("minute", 300), new Duration("minute", 360)); 
       tariffTable.addTariff(p6, new Money("R50", currency));
       final TimePeriod p7 = new TimePeriod(new Duration("minute", 420), new Duration("minute", 480)); 
       tariffTable.addTariff(p7, new Money("R60", currency));
       final TimePeriod p8 = new TimePeriod(new Duration("minute", 480), new Duration("minute", 540)); 
       tariffTable.addTariff(p8, new Money("R70", currency));
       final TimePeriod p9 = new TimePeriod(new Duration("minute", 600), new Duration("minute", 660)); 
       tariffTable.addTariff(p9, new Money("R90", currency));
       final TimePeriod p10 = new TimePeriod(new Duration("minute", 720), new Duration("minute", 780)); 
       tariffTable.addTariff(p10, new Money("R100", currency));



        
        // Declare variables to store a Clock and a Register object, create the relevant objects and assign them. 
        
        System.out.println("Car Park Simulator");
        Time currentTime = clock.examine();
        System.out.println("The current time is "+currentTime.toString()+".");
        // Print current time.
        System.out.println("Commands: tariffs, advance {minutes}, arrive, depart, quit.");
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
                Ticket ticket = new Ticket(clock.examine());
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
                 System.out.println("Cost of stay : "+tariffTable.getTariff(d)+".");
                }
                else {
                 System.out.println("Invalid ticket ID.");
                }
                // Determine if ticket is valid, i.e. in the register.
                // If not, print error message.
                // If yes, retreive it, calculate duration of stay and print it.
            }
            else if (input.equals("tariffs")) {
             System.out.println(tariffTable);
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
