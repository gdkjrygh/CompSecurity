// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appdatasearch.zzk;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndexApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zziu, zzit, zziq, zzis

public final class zziv
    implements zzk, AppIndexApi
{
    private static final class zza
        implements com.google.android.gms.appindexing.AppIndexApi.ActionResult
    {

        private zziv zzNS;
        private PendingResult zzNT;
        private Action zzNU;

        public PendingResult end(GoogleApiClient googleapiclient)
        {
            Object obj = googleapiclient.getContext().getPackageName();
            long l = System.currentTimeMillis();
            obj = zziu.zza(zzNU, l, ((String) (obj)), 2);
            return zzNS.zza(googleapiclient, new UsageInfo[] {
                obj
            });
        }

        public PendingResult getPendingResult()
        {
            return zzNT;
        }

        zza(zziv zziv1, PendingResult pendingresult, Action action1)
        {
            zzNS = zziv1;
            zzNT = pendingresult;
            zzNU = action1;
        }
    }

    private static abstract class zzb extends com.google.android.gms.common.api.zza.zza
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((zzit)client);
        }

        protected abstract void zza(zziq zziq)
            throws RemoteException;

        protected final void zza(zzit zzit1)
            throws RemoteException
        {
            zza(zzit1.zzkO());
        }

        public zzb(GoogleApiClient googleapiclient)
        {
            super(com.google.android.gms.appdatasearch.zza.zzMO, googleapiclient);
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

    private static final class zzd extends zzis
    {

        public void zza(Status status)
        {
            zzNO.zzm(status);
        }

        public zzd(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }


    public zziv()
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

    private PendingResult zza(GoogleApiClient googleapiclient, Action action1, int i)
    {
        String s = googleapiclient.getContext().getPackageName();
        return zza(googleapiclient, new UsageInfo[] {
            zziu.zza(action1, System.currentTimeMillis(), s, i)
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

    public static void zzi(List list)
    {
        if (list != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                zzb(null, ((com.google.android.gms.appindexing.AppIndexApi.AppIndexingLink)list.next()).appIndexingUrl);
            }
        }
    }

    public com.google.android.gms.appindexing.AppIndexApi.ActionResult action(GoogleApiClient googleapiclient, Action action1)
    {
        return new zza(this, zza(googleapiclient, action1, 1), action1);
    }

    public PendingResult end(GoogleApiClient googleapiclient, Action action1)
    {
        return zza(googleapiclient, action1, 2);
    }

    public PendingResult start(GoogleApiClient googleapiclient, Action action1)
    {
        return zza(googleapiclient, action1, 1);
    }

    public PendingResult view(GoogleApiClient googleapiclient, Activity activity, Intent intent, String s, Uri uri, List list)
    {
        activity = googleapiclient.getContext().getPackageName();
        zzi(list);
        return zza(googleapiclient, new UsageInfo[] {
            new UsageInfo(activity, intent, s, uri, null, list, 1)
        });
    }

    public PendingResult view(GoogleApiClient googleapiclient, Activity activity, Uri uri, String s, Uri uri1, List list)
    {
        String s1 = googleapiclient.getContext().getPackageName();
        zzb(s1, uri);
        return view(googleapiclient, activity, zza(s1, uri), s, uri1, list);
    }

    public PendingResult viewEnd(GoogleApiClient googleapiclient, Activity activity, Intent intent)
    {
        activity = googleapiclient.getContext().getPackageName();
        return zza(googleapiclient, new UsageInfo[] {
            (new com.google.android.gms.appdatasearch.UsageInfo.zza()).zza(UsageInfo.zza(activity, intent)).zzw(System.currentTimeMillis()).zzal(0).zzam(2).zzkN()
        });
    }

    public PendingResult viewEnd(GoogleApiClient googleapiclient, Activity activity, Uri uri)
    {
        return viewEnd(googleapiclient, activity, zza(googleapiclient.getContext().getPackageName(), uri));
    }

    public transient PendingResult zza(GoogleApiClient googleapiclient, UsageInfo ausageinfo[])
    {
        return googleapiclient.zza(new zzc(googleapiclient, googleapiclient.getContext().getPackageName(), ausageinfo) {

            final String zzNP;
            final UsageInfo zzNQ[];
            final zziv zzNR;

            protected void zza(zziq zziq1)
                throws RemoteException
            {
                zziq1.zza(new zzd(this), zzNP, zzNQ);
            }

            
            {
                zzNR = zziv.this;
                zzNP = s;
                zzNQ = ausageinfo;
                super(googleapiclient);
            }
        });
    }
}
