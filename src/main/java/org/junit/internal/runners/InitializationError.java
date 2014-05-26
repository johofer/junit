package org.junit.internal.runners;

import java.util.Arrays;
import java.util.List;

/**
 * Use the published version:
 * {@link org.junit.runners.model.InitializationError}
 * This may disappear as soon as 1 April 2009
 */
@Deprecated
public class InitializationError extends Exception {
    private static final long serialVersionUID = 1L;
    private final List<Throwable> errors;

    public InitializationError(List<Throwable> errors) {
        this.errors = errors;
    }

    public InitializationError(Throwable... errors) {
        this(Arrays.asList(errors));
    }

    public InitializationError(String string) {
        this(new Exception(string));
    }

    public List<Throwable> getCauses() {
        return errors;
    }
}
