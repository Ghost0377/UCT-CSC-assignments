//A programme to store a collection of Tickets.
//Rector Ratsaka
//RTSREC001
//13 August 2022

public class Register {
//instant variables
 public Ticket[] tickets;
 public int numTickets;

 public Register() {
  // Create a new Register object.
  numTickets = 0;
  tickets = new Ticket[100];
 }

 public void add(Ticket ticket) {
  // Store the given ticket in the register.
  tickets[numTickets] = ticket;
  numTickets++;
  
 }
 public boolean contains(String ticketID) {
  // Determine whether a ticket with the given ID is in the collection.
  for (int i=0;i<tickets.length;i++) {
  try {
   if (tickets[i].ID().equals(ticketID)) {
    return true;
   }
   }
   catch (Exception e) {
    return false;
   }
  }
  return false;
 }

 public Ticket retrieve(String ticketID) {
   // Get the Ticket with the given ID from the collection.
   Ticket retrieved=null;
      for (int i=0; i<tickets.length; i++) {
         if (tickets[i].ID().equals(ticketID)){
             retrieved = tickets[i];
             break;
         }
      }
      return retrieved;
     }
}