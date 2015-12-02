// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.NoSuchElementException;

final class ifm extends ick
{

    private final ick a;
    private final boolean b;
    private final Object c;
    private Object d;
    private boolean e;
    private boolean f;

    ifm(ick ick1, boolean flag, Object obj)
    {
        e = false;
        f = false;
        a = ick1;
        b = flag;
        c = obj;
    }

    public final void a()
    {
label0:
        {
            if (!f)
            {
                if (!e)
                {
                    break label0;
                }
                a.a(d);
                a.a();
            }
            return;
        }
        if (b)
        {
            a.a(c);
            a.a();
            return;
        } else
        {
            a.a(new NoSuchElementException("Sequence contains no elements"));
            return;
        }
    }

    public final void a(Object obj)
    {
        if (e)
        {
            f = true;
            a.a(new IllegalArgumentException("Sequence contains too many elements"));
            b();
            return;
        } else
        {
            d = obj;
            e = true;
            return;
        }
    }

    public final void a(Throwable throwable)
    {
        a.a(throwable);
    }

    final void e()
    {
        a(2L);
    }
}
