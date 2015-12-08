// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;

// Referenced classes of package com.google.android.gms.internal:
//            zzlc

public class zzla extends zzj
{

    public zzla(Context context, Looper looper, zzf zzf, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 39, zzf, connectioncallbacks, onconnectionfailedlistener);
    }

    protected IInterface zzV(IBinder ibinder)
    {
        return zzaO(ibinder);
    }

    protected zzlc zzaO(IBinder ibinder)
    {
        return zzlc.zza.zzaQ(ibinder);
    }

    public String zzfA()
    {
        return "com.google.android.gms.common.service.START";
    }

    protected String zzfB()
    {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }
}
