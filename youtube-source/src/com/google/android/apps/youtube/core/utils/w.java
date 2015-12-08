// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.core.utils:
//            x

public abstract class w
{

    private boolean a;
    private Binder b;
    private final Class c;
    private final ServiceConnection d = new x(this);

    public w(Class class1)
    {
        c = (Class)com.google.android.apps.youtube.common.fromguava.c.a(class1);
    }

    static Binder a(w w1, Binder binder)
    {
        w1.b = binder;
        return binder;
    }

    static boolean a(w w1)
    {
        return w1.a;
    }

    static Binder b(w w1)
    {
        return w1.b;
    }

    public final Binder a()
    {
        return b;
    }

    public final void a(Context context)
    {
        if (!a)
        {
            a = true;
            Intent intent = new Intent(context, c);
            if (!context.bindService(intent, d, 1))
            {
                throw new RuntimeException((new StringBuilder("Could not bind to ")).append(intent).toString());
            }
        }
    }

    protected abstract void a(Binder binder);

    public final void b(Context context)
    {
        if (a)
        {
            a = false;
            if (b != null)
            {
                a(b);
            }
            context.unbindService(d);
        }
    }

    protected abstract void b(Binder binder);
}
