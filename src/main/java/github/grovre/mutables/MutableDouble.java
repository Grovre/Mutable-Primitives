package github.grovre.mutables;

import github.grovre.Mutable;
import github.grovre.interfaces.BigDecimalCapable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Synchronized;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class MutableDouble extends Mutable implements BigDecimalCapable {

    private double double_;

    @Override
    public BigDecimal asBigDecimal() {
        return new BigDecimal(this.double_);
    }

    @Synchronized
    public void setConcurrently(double v) {
        this.double_ = v;
    }

    @Override
    public MutableDouble random() {
        double randomDouble = random.nextDouble();
        return new MutableDouble(randomDouble);
    }
}
