// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;

// Referenced classes of package com.google.android.gms.internal:
//            fd, cq, fy, cp, 
//            fj

public final class cl extends fd
{

    private final int e;

    public cl(Context context, c c1, d d, int i)
    {
        super(context, c1, d, new String[0]);
        e = i;
    }

    protected final IInterface a(IBinder ibinder)
    {
        return cq.a(ibinder);
    }

    protected final String a()
    {
        return "com.google.android.gms.ads.service.START";
    }

    protected final void a(fy fy1, fj fj)
    {
        Bundle bundle = new Bundle();
        fy1.g(fj, e, h().getPackageName(), bundle);
    }

    protected final String b()
    {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public final cp c()
    {
        return (cp)super.j();
    }
}
