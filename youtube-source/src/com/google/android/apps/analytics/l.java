// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import android.os.Handler;

// Referenced classes of package com.google.android.apps.analytics:
//            h, j, m, p

final class l
    implements h
{

    final j a;

    l(j j1)
    {
        a = j1;
        super();
    }

    public final void a()
    {
        j.a(a).post(new m(this));
    }

    public final void a(long l1)
    {
        j.b(a).a(l1);
    }
}
