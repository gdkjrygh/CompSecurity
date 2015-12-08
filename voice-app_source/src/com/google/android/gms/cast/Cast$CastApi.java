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

public static interface zza
{
    public static final class zza
        implements Cast.CastApi
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
            return googleapiclient.zzb(new Cast.zza(this, googleapiclient) {

                final zza zzQB;

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
                zzQB = zza1;
                super(googleapiclient);
            }
            });
        }

        public PendingResult joinApplication(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.zzb(new Cast.zza(this, googleapiclient, s) {

                final zza zzQB;
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
                zzQB = zza1;
                zzQC = s;
                super(googleapiclient);
            }
            });
        }

        public PendingResult joinApplication(GoogleApiClient googleapiclient, String s, String s1)
        {
            return googleapiclient.zzb(new Cast.zza(googleapiclient, s, s1) {

                final String val$sessionId;
                final zza zzQB;
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
                zzQB = final_zza1;
                zzQC = s;
                sessionId = s1;
                super(googleapiclient);
            }
            });
        }

        public PendingResult launchApplication(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.zzb(new Cast.zza(this, googleapiclient, s) {

                final zza zzQB;
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
                zzQB = zza1;
                zzQC = s;
                super(googleapiclient);
            }
            });
        }

        public PendingResult launchApplication(GoogleApiClient googleapiclient, String s, LaunchOptions launchoptions)
        {
            return googleapiclient.zzb(new Cast.zza(this, googleapiclient, s, launchoptions) {

                final zza zzQB;
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
                zzQB = zza1;
                zzQC = s;
                zzQD = launchoptions;
                super(googleapiclient);
            }
            });
        }

        public PendingResult launchApplication(GoogleApiClient googleapiclient, String s, boolean flag)
        {
            return launchApplication(googleapiclient, s, (new LaunchOptions.Builder()).setRelaunchIfRunning(flag).build());
        }

        public PendingResult leaveApplication(GoogleApiClient googleapiclient)
        {
            return googleapiclient.zzb(new zzh(this, googleapiclient) {

                final zza zzQB;

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
                zzQB = zza1;
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
            return googleapiclient.zzb(new zzh(this, googleapiclient, s, s1) {

                final String zzQA;
                final zza zzQB;
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
                zzQB = zza1;
                zzQz = s;
                zzQA = s1;
                super(googleapiclient);
            }
            });
        }

        public void setMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s, Cast.MessageReceivedCallback messagereceivedcallback)
            throws IOException, IllegalStateException
        {
            try
            {
                ((zze)googleapiclient.zza(zzk.zzNX)).zza(s, messagereceivedcallback);
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
            return googleapiclient.zzb(new zzh(this, googleapiclient) {

                final zza zzQB;

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
                zzQB = zza1;
                super(googleapiclient);
            }
            });
        }

        public PendingResult stopApplication(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.zzb(new zzh(googleapiclient, s) {

                final String val$sessionId;
                final zza zzQB;

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
                zzQB = final_zza1;
                sessionId = s;
                super(googleapiclient);
            }
            });
        }

        public zza()
        {
        }
    }


    public abstract int getActiveInputState(GoogleApiClient googleapiclient)
        throws IllegalStateException;

    public abstract ApplicationMetadata getApplicationMetadata(GoogleApiClient googleapiclient)
        throws IllegalStateException;

    public abstract String getApplicationStatus(GoogleApiClient googleapiclient)
        throws IllegalStateException;

    public abstract int getStandbyState(GoogleApiClient googleapiclient)
        throws IllegalStateException;

    public abstract double getVolume(GoogleApiClient googleapiclient)
        throws IllegalStateException;

    public abstract boolean isMute(GoogleApiClient googleapiclient)
        throws IllegalStateException;

    public abstract PendingResult joinApplication(GoogleApiClient googleapiclient);

    public abstract PendingResult joinApplication(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult joinApplication(GoogleApiClient googleapiclient, String s, String s1);

    public abstract PendingResult launchApplication(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult launchApplication(GoogleApiClient googleapiclient, String s, LaunchOptions launchoptions);

    public abstract PendingResult launchApplication(GoogleApiClient googleapiclient, String s, boolean flag);

    public abstract PendingResult leaveApplication(GoogleApiClient googleapiclient);

    public abstract void removeMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s)
        throws IOException, IllegalArgumentException;

    public abstract void requestStatus(GoogleApiClient googleapiclient)
        throws IOException, IllegalStateException;

    public abstract PendingResult sendMessage(GoogleApiClient googleapiclient, String s, String s1);

    public abstract void setMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s, eceivedCallback eceivedcallback)
        throws IOException, IllegalStateException;

    public abstract void setMute(GoogleApiClient googleapiclient, boolean flag)
        throws IOException, IllegalStateException;

    public abstract void setVolume(GoogleApiClient googleapiclient, double d)
        throws IOException, IllegalArgumentException, IllegalStateException;

    public abstract PendingResult stopApplication(GoogleApiClient googleapiclient);

    public abstract PendingResult stopApplication(GoogleApiClient googleapiclient, String s);
}
