// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats:
//            AppStatsState

final class a extends Enum
{

    public static final a a;
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static final a j;
    public static final a k;
    public static final a l;
    public static final a m;
    private static final a o[];
    private Map n;

    private a(String s, int i1)
    {
        super(s, i1);
        n = new HashMap();
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/a, s);
    }

    public static a[] values()
    {
        return (a[])o.clone();
    }

    AppStatsState a()
    {
        if (n.isEmpty())
        {
            n.put(a, AppStatsState.APP_STATS_UNINITIALIZED);
            n.put(b, AppStatsState.APP_STATS_INITIALIZING);
            n.put(c, AppStatsState.APP_STATS_INITIALIZED);
            n.put(d, AppStatsState.APP_STATS_PURGING);
            n.put(e, AppStatsState.APP_STATS_RECORDING);
            n.put(f, AppStatsState.APP_STATS_WRITING);
            n.put(g, AppStatsState.APP_STATS_RECORDING_WRITING);
            n.put(h, AppStatsState.APP_STATS_EXPORTING);
            n.put(j, AppStatsState.APP_STATS_LOGGING_SESSION);
            n.put(l, AppStatsState.APP_STATS_UPGRADING);
        }
        return (AppStatsState)n.get(this);
    }

    static 
    {
        a = new a("STATE_UNINITIALIZED", 0);
        b = new a("STATE_INITIALIZING", 1);
        c = new a("STATE_INITIALIZED", 2);
        d = new a("STATE_PURGING", 3);
        e = new a("STATE_RECORDING", 4);
        f = new a("STATE_WRITING", 5);
        g = new a("STATE_RECORDING_WRITING", 6);
        h = new a("STATE_EXPORTING", 7);
        i = new a("STATE_BEGINNING_SESSION", 8);
        j = new a("STATE_LOGGING_SESSION", 9);
        k = new a("STATE_ENDING_SESSION", 10);
        l = new a("STATE_UPGRADING", 11);
        m = new a("STATE_ANY", 12);
        o = (new a[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m
        });
    }
}
