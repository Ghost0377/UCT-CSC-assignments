//A programme to test Time and Duration class using Junit.
//Rector Ratsaka
//RTSREC001
//13 August 2022

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class TestOfTime {
  Time t1 = new Time("10:00");
  Time t2 = new Time("11:00");


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before 
   public void setUp() {
   }


   /** A test that always fails. **/
   @Test 
   public void testTimetoString() {
     //testing toString 
     Assert.assertEquals("10:00:00",t1.toString());
   }

   @Test
   public void testTimesubtract1() {
          //testing subtract
     Assert.assertEquals(60,t2.subtract(t1).intValue("minute"));
   }
   @Test
   public void testTimesubtract2() {
     //testing subtract between same times
     Assert.assertEquals(0,t1.subtract(t1).intValue("minute"));
   } 
   @Test
   public void testDuration_ms() { 
     //testing intValue for millisecond
     Assert.assertEquals(3600000,t2.subtract(t1).intValue("millisecond"));
   }
   @Test
   public void testDuration_s() { 
     //testing intValue for second
     Assert.assertEquals(3600,t2.subtract(t1).intValue("second"));
   }
   @Test
   public void testDuration_m() { 
     //testing intValue for minute
     Assert.assertEquals(60,t2.subtract(t1).intValue("minute"));
   }
   @Test
   public void testDuration_h() { 
     //testing intValue for hour
     Assert.assertEquals(1,t2.subtract(t1).intValue("hour"));
   }
   
  }
