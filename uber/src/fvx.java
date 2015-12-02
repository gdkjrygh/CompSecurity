// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.analytics.model.AnalyticsEvent;

public final class fvx extends Enum
{

    public static final fvx a;
    private static final fvx h[];
    public int b;
    public int c;
    public float d;
    public AnalyticsEvent e;
    public AnalyticsEvent f;
    public int g;

    private fvx(String s, AnalyticsEvent analyticsevent, AnalyticsEvent analyticsevent1)
    {
        super(s, 0);
        g = 0x7f07004d;
        b = 0x7f07004c;
        c = 0x7f020188;
        d = 1.0F;
        e = analyticsevent;
        f = analyticsevent1;
    }

    public static fvx valueOf(String s)
    {
        return (fvx)Enum.valueOf(fvx, s);
    }

    public static fvx[] values()
    {
        return (fvx[])h.clone();
    }

    static 
    {
        a = new fvx("PICKUP_NOTE", AnalyticsEvent.create("impression").setName(l.eD), AnalyticsEvent.create("tap").setName(n.cU).setValue("tutorial"));
        h = (new fvx[] {
            a
        });
    }
}
