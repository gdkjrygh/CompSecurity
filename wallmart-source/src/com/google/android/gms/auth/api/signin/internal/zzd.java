// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.zze;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.auth.api.signin.internal:
//            zzb

public class zzd extends zzj
{

    private final zze zzRS;

    public zzd(Context context, Looper looper, zzf zzf, zze zze1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 87, zzf, connectioncallbacks, onconnectionfailedlistener);
        zzRS = (zze)zzx.zzv(zze1);
    }

    protected IInterface zzV(IBinder ibinder)
    {
        return zzaz(ibinder);
    }

    protected zzb zzaz(IBinder ibinder)
    {
        return zzb.zza.zzay(ibinder);
    }

    protected String zzfA()
    {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    protected String zzfB()
    {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }
}
