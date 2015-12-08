// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.ConditionVariable;
import android.view.SurfaceHolder;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ej

final class em
    implements Runnable
{

    final AtomicReference a;
    final ConditionVariable b;
    final ej c;

    em(ej ej1, AtomicReference atomicreference, ConditionVariable conditionvariable)
    {
        c = ej1;
        a = atomicreference;
        b = conditionvariable;
        super();
    }

    public final void run()
    {
        if (ej.d(c) != null)
        {
            a.set(ej.d(c).getSurfaceFrame());
        }
        b.open();
    }
}
