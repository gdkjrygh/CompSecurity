// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.analytics.model.AnalyticsEvent;

public final class eew
{

    public static final eew a = (new eex()).a(true).b();
    public static final eew b = (new eex()).a(false).b();
    private cif c;
    private String d;
    private String e;
    private String f;
    private boolean g;
    private boolean h;

    private eew()
    {
    }

    eew(byte byte0)
    {
        this();
    }

    static cif a(eew eew1, cif cif)
    {
        eew1.c = cif;
        return cif;
    }

    static String a(eew eew1, String s)
    {
        eew1.d = s;
        return s;
    }

    static boolean a(eew eew1, boolean flag)
    {
        eew1.h = flag;
        return flag;
    }

    static String b(eew eew1, String s)
    {
        eew1.e = s;
        return s;
    }

    static boolean b(eew eew1, boolean flag)
    {
        eew1.g = flag;
        return flag;
    }

    static String c(eew eew1, String s)
    {
        eew1.f = s;
        return s;
    }

    public final AnalyticsEvent a()
    {
        return AnalyticsEvent.create(d).setName(c).setValue(e).setReferrer(f);
    }

    public final boolean b()
    {
        return d != null && c != null;
    }

    public final boolean c()
    {
        return g;
    }

    public final boolean d()
    {
        return h;
    }

}
