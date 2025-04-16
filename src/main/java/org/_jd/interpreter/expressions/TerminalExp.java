package org._jd.interpreter.expressions;

import org._jd.interpreter.context.InterContext;

public class TerminalExp extends Exp{
    private String data;

    public TerminalExp(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(InterContext context) {
        return context.getString().contains(data.toLowerCase());
    }
}
