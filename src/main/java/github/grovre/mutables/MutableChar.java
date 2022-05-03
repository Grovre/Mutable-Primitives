package github.grovre.mutables;

import github.grovre.Mutable;
import github.grovre.interfaces.AsNumber;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Synchronized;

@Data
@AllArgsConstructor
public class MutableChar extends Mutable implements AsNumber {

    private char char_;

    @Override
    public int asNumber() {
        return Character.codePointAt(new char[]{this.char_}, 0);
    }

    @Synchronized
    public void setConcurrently(char v) {
        this.char_ = v;
    }

    @Override
    public MutableChar random() {
        char randomChar = (char) random.nextInt(200);
        return new MutableChar(randomChar);
    }
}
