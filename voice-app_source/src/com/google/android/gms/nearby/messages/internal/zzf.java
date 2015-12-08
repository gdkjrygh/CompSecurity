// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            zzc

class zzf extends zzi
{

    private String zzOe;
    private String zzaGa;

    zzf(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, zze zze1, com.google.android.gms.nearby.messages.zze zze2)
    {
        super(context, looper, 62, connectioncallbacks, onconnectionfailedlistener, zze1);
        zzOe = zze1.zzny();
        if (zze2 != null)
        {
            zzaGa = zze2.zzayp;
        }
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
    }

    public boolean requiresAccount()
    {
        return true;
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzdg(ibinder);
    }

    protected zzc zzdg(IBinder ibinder)
    {
        return zzc.zza.zzdf(ibinder);
    }
}
