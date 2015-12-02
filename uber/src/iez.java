// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Queue;

final class iez extends ick
{

    static final int f;
    final ifb a;
    final long b;
    volatile boolean c;
    volatile igg d;
    int e;

    public iez(ifb ifb1, long l)
    {
        a = ifb1;
        b = l;
    }

    public final void a()
    {
        c = true;
        a.f();
    }

    public final void a(Object obj)
    {
        a.a(this, obj);
    }

    public final void a(Throwable throwable)
    {
        c = true;
        a.e().offer(throwable);
        a.f();
    }

    public final void b(long l)
    {
        int i = e - (int)l;
        if (i > f)
        {
            e = i;
        } else
        {
            e = igg.c;
            i = igg.c - i;
            if (i > 0)
            {
                a(i);
                return;
            }
        }
    }

    public final void d()
    {
        e = igg.c;
        a(igg.c);
    }

    static 
    {
        f = igg.c / 4;
    }
}
