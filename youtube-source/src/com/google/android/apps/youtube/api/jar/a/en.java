// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.os.ConditionVariable;
import android.view.SurfaceHolder;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ej

final class en
    implements Runnable
{

    final AtomicBoolean a;
    final ConditionVariable b;
    final ej c;

    en(ej ej1, AtomicBoolean atomicboolean, ConditionVariable conditionvariable)
    {
        c = ej1;
        a = atomicboolean;
        b = conditionvariable;
        super();
    }

    public final void run()
    {
        if (ej.d(c) != null)
        {
            a.set(ej.d(c).isCreating());
        }
        b.open();
    }
}
