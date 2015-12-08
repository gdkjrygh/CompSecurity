// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.api.jar.h;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            dt

final class dv
    implements Runnable
{

    final h a;
    final dt b;

    dv(dt dt, h h1)
    {
        b = dt;
        a = h1;
        super();
    }

    public final void run()
    {
        a.d();
    }
}
