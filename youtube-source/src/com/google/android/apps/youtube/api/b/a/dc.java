// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;


// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            db, cv

final class dc
    implements Runnable
{

    final db a;

    dc(db db1)
    {
        a = db1;
        super();
    }

    public final void run()
    {
        if (cv.d(a.b) == null)
        {
            throw new IllegalStateException("onSurfaceCreated called with surface == null");
        } else
        {
            cv.c(a.b);
            return;
        }
    }
}
