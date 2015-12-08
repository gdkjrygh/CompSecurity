// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;


public final class dl extends Enum
{

    public static final dl a;
    public static final dl b;
    public static final dl c;
    public static final dl d;
    public static final dl e;
    public static final dl f;
    public static final dl g;
    public static final dl h;
    public static final dl i;
    public static final dl j;
    private static final dl n[];
    private final String k;
    private final String l;
    private final boolean m;

    private dl(String s, int i1, String s1, String s2)
    {
        this(s, i1, s1, s2, false);
    }

    private dl(String s, int i1, String s1, String s2, boolean flag)
    {
        super(s, i1);
        k = s1;
        l = s2;
        m = flag;
    }

    public static dl valueOf(String s)
    {
        return (dl)Enum.valueOf(com/paypal/android/sdk/onetouch/core/dl, s);
    }

    public static dl[] values()
    {
        return (dl[])n.clone();
    }

    public final String a()
    {
        return (new StringBuilder()).append(k).append(":").append(l).toString();
    }

    public final boolean b()
    {
        return m;
    }

    static 
    {
        a = new dl("WalletIsPresent", 0, "checkwallet", "present");
        b = new dl("WalletIsAbsent", 1, "checkwallet", "absent");
        c = new dl("PreflightBrowser", 2, "preflight", "browser");
        d = new dl("PreflightWallet", 3, "preflight", "wallet");
        e = new dl("PreflightNone", 4, "preflight", "none");
        f = new dl("SwitchToBrowser", 5, "switchaway", "browser");
        g = new dl("SwitchToWallet", 6, "switchaway", "wallet");
        h = new dl("Cancel", 7, "switchback", "cancel");
        i = new dl("Return", 8, "switchback", "return");
        j = new dl("Error", 9, "switchback", "cancel", true);
        n = (new dl[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }
}
