package org._jd.factory.appearance;

import org._jd.factory.products.Bread;
import org._jd.factory.products.Product;

public class Slicer {
    private Product product;

    public Slicer(Product product) {
        this.product = product;
    }

    public void slice(){
        product.setSliced(true);
    }
}
