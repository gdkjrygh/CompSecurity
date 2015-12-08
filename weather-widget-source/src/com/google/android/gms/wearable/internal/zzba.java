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
//            zzh, zzbn

public final class zzba
    implements NodeApi
{
    private static final class zza extends zzh
    {

        private com.google.android.gms.wearable.NodeApi.NodeListener zzbaL;

        protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
            throws RemoteException
        {
            zza((zzbn)zzb1);
        }

        protected void zza(zzbn zzbn1)
            throws RemoteException
        {
            zzbn1.zza(this, zzbaL);
            zzbaL = null;
        }

        public Result zzb(Status status)
        {
            return zzd(status);
        }

        public Status zzd(Status status)
        {
            zzbaL = null;
            return status;
        }

        private zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
        {
            super(googleapiclient);
            zzbaL = nodelistener;
        }

    }

    public static class zzb
        implements com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult
    {

        private final Status zzQA;
        private final List zzbaM;

        public List getNodes()
        {
            return zzbaM;
        }

        public Status getStatus()
        {
            return zzQA;
        }

        public zzb(Status status, List list)
        {
            zzQA = status;
            zzbaM = list;
        }
    }

    public static class zzc
        implements com.google.android.gms.wearable.NodeApi.GetLocalNodeResult
    {

        private final Status zzQA;
        private final Node zzbaN;

        public Node getNode()
        {
            return zzbaN;
        }

        public Status getStatus()
        {
            return zzQA;
        }

        public zzc(Status status, Node node)
        {
            zzQA = status;
            zzbaN = node;
        }
    }


    public zzba()
    {
    }

    public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
    {
        return googleapiclient.zza(new zza(googleapiclient, nodelistener));
    }

    public PendingResult getConnectedNodes(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zza(new zzh(googleapiclient) {

            final zzba zzbaJ;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzbn)zzb1);
            }

            protected void zza(zzbn zzbn1)
                throws RemoteException
            {
                zzbn1.zzp(this);
            }

            protected Result zzb(Status status)
            {
                return zzbv(status);
            }

            protected com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult zzbv(Status status)
            {
                return new zzb(status, new ArrayList());
            }

            
            {
                zzbaJ = zzba.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult getLocalNode(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zza(new zzh(googleapiclient) {

            final zzba zzbaJ;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzbn)zzb1);
            }

            protected void zza(zzbn zzbn1)
                throws RemoteException
            {
                zzbn1.zzo(this);
            }

            protected Result zzb(Status status)
            {
                return zzbu(status);
            }

            protected com.google.android.gms.wearable.NodeApi.GetLocalNodeResult zzbu(Status status)
            {
                return new zzc(status, null);
            }

            
            {
                zzbaJ = zzba.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
    {
        return googleapiclient.zza(new zzh(googleapiclient, nodelistener) {

            final zzba zzbaJ;
            final com.google.android.gms.wearable.NodeApi.NodeListener zzbaK;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzbn)zzb1);
            }

            protected void zza(zzbn zzbn1)
                throws RemoteException
            {
                zzbn1.zzb(this, zzbaK);
            }

            public Result zzb(Status status)
            {
                return zzd(status);
            }

            public Status zzd(Status status)
            {
                return status;
            }

            
            {
                zzbaJ = zzba.this;
                zzbaK = nodelistener;
                super(googleapiclient);
            }
        });
    }
}
