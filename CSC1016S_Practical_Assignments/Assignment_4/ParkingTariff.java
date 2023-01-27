// A programme to store TimePeriod and Money for TariffTable.
//Rector Ratsaka
//RTSREC001
//22 August 2022

public class ParkingTariff {
 private TimePeriod period;
 private Money tariff;

 public ParkingTariff(TimePeriod period,Money tariff) {
  this.period=period;
  this.tariff=tariff;
 }
 public ParkingTariff() {
  this(null,null);
 }
 public TimePeriod getPeriod() {
  return this.period;
 }
 public Money getTariff() {
  return this.tariff;
 }
}
