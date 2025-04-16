package org._jd;

import org._jd.adapter.adapter.Flash;
import org._jd.adapter.adapter.FlashAdapter;
import org._jd.factory.BreadFactory;
import org._jd.factory.ButterFactory;
import org._jd.factory.Factory;
import org._jd.factory.GarlicFactory;
import org._jd.factory.products.Product;
import org._jd.interpreter.context.InterContext;
import org._jd.interpreter.expressions.AndExp;
import org._jd.interpreter.expressions.Exp;
import org._jd.interpreter.expressions.OrExp;
import org._jd.interpreter.expressions.TerminalExp;
import org._jd.singletone.Singletone;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("====== SINGLETONE ======");
        Singletone singletone = Singletone.getInstance();

        System.out.println(singletone.getCnt());

        for (int i = 0; i < 3; i++) {
            Singletone.getInstance();
        }

        System.out.println(Singletone.getInstance().getCnt());

        System.out.println("====== FACTORY ======");
        List<Factory> factories = new ArrayList<>();
        Factory breadFactory = new BreadFactory();
        factories.add(breadFactory);
        factories.add(new GarlicFactory());
        factories.add(new ButterFactory());

        Product bread = breadFactory.create();
        System.out.println(bread.getCnt() + " " + bread.getMessage());

        for (Factory factory : factories){
            Product product = factory.create();
            System.out.println(product.getCnt() + " " + product.getMessage());
        }

        System.out.println("====== INTERPRETER ======");

        Exp awesome = new TerminalExp("чудесный");
        Exp day = new TerminalExp("День");
        Exp cold = new TerminalExp("Мороз");
        Exp sunny = new TerminalExp("солнце");

        System.out.println(new AndExp(List.of(day, sunny, cold))
                .interpret(new InterContext("мороз и солнце, день чудесный")));
        System.out.println(new OrExp(List.of(day, sunny, awesome))
                .interpret(new InterContext("какой чудесный день, какой чудесный пень")));

        System.out.println("====== ADAPTER ======");

        Flash flash = new FlashAdapter();

        flash.signalSOS();
    }
}