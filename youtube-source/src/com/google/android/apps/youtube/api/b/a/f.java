// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.ConditionVariable;
import com.google.android.apps.youtube.api.ApiPlayer;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            d

final class f
    implements Runnable
{

    final AtomicBoolean a;
    final ConditionVariable b;
    final d c;

    f(d d1, AtomicBoolean atomicboolean, ConditionVariable conditionvariable)
    {
        c = d1;
        a = atomicboolean;
        b = conditionvariable;
        super();
    }

    public final void run()
    {
        a.set(d.a(c).l());
        b.open();
    }
}
