// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;


public final class n extends Enum
{

    public static final n a;
    public static final n b;
    public static final n c;
    public static final n d;
    public static final n e;
    public static final n f;
    public static final n g;
    public static final n h;
    public static final n i;
    public static final n j;
    private static final n l[];
    private final int k;

    private n(String s, int i1, int j1)
    {
        super(s, i1);
        k = j1;
    }

    public static n valueOf(String s)
    {
        return (n)Enum.valueOf(com/facebook/ads/a/n, s);
    }

    public static n[] values()
    {
        return (n[])l.clone();
    }

    int a()
    {
        return k;
    }

    static 
    {
        a = new n("UNKNOWN", 0, 0);
        b = new n("WEBVIEW_BANNER_LEGACY", 1, 4);
        c = new n("WEBVIEW_BANNER_50", 2, 5);
        d = new n("WEBVIEW_BANNER_90", 3, 6);
        e = new n("WEBVIEW_INTERSTITIAL_UNKNOWN", 4, 100);
        f = new n("WEBVIEW_INTERSTITIAL_HORIZONTAL", 5, 101);
        g = new n("WEBVIEW_INTERSTITIAL_VERTICAL", 6, 102);
        h = new n("WEBVIEW_INTERSTITIAL_TABLET", 7, 103);
        i = new n("NATIVE_UNKNOWN", 8, 200);
        j = new n("NATIVE_250", 9, 201);
        l = (new n[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }
}
