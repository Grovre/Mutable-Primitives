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
public class MutableByte extends Mutable implements BigDecimalCapable, AtomicCapable {

    private byte byte_;

    @Override
    public BigDecimal asBigDecimal() {
        return new BigDecimal(this.byte_);
    }

    @Override
    public AtomicInteger asAtomic() {
        return new AtomicInteger(this.byte_);
    }

    @Synchronized
    public void setConcurrently(byte v) {
        this.byte_ = v;
    }

    @Override
    public MutableByte random() {
        byte randomByte = (byte) random.nextInt();
        return new MutableByte(randomByte);
    }
}
