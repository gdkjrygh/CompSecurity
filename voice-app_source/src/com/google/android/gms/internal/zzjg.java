// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;

// Referenced classes of package com.google.android.gms.internal:
//            zzji

public class zzjg extends zzi
{

    public zzjg(Context context, Looper looper, zze zze, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 74, connectioncallbacks, onconnectionfailedlistener, zze);
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.auth.api.accountstatus.internal.IAccountStatusService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.auth.api.accountstatus.START";
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzam(ibinder);
    }

    protected zzji zzam(IBinder ibinder)
    {
        return zzji.zza.zzao(ibinder);
    }
}
