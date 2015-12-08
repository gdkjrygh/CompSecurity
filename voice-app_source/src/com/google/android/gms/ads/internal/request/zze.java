// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.zzi;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzi

public class zze extends zzi
{

    final int zzCk;

    public zze(Context context, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, int i)
    {
        super(context, context.getMainLooper(), 8, connectioncallbacks, onconnectionfailedlistener);
        zzCk = i;
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.ads.service.START";
    }

    protected com.google.android.gms.ads.internal.request.zzi zzS(IBinder ibinder)
    {
        return zzi.zza.zzU(ibinder);
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzS(ibinder);
    }

    public com.google.android.gms.ads.internal.request.zzi zzfy()
        throws DeadObjectException
    {
        return (com.google.android.gms.ads.internal.request.zzi)super.zznM();
    }
}
