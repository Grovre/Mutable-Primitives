package github.grovre.mutables;

import github.grovre.Mutable;
import github.grovre.interfaces.AsAtomic;
import github.grovre.interfaces.BigDecimalCapable;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicInteger;

@Data
@AllArgsConstructor
public class MutableByte extends Mutable implements BigDecimalCapable, AsAtomic {

    private byte byte_;

    @Override
    public BigDecimal getAsBigDecimal() {
        return new BigDecimal(this.byte_);
    }

    public AtomicInteger asAtomic() {
        return new AtomicInteger(this.byte_);
    }
}
