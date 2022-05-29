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
public class MutableByte extends Mutable implements BigDecimalCapable, AtomicCapable, BoolCaster {

    private byte byte_;

    /**
     * Forms a BigDecimal object out of the byte contained
     * inside of the invoking MutableByte object.
     * @return new BigDecimal of the byte
     */
    @Override
    public BigDecimal asBigDecimal() {
        return new BigDecimal(this.byte_);
    }

    /**
     * Generates an AtomicInteger out of this byte. Note that this is an
     * INTEGER and not a BYTE that is atomic!
     * @return new AtomicInteger of byte
     */
    @Override
    public AtomicInteger asAtomic() {
        return new AtomicInteger(this.byte_);
    }

    /**
     * A threadsafe setter for the byte
     * @param v The replacing byte value
     */
    @Synchronized
    public void setConcurrently(byte v) {
        this.byte_ = v;
    }

    /**
     * Generates a MutableByte from an int casted to a byte.
     * This method of getting a random byte is experimental
     * and may not work.
     * @return new MutableByte of an int casted to a byte
     */
    @Override
    public MutableByte random() {
        byte randomByte = (byte) random.nextInt();
        return new MutableByte(randomByte);
    }

    @Override
    public boolean bool() {
        return this.byte_ != 0;
    }
}
