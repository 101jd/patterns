package org._jd.adapter.adapter;

import org._jd.adapter.domain.Beeper;

public class FlashAdapter implements Flash {
    private final Beeper beeper = new Beeper();


    @Override
    public void flash() {
        beeper.beepShort();
        System.out.println();
    }

    @Override
    public void flashIntence() {
        beeper.beepLong();
        System.out.println();
    }

    @Override
    public void signalSOS() {
        for (int i = 0; i < 3; i++) {
            beeper.beepShort();
        }
        for (int i = 0; i < 3; i++) {
            beeper.beepLong();
        }
        for (int i = 0; i < 3; i++) {
            beeper.beepShort();
        }
        System.out.println();
    }
}
