package github.grovre.mutables;

import github.grovre.Mutable;
import github.grovre.interfaces.BigDecimalCapable;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class MutableShort extends Mutable implements BigDecimalCapable {

    private short short_;

    @Override
    public BigDecimal getAsBigDecimal() {
        return new BigDecimal(this.short_);
    }
}
