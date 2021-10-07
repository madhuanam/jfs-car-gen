package com.example.car_gen;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    Honda civic = new Honda("red",2021,14,false) ;
    @Test
    public void testAccelerateSpeed() {
        Assert.assertEquals(5,civic.accelerateSpeed());
        Assert.assertEquals(10,civic.accelerateSpeed());
        Assert.assertEquals(10,civic.accelerateSpeed());
      //  Assert.assertEquals(5,civic.decelerateSpeed());
    }
    @Test
    public void testDecelerateSpeed() {
        Assert.assertEquals(0,civic.decelerateSpeed());
    }

    @Test
    public void testConvertToElectric(){
        Assert.assertEquals(true,civic.convertToElectric());
    }
}
