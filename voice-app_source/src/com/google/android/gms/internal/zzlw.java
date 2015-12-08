// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.fitness.zza;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzlv

public abstract class zzlw extends zzi
{

    protected zzlw(Context context, Looper looper, int i, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, zze zze)
    {
        super(context, looper, i, connectioncallbacks, onconnectionfailedlistener, zze);
    }

    public boolean requiresAccount()
    {
        return true;
    }

    public boolean requiresSignIn()
    {
        return !zzlv.zzam(getContext());
    }

    protected Set zza(Set set)
    {
        return com.google.android.gms.fitness.zza.zzd(set);
    }
}
