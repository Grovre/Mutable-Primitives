package github.grovre.mutables;

import github.grovre.Mutable;
import github.grovre.interfaces.AsAtomic;
import github.grovre.interfaces.AsBigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Synchronized;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicLong;

@Data
@AllArgsConstructor
public class MutableLong extends Mutable implements AsBigDecimal, AsAtomic {

    private long long_;

    @Override
    public BigDecimal getAsBigDecimal() {
        return new BigDecimal(this.long_);
    }

    @Override
    public AtomicLong asAtomic() {
        return new AtomicLong(this.long_);
    }

    @Synchronized
    public void setConcurrently(long v) {
        this.long_ = v;
    }
}
