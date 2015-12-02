// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eex
{

    private boolean a;
    private boolean b;
    private cif c;
    private String d;
    private String e;
    private String f;

    public eex()
    {
        a = true;
        b = false;
        d = "tap";
    }

    public final eex a()
    {
        b = true;
        return this;
    }

    public final eex a(cif cif)
    {
        c = cif;
        return this;
    }

    public final eex a(String s)
    {
        f = s;
        return this;
    }

    public final eex a(boolean flag)
    {
        a = flag;
        return this;
    }

    public final eew b()
    {
        eew eew1 = new eew((byte)0);
        eew.a(eew1, a);
        eew.b(eew1, b);
        eew.a(eew1, d);
        eew.a(eew1, c);
        eew.b(eew1, e);
        eew.c(eew1, f);
        return eew1;
    }

    public final eex b(String s)
    {
        e = s;
        return this;
    }
}
