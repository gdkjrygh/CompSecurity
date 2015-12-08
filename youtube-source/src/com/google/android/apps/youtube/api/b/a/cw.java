// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.Handler;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            bb, cv, cy, cx

abstract class cw extends bb
{

    final cv a;

    private cw(cv cv1)
    {
        a = cv1;
        super();
    }

    cw(cv cv1, byte byte0)
    {
        this(cv1);
    }

    public final void a()
    {
        cv.a(a).post(new cy(this));
    }

    public final void a(int i, int j, int k)
    {
        cv.a(a).post(new cx(this, i, j, k));
    }
}
