package github.grovre;

import lombok.Data;

import java.util.Random;

@Data
public abstract class Mutable {

    protected final static Random random = new Random();

    public abstract Mutable random();
}
