// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appdatasearch.zza;
import com.google.android.gms.appdatasearch.zzk;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndexApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzgu, zzgt, zzgq, zzgs

public final class zzgv
    implements zzk, AppIndexApi
{
    private static abstract class zzb extends com.google.android.gms.common.api.zza.zza
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((zzgt)zza1);
        }

        protected abstract void zza(zzgq zzgq)
            throws RemoteException;

        protected final void zza(zzgt zzgt1)
            throws RemoteException
        {
            zza(zzgt1.zzjH());
        }

        public zzb(GoogleApiClient googleapiclient)
        {
            super(zza.zzIS, googleapiclient);
        }
    }

    private static abstract class zzc extends zzb
    {

        protected Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        protected Status zzb(Status status)
        {
            return status;
        }

        zzc(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    private static final class zzd extends zzgs
    {

        public void zza(Status status)
        {
            zzJS.zzj(status);
        }

        public zzd(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }


    public zzgv()
    {
    }

    public static Intent zza(String s, Uri uri)
    {
        zzb(s, uri);
        s = uri.getPathSegments();
        String s1 = (String)s.get(0);
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme(s1);
        if (s.size() > 1)
        {
            builder.authority((String)s.get(1));
            for (int i = 2; i < s.size(); i++)
            {
                builder.appendPath((String)s.get(i));
            }

        }
        builder.encodedQuery(uri.getEncodedQuery());
        builder.encodedFragment(uri.getEncodedFragment());
        return new Intent("android.intent.action.VIEW", builder.build());
    }

    private PendingResult zza(GoogleApiClient googleapiclient, Action action, int i)
    {
        String s = googleapiclient.getContext().getPackageName();
        return zza(googleapiclient, new UsageInfo[] {
            com.google.android.gms.internal.zzgu.zza(action, System.currentTimeMillis(), s, i)
        });
    }

    private static void zzb(String s, Uri uri)
    {
        if (!"android-app".equals(uri.getScheme()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("AppIndex: The URI scheme must be 'android-app' and follow the format (android-app://<package_name>/<scheme>/[host_path]). Provided URI: ").append(uri).toString());
        }
        String s1 = uri.getHost();
        if (s != null && !s.equals(s1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("AppIndex: The URI host must match the package name and follow the format (android-app://<package_name>/<scheme>/[host_path]). Provided URI: ").append(uri).toString());
        }
        s = uri.getPathSegments();
        if (s.isEmpty() || ((String)s.get(0)).isEmpty())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("AppIndex: The app URI scheme must exist and follow the format android-app://<package_name>/<scheme>/[host_path]). Provided URI: ").append(uri).toString());
        } else
        {
            return;
        }
    }

    public PendingResult end(GoogleApiClient googleapiclient, Action action)
    {
        return zza(googleapiclient, action, 2);
    }

    public PendingResult start(GoogleApiClient googleapiclient, Action action)
    {
        return zza(googleapiclient, action, 1);
    }

    public transient PendingResult zza(GoogleApiClient googleapiclient, UsageInfo ausageinfo[])
    {
        return googleapiclient.zza(new zzc(googleapiclient, googleapiclient.getContext().getPackageName(), ausageinfo) {

            final String zzJT;
            final UsageInfo zzJU[];
            final zzgv zzJV;

            protected void zza(zzgq zzgq1)
                throws RemoteException
            {
                zzgq1.zza(new zzd(this), zzJT, zzJU);
            }

            
            {
                zzJV = zzgv.this;
                zzJT = s;
                zzJU = ausageinfo;
                super(googleapiclient);
            }
        });
    }
}
