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
//            zzjo

public class zzjq extends zzi
{

    public zzjq(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 87, connectioncallbacks, onconnectionfailedlistener);
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzav(ibinder);
    }

    protected zzjo zzav(IBinder ibinder)
    {
        return zzjo.zza.zzau(ibinder);
    }
}
