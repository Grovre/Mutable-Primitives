package github.grovre.interfaces;

/**
 * Any Mutable object that is inherently supported
 * by Java's atomic package will implement this interface
 * and be able to provide an easy way of getting the
 * number or non-number variable as an Atomic.
 */
public interface AtomicCapable {

    /**
     * Formed in implementing classes to represent
     * Atomic types of numbers and some non-number types.
     * @return
     */
    Object asAtomic();
}
