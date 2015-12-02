// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class daa extends czt
{

    private final czb a;
    private final cev b;
    private boolean c;

    public daa(czb czb, cev cev1)
    {
        c = false;
        a = czb;
        b = cev1;
    }

    public final void a()
    {
        if (!c)
        {
            b.a(a);
            c = true;
        }
    }

    public final void b()
    {
        if (c)
        {
            b.b(a);
            c = false;
        }
    }
}
