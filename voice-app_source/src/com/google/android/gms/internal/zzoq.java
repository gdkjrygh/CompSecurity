// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zzi;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.connection.AppMetadata;
import com.google.android.gms.nearby.connection.Connections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzop

public final class zzoq
    implements Connections
{
    private static abstract class zza extends com.google.android.gms.common.api.zza.zza
    {

        public zza(GoogleApiClient googleapiclient)
        {
            super(zzoq.zzNX, googleapiclient);
        }
    }

    private static abstract class zzb extends zza
    {

        public Result createFailedResult(Status status)
        {
            return zzaM(status);
        }

        public com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult zzaM(Status status)
        {
            return new com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult(this, status) {

                final Status zzOl;
                final zzb zzaFN;

                public String getLocalEndpointName()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzOl;
                }

            
            {
                zzaFN = zzb1;
                zzOl = status;
                super();
            }
            };
        }

        private zzb(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class zzc extends zza
    {

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        public Status zzb(Status status)
        {
            return status;
        }

        private zzc(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public static final com.google.android.gms.common.api.Api.ClientKey zzNX = new com.google.android.gms.common.api.Api.ClientKey();
    public static final com.google.android.gms.common.api.Api.zza zzNY = new com.google.android.gms.common.api.Api.zza() {

        public int getPriority()
        {
            return 0x7fffffff;
        }

        public com.google.android.gms.common.api.Api.Client zza(Context context, Looper looper, zze zze1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return zzq(context, looper, zze1, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
        }

        public zzop zzq(Context context, Looper looper, zze zze1, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return new zzop(context, looper, connectioncallbacks, onconnectionfailedlistener);
        }

    };

    public zzoq()
    {
    }

    public static zzop zzd(GoogleApiClient googleapiclient, boolean flag)
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
        return zze(googleapiclient, flag);
    }

    public static zzop zze(GoogleApiClient googleapiclient, boolean flag)
    {
        zzu.zza(googleapiclient.zza(Nearby.CONNECTIONS_API), "GoogleApiClient is not configured to use the Nearby Connections Api. Pass Nearby.CONNECTIONS_API into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean flag1 = googleapiclient.hasConnectedApi(Nearby.CONNECTIONS_API);
        if (flag && !flag1)
        {
            throw new IllegalStateException("GoogleApiClient has an optional Nearby.CONNECTIONS_API and is not connected to Nearby Connections. Use GoogleApiClient.hasConnectedApi(Nearby.CONNECTIONS_API) to guard this call.");
        }
        if (flag1)
        {
            return (zzop)googleapiclient.zza(zzNX);
        } else
        {
            return null;
        }
    }

    public PendingResult acceptConnectionRequest(GoogleApiClient googleapiclient, String s, byte abyte0[], com.google.android.gms.nearby.connection.Connections.MessageListener messagelistener)
    {
        return googleapiclient.zzb(new zzc(googleapiclient, s, abyte0, googleapiclient.zzo(messagelistener)) {

            final zzoq zzaFJ;
            final zzi zzaFM;
            final String zzaFs;
            final byte zzarU[];

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzop)client);
            }

            protected void zza(zzop zzop1)
                throws RemoteException
            {
                zzop1.zza(this, zzaFs, zzarU, zzaFM);
            }

            
            {
                zzaFJ = zzoq.this;
                zzaFs = s;
                zzarU = abyte0;
                zzaFM = zzi;
                super(googleapiclient);
            }
        });
    }

    public void disconnectFromEndpoint(GoogleApiClient googleapiclient, String s)
    {
        zzd(googleapiclient, false).zzdR(s);
    }

    public String getLocalDeviceId(GoogleApiClient googleapiclient)
    {
        return zzd(googleapiclient, true).zzwS();
    }

    public String getLocalEndpointId(GoogleApiClient googleapiclient)
    {
        return zzd(googleapiclient, true).zzwR();
    }

    public PendingResult rejectConnectionRequest(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new zzc(googleapiclient, s) {

            final zzoq zzaFJ;
            final String zzaFs;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzop)client);
            }

            protected void zza(zzop zzop1)
                throws RemoteException
            {
                zzop1.zzp(this, zzaFs);
            }

            
            {
                zzaFJ = zzoq.this;
                zzaFs = s;
                super(googleapiclient);
            }
        });
    }

    public PendingResult sendConnectionRequest(final GoogleApiClient final_googleapiclient, String s, String s1, byte abyte0[], com.google.android.gms.nearby.connection.Connections.ConnectionResponseCallback connectionresponsecallback, com.google.android.gms.nearby.connection.Connections.MessageListener messagelistener)
    {
        return final_googleapiclient.zzb(new zzc(s, s1, abyte0, final_googleapiclient.zzo(connectionresponsecallback), final_googleapiclient.zzo(messagelistener)) {

            final String val$name;
            final zzoq zzaFJ;
            final zzi zzaFL;
            final zzi zzaFM;
            final String zzaFs;
            final byte zzarU[];

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzop)client);
            }

            protected void zza(zzop zzop1)
                throws RemoteException
            {
                zzop1.zza(this, name, zzaFs, zzarU, zzaFL, zzaFM);
            }

            
            {
                zzaFJ = zzoq.this;
                name = s;
                zzaFs = s1;
                zzarU = abyte0;
                zzaFL = zzi;
                zzaFM = zzi1;
                super(final_googleapiclient);
            }
        });
    }

    public void sendReliableMessage(GoogleApiClient googleapiclient, String s, byte abyte0[])
    {
        zzd(googleapiclient, false).zza(new String[] {
            s
        }, abyte0);
    }

    public void sendReliableMessage(GoogleApiClient googleapiclient, List list, byte abyte0[])
    {
        zzd(googleapiclient, false).zza((String[])list.toArray(new String[list.size()]), abyte0);
    }

    public void sendUnreliableMessage(GoogleApiClient googleapiclient, String s, byte abyte0[])
    {
        zzd(googleapiclient, false).zzb(new String[] {
            s
        }, abyte0);
    }

    public void sendUnreliableMessage(GoogleApiClient googleapiclient, List list, byte abyte0[])
    {
        zzd(googleapiclient, false).zzb((String[])list.toArray(new String[list.size()]), abyte0);
    }

    public PendingResult startAdvertising(final GoogleApiClient final_googleapiclient, String s, AppMetadata appmetadata, long l, com.google.android.gms.nearby.connection.Connections.ConnectionRequestListener connectionrequestlistener)
    {
        return final_googleapiclient.zzb(new zzb(s, appmetadata, l, final_googleapiclient.zzo(connectionrequestlistener)) {

            final String val$name;
            final AppMetadata zzaFG;
            final long zzaFH;
            final zzi zzaFI;
            final zzoq zzaFJ;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzop)client);
            }

            protected void zza(zzop zzop1)
                throws RemoteException
            {
                zzop1.zza(this, name, zzaFG, zzaFH, zzaFI);
            }

            
            {
                zzaFJ = zzoq.this;
                name = s;
                zzaFG = appmetadata;
                zzaFH = l;
                zzaFI = zzi;
                super(final_googleapiclient);
            }
        });
    }

    public PendingResult startDiscovery(GoogleApiClient googleapiclient, String s, long l, com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener endpointdiscoverylistener)
    {
        return googleapiclient.zzb(new zzc(googleapiclient, s, l, googleapiclient.zzo(endpointdiscoverylistener)) {

            final String zzaFE;
            final long zzaFH;
            final zzoq zzaFJ;
            final zzi zzaFK;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzop)client);
            }

            protected void zza(zzop zzop1)
                throws RemoteException
            {
                zzop1.zza(this, zzaFE, zzaFH, zzaFK);
            }

            
            {
                zzaFJ = zzoq.this;
                zzaFE = s;
                zzaFH = l;
                zzaFK = zzi;
                super(googleapiclient);
            }
        });
    }

    public void stopAdvertising(GoogleApiClient googleapiclient)
    {
        zzd(googleapiclient, false).zzwT();
    }

    public void stopAllEndpoints(GoogleApiClient googleapiclient)
    {
        zzd(googleapiclient, false).zzwU();
    }

    public void stopDiscovery(GoogleApiClient googleapiclient, String s)
    {
        zzd(googleapiclient, false).zzdQ(s);
    }

}
