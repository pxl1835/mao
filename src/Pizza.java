import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
//import org.Assert.assertTrue;
//import org.junit.Test;

public class Pizza {

    private PizzaStatus status;
    public enum PizzaStatus {
        ORDERED (5){
            @Override
            public boolean isOrdered() {
                return true;
            }
        },
        READY (2){
            @Override
            public boolean isReady() {
                return true;
            }
        },
        DELIVERED (0){
            @Override
            public boolean isDelivered() {
                return true;
            }
        };

        private int timeToDelivery;

        public boolean isOrdered() {return false;}

        public boolean isReady() {return false;}

        public boolean isDelivered(){return false;}

        public int getTimeToDelivery() {
            return timeToDelivery;
        }

        PizzaStatus (int timeToDelivery) {
            this.timeToDelivery = timeToDelivery;
        }
    }

    public boolean isDeliverable() {
        return this.status.isReady();
    }

//    public void printTimeToDeliver() {
//        System.out.println("Time to delivery is " +
//                this.PizzaStatus((int)(new Date()).getTime()).getTimeToDelivery());
//    }

    // Methods that set and get the status variable.
    public void setStatus(PizzaStatus status) {
        this.status = status;
    }

    public PizzaStatus getStatus() {
        return this.status ;
    }

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        Pizza testPz = new Pizza();
        testPz.setStatus(Pizza.PizzaStatus.ORDERED);
        System.out.println("current status : "  + testPz.getStatus() );
        //assertTrue(testPz.isDeliverable());
        boolean ready = testPz.isDeliverable();
        System.out.println("isDeliverable ? "  + ready );

        testPz.setStatus(Pizza.PizzaStatus.READY);
        System.out.println("current status : "  + testPz.getStatus() );
        ready = testPz.isDeliverable();
        System.out.println("isDeliverable ? "  + ready );

        testPz.setStatus(PizzaStatus.DELIVERED);
        System.out.println("current status : "  + testPz.getStatus() );
        ready = testPz.isDeliverable();
        System.out.println("isDeliverable ? "  + ready );

    }

}
