// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzll;
import com.google.android.gms.internal.zzlm;
import com.google.android.gms.internal.zzln;
import com.google.android.gms.internal.zzlo;
import com.google.android.gms.internal.zzlp;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.internal.PlusSession;
import com.google.android.gms.plus.internal.zze;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus:
//            Account, Moments, People, zzb, 
//            zza

public final class Plus
{
    public static final class PlusOptions
        implements com.google.android.gms.common.api.Api.ApiOptions.Optional
    {

        final String zzayN;
        final Set zzayO;

        private PlusOptions()
        {
            zzayN = null;
            zzayO = new HashSet();
        }


        private PlusOptions(Builder builder)
        {
            zzayN = builder.zzayN;
            zzayO = builder.zzayO;
        }

    }

    public static final class PlusOptions.Builder
    {

        String zzayN;
        final Set zzayO = new HashSet();

        public PlusOptions build()
        {
            return new PlusOptions(this);
        }

        public PlusOptions.Builder()
        {
        }
    }

    public static abstract class zza extends com.google.android.gms.common.api.zza.zza
    {

        public zza(GoogleApiClient googleapiclient)
        {
            super(Plus.zzKh, googleapiclient);
        }
    }


    public static final Api API;
    public static final Account AccountApi = new zzll();
    public static final Moments MomentsApi = new zzlo();
    public static final People PeopleApi = new zzlp();
    public static final Scope SCOPE_PLUS_LOGIN = new Scope("https://www.googleapis.com/auth/plus.login");
    public static final Scope SCOPE_PLUS_PROFILE = new Scope("https://www.googleapis.com/auth/plus.me");
    public static final com.google.android.gms.common.api.Api.zzc zzKh;
    static final com.google.android.gms.common.api.Api.zzb zzKi;
    public static final zzb zzayL = new zzln();
    public static final com.google.android.gms.plus.zza zzayM = new zzlm();

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
        zzv.zzb(flag1, "GoogleApiClient parameter is required.");
        zzv.zza(googleapiclient.isConnected(), "GoogleApiClient must be connected.");
        zzv.zza(googleapiclient.zza(API), "GoogleApiClient is not configured to use the Plus.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature.");
        flag1 = googleapiclient.hasConnectedApi(API);
        if (flag && !flag1)
        {
            throw new IllegalStateException("GoogleApiClient has an optional Plus.API and is not connected to Plus. Use GoogleApiClient.hasConnectedApi(Plus.API) to guard this call.");
        }
        if (flag1)
        {
            return (zze)googleapiclient.zza(zzKh);
        } else
        {
            return null;
        }
    }

    static 
    {
        zzKh = new com.google.android.gms.common.api.Api.zzc();
        zzKi = new com.google.android.gms.common.api.Api.zzb() {

            public int getPriority()
            {
                return 2;
            }

            public volatile com.google.android.gms.common.api.Api.zza zza(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zza(context, looper, zze1, (PlusOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zze zza(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, PlusOptions plusoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                PlusOptions plusoptions1 = plusoptions;
                if (plusoptions == null)
                {
                    plusoptions1 = new PlusOptions();
                }
                plusoptions = zze1.zzlC();
                String as1[] = zzif.zzc(zze1.zzlG());
                String as[] = (String[])plusoptions1.zzayO.toArray(new String[0]);
                String s = context.getPackageName();
                String s1 = context.getPackageName();
                PlusCommonExtras pluscommonextras = new PlusCommonExtras();
                return new zze(context, looper, zze1, new PlusSession(plusoptions, as1, as, new String[0], s, s1, null, pluscommonextras), connectioncallbacks, onconnectionfailedlistener);
            }

        };
        API = new Api("Plus.API", zzKi, zzKh, new Scope[0]);
    }
}
