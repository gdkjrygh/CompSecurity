// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzn, zzg

public class zzb extends zzi
{

    protected final zzn zzayq = new zzn() {

        final zzb zzayx;

        public void zznL()
        {
            zzb.zza(zzayx);
        }

        public IInterface zznM()
            throws DeadObjectException
        {
            return zzut();
        }

        public zzg zzut()
            throws DeadObjectException
        {
            return (zzg)zzayx.zznM();
        }

            
            {
                zzayx = zzb.this;
                super();
            }
    };
    private final String zzayw;

    public zzb(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, zze zze)
    {
        super(context, looper, 23, connectioncallbacks, onconnectionfailedlistener, zze);
        zzayw = s;
    }

    static void zza(zzb zzb1)
    {
        zzb1.zznL();
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzbU(ibinder);
    }

    protected zzg zzbU(IBinder ibinder)
    {
        return zzg.zza.zzbW(ibinder);
    }

    protected Bundle zzkR()
    {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", zzayw);
        return bundle;
    }
}
