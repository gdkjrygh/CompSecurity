// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import org.json.JSONArray;

final class m extends Enum
{

    public static final m a;
    public static final m b;
    public static final m c;
    public static final m d;
    public static final m e;
    public static final m f;
    public static final m g;
    public static final m h;
    public static final m i;
    public static final m j;
    public static final m k;
    public static final m l;
    private static final m n[];
    private static final String o;
    private static final m p[];
    private final int m;

    private m(String s, int i1, int j1)
    {
        super(s, i1);
        m = j1;
    }

    public static String b()
    {
        return o;
    }

    public static m valueOf(String s)
    {
        return (m)Enum.valueOf(com/facebook/ads/a/m, s);
    }

    public static m[] values()
    {
        return (m[])p.clone();
    }

    int a()
    {
        return m;
    }

    static 
    {
        int i1 = 0;
        a = new m("APP_AD", 0, 0);
        b = new m("LINK_AD", 1, 1);
        c = new m("APP_AD_V2", 2, 2);
        d = new m("LINK_AD_V2", 3, 3);
        e = new m("APP_ENGAGEMENT_AD", 4, 4);
        f = new m("AD_CHOICES", 5, 5);
        g = new m("JS_TRIGGER", 6, 6);
        h = new m("JS_TRIGGER_NO_AUTO_IMP_LOGGING", 7, 7);
        i = new m("VIDEO_AD", 8, 8);
        j = new m("INLINE_VIDEO_AD", 9, 9);
        k = new m("BANNER_TO_INTERSTITIAL", 10, 10);
        l = new m("NATIVE_CLOSE_BUTTON", 11, 11);
        p = (new m[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l
        });
        n = (new m[] {
            d, e, f, h, l
        });
        JSONArray jsonarray = new JSONArray();
        m am[] = n;
        for (int j1 = am.length; i1 < j1; i1++)
        {
            jsonarray.put(am[i1].a());
        }

        o = jsonarray.toString();
    }
}
