package ge.edeu.btu;
import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;


public class Payment {
    private static org.apache.log4j.Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
	Electricity electricity= new Electricity("Customer1", 123.2);
	Water water  = new Water("Customer2",19.7);
	pay(electricity,water);
    }

    public static <T> void pay(Electricity electricity, Water water){
        log.info("კომუნალური გადახდილია "+electricity);
        log.info("კომუნალური გადახდილია "+water);
    }
}
