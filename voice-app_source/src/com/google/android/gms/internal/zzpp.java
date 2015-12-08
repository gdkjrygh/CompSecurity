// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.GoogleNowAuthState;
import com.google.android.gms.search.SearchAuth;
import com.google.android.gms.search.SearchAuthApi;

// Referenced classes of package com.google.android.gms.internal:
//            zzpo, zzpn

public class zzpp
    implements SearchAuthApi
{
    static abstract class zza extends zzpm.zza
    {

        public void zza(Status status, GoogleNowAuthState googlenowauthstate)
        {
            throw new UnsupportedOperationException();
        }

        zza()
        {
        }
    }

    static class zzb extends com.google.android.gms.common.api.zza.zza
    {

        private final GoogleApiClient zzRa;
        private final String zzaJI;
        private final boolean zzaJJ = Log.isLoggable("SearchAuth", 3);

        static boolean zza(zzb zzb1)
        {
            return zzb1.zzaJJ;
        }

        protected Result createFailedResult(Status status)
        {
            return zzaS(status);
        }

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((zzpo)client);
        }

        protected void zza(zzpo zzpo1)
            throws RemoteException
        {
            if (zzaJJ)
            {
                Log.d("SearchAuth", "GetGoogleNowAuthImpl started");
            }
            String s = zzRa.getContext().getPackageName();
            zza zza1 = new zza(this) {

                final zzb zzaJK;

                public void zza(Status status, GoogleNowAuthState googlenowauthstate)
                {
                    if (zzb.zza(zzaJK))
                    {
                        Log.d("SearchAuth", "GetGoogleNowAuthImpl success");
                    }
                    zzaJK.setResult(new zzc(status, googlenowauthstate));
                }

            
            {
                zzaJK = zzb1;
                super();
            }
            };
            ((zzpn)zzpo1.zznM()).zza(zza1, s, zzaJI);
        }

        protected com.google.android.gms.search.SearchAuthApi.GoogleNowAuthResult zzaS(Status status)
        {
            if (zzaJJ)
            {
                Log.d("SearchAuth", (new StringBuilder()).append("GetGoogleNowAuthImpl received failure: ").append(status.getStatusMessage()).toString());
            }
            return new zzc(status, null);
        }

        protected zzb(GoogleApiClient googleapiclient, String s)
        {
            super(SearchAuth.zzNX, googleapiclient);
            zzRa = googleapiclient;
            zzaJI = s;
        }
    }

    static class zzc
        implements com.google.android.gms.search.SearchAuthApi.GoogleNowAuthResult
    {

        private final Status zzOt;
        private final GoogleNowAuthState zzaJL;

        public GoogleNowAuthState getGoogleNowAuthState()
        {
            return zzaJL;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        zzc(Status status, GoogleNowAuthState googlenowauthstate)
        {
            zzOt = status;
            zzaJL = googlenowauthstate;
        }
    }


    public zzpp()
    {
    }

    public PendingResult getGoogleNowAuth(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zza(new zzb(googleapiclient, s));
    }
}
