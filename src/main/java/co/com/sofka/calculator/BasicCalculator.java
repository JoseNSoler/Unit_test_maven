package co.com.sofka.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);


    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long subtraction(Long number1, Long number2) {
        logger.info("Subtracting {} - {}", number1, number2);
        return number1 - number2;
    }

    public Long multiply(Long number1, Long number2) {
        logger.info("Multiplying {} * {}",number1,number2);
        return number1 * number2;
    }

    public Long divide(Long number1, Long number2) {
        try {
            logger.info("Dividing {} / {}",number1,number2);
            return number1 / number2;
        } catch (ArithmeticException e){
            logger.info("Can't divide betweem 0");
            return Long.parseLong("0");
        }
    }
}
