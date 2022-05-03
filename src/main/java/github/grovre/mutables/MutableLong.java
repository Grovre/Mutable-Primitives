package github.grovre.mutables;

import github.grovre.Mutable;
import github.grovre.interfaces.AsAtomic;
import github.grovre.interfaces.BigDecimalCapable;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicLong;

@Data
@AllArgsConstructor
public class MutableLong extends Mutable implements BigDecimalCapable, AsAtomic {

    private long long_;

    @Override
    public BigDecimal getAsBigDecimal() {
        return new BigDecimal(this.long_);
    }

    @Override
    public AtomicLong asAtomic() {
        return new AtomicLong(this.long_);
    }
}
