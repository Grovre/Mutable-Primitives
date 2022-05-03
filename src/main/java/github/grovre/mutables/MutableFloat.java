package github.grovre.mutables;

import github.grovre.Mutable;
import github.grovre.interfaces.BigDecimalCapable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Synchronized;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class MutableFloat extends Mutable implements BigDecimalCapable {

    private float float_;

    @Override
    public BigDecimal asBigDecimal() {
        return new BigDecimal(this.float_);
    }

    @Synchronized
    public void setConcurrently(float v) {
        this.float_ = v;
    }

    @Override
    public MutableFloat random() {
        float randomFloat = random.nextFloat();
        return new MutableFloat(randomFloat);
    }
}
