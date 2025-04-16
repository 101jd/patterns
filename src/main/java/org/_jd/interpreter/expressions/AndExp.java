package org._jd.interpreter.expressions;

import org._jd.interpreter.context.InterContext;

import java.util.List;
import java.util.function.Predicate;

public class AndExp extends Exp{

    List<Exp> exps;

    public AndExp(List<Exp> exps) {
        this.exps = exps;
    }

    @Override
    public boolean interpret(InterContext context) {
        return exps.stream().allMatch(exp -> exp.interpret(context));
    }
}
