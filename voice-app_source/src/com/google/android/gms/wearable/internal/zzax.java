// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzf, zzbk

public final class zzax
    implements NodeApi
{
    private static final class zza extends zzf
    {

        private com.google.android.gms.wearable.NodeApi.NodeListener zzaUI;

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((zzbk)client);
        }

        protected void zza(zzbk zzbk1)
            throws RemoteException
        {
            zzbk1.zza(this, zzaUI);
            zzaUI = null;
        }

        public Status zzb(Status status)
        {
            zzaUI = null;
            return status;
        }

        private zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
        {
            super(googleapiclient);
            zzaUI = nodelistener;
        }

    }

    public static class zzb
        implements com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult
    {

        private final Status zzOt;
        private final List zzaUJ;

        public List getNodes()
        {
            return zzaUJ;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        public zzb(Status status, List list)
        {
            zzOt = status;
            zzaUJ = list;
        }
    }

    public static class zzc
        implements com.google.android.gms.wearable.NodeApi.GetLocalNodeResult
    {

        private final Status zzOt;
        private final Node zzaUK;

        public Node getNode()
        {
            return zzaUK;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        public zzc(Status status, Node node)
        {
            zzOt = status;
            zzaUK = node;
        }
    }


    public zzax()
    {
    }

    public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
    {
        return googleapiclient.zza(new zza(googleapiclient, nodelistener));
    }

    public PendingResult getConnectedNodes(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zza(new zzf(googleapiclient) {

            final zzax zzaUG;

            protected Result createFailedResult(Status status)
            {
                return zzbj(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzbk)client);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zzn(this);
            }

            protected com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult zzbj(Status status)
            {
                return new zzb(status, new ArrayList());
            }

            
            {
                zzaUG = zzax.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult getLocalNode(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zza(new zzf(googleapiclient) {

            final zzax zzaUG;

            protected Result createFailedResult(Status status)
            {
                return zzbi(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzbk)client);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zzm(this);
            }

            protected com.google.android.gms.wearable.NodeApi.GetLocalNodeResult zzbi(Status status)
            {
                return new zzc(status, null);
            }

            
            {
                zzaUG = zzax.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
    {
        return googleapiclient.zza(new zzf(googleapiclient, nodelistener) {

            final zzax zzaUG;
            final com.google.android.gms.wearable.NodeApi.NodeListener zzaUH;

            public Result createFailedResult(Status status)
            {
                return zzb(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzbk)client);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zzb(this, zzaUH);
            }

            public Status zzb(Status status)
            {
                return status;
            }

            
            {
                zzaUG = zzax.this;
                zzaUH = nodelistener;
                super(googleapiclient);
            }
        });
    }
}
