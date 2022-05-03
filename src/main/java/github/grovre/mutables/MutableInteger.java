package github.grovre.mutables;

import github.grovre.Mutable;
import github.grovre.interfaces.AtomicCapable;
import github.grovre.interfaces.BigDecimalCapable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Synchronized;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicInteger;

@Data
@AllArgsConstructor
public class MutableInteger extends Mutable implements BigDecimalCapable, AtomicCapable {

    private int int_;

    /**
     * Returns the int as a new BigDecimal.
     * @return new BigDecimal of int
     */
    @Override
    public BigDecimal asBigDecimal() {
        return new BigDecimal(this.int_);
    }

    /**
     * Returns the int as a new AtomicInteger
     * @return new AtomicInteger of int
     */
    @Override
    public AtomicInteger asAtomic() {
        return new AtomicInteger(this.int_);
    }

    /**
     * A threadsafe setter for the int
     * @param v The value the int will become
     */
    @Synchronized
    public void setConcurrently(int v) {
        this.int_ = v;
    }

    /**
     * Generates a random MutableInteger object
     * @return new MutableInteger with random int
     */
    @Override
    public MutableInteger random() {
        int randomInt = random.nextInt();
        return new MutableInteger(randomInt);
    }
}
