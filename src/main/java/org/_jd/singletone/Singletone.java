package org._jd.singletone;

public class Singletone {

    private static Singletone singletone;
    private static int cnt;

    private Singletone() {
        cnt = 0;
    }

    public static Singletone getInstance(){
        cnt++;
        return singletone == null ? singletone = new Singletone() : singletone;
    }

    public int getCnt() {
        return cnt;
    }
}
