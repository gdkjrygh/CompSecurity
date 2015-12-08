// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzjl

public final class zzjj extends zzi
{

    private final Bundle zzOR;

    public zzjj(Context context, Looper looper, zze zze1, com.google.android.gms.auth.api.Auth.zza zza, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 16, connectioncallbacks, onconnectionfailedlistener, zze1);
        if (zza == null)
        {
            context = new Bundle();
        } else
        {
            context = zza.zzkY();
        }
        zzOR = context;
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.auth.service.START";
    }

    public boolean requiresSignIn()
    {
        zze zze1 = zznK();
        return !TextUtils.isEmpty(zze1.getAccountName()) && !zze1.zzb(Auth.zzOL).isEmpty();
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzar(ibinder);
    }

    protected zzjl zzar(IBinder ibinder)
    {
        return zzjl.zza.zzat(ibinder);
    }

    protected Bundle zzkR()
    {
        return zzOR;
    }
}
