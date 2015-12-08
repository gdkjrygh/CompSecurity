// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.api.jar.h;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            dt

final class dw
    implements Runnable
{

    final dt a;

    dw(dt dt1)
    {
        a = dt1;
        super();
    }

    public final void run()
    {
        dt.a(a).b();
    }
}
