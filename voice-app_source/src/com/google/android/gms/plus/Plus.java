// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzln;
import com.google.android.gms.internal.zzpa;
import com.google.android.gms.internal.zzpb;
import com.google.android.gms.internal.zzpc;
import com.google.android.gms.internal.zzpd;
import com.google.android.gms.internal.zzpe;
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

        final String zzaHb;
        final Set zzaHc;

        public static Builder builder()
        {
            return new Builder();
        }

        private PlusOptions()
        {
            zzaHb = null;
            zzaHc = new HashSet();
        }


        private PlusOptions(Builder builder1)
        {
            zzaHb = builder1.zzaHb;
            zzaHc = builder1.zzaHc;
        }

    }

    public static final class PlusOptions.Builder
    {

        String zzaHb;
        final Set zzaHc = new HashSet();

        public transient PlusOptions.Builder addActivityTypes(String as[])
        {
            zzu.zzb(as, "activityTypes may not be null.");
            for (int i = 0; i < as.length; i++)
            {
                zzaHc.add(as[i]);
            }

            return this;
        }

        public PlusOptions build()
        {
            return new PlusOptions(this);
        }

        public PlusOptions.Builder setServerClientId(String s)
        {
            zzaHb = s;
            return this;
        }

        public PlusOptions.Builder()
        {
        }
    }

    public static abstract class zza extends com.google.android.gms.common.api.zza.zza
    {

        public zza(GoogleApiClient googleapiclient)
        {
            super(Plus.zzNX, googleapiclient);
        }
    }


    public static final Api API;
    public static final Account AccountApi = new zzpa();
    public static final Moments MomentsApi = new zzpd();
    public static final People PeopleApi = new zzpe();
    public static final Scope SCOPE_PLUS_LOGIN = new Scope("https://www.googleapis.com/auth/plus.login");
    public static final Scope SCOPE_PLUS_PROFILE = new Scope("https://www.googleapis.com/auth/plus.me");
    public static final com.google.android.gms.common.api.Api.ClientKey zzNX;
    static final com.google.android.gms.common.api.Api.zza zzNY;
    public static final zzb zzaGZ = new zzpc();
    public static final com.google.android.gms.plus.zza zzaHa = new zzpb();

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
        zzNY = new com.google.android.gms.common.api.Api.zza() {

            public int getPriority()
            {
                return 2;
            }

            public volatile com.google.android.gms.common.api.Api.Client zza(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
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
                plusoptions = zze1.zzns();
                String as1[] = zzln.zzc(zze1.zznw());
                String as[] = (String[])plusoptions1.zzaHc.toArray(new String[0]);
                String s = context.getPackageName();
                String s1 = context.getPackageName();
                PlusCommonExtras pluscommonextras = new PlusCommonExtras();
                return new zze(context, looper, zze1, new PlusSession(plusoptions, as1, as, new String[0], s, s1, null, pluscommonextras), connectioncallbacks, onconnectionfailedlistener);
            }

        };
        API = new Api("Plus.API", zzNY, zzNX, new Scope[0]);
    }
}
