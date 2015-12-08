// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.d;

import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;

// Referenced classes of package com.google.android.apps.youtube.common.d:
//            a

public class g extends com.google.android.apps.youtube.common.d.a
{

    public static final String a = com/google/android/apps/youtube/common/d/g.getCanonicalName();
    private final h b;

    public g(a a1, h h1)
    {
        super(a1);
        b = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        a1.a(this);
    }

    public final String b()
    {
        return a;
    }

    protected final boolean c()
    {
        return b.a();
    }

    public void handleConnectivityChangedEvent(com.google.android.apps.youtube.common.network.a a1)
    {
        if (a1.a())
        {
            a();
        }
    }

}
