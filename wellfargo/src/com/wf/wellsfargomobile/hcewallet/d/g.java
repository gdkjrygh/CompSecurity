// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.d;


public final class g extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    public static final g h;
    public static final g i;
    public static final g j;
    public static final g k;
    private static final g l[];

    private g(String s, int i1)
    {
        super(s, i1);
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/wf/wellsfargomobile/hcewallet/d/g, s);
    }

    public static g[] values()
    {
        return (g[])l.clone();
    }

    static 
    {
        a = new g("SHOW_VIEW", 0);
        b = new g("SHOW_SECUREVIEW", 1);
        c = new g("WAC_AUTH_PAY_NOW", 2);
        d = new g("WAC_AUTH_WALLET_HOME", 3);
        e = new g("ACK_DATA_STORAGE", 4);
        f = new g("SIGN_OUT", 5);
        g = new g("UPDATE_TVL", 6);
        h = new g("UPDATE_TVL_ASYNC", 7);
        i = new g("UPDATE_TVL_SECURE", 8);
        j = new g("IS_VALID_SESSION", 9);
        k = new g("ACTIVE_SESSION", 10);
        l = (new g[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
