package github.grovre;

import github.grovre.mutables.*;
import lombok.Data;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Data
public abstract class Mutable {

    @Getter
    private static final List<Class<? extends Mutable>> mutableClasses =
                    Arrays.asList(MutableBoolean.class, MutableByte.class,
                    MutableChar.class, MutableDouble.class, MutableFloat.class,
                    MutableInteger.class, MutableLong.class, MutableShort.class);

    protected final static Random random = new Random();

    public abstract Mutable random();
}
