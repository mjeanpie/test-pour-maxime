class Compteur {
    private  /*@ spec_public @*/ int num;
    //@ public invariant num >= 0 && num <= Integer.MAX_VALUE;

    //@ ensures num == 0;
    public Compteur() {
        num = 0;
    }

    //@ ensures num > 0;
    public void incr() {
        if (num < Integer.MAX_VALUE)
            num += 1;
    }

    //@ ensures num >= 0;
    public void decr() {
        /* TODO */
    }
}
