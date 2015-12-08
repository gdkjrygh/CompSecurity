// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            e

final class h
    implements b
{

    final e a;

    h(e e)
    {
        a = e;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
        L.a("Error adding video to watch history", exception);
    }

    public final volatile void a(Object obj, Object obj1)
    {
    }
}
