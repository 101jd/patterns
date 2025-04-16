package org._jd.interpreter.expressions;

import org._jd.interpreter.context.InterContext;

public abstract class Exp {
    public abstract boolean interpret(InterContext context);
}
