// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.appinvite.AppInvite;
import com.google.android.gms.appinvite.AppInviteApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzix

public class zziw
    implements AppInviteApi
{
    static abstract class zza extends com.google.android.gms.common.api.zza.zza
    {

        public zza(GoogleApiClient googleapiclient)
        {
            super(AppInvite.zzNX, googleapiclient);
        }
    }

    final class zzb extends zza
    {

        private final String zzNZ;
        final zziw zzOa;

        protected Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((zzix)client);
        }

        protected void zza(zzix zzix1)
            throws RemoteException
        {
            zzix1.zzb(new zziy.zza(this) {

                final zzb zzOb;

                public void zzc(Status status)
                    throws RemoteException
                {
                    zzOb.setResult(status);
                }

            
            {
                zzOb = zzb1;
                super();
            }
            }, zzNZ);
        }

        protected Status zzb(Status status)
        {
            return status;
        }

        public zzb(GoogleApiClient googleapiclient, String s)
        {
            zzOa = zziw.this;
            super(googleapiclient);
            zzNZ = s;
        }
    }

    final class zzc extends zza
    {

        private final String zzNZ;
        final zziw zzOa;

        protected Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((zzix)client);
        }

        protected void zza(zzix zzix1)
            throws RemoteException
        {
            zzix1.zza(new zziy.zza(this) {

                final zzc zzOc;

                public void zzc(Status status)
                    throws RemoteException
                {
                    zzOc.setResult(status);
                }

            
            {
                zzOc = zzc1;
                super();
            }
            }, zzNZ);
        }

        protected Status zzb(Status status)
        {
            return status;
        }

        public zzc(GoogleApiClient googleapiclient, String s)
        {
            zzOa = zziw.this;
            super(googleapiclient);
            zzNZ = s;
        }
    }


    public zziw()
    {
    }

    public PendingResult convertInvitation(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zza(new zzc(googleapiclient, s));
    }

    public PendingResult updateInvitationOnInstall(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zza(new zzb(googleapiclient, s));
    }
}
