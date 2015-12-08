// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzh;
import com.google.android.gms.cast.internal.zzk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.cast:
//            Cast, ApplicationMetadata, LaunchOptions

public static final class ient
    implements ient
{

    public int getActiveInputState(GoogleApiClient googleapiclient)
        throws IllegalStateException
    {
        return ((zze)googleapiclient.zza(zzk.zzNX)).zzlP();
    }

    public ApplicationMetadata getApplicationMetadata(GoogleApiClient googleapiclient)
        throws IllegalStateException
    {
        return ((zze)googleapiclient.zza(zzk.zzNX)).getApplicationMetadata();
    }

    public String getApplicationStatus(GoogleApiClient googleapiclient)
        throws IllegalStateException
    {
        return ((zze)googleapiclient.zza(zzk.zzNX)).getApplicationStatus();
    }

    public int getStandbyState(GoogleApiClient googleapiclient)
        throws IllegalStateException
    {
        return ((zze)googleapiclient.zza(zzk.zzNX)).zzlQ();
    }

    public double getVolume(GoogleApiClient googleapiclient)
        throws IllegalStateException
    {
        return ((zze)googleapiclient.zza(zzk.zzNX)).zzlO();
    }

    public boolean isMute(GoogleApiClient googleapiclient)
        throws IllegalStateException
    {
        return ((zze)googleapiclient.zza(zzk.zzNX)).isMute();
    }

    public PendingResult joinApplication(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new Cast.zza(googleapiclient) {

            final Cast.CastApi.zza zzQB;

            protected void zza(zze zze1)
                throws RemoteException
            {
                try
                {
                    zze1.zzb(null, null, this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (zze zze1)
                {
                    zzaL(2001);
                }
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzQB = Cast.CastApi.zza.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult joinApplication(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new Cast.zza(googleapiclient, s) {

            final Cast.CastApi.zza zzQB;
            final String zzQC;

            protected void zza(zze zze1)
                throws RemoteException
            {
                try
                {
                    zze1.zzb(zzQC, null, this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (zze zze1)
                {
                    zzaL(2001);
                }
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzQB = Cast.CastApi.zza.this;
                zzQC = s;
                super(googleapiclient);
            }
        });
    }

    public PendingResult joinApplication(final GoogleApiClient final_googleapiclient, String s, String s1)
    {
        return final_googleapiclient.zzb(new Cast.zza(s, s1) {

            final String val$sessionId;
            final Cast.CastApi.zza zzQB;
            final String zzQC;

            protected void zza(zze zze1)
                throws RemoteException
            {
                try
                {
                    zze1.zzb(zzQC, sessionId, this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (zze zze1)
                {
                    zzaL(2001);
                }
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzQB = Cast.CastApi.zza.this;
                zzQC = s;
                sessionId = s1;
                super(final_googleapiclient);
            }
        });
    }

    public PendingResult launchApplication(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new Cast.zza(googleapiclient, s) {

            final Cast.CastApi.zza zzQB;
            final String zzQC;

            protected void zza(zze zze1)
                throws RemoteException
            {
                try
                {
                    zze1.zza(zzQC, false, this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (zze zze1)
                {
                    zzaL(2001);
                }
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzQB = Cast.CastApi.zza.this;
                zzQC = s;
                super(googleapiclient);
            }
        });
    }

    public PendingResult launchApplication(GoogleApiClient googleapiclient, String s, LaunchOptions launchoptions)
    {
        return googleapiclient.zzb(new Cast.zza(googleapiclient, s, launchoptions) {

            final Cast.CastApi.zza zzQB;
            final String zzQC;
            final LaunchOptions zzQD;

            protected void zza(zze zze1)
                throws RemoteException
            {
                try
                {
                    zze1.zza(zzQC, zzQD, this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (zze zze1)
                {
                    zzaL(2001);
                }
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzQB = Cast.CastApi.zza.this;
                zzQC = s;
                zzQD = launchoptions;
                super(googleapiclient);
            }
        });
    }

    public PendingResult launchApplication(GoogleApiClient googleapiclient, String s, boolean flag)
    {
        return launchApplication(googleapiclient, s, (new lder()).setRelaunchIfRunning(flag).build());
    }

    public PendingResult leaveApplication(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzh(googleapiclient) {

            final Cast.CastApi.zza zzQB;

            protected void zza(zze zze1)
                throws RemoteException
            {
                try
                {
                    zze1.zzd(this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (zze zze1)
                {
                    zzaL(2001);
                }
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzQB = Cast.CastApi.zza.this;
                super(googleapiclient);
            }
        });
    }

    public void removeMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s)
        throws IOException, IllegalArgumentException
    {
        try
        {
            ((zze)googleapiclient.zza(zzk.zzNX)).zzbC(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            throw new IOException("service error");
        }
    }

    public void requestStatus(GoogleApiClient googleapiclient)
        throws IOException, IllegalStateException
    {
        try
        {
            ((zze)googleapiclient.zza(zzk.zzNX)).zzlN();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            throw new IOException("service error");
        }
    }

    public PendingResult sendMessage(GoogleApiClient googleapiclient, String s, String s1)
    {
        return googleapiclient.zzb(new zzh(googleapiclient, s, s1) {

            final String zzQA;
            final Cast.CastApi.zza zzQB;
            final String zzQz;

            protected void zza(zze zze1)
                throws RemoteException
            {
                try
                {
                    zze1.zza(zzQz, zzQA, this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (zze zze1) { }
                // Misplaced declaration of an exception variable
                catch (zze zze1) { }
                zzaL(2001);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzQB = Cast.CastApi.zza.this;
                zzQz = s;
                zzQA = s1;
                super(googleapiclient);
            }
        });
    }

    public void setMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s, vedCallback vedcallback)
        throws IOException, IllegalStateException
    {
        try
        {
            ((zze)googleapiclient.zza(zzk.zzNX)).zza(s, vedcallback);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            throw new IOException("service error");
        }
    }

    public void setMute(GoogleApiClient googleapiclient, boolean flag)
        throws IOException, IllegalStateException
    {
        try
        {
            ((zze)googleapiclient.zza(zzk.zzNX)).zzR(flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            throw new IOException("service error");
        }
    }

    public void setVolume(GoogleApiClient googleapiclient, double d)
        throws IOException, IllegalArgumentException, IllegalStateException
    {
        try
        {
            ((zze)googleapiclient.zza(zzk.zzNX)).zzd(d);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            throw new IOException("service error");
        }
    }

    public PendingResult stopApplication(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzh(googleapiclient) {

            final Cast.CastApi.zza zzQB;

            protected void zza(zze zze1)
                throws RemoteException
            {
                try
                {
                    zze1.zza("", this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (zze zze1)
                {
                    zzaL(2001);
                }
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzQB = Cast.CastApi.zza.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult stopApplication(final GoogleApiClient final_googleapiclient, String s)
    {
        return final_googleapiclient.zzb(new zzh(s) {

            final String val$sessionId;
            final Cast.CastApi.zza zzQB;

            protected void zza(zze zze1)
                throws RemoteException
            {
                if (TextUtils.isEmpty(sessionId))
                {
                    zzd(2001, "IllegalArgument: sessionId cannot be null or empty");
                    return;
                }
                try
                {
                    zze1.zza(sessionId, this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (zze zze1)
                {
                    zzaL(2001);
                }
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zze)client);
            }

            
            {
                zzQB = Cast.CastApi.zza.this;
                sessionId = s;
                super(final_googleapiclient);
            }
        });
    }

    public ient()
    {
    }
}
