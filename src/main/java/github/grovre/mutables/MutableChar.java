package github.grovre.mutables;

import github.grovre.Mutable;
import github.grovre.interfaces.BoolCaster;
import github.grovre.interfaces.NumberCapable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Synchronized;

@Data
@AllArgsConstructor
public class MutableChar extends Mutable implements NumberCapable, BoolCaster {

    private char char_;

    /**
     * Generates the code point of the contained character
     * @return code point of the character
     */
    @Override
    public int asNumber() {
        return Character.codePointAt(new char[]{this.char_}, 0);
    }

    /**
     * A threadsafe setter for the character
     * @param v The replacing char
     */
    @Synchronized
    public void setConcurrently(char v) {
        this.char_ = v;
    }

    /**
     * Generates a MutableChar object that holds a random
     * character formed by a code point between 1 (inclusive)
     * and 200 (exclusive)
     * @return new MutableChar with random unchecked char
     */
    @Override
    public MutableChar random() {
        char randomChar = (char) random.nextInt(200);
        return new MutableChar(randomChar);
    }

    @Override
    public boolean bool() {
        return (int) this.char_ != 0;
    }
}
