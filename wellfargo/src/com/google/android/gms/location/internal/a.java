// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.m;

// Referenced classes of package com.google.android.gms.location.internal:
//            b, m, z, l

public class a extends m
{

    protected final z d = new b(this);
    private final String e;

    public a(Context context, Looper looper, q q, r r, String s, h h)
    {
        super(context, looper, 23, h, q, r);
        e = s;
    }

    static void a(a a1)
    {
        a1.l();
    }

    protected IInterface a(IBinder ibinder)
    {
        return b(ibinder);
    }

    protected l b(IBinder ibinder)
    {
        return m.a(ibinder);
    }

    protected String d()
    {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected String e()
    {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    protected Bundle k()
    {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", e);
        return bundle;
    }
}
