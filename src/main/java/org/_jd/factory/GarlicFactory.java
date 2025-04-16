package org._jd.factory;

import org._jd.factory.products.Garlic;
import org._jd.factory.products.Product;

public class GarlicFactory extends Factory {

    @Override
    protected Product FactoryMethod() {
        cnt++;
        return new Garlic("garlic", cnt);
    }
}
