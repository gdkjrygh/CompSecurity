// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;


public final class ah extends Enum
{

    public static final ah a;
    public static final ah b;
    public static final ah c;
    public static final ah d;
    public static final ah e;
    public static final ah f;
    public static final ah g;
    public static final ah h;
    public static final ah i;
    public static final ah j;
    public static final ah k;
    public static final ah l;
    public static final ah m;
    public static final ah n;
    public static final ah o;
    public static final ah p;
    public static final ah q;
    public static final ah r;
    private static final ah s[];

    private ah(String s1, int i1)
    {
        super(s1, i1);
    }

    public static ah valueOf(String s1)
    {
        return (ah)Enum.valueOf(io/card/payment/ah, s1);
    }

    public static ah[] values()
    {
        return (ah[])s.clone();
    }

    static 
    {
        a = new ah("CANCEL", 0);
        b = new ah("CARDTYPE_AMERICANEXPRESS", 1);
        c = new ah("CARDTYPE_DISCOVER", 2);
        d = new ah("CARDTYPE_JCB", 3);
        e = new ah("CARDTYPE_MASTERCARD", 4);
        f = new ah("CARDTYPE_VISA", 5);
        g = new ah("DONE", 6);
        h = new ah("ENTRY_CVV", 7);
        i = new ah("ENTRY_POSTAL_CODE", 8);
        j = new ah("ENTRY_EXPIRES", 9);
        k = new ah("EXPIRES_PLACEHOLDER", 10);
        l = new ah("SCAN_GUIDE", 11);
        m = new ah("KEYBOARD", 12);
        n = new ah("ENTRY_CARD_NUMBER", 13);
        o = new ah("MANUAL_ENTRY_TITLE", 14);
        p = new ah("ERROR_NO_DEVICE_SUPPORT", 15);
        q = new ah("ERROR_CAMERA_CONNECT_FAIL", 16);
        r = new ah("ERROR_CAMERA_UNEXPECTED_FAIL", 17);
        s = (new ah[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r
        });
    }
}
