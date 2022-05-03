package github.grovre.mutables;

import github.grovre.Mutable;
import github.grovre.interfaces.AsAtomic;
import github.grovre.interfaces.AsNumber;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Synchronized;

import java.util.concurrent.atomic.AtomicBoolean;

@Data
@AllArgsConstructor
public class MutableBoolean extends Mutable implements AsNumber, AsAtomic {

    private boolean boolean_;

    @Override
    public int asNumber() {
        return this.boolean_ ? 1 : 0;
    }

    @Override
    public AtomicBoolean asAtomic() {
        return new AtomicBoolean(this.boolean_);
    }

    @Synchronized
    public void setConcurrently(boolean v) {
        this.boolean_ = v;
    }

    @Override
    public MutableBoolean random() {
        boolean randomBoolean = random.nextBoolean();
        return new MutableBoolean(randomBoolean);
    }
}
