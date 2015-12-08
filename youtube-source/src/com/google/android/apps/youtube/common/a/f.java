// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.a;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.android.apps.youtube.common.a:
//            b, g

public abstract class f
    implements b
{

    private static final LinkedBlockingQueue a = new LinkedBlockingQueue();
    private final b b;

    public f(b b1)
    {
        b = (b)c.a(b1);
    }

    private static g a()
    {
        g g1 = (g)a.poll();
        if (g1 != null)
        {
            return g1;
        } else
        {
            return new g((byte)0);
        }
    }

    static void a(g g1)
    {
        try
        {
            a.put(g1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (g g1)
        {
            L.b("Interrupted when releasing runnable to the queue", g1);
        }
    }

    public final void a(Object obj, Exception exception)
    {
        g g1 = a();
        g1.a(b, obj, exception);
        a(((Runnable) (g1)));
    }

    public final void a(Object obj, Object obj1)
    {
        g g1 = a();
        g1.a(b, obj, obj1);
        a(((Runnable) (g1)));
    }

    protected abstract void a(Runnable runnable);

}
