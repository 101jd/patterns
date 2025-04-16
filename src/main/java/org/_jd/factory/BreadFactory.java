package org._jd.factory;

import org._jd.factory.products.Bread;
import org._jd.factory.products.Product;

public class BreadFactory extends Factory{
    @Override
    protected Product FactoryMethod() {
        cnt++;
        return new Bread("bread", cnt);
    }
}
