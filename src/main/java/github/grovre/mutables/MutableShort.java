package github.grovre.mutables;

import github.grovre.Mutable;
import github.grovre.interfaces.AtomicCapable;
import github.grovre.interfaces.BigDecimalCapable;
import github.grovre.interfaces.BoolCaster;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Synchronized;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicInteger;

@Data
@AllArgsConstructor
public class MutableShort extends Mutable implements BigDecimalCapable, AtomicCapable, BoolCaster {

    private short short_;

    /**
     * Creates a BigDecimal out of the short. This method
     * utilizes Java's behind-the-scenes casting from a short
     * to an int since shorts are not part of any
     * BigDecimal constructor
     * @return new BigDecimal of the short
     */
    @Override
    public BigDecimal asBigDecimal() {
        return new BigDecimal(this.short_);
    }

    /**
     * Creates an AtomicInteger out of this short. This method also
     * uses Java's behind-the-scenes casting. Do note that this
     * is an AtomicINTEGER and not an AtomicSHORT as they do not exist.
     * @return new AtomicInteger of the contained short
     */
    @Override
    public AtomicInteger asAtomic() {
        return new AtomicInteger(this.short_);
    }

    /**
     * A threadsafe setter for the contained short
     * @param v short to replace current short
     */
    @Synchronized
    public void setConcurrently(short v) {
        this.short_ = v;
    }

    /**
     * Generates a MutableShort with a random short inside
     * @return new MutableShort with random short
     */
    @Override
    public MutableShort random() {
        short randomShort = (short) random.nextInt();
        return new MutableShort(randomShort);
    }

    @Override
    public boolean bool() {
        return this.short_ != 0;
    }
}
