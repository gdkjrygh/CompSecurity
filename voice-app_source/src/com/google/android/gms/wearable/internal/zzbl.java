// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.wearable.DataEventBuffer;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ChannelEventParcelable, AncsNotificationParcelable, CapabilityInfoParcelable, MessageEventParcelable, 
//            NodeParcelable

final class zzbl extends zzas.zza
{

    private final String zzaTD;
    private final IntentFilter zzaUk[];
    private com.google.android.gms.wearable.zza.zza zzaVb;
    private com.google.android.gms.wearable.DataApi.DataListener zzaVc;
    private com.google.android.gms.wearable.MessageApi.MessageListener zzaVd;
    private com.google.android.gms.wearable.NodeApi.NodeListener zzaVe;
    private com.google.android.gms.wearable.NodeApi.zza zzaVf;
    private com.google.android.gms.wearable.ChannelApi.ChannelListener zzaVg;
    private com.google.android.gms.wearable.CapabilityApi.CapabilityListener zzaVh;
    private final String zzaVi;

    private zzbl(com.google.android.gms.wearable.zza.zza zza1, com.google.android.gms.wearable.DataApi.DataListener datalistener, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener, com.google.android.gms.wearable.NodeApi.zza zza2, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, 
            IntentFilter aintentfilter[], String s, String s1)
    {
        zzaVb = zza1;
        zzaVc = datalistener;
        zzaVd = messagelistener;
        zzaVe = nodelistener;
        zzaVf = zza2;
        zzaVg = channellistener;
        zzaVh = capabilitylistener;
        zzaUk = aintentfilter;
        zzaVi = s;
        zzaTD = s1;
    }

    public static zzbl zza(com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, String s)
    {
        return new zzbl(null, null, null, null, null, null, (com.google.android.gms.wearable.CapabilityApi.CapabilityListener)zzu.zzu(capabilitylistener), null, null, s);
    }

    public static zzbl zza(com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener, String s)
    {
        return new zzbl(null, null, null, null, null, (com.google.android.gms.wearable.ChannelApi.ChannelListener)zzu.zzu(channellistener), null, null, (String)zzu.zzu(s), null);
    }

    public static zzbl zza(com.google.android.gms.wearable.DataApi.DataListener datalistener, IntentFilter aintentfilter[])
    {
        return new zzbl(null, (com.google.android.gms.wearable.DataApi.DataListener)zzu.zzu(datalistener), null, null, null, null, null, aintentfilter, null, null);
    }

    public static zzbl zza(com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, IntentFilter aintentfilter[])
    {
        return new zzbl(null, null, (com.google.android.gms.wearable.MessageApi.MessageListener)zzu.zzu(messagelistener), null, null, null, null, aintentfilter, null, null);
    }

    public static zzbl zza(com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
    {
        return new zzbl(null, null, null, (com.google.android.gms.wearable.NodeApi.NodeListener)zzu.zzu(nodelistener), null, null, null, null, null, null);
    }

    public static zzbl zzb(com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
    {
        return new zzbl(null, null, null, null, null, (com.google.android.gms.wearable.ChannelApi.ChannelListener)zzu.zzu(channellistener), null, null, null, null);
    }

    public void clear()
    {
        zzaVb = null;
        zzaVc = null;
        zzaVd = null;
        zzaVe = null;
        zzaVf = null;
        zzaVg = null;
        zzaVh = null;
    }

    public void onConnectedNodes(List list)
    {
        if (zzaVf != null)
        {
            zzaVf.onConnectedNodes(list);
        }
    }

    public IntentFilter[] zzBh()
    {
        return zzaUk;
    }

    public String zzBi()
    {
        return zzaVi;
    }

    public String zzBj()
    {
        return zzaTD;
    }

    public void zza(AncsNotificationParcelable ancsnotificationparcelable)
    {
        if (zzaVb != null)
        {
            zzaVb.zza(ancsnotificationparcelable);
        }
    }

    public void zza(CapabilityInfoParcelable capabilityinfoparcelable)
    {
        if (zzaVh != null)
        {
            zzaVh.onCapabilityChanged(capabilityinfoparcelable);
        }
    }

    public void zza(ChannelEventParcelable channeleventparcelable)
    {
        if (zzaVg != null)
        {
            channeleventparcelable.zza(zzaVg);
        }
    }

    public void zza(MessageEventParcelable messageeventparcelable)
    {
        if (zzaVd != null)
        {
            zzaVd.onMessageReceived(messageeventparcelable);
        }
    }

    public void zza(NodeParcelable nodeparcelable)
    {
        if (zzaVe != null)
        {
            zzaVe.onPeerConnected(nodeparcelable);
        }
    }

    public void zzac(DataHolder dataholder)
    {
        if (zzaVc == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        zzaVc.onDataChanged(new DataEventBuffer(dataholder));
        dataholder.close();
        return;
        Exception exception;
        exception;
        dataholder.close();
        throw exception;
        dataholder.close();
        return;
    }

    public void zzb(NodeParcelable nodeparcelable)
    {
        if (zzaVe != null)
        {
            zzaVe.onPeerDisconnected(nodeparcelable);
        }
    }
}
