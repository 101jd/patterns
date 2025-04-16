package org._jd.factory;

import org._jd.factory.products.Butter;
import org._jd.factory.products.Product;

public class ButterFactory extends Factory{
    @Override
    protected Product FactoryMethod() {
        cnt++;
        return new Butter("butter", cnt);
    }
}
