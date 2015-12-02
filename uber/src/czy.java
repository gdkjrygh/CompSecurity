// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class czy extends czs
{

    private final cev a;
    private final cyz b;
    private boolean c;

    public czy(cyz cyz, cev cev1)
    {
        c = false;
        b = cyz;
        a = cev1;
    }

    public final void a()
    {
        if (!c)
        {
            a.a(b);
            c = true;
        }
    }

    public final void b()
    {
        if (c)
        {
            a.b(b);
            c = false;
        }
    }
}
