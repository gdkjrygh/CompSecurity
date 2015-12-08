// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.net.async;


// Referenced classes of package com.google.android.apps.ytremote.fork.net.async:
//            c, p, b

public final class w
    implements c, Runnable
{

    private final p a;

    private w(p p1)
    {
        if (p1 == null)
        {
            throw new NullPointerException("dispatcher cannot be null");
        } else
        {
            a = p1;
            return;
        }
    }

    public static w a(p p1, long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("delayMs cannot be negative: ")).append(l).toString());
        }
        w w1 = new w(p1);
        if (l == 0L)
        {
            p1.execute(w1);
            return w1;
        } else
        {
            p1.a(l, null, w1);
            return w1;
        }
    }

    public final void a(b b)
    {
        a.b();
    }

    public final void run()
    {
        a.b();
    }
}
