// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzpa;
import com.google.android.gms.internal.zzpb;
import com.google.android.gms.internal.zzpc;
import com.google.android.gms.internal.zzpd;
import com.google.android.gms.internal.zzpe;
import com.google.android.gms.plus.internal.zze;

// Referenced classes of package com.google.android.gms.plus:
//            Account, Moments, People, zzb, 
//            zza

public final class Plus
{

    public static final Api API;
    public static final Account AccountApi = new zzpa();
    public static final Moments MomentsApi = new zzpd();
    public static final People PeopleApi = new zzpe();
    public static final Scope SCOPE_PLUS_LOGIN = new Scope("https://www.googleapis.com/auth/plus.login");
    public static final Scope SCOPE_PLUS_PROFILE = new Scope("https://www.googleapis.com/auth/plus.me");
    public static final com.google.android.gms.common.api.Api.ClientKey zzNX;
    static final com.google.android.gms.common.api.Api.zza zzNY;
    public static final zzb zzaGZ = new zzpc();
    public static final zza zzaHa = new zzpb();

    private Plus()
    {
    }

    public static zze zzf(GoogleApiClient googleapiclient, boolean flag)
    {
        boolean flag1;
        if (googleapiclient != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        zzu.zzb(flag1, "GoogleApiClient parameter is required.");
        zzu.zza(googleapiclient.isConnected(), "GoogleApiClient must be connected.");
        zzu.zza(googleapiclient.zza(API), "GoogleApiClient is not configured to use the Plus.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature.");
        flag1 = googleapiclient.hasConnectedApi(API);
        if (flag && !flag1)
        {
            throw new IllegalStateException("GoogleApiClient has an optional Plus.API and is not connected to Plus. Use GoogleApiClient.hasConnectedApi(Plus.API) to guard this call.");
        }
        if (flag1)
        {
            return (zze)googleapiclient.zza(zzNX);
        } else
        {
            return null;
        }
    }

    static 
    {
        zzNX = new com.google.android.gms.common.api.Api.ClientKey();
        zzNY = new _cls1();
        API = new Api("Plus.API", zzNY, zzNX, new Scope[0]);
    }

    // Unreferenced inner class com/google/android/gms/plus/Plus$PlusOptions
    /* block-local class not found */
    class PlusOptions {}


    // Unreferenced inner class com/google/android/gms/plus/Plus$zza
    /* block-local class not found */
    class zza {}


    /* member class not found */
    class _cls1 {}

}
