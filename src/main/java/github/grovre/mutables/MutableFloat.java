package github.grovre.mutables;

import github.grovre.Mutable;
import github.grovre.interfaces.BigDecimalCapable;
import github.grovre.interfaces.BoolCaster;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Synchronized;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class MutableFloat extends Mutable implements BigDecimalCapable, BoolCaster {

    private float float_;

    /**
     * Creates a BigDecimal object out of the contained float
     * from this MutableFloat
     * @return new BigDecimal from contained float
     */
    @Override
    public BigDecimal asBigDecimal() {
        return new BigDecimal(this.float_);
    }

    /**
     * A threadsafe setter for the float
     * @param v The float to replace the current float with
     */
    @Synchronized
    public void setConcurrently(float v) {
        this.float_ = v;
    }

    /**
     * Generates a MutableFloat with a random float contained
     * @return new MutableFloat with random float inside
     */
    @Override
    public MutableFloat random() {
        float randomFloat = random.nextFloat();
        return new MutableFloat(randomFloat);
    }

    @Override
    public boolean bool() {
        return this.float_ != 0;
    }
}
