// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import android.app.Application;

// Referenced classes of package com.crashlytics.android.internal:
//            x, v

final class w
{

    final v a;

    private w(v v)
    {
        a = v;
        super();
    }

    w(v v, byte byte0)
    {
        this(v);
    }

    static void a(w w1, Application application)
    {
        if (application != null)
        {
            application.registerActivityLifecycleCallbacks(new x(w1));
        }
    }
}
