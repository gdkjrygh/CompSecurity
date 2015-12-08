// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.panorama.Panorama;
import com.google.android.gms.panorama.PanoramaApi;

// Referenced classes of package com.google.android.gms.internal:
//            zzou, zzot, zzox, zzow

public class zzov
    implements PanoramaApi
{
    private static abstract class zza extends zzc
    {

        protected Result createFailedResult(Status status)
        {
            return zzaN(status);
        }

        protected com.google.android.gms.panorama.PanoramaApi.PanoramaResult zzaN(Status status)
        {
            return new zzox(status, null);
        }

        public zza(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    private static final class zzb extends zzot.zza
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zza(int i, Bundle bundle, int j, Intent intent)
        {
            if (bundle != null)
            {
                bundle = (PendingIntent)bundle.getParcelable("pendingIntent");
            } else
            {
                bundle = null;
            }
            bundle = new Status(i, null, bundle);
            zzOs.zzm(new zzox(bundle, intent));
        }

        public zzb(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = zzb1;
        }
    }

    private static abstract class zzc extends com.google.android.gms.common.api.zza.zza
    {

        protected abstract void zza(Context context, zzou zzou1)
            throws RemoteException;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((zzow)client);
        }

        protected final void zza(zzow zzow1)
            throws RemoteException
        {
            zza(zzow1.getContext(), (zzou)zzow1.zznM());
        }

        protected zzc(GoogleApiClient googleapiclient)
        {
            super(Panorama.zzNX, googleapiclient);
        }
    }


    public zzov()
    {
    }

    private static void zza(Context context, Uri uri)
    {
        context.revokeUriPermission(uri, 1);
    }

    private static void zza(Context context, zzou zzou1, zzot zzot, Uri uri, Bundle bundle)
        throws RemoteException
    {
        context.grantUriPermission("com.google.android.gms", uri, 1);
        zzot = new zzot.zza(context, uri, zzot) {

            final Uri zzaGx;
            final zzot zzaGz;
            final Context zzqV;

            public void zza(int i, Bundle bundle1, int j, Intent intent)
                throws RemoteException
            {
                zzov.zzb(zzqV, zzaGx);
                zzaGz.zza(i, bundle1, j, intent);
            }

            
            {
                zzqV = context;
                zzaGx = uri;
                zzaGz = zzot1;
                super();
            }
        };
        try
        {
            zzou1.zza(zzot, uri, bundle, true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzou zzou1)
        {
            zza(context, uri);
            throw zzou1;
        }
        // Misplaced declaration of an exception variable
        catch (zzou zzou1)
        {
            zza(context, uri);
        }
        throw zzou1;
    }

    static void zzb(Context context, Uri uri)
    {
        zza(context, uri);
    }

    static void zzb(Context context, zzou zzou1, zzot zzot, Uri uri, Bundle bundle)
        throws RemoteException
    {
        zza(context, zzou1, zzot, uri, bundle);
    }

    public PendingResult loadPanoramaInfo(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.zza(new zza(googleapiclient, uri) {

            final Uri zzaGx;
            final zzov zzaGy;

            protected void zza(Context context, zzou zzou1)
                throws RemoteException
            {
                zzou1.zza(new zzb(this), zzaGx, null, false);
            }

            
            {
                zzaGy = zzov.this;
                zzaGx = uri;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadPanoramaInfoAndGrantAccess(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.zza(new zza(googleapiclient, uri) {

            final Uri zzaGx;
            final zzov zzaGy;

            protected void zza(Context context, zzou zzou1)
                throws RemoteException
            {
                zzov.zzb(context, zzou1, new zzb(this), zzaGx, null);
            }

            
            {
                zzaGy = zzov.this;
                zzaGx = uri;
                super(googleapiclient);
            }
        });
    }
}
