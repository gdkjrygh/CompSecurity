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
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzn, zzg

public class zzb extends zzj
{

    protected final zzn zzaCs = new zzn() {

        final zzb zzaCz;

        public IInterface zzoA()
            throws DeadObjectException
        {
            return zzvN();
        }

        public void zzoz()
        {
            zzb.zza(zzaCz);
        }

        public zzg zzvN()
            throws DeadObjectException
        {
            return (zzg)zzaCz.zzoA();
        }

            
            {
                zzaCz = zzb.this;
                super();
            }
    };
    private final String zzaCy;

    public zzb(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, zzf zzf)
    {
        super(context, looper, 23, zzf, connectioncallbacks, onconnectionfailedlistener);
        zzaCy = s;
    }

    static void zza(zzb zzb1)
    {
        zzb1.zzoz();
    }

    protected IInterface zzV(IBinder ibinder)
    {
        return zzbY(ibinder);
    }

    protected zzg zzbY(IBinder ibinder)
    {
        return zzg.zza.zzca(ibinder);
    }

    protected String zzfA()
    {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected String zzfB()
    {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    protected Bundle zzli()
    {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", zzaCy);
        return bundle;
    }
}
