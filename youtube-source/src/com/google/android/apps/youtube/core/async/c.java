// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            b, af

final class c
    implements Runnable
{

    final Object a;
    final b b;
    final com.google.android.apps.youtube.core.async.b c;

    c(com.google.android.apps.youtube.core.async.b b1, Object obj, b b2)
    {
        c = b1;
        a = obj;
        b = b2;
        super();
    }

    public final void run()
    {
        try
        {
            com.google.android.apps.youtube.core.async.b.a(c).a(a, b);
            return;
        }
        catch (Exception exception)
        {
            L.c("target requester should catch exception and pass to callback.onError");
            b.a(a, exception);
            return;
        }
    }
}
