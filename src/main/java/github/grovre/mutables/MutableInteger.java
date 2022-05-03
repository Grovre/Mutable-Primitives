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
public class MutableInteger extends Mutable implements BigDecimalCapable, AtomicCapable {

    private int int_;

    @Override
    public BigDecimal asBigDecimal() {
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

    @Override
    public MutableInteger random() {
        int randomInt = random.nextInt();
        return new MutableInteger(randomInt);
    }
}
