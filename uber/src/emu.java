// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class emu
{

    private String a;
    private String b;
    private Boolean c;
    private Boolean d;

    public emu()
    {
        a = "";
        b = "";
        c = Boolean.valueOf(false);
        d = Boolean.valueOf(true);
    }

    public final String a()
    {
        return a;
    }

    public final void a(Boolean boolean1)
    {
        c = boolean1;
    }

    public final void a(String s)
    {
        a = s;
    }

    public final Boolean b()
    {
        return c;
    }

    public final void b(Boolean boolean1)
    {
        d = boolean1;
    }

    public final void b(String s)
    {
        b = s;
    }

    public final Boolean c()
    {
        return d;
    }
}
