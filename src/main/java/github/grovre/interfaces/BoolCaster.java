package github.grovre.interfaces;

/**
 * Any type capable of being casted to a bool. We like this, especially in C++.
 */
public interface BoolCaster {

    /**
     * Inspired by good languages. Namely, C++ being able to cast things into booleans.
     * @return Returns the boolean-equivalent of this type. Anything non-zero is true, basically.
     */
    boolean bool();
}
