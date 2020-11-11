package George_Rogava_v1.ge.edu.currency;

import George_Rogava_v1.ge.edu.currency.service.impl.CurrencyServiceImpl;
import org.apache.log4j.Logger;

public class Main {
    public static void main(String[] args) {

        final Logger logger = Logger.getLogger(String.valueOf(Main.class));

        CurrencyServiceImpl object = new CurrencyServiceImpl();

        object.setExchangeRate(0.30);

        logger.info(object.convert(100));
        logger.info(object.convert(25.55));

    }
}
