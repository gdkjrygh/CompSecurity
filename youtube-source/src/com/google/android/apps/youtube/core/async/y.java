// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            af, z

public final class y
    implements af
{

    private final af a;
    private final AtomicLong b;
    private final b c;

    public y(af af1, AtomicLong atomiclong, b b1)
    {
        a = (af)com.google.android.apps.youtube.common.fromguava.c.a(af1);
        b = (AtomicLong)com.google.android.apps.youtube.common.fromguava.c.a(atomiclong, "lastEventTime may not be null");
        c = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
    }

    static b a(y y1)
    {
        return y1.c;
    }

    static AtomicLong b(y y1)
    {
        return y1.b;
    }

    public final void a(Object obj, com.google.android.apps.youtube.common.a.b b1)
    {
        a.a(obj, new z(this, b1));
    }
}
