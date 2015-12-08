// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.r;

// Referenced classes of package com.google.android.gms.common.internal:
//            m, h

public class c extends m
{

    private final j d;

    public c(Context context, Looper looper, int i, q q, r r, h h, j j1)
    {
        super(context, looper, i, h, q, r);
        d = j1;
    }

    protected IInterface a(IBinder ibinder)
    {
        return d.a(ibinder);
    }

    protected void a(int i, IInterface iinterface)
    {
        d.a(i, iinterface);
    }

    protected String d()
    {
        return d.a();
    }

    protected String e()
    {
        return d.b();
    }
}
