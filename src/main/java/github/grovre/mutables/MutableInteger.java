package github.grovre.mutables;

import github.grovre.Mutable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MutableInteger extends Mutable {

    private int int_;
}