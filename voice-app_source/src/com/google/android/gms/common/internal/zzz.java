// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzi, zze

public class zzz extends zzi
{

    private final com.google.android.gms.common.api.Api.zzb zzabf;

    public zzz(Context context, Looper looper, int i, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, zze zze, com.google.android.gms.common.api.Api.zzb zzb)
    {
        super(context, looper, i, connectioncallbacks, onconnectionfailedlistener, zze);
        zzabf = zzb;
    }

    protected String getServiceDescriptor()
    {
        return zzabf.getServiceDescriptor();
    }

    protected String getStartServiceAction()
    {
        return zzabf.getStartServiceAction();
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzabf.zzT(ibinder);
    }
}
