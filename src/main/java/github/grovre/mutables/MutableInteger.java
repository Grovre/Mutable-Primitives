package github.grovre.mutables;

import github.grovre.Mutable;
import github.grovre.interfaces.AsAtomic;
import github.grovre.interfaces.AsBigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Synchronized;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicInteger;

@Data
@AllArgsConstructor
public class MutableInteger extends Mutable implements AsBigDecimal, AsAtomic {

    private int int_;

    @Override
    public BigDecimal getAsBigDecimal() {
        return new BigDecimal(this.int_);
    }

    @Override
    public AtomicInteger asAtomic() {
        return new AtomicInteger(this.int_);
    }

    @Synchronized
    public void setConcurrently(int v) {
        this.int_ = v;
    }
}
