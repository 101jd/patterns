package org._jd.factory.products;

public abstract class Product {
    protected String message;
    protected int cnt;
    protected boolean sliced;

    protected Product(String message, int cnt) {
        this.cnt = cnt;
        this.message = message;
        this.sliced = false;
    }

    public String getMessage() {
        if (sliced)
            return "there is some fine slices of " + message;
        return message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setSliced(boolean sliced) {
        this.sliced = sliced;
    }
}
