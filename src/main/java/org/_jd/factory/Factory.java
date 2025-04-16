package org._jd.factory;

import org._jd.factory.appearance.Slicer;
import org._jd.factory.products.Product;

public abstract class Factory {
    protected int cnt;
    protected abstract Product FactoryMethod();

    public Product create(){
        Product product = FactoryMethod();
        new Slicer(product).slice();

        return product;
    }
}
