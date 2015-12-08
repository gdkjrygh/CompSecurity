// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import android.os.Handler;
import android.os.Looper;

// Referenced classes of package com.crashlytics.android.internal:
//            b, t, C, s, 
//            f, m

public final class B extends b
{

    private final Handler b = new Handler(Looper.getMainLooper());

    public B(m m)
    {
        super(m);
    }

    static void a(B b1, Object obj)
    {
        b1.b.c(obj);
    }

    public final void c(Object obj)
    {
        if (obj instanceof t)
        {
            obj = (t)obj;
            if (Looper.myLooper() == Looper.getMainLooper())
            {
                super.c(obj);
                return;
            } else
            {
                b.post(new C(this, ((t) (obj))));
                return;
            }
        }
        if ((obj instanceof s) || (obj instanceof f))
        {
            super.c(obj);
            return;
        } else
        {
            throw new IllegalArgumentException("Posted argument must implement Event interface");
        }
    }
}
