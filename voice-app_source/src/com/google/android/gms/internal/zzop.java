// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.nearby.connection.AppMetadata;

// Referenced classes of package com.google.android.gms.internal:
//            zzos, zzoo

public final class zzop extends zzi
{
    private static final class zza extends zzb
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzia(int i)
            throws RemoteException
        {
            zzOs.zzm(new Status(i));
        }

        public zza(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.common.api.zzi zzi1)
        {
            super(zzi1);
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzu(zzb1);
        }
    }

    private static class zzb extends zzoo
    {

        private final com.google.android.gms.common.api.zzi zzaFr;

        public void onDisconnected(String s)
            throws RemoteException
        {
            zzaFr.zza(new com.google.android.gms.common.api.zzi.zzb(this, s) {

                final String zzaFs;
                final zzb zzaFu;

                public void zza(com.google.android.gms.nearby.connection.Connections.MessageListener messagelistener)
                {
                    messagelistener.onDisconnected(zzaFs);
                }

                public void zzmw()
                {
                }

                public void zzn(Object obj)
                {
                    zza((com.google.android.gms.nearby.connection.Connections.MessageListener)obj);
                }

            
            {
                zzaFu = zzb1;
                zzaFs = s;
                super();
            }
            });
        }

        public void onMessageReceived(String s, byte abyte0[], boolean flag)
            throws RemoteException
        {
            zzaFr.zza(new com.google.android.gms.common.api.zzi.zzb(this, s, abyte0, flag) {

                final String zzaFs;
                final boolean zzaFt;
                final zzb zzaFu;
                final byte zzarU[];

                public void zza(com.google.android.gms.nearby.connection.Connections.MessageListener messagelistener)
                {
                    messagelistener.onMessageReceived(zzaFs, zzarU, zzaFt);
                }

                public void zzmw()
                {
                }

                public void zzn(Object obj)
                {
                    zza((com.google.android.gms.nearby.connection.Connections.MessageListener)obj);
                }

            
            {
                zzaFu = zzb1;
                zzaFs = s;
                zzarU = abyte0;
                zzaFt = flag;
                super();
            }
            });
        }

        zzb(com.google.android.gms.common.api.zzi zzi1)
        {
            zzaFr = zzi1;
        }
    }

    private static final class zzc extends zzb
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;
        private final com.google.android.gms.common.api.zzi zzaFv;

        public void zza(String s, int i, byte abyte0[])
            throws RemoteException
        {
            zzaFv.zza(new com.google.android.gms.common.api.zzi.zzb(this, s, i, abyte0) {

                final int zzUK;
                final String zzaFs;
                final zzc zzaFw;
                final byte zzarU[];

                public void zza(com.google.android.gms.nearby.connection.Connections.ConnectionResponseCallback connectionresponsecallback)
                {
                    connectionresponsecallback.onConnectionResponse(zzaFs, new Status(zzUK), zzarU);
                }

                public void zzmw()
                {
                }

                public void zzn(Object obj)
                {
                    zza((com.google.android.gms.nearby.connection.Connections.ConnectionResponseCallback)obj);
                }

            
            {
                zzaFw = zzc1;
                zzaFs = s;
                zzUK = i;
                zzarU = abyte0;
                super();
            }
            });
        }

        public void zzhZ(int i)
            throws RemoteException
        {
            zzOs.zzm(new Status(i));
        }

        public zzc(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.common.api.zzi zzi1, com.google.android.gms.common.api.zzi zzi2)
        {
            super(zzi2);
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzu(zzb1);
            zzaFv = (com.google.android.gms.common.api.zzi)zzu.zzu(zzi1);
        }
    }

    private static final class zzd extends zzoo
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;
        private final com.google.android.gms.common.api.zzi zzaFx;

        public void onConnectionRequest(String s, String s1, String s2, byte abyte0[])
            throws RemoteException
        {
            zzaFx.zza(new com.google.android.gms.common.api.zzi.zzb(this, s, s1, s2, abyte0) {

                final zzd zzaFA;
                final String zzaFs;
                final String zzaFy;
                final String zzaFz;
                final byte zzarU[];

                public void zza(com.google.android.gms.nearby.connection.Connections.ConnectionRequestListener connectionrequestlistener)
                {
                    connectionrequestlistener.onConnectionRequest(zzaFs, zzaFy, zzaFz, zzarU);
                }

                public void zzmw()
                {
                }

                public void zzn(Object obj)
                {
                    zza((com.google.android.gms.nearby.connection.Connections.ConnectionRequestListener)obj);
                }

            
            {
                zzaFA = zzd1;
                zzaFs = s;
                zzaFy = s1;
                zzaFz = s2;
                zzarU = abyte0;
                super();
            }
            });
        }

        public void zzj(int i, String s)
            throws RemoteException
        {
            zzOs.zzm(new zze(new Status(i), s));
        }

        zzd(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.common.api.zzi zzi1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzu(zzb1);
            zzaFx = (com.google.android.gms.common.api.zzi)zzu.zzu(zzi1);
        }
    }

    private static final class zze
        implements com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult
    {

        private final Status zzOt;
        private final String zzaFB;

        public String getLocalEndpointName()
        {
            return zzaFB;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        zze(Status status, String s)
        {
            zzOt = status;
            zzaFB = s;
        }
    }

    private static final class zzf extends zzoo
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;
        private final com.google.android.gms.common.api.zzi zzaFx;

        public void onEndpointFound(String s, String s1, String s2, String s3)
            throws RemoteException
        {
            zzaFx.zza(new com.google.android.gms.common.api.zzi.zzb(s, s1, s2, s3) {

                final String val$name;
                final String zzaFC;
                final String zzaFD;
                final String zzaFE;
                final zzf zzaFF;

                public void zza(com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener endpointdiscoverylistener)
                {
                    endpointdiscoverylistener.onEndpointFound(zzaFC, zzaFD, zzaFE, name);
                }

                public void zzmw()
                {
                }

                public void zzn(Object obj)
                {
                    zza((com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener)obj);
                }

            
            {
                zzaFF = final_zzf1;
                zzaFC = s;
                zzaFD = s1;
                zzaFE = s2;
                name = s3;
                super();
            }
            });
        }

        public void onEndpointLost(String s)
            throws RemoteException
        {
            zzaFx.zza(new com.google.android.gms.common.api.zzi.zzb(this, s) {

                final String zzaFC;
                final zzf zzaFF;

                public void zza(com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener endpointdiscoverylistener)
                {
                    endpointdiscoverylistener.onEndpointLost(zzaFC);
                }

                public void zzmw()
                {
                }

                public void zzn(Object obj)
                {
                    zza((com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener)obj);
                }

            
            {
                zzaFF = zzf1;
                zzaFC = s;
                super();
            }
            });
        }

        public void zzhX(int i)
            throws RemoteException
        {
            zzOs.zzm(new Status(i));
        }

        zzf(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.common.api.zzi zzi1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzu(zzb1);
            zzaFx = (com.google.android.gms.common.api.zzi)zzu.zzu(zzi1);
        }
    }


    private final long zzaoX = (long)hashCode();

    public zzop(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 54, connectioncallbacks, onconnectionfailedlistener);
    }

    public void disconnect()
    {
        if (isConnected())
        {
            try
            {
                ((zzos)zznM()).zzE(zzaoX);
            }
            catch (RemoteException remoteexception)
            {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", remoteexception);
            }
        }
        super.disconnect();
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzda(ibinder);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, long l, com.google.android.gms.common.api.zzi zzi1)
        throws RemoteException
    {
        ((zzos)zznM()).zza(new zzf(zzb1, zzi1), s, l, zzaoX);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, AppMetadata appmetadata, long l, com.google.android.gms.common.api.zzi zzi1)
        throws RemoteException
    {
        ((zzos)zznM()).zza(new zzd(zzb1, zzi1), s, appmetadata, l, zzaoX);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, byte abyte0[], com.google.android.gms.common.api.zzi zzi1, com.google.android.gms.common.api.zzi zzi2)
        throws RemoteException
    {
        ((zzos)zznM()).zza(new zzc(zzb1, zzi1, zzi2), s, s1, abyte0, zzaoX);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, byte abyte0[], com.google.android.gms.common.api.zzi zzi1)
        throws RemoteException
    {
        ((zzos)zznM()).zza(new zza(zzb1, zzi1), s, abyte0, zzaoX);
    }

    public void zza(String as[], byte abyte0[])
    {
        try
        {
            ((zzos)zznM()).zza(as, abyte0, zzaoX);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            Log.w("NearbyConnectionsClient", "Couldn't send reliable message", as);
        }
    }

    public void zzb(String as[], byte abyte0[])
    {
        try
        {
            ((zzos)zznM()).zzb(as, abyte0, zzaoX);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            Log.w("NearbyConnectionsClient", "Couldn't send unreliable message", as);
        }
    }

    public void zzdQ(String s)
    {
        try
        {
            ((zzos)zznM()).zzf(s, zzaoX);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("NearbyConnectionsClient", "Couldn't stop discovery", s);
        }
    }

    public void zzdR(String s)
    {
        try
        {
            ((zzos)zznM()).zzg(s, zzaoX);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("NearbyConnectionsClient", "Couldn't disconnect from endpoint", s);
        }
    }

    protected zzos zzda(IBinder ibinder)
    {
        return zzos.zza.zzdc(ibinder);
    }

    public void zzp(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((zzos)zznM()).zza(new zzoo(zzb1) {

            final com.google.android.gms.common.api.zza.zzb zzaFp;
            final zzop zzaFq;

            public void zzib(int i)
                throws RemoteException
            {
                zzaFp.zzm(new Status(i));
            }

            
            {
                zzaFq = zzop.this;
                zzaFp = zzb1;
                super();
            }
        }, s, zzaoX);
    }

    public String zzwR()
    {
        String s;
        try
        {
            s = ((zzos)zznM()).zzQ(zzaoX);
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeException(remoteexception);
        }
        return s;
    }

    public String zzwS()
    {
        String s;
        try
        {
            s = ((zzos)zznM()).zzwS();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeException(remoteexception);
        }
        return s;
    }

    public void zzwT()
    {
        try
        {
            ((zzos)zznM()).zzN(zzaoX);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("NearbyConnectionsClient", "Couldn't stop advertising", remoteexception);
        }
    }

    public void zzwU()
    {
        try
        {
            ((zzos)zznM()).zzP(zzaoX);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("NearbyConnectionsClient", "Couldn't stop all endpoints", remoteexception);
        }
    }
}
