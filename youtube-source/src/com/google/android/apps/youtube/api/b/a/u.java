// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.ConditionVariable;
import com.google.android.apps.youtube.api.ApiPlayer;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            d

final class u
    implements Runnable
{

    final AtomicReference a;
    final ConditionVariable b;
    final d c;

    u(d d1, AtomicReference atomicreference, ConditionVariable conditionvariable)
    {
        c = d1;
        a = atomicreference;
        b = conditionvariable;
        super();
    }

    public final void run()
    {
        a.set(d.a(c).q());
        b.open();
    }
}
