// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dqx extends dcq
{

    private dqy a[];
    private dqz b;
    private boolean c;

    public transient dqx(dqz dqz1, dqy adqy[])
    {
        a = adqy;
        b = dqz1;
    }

    protected final void a()
    {
        b.a();
    }

    protected final void b()
    {
        b.b();
    }

    public final void c()
    {
        c = false;
        b.c();
    }

    public final void f()
    {
        if (c)
        {
            return;
        }
        dqy adqy[] = a;
        int j = adqy.length;
        for (int i = 0; i < j; i++)
        {
            dqy dqy1 = adqy[i];
            b.a(dqy1.c(), dqy1.a(), dqy1.b());
        }

        c = true;
    }
}
