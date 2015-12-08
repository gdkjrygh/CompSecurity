// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.a;

import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.common.a:
//            f, b

public final class e extends f
{

    private final Handler a;
    private final Thread b;

    private e(Handler handler, b b1)
    {
        super(b1);
        a = (Handler)c.a(handler);
        b = handler.getLooper().getThread();
    }

    public static e a(Handler handler, b b1)
    {
        return new e(handler, b1);
    }

    protected final void a(Runnable runnable)
    {
        if (Thread.currentThread() != b)
        {
            a.post(runnable);
            return;
        } else
        {
            runnable.run();
            return;
        }
    }
}
