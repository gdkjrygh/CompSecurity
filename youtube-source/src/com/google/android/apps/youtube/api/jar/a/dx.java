// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.api.jar.h;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            dt

final class dx
    implements Runnable
{

    final int a;
    final int b;
    final dt c;

    dx(dt dt1, int i, int j)
    {
        c = dt1;
        a = i;
        b = j;
        super();
    }

    public final void run()
    {
        dt.a(c).setVideoSize(a, b);
    }
}
