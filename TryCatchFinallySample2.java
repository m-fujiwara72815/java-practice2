import java.util.logging.*;

public class TryCatchFinallySample2{
    public static void main(String[] args){

        Logger logger = Logger.getLogger(TryCatchFinallySample2.class.getName());

        try{
            logger.warning("WARNING");
            Integer.parseInt(args[0]);
        }
        catch(Exception e){
            logger.severe("SEVERE");
        }
        finally{
            logger.info("INFO");
        }
    }
}