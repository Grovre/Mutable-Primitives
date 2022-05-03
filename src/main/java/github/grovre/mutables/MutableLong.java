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

    @Override
    public BigDecimal asBigDecimal() {
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

    @Override
    public MutableLong random() {
        long randomLong = random.nextLong();
        return new MutableLong(randomLong);
    }
}
