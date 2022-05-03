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
public class MutableShort extends Mutable implements AsBigDecimal, AsAtomic {

    private short short_;

    @Override
    public BigDecimal asBigDecimal() {
        return new BigDecimal(this.short_);
    }

    @Override
    public AtomicInteger asAtomic() {
        return new AtomicInteger(this.short_);
    }

    @Synchronized
    public void setConcurrently(short v) {
        this.short_ = v;
    }

    @Override
    public MutableShort random() {
        short randomShort = (short) random.nextInt();
        return new MutableShort(randomShort);
    }
}
