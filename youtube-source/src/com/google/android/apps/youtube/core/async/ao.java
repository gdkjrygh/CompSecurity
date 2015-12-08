// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.cache.a;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            an, Timestamped

final class ao
    implements b
{

    final an a;
    private final b b;

    public ao(an an1, b b1)
    {
        a = an1;
        super();
        b = b1;
    }

    public final void a(Object obj, Exception exception)
    {
        b.a(obj, exception);
    }

    public final void a(Object obj, Object obj1)
    {
        com.google.android.apps.youtube.core.async.an.b(a).a(a.a(obj), new Timestamped(obj1, com.google.android.apps.youtube.core.async.an.a(a).a()));
        b.a(obj, obj1);
    }
}
