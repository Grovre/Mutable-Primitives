package github.grovre.mutables;

import github.grovre.Mutable;
import github.grovre.interfaces.AsNumber;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MutableBoolean extends Mutable implements AsNumber {

    private boolean boolean_;

    @Override
    public int asNumber() {
        return this.boolean_ ? 1 : 0;
    }
}
