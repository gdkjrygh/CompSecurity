// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzi;

// Referenced classes of package com.google.android.gms.internal:
//            zzpi, zzph

public class zzpk extends zzi
{

    public zzpk(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 45, connectioncallbacks, onconnectionfailedlistener);
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.safetynet.service.START";
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzdy(ibinder);
    }

    public void zza(zzph zzph, byte abyte0[])
        throws RemoteException
    {
        ((zzpi)zznM()).zza(zzph, abyte0);
    }

    protected zzpi zzdy(IBinder ibinder)
    {
        return zzpi.zza.zzdx(ibinder);
    }
}
