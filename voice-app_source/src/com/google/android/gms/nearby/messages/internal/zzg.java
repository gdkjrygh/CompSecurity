// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.nearby.messages.zzc;
import com.google.android.gms.nearby.messages.zze;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            zzf

public class zzg
    implements zzc
{

    public static final com.google.android.gms.common.api.Api.ClientKey zzNX = new com.google.android.gms.common.api.Api.ClientKey();
    public static final com.google.android.gms.common.api.Api.zza zzNY = new com.google.android.gms.common.api.Api.zza() {

        public int getPriority()
        {
            return 0x7fffffff;
        }

        public volatile com.google.android.gms.common.api.Api.Client zza(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return zza(context, looper, zze1, (zze)obj, connectioncallbacks, onconnectionfailedlistener);
        }

        public zzf zza(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, zze zze2, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return new zzf(context, looper, connectioncallbacks, onconnectionfailedlistener, zze1, zze2);
        }

    };

    public zzg()
    {
    }

}
