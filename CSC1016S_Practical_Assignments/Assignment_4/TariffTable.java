// A programme that records parking tariffs for a pay-to-stay car park.
//Rector Ratsaka
//RTSREC001
//22 August 2022

public class TariffTable {
 private int maxSize;
 private int total;
 private  ParkingTariff[] park;
 private int tariffs;

 public TariffTable(int maxSize) {
  // initialising instant variables.
  this.maxSize = maxSize;
  tariffs = 0;
  park = new ParkingTariff[this.maxSize];

 }
 public void addTariff(TimePeriod period, Money tariff) {
  //add tariff for the given period to the table.
  ParkingTariff parking = new ParkingTariff(period,tariff);
  if (tariffs<maxSize) {
      if (tariffs==0) {
         park[tariffs] = parking;
         tariffs++;
      }
      else {
       TimePeriod other = park[tariffs-1].getPeriod();
       if (other.adjacent(period)) {
          if ( other.precedes(period)){
              park[tariffs] = parking;
              tariffs++;              
          }
          else {
            throw new IllegalArgumentException("Tariff periods must be adjacent.");
          }
       }
       else {
        throw new IllegalArgumentException("Tariff periods must be adjacent.");
       }
      }
    } 
 }
 public Money getTariff(Duration lengthOfStay) {
  //Obtain the tariff for the given length of stay.
  Money tariff=null;
  for (int i=0; i<tariffs; i++) {
    if((park[i].getPeriod()).includes(lengthOfStay)) {
       tariff= park[i].getTariff();
    }
  }       
    return tariff;

 }
 public String toString() {
  //obtain a string representation of this tarifftable.
  String result ="";
     for (int i=0; i<tariffs; i++) {
        ParkingTariff copy = park[i];
        if (i<(tariffs-1)) {
          result = result + copy.getPeriod() +" : "+copy.getTariff()+"\n";
        }
        else {
         result = result + copy.getPeriod() +" : "+copy.getTariff();
        }
     }
     return result;

 }
}