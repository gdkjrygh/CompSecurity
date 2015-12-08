// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;

// Referenced classes of package com.google.android.gms.auth.api.credentials.internal:
//            zzh

public final class zze extends zzj
{

    private final com.google.android.gms.auth.api.Auth.AuthCredentialsOptions zzRD;

    public zze(Context context, Looper looper, zzf zzf, com.google.android.gms.auth.api.Auth.AuthCredentialsOptions authcredentialsoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 68, zzf, connectioncallbacks, onconnectionfailedlistener);
        zzRD = authcredentialsoptions;
    }

    protected IInterface zzV(IBinder ibinder)
    {
        return zzar(ibinder);
    }

    protected zzh zzar(IBinder ibinder)
    {
        return zzh.zza.zzat(ibinder);
    }

    protected String zzfA()
    {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    protected String zzfB()
    {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    protected Bundle zzli()
    {
        if (zzRD == null)
        {
            return new Bundle();
        } else
        {
            return zzRD.zzli();
        }
    }
}
