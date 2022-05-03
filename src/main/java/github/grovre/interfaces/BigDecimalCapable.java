package github.grovre.interfaces;

import java.math.BigDecimal;

/**
 * Any number Mutable will implement this interface.
 * The interface will provide Mutable numbers with a way
 * to easily provide consumers a BigDecimal variant of the number.
 */
public interface BigDecimalCapable {

    /**
     * This method will take the current number a Mutable is wrapping and
     * form a BigDecimal out of said number. This isn't only available for the
     * default argument types like int and double, but also for shorts, floats, etc.
     * @return new BigDecimal of current number
     */
    BigDecimal asBigDecimal();
}
