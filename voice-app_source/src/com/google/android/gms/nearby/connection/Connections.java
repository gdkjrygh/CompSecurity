// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.connection;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.nearby.connection:
//            AppMetadata

public interface Connections
{
    public static interface ConnectionRequestListener
    {

        public abstract void onConnectionRequest(String s, String s1, String s2, byte abyte0[]);
    }

    public static interface ConnectionResponseCallback
    {

        public abstract void onConnectionResponse(String s, Status status, byte abyte0[]);
    }

    public static interface EndpointDiscoveryListener
    {

        public abstract void onEndpointFound(String s, String s1, String s2, String s3);

        public abstract void onEndpointLost(String s);
    }

    public static interface MessageListener
    {

        public abstract void onDisconnected(String s);

        public abstract void onMessageReceived(String s, byte abyte0[], boolean flag);
    }

    public static interface StartAdvertisingResult
        extends Result
    {

        public abstract String getLocalEndpointName();
    }


    public static final long DURATION_INDEFINITE = 0L;
    public static final int MAX_RELIABLE_MESSAGE_LEN = 4096;
    public static final int MAX_UNRELIABLE_MESSAGE_LEN = 1168;
    public static final List zzaFo = Arrays.asList(new Integer[] {
        Integer.valueOf(1), Integer.valueOf(2)
    });

    public abstract PendingResult acceptConnectionRequest(GoogleApiClient googleapiclient, String s, byte abyte0[], MessageListener messagelistener);

    public abstract void disconnectFromEndpoint(GoogleApiClient googleapiclient, String s);

    public abstract String getLocalDeviceId(GoogleApiClient googleapiclient);

    public abstract String getLocalEndpointId(GoogleApiClient googleapiclient);

    public abstract PendingResult rejectConnectionRequest(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult sendConnectionRequest(GoogleApiClient googleapiclient, String s, String s1, byte abyte0[], ConnectionResponseCallback connectionresponsecallback, MessageListener messagelistener);

    public abstract void sendReliableMessage(GoogleApiClient googleapiclient, String s, byte abyte0[]);

    public abstract void sendReliableMessage(GoogleApiClient googleapiclient, List list, byte abyte0[]);

    public abstract void sendUnreliableMessage(GoogleApiClient googleapiclient, String s, byte abyte0[]);

    public abstract void sendUnreliableMessage(GoogleApiClient googleapiclient, List list, byte abyte0[]);

    public abstract PendingResult startAdvertising(GoogleApiClient googleapiclient, String s, AppMetadata appmetadata, long l, ConnectionRequestListener connectionrequestlistener);

    public abstract PendingResult startDiscovery(GoogleApiClient googleapiclient, String s, long l, EndpointDiscoveryListener endpointdiscoverylistener);

    public abstract void stopAdvertising(GoogleApiClient googleapiclient);

    public abstract void stopAllEndpoints(GoogleApiClient googleapiclient);

    public abstract void stopDiscovery(GoogleApiClient googleapiclient, String s);

}
