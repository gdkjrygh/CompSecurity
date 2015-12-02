// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gfq extends Enum
{

    public static final gfq a;
    public static final gfq b;
    public static final gfq c;
    public static final gfq d;
    public static final gfq e;
    public static final gfq f;
    public static final gfq g;
    public static final gfq h;
    public static final gfq i;
    public static final gfq j;
    private static final gfq n[];
    private final int k;
    private final int l;
    private final String m;

    private gfq(String s, int i1, int j1, int k1, String s1)
    {
        super(s, i1);
        k = j1;
        l = k1;
        m = s1;
    }

    public static gfq valueOf(String s)
    {
        return (gfq)Enum.valueOf(gfq, s);
    }

    public static gfq[] values()
    {
        return (gfq[])n.clone();
    }

    final int a()
    {
        return k;
    }

    final int b()
    {
        return l;
    }

    public final String c()
    {
        return m;
    }

    static 
    {
        a = new gfq("HIDDEN", 0, 0, 0, null);
        b = new gfq("DRIVER", 1, gfr.a, 0, "none");
        c = new gfq("DRIVER_WITH_MUSIC", 2, gfr.a, gfr.c, "none");
        d = new gfq("DRIVER_WITH_POOL", 3, gfr.a, gfr.d, "uberpool");
        e = new gfq("DRIVER_WITH_SAFETY_NET", 4, gfr.a, gfr.f, "safety_net");
        f = new gfq("TRIP_ACTIONS", 5, gfr.b, gfr.a, "tray_actions");
        g = new gfq("TRIP_MUSIC", 6, gfr.c, gfr.a, "unison");
        h = new gfq("TRIP_POOL", 7, gfr.d, gfr.a, "uberpool");
        i = new gfq("RIDER_PROFILES", 8, gfr.a, gfr.e, "none");
        j = new gfq("RIDER_PROFILES_PICKER", 9, gfr.e, 0, "none");
        n = (new gfq[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }
}
