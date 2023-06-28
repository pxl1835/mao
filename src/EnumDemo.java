

import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

public class EnumDemo {
    public static void main(String[] args) {
        Pizza testPz = new Pizza();
        testPz.setStatus(Pizza.PizzaStatus.READY);
        assertTrue(testPz.isDeliverable());
        System.out.println("testPz.isDeliverable()? : Yes" );
        testPz.setStatus(Pizza.PizzaStatus.ORDERED);
        assertTrue(testPz.isDeliverable());
        System.out.println("You entered: Hello" );
    }
}
