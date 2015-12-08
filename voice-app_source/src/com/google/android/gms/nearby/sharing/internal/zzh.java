// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.nearby.sharing.zzd;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            zze

public final class zzh
    implements zzd
{

    public static final com.google.android.gms.common.api.Api.ClientKey zzNX = new com.google.android.gms.common.api.Api.ClientKey();
    public static final com.google.android.gms.common.api.Api.zza zzNY = new com.google.android.gms.common.api.Api.zza() {

        public int getPriority()
        {
            return 0x7fffffff;
        }

        public com.google.android.gms.common.api.Api.Client zza(Context context, Looper looper, zze zze1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return zzr(context, looper, zze1, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
        }

        public com.google.android.gms.nearby.sharing.internal.zze zzr(Context context, Looper looper, zze zze1, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return new com.google.android.gms.nearby.sharing.internal.zze(context, looper, connectioncallbacks, onconnectionfailedlistener, zze1);
        }

    };

    public zzh()
    {
    }

}
