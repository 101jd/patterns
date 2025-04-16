package org._jd.interpreter.expressions;

import org._jd.interpreter.context.InterContext;

import java.util.List;

public class OrExp extends Exp{
    List<Exp> exps;

    public OrExp(List<Exp> exps) {
        this.exps = exps;
    }

    @Override
    public boolean interpret(InterContext context) {
        return exps.stream().anyMatch(exp -> exp.interpret(context));
    }
}
