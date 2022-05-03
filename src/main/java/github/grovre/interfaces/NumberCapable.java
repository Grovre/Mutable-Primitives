package github.grovre.interfaces;

/**
 * Any object that could possibly represent numbers in a way will
 * implement this interface. This interface is used by the only two
 * primitives that aren't numbers: booleans and chars.
 * This can be useful since it will return a 1 or 0 for true or false and the
 * code point of a character. Those are just two examples of
 * number representations of non-number types.
 */
public interface NumberCapable {

    /**
     * The abstract method to be implemented depending
     * on the type of the Mutable it is constructed for.
     * @return
     */
    int asNumber();
}
