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
//            zzkr

public class zzkp extends zzi
{

    public zzkp(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 39, connectioncallbacks, onconnectionfailedlistener);
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    public String getStartServiceAction()
    {
        return "com.google.android.gms.common.service.START";
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzaK(ibinder);
    }

    protected zzkr zzaK(IBinder ibinder)
    {
        return zzkr.zza.zzaM(ibinder);
    }
}
