// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.signin.internal.zzg;
import com.google.android.gms.signin.internal.zzh;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.internal:
//            zzmc, zzme

public final class zzmb
{

    public static final Api API;
    public static final com.google.android.gms.common.api.Api.zzc zzKh;
    public static final com.google.android.gms.common.api.Api.zzb zzKi;
    public static final zzmc zzaBC = new zzg();

    static 
    {
        zzKh = new com.google.android.gms.common.api.Api.zzc();
        zzKi = new com.google.android.gms.common.api.Api.zzb() {

            public int getPriority()
            {
                return 0x7fffffff;
            }

            public volatile com.google.android.gms.common.api.Api.zza zza(Context context, Looper looper, zze zze, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zza(context, looper, zze, (zzme)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzh zza(Context context, Looper looper, zze zze, zzme zzme1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                if (zzme1 == null)
                {
                    zzme1 = zzme.zzaBD;
                }
                return new zzh(context, looper, zze, zzme1, connectioncallbacks, onconnectionfailedlistener, Executors.newSingleThreadExecutor());
            }

        };
        API = new Api("SignIn.API", zzKi, zzKh, new Scope[0]);
    }
}
