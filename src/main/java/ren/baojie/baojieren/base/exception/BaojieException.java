package ren.baojie.baojieren.base.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BaojieException extends RuntimeException {

    private BaojieError error;

    public BaojieException(BaojieError error) {
        this.error = error;
    }
}
