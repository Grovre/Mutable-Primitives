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
public class MutableDouble extends Mutable implements BigDecimalCapable, BoolCaster {

    private double double_;

    /**
     * Creates a BigDecimal object out of the contained double
     * from this MutableDouble
     * @return new BigDecimal from contained double
     */
    @Override
    public BigDecimal asBigDecimal() {
        return new BigDecimal(this.double_);
    }

    /**
     * A threadsafe setter for the contained double
     * @param v The replacing double
     */
    @Synchronized
    public void setConcurrently(double v) {
        this.double_ = v;
    }

    /**
     * Generates a random double inside of a new MutableDouble
     * @return new MutableDouble with random double
     */
    @Override
    public MutableDouble random() {
        double randomDouble = random.nextDouble();
        return new MutableDouble(randomDouble);
    }

    @Override
    public boolean bool() {
        return this.double_ != 0;
    }
}
