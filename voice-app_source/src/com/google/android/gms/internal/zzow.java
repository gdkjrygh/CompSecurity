// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.zzi;

// Referenced classes of package com.google.android.gms.internal:
//            zzou

public class zzow extends zzi
{

    public zzow(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 3, connectioncallbacks, onconnectionfailedlistener);
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.panorama.internal.IPanoramaService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.panorama.service.START";
    }

    public IInterface zzT(IBinder ibinder)
    {
        return zzdo(ibinder);
    }

    public zzou zzdo(IBinder ibinder)
    {
        return zzou.zza.zzdn(ibinder);
    }
}
