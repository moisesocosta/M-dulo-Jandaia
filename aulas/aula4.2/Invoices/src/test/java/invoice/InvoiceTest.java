package invoice;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class InvoiceTest {

    private Invoice invoice;


    @BeforeEach
    void setUp(){
        this.invoice = new Invoice(1465465L,new Date(),6500);
    }

    @DisplayName("Change value should work")
    @Test
    void changeTotalValue(){
        //Arrange
        float testData = 6750.42F;
        float expected = 6750.42F;

        //Act
        invoice.setTotalValue(testData);

        //Assert
        Assertions.assertEquals(expected,invoice.getTotalValue()," Change value should work");
    }

    @Test
    void changeTotalValueTwo(){
        //Arrange

        float testData = 6752.42F;
        float expected = 6752.42F;

        //Act
        invoice.setTotalValue(testData);

        //Assert
        Assertions.assertEquals(expected,invoice.getTotalValue()," Change value should work");
    }

}