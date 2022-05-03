package github.grovre.mutables;

import github.grovre.Mutable;
import github.grovre.interfaces.AsNumber;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MutableChar extends Mutable implements AsNumber {

    private char char_;

    @Override
    public int asNumber() {
        return Character.codePointAt(new char[]{this.char_}, 0);
    }
}
