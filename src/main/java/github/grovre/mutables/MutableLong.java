package github.grovre.mutables;

import github.grovre.Mutable;
import github.grovre.interfaces.AtomicCapable;
import github.grovre.interfaces.BigDecimalCapable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Synchronized;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicLong;

@Data
@AllArgsConstructor
public class MutableLong extends Mutable implements BigDecimalCapable, AtomicCapable {

    private long long_;

    /**
     * Returns this long as a BigDecimal
     * @return new BigDecimal of long
     */
    @Override
    public BigDecimal asBigDecimal() {
        return new BigDecimal(this.long_);
    }

    /**
     * Returns an AtomicLong of this long
     * @return new AtomicLong of long
     */
    @Override
    public AtomicLong asAtomic() {
        return new AtomicLong(this.long_);
    }

    /**
     * A threadsafe setter for the wrapped number
     * @param v the long to set the internal long to
     */
    @Synchronized
    public void setConcurrently(long v) {
        this.long_ = v;
    }

    /**
     * Generates a MutableLong object with a random
     * long inside
     * @return new MutableLong with random long
     */
    @Override
    public MutableLong random() {
        long randomLong = random.nextLong();
        return new MutableLong(randomLong);
    }
}
