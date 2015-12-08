// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DrivePreferencesApi;
import com.google.android.gms.drive.FileUploadPreferences;

// Referenced classes of package com.google.android.gms.drive.internal:
//            FileUploadPreferencesImpl, zzd, OnDeviceUsagePreferenceResponse, zzs, 
//            zzak, zzr, SetFileUploadPreferencesRequest, zzbq

public class zzy
    implements DrivePreferencesApi
{
    private class zza extends zzd
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;
        final zzy zzafu;

        public void zza(OnDeviceUsagePreferenceResponse ondeviceusagepreferenceresponse)
            throws RemoteException
        {
            zzOs.zzm(zzafu. new zzb(Status.zzXP, ondeviceusagepreferenceresponse.zzpL()));
        }

        public void zzt(Status status)
            throws RemoteException
        {
            zzOs.zzm(zzafu. new zzb(status, null));
        }

        private zza(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzafu = zzy.this;
            super();
            zzOs = zzb1;
        }

    }

    private class zzb
        implements com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult
    {

        private final Status zzOt;
        final zzy zzafu;
        private final FileUploadPreferences zzafw;

        public FileUploadPreferences getFileUploadPreferences()
        {
            return zzafw;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        private zzb(Status status, FileUploadPreferences fileuploadpreferences)
        {
            zzafu = zzy.this;
            super();
            zzOt = status;
            zzafw = fileuploadpreferences;
        }

    }

    private abstract class zzc extends zzr
    {

        final zzy zzafu;

        protected Result createFailedResult(Status status)
        {
            return zzz(status);
        }

        protected com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult zzz(Status status)
        {
            return zzafu. new zzb(status, null);
        }

        public zzc(GoogleApiClient googleapiclient)
        {
            zzafu = zzy.this;
            super(googleapiclient);
        }
    }


    public zzy()
    {
    }

    public PendingResult getFileUploadPreferences(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zza(new zzc(googleapiclient) {

            final zzy zzafu;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzs)client);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzs1.zzpB().zzd(zzafu. new zza(this));
            }

            
            {
                zzafu = zzy.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult setFileUploadPreferences(GoogleApiClient googleapiclient, FileUploadPreferences fileuploadpreferences)
    {
        if (!(fileuploadpreferences instanceof FileUploadPreferencesImpl))
        {
            throw new IllegalArgumentException("Invalid preference value");
        } else
        {
            return googleapiclient.zzb(new zzr.zza(googleapiclient, (FileUploadPreferencesImpl)fileuploadpreferences) {

                final zzy zzafu;
                final FileUploadPreferencesImpl zzafv;

                protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                    throws RemoteException
                {
                    zza((zzs)client);
                }

                protected void zza(zzs zzs1)
                    throws RemoteException
                {
                    zzs1.zzpB().zza(new SetFileUploadPreferencesRequest(zzafv), new zzbq(this));
                }

            
            {
                zzafu = zzy.this;
                zzafv = fileuploadpreferencesimpl;
                super(googleapiclient);
            }
            });
        }
    }
}
