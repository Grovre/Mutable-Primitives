package github.grovre.mutables;

import github.grovre.Mutable;
import github.grovre.interfaces.BigDecimalCapable;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class MutableLong extends Mutable implements BigDecimalCapable {

    private long long_;

    @Override
    public BigDecimal getAsBigDecimal() {
        return new BigDecimal(this.long_);
    }
}
