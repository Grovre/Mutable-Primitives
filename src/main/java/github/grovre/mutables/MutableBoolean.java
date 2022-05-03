package github.grovre.mutables;

import github.grovre.Mutable;
import github.grovre.interfaces.AtomicCapable;
import github.grovre.interfaces.NumberCapable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Synchronized;

import java.util.concurrent.atomic.AtomicBoolean;

@Data
@AllArgsConstructor
public class MutableBoolean extends Mutable implements NumberCapable, AtomicCapable {

    private boolean boolean_;

    /**
     * Generates an int out of the boolean value, represented by a
     * 1 (true) and a 0 (false)
     * @return new int of boolean, 1 || 0
     */
    @Override
    public int asNumber() {
        return this.boolean_ ? 1 : 0;
    }

    /**
     * Generates an AtomicBoolean out of this boolean
     * @return new AtomicBoolean of contained boolean
     */
    @Override
    public AtomicBoolean asAtomic() {
        return new AtomicBoolean(this.boolean_);
    }

    /**
     * A threadsafe setter for the boolean
     * @param v The replacing boolean
     */
    @Synchronized
    public void setConcurrently(boolean v) {
        this.boolean_ = v;
    }

    /**
     * Generates a MutableBoolean with a random boolean value
     * @return new MutableBoolean with random boolean value
     */
    @Override
    public MutableBoolean random() {
        boolean randomBoolean = random.nextBoolean();
        return new MutableBoolean(randomBoolean);
    }
}
