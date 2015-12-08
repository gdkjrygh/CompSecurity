// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.identity.v;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            hj

abstract class ib
    implements v
{

    final hj b;

    private ib(hj hj1)
    {
        b = hj1;
        super();
    }

    ib(hj hj1, byte byte0)
    {
        this(hj1);
    }

    public final void a(Exception exception)
    {
        hj.a(b).c(exception);
    }

    public final void b()
    {
    }
}
