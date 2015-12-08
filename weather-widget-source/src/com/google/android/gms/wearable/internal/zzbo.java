// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.DataEventBuffer;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ChannelEventParcelable, AmsEntityUpdateParcelable, AncsNotificationParcelable, CapabilityInfoParcelable, 
//            MessageEventParcelable, NodeParcelable

final class zzbo extends zzav.zza
{

    private final String zzaZF;
    private final IntentFilter zzbal[];
    private com.google.android.gms.wearable.zza.zza zzbbg;
    private com.google.android.gms.wearable.zzc.zza zzbbh;
    private com.google.android.gms.wearable.DataApi.DataListener zzbbi;
    private com.google.android.gms.wearable.MessageApi.MessageListener zzbbj;
    private com.google.android.gms.wearable.NodeApi.NodeListener zzbbk;
    private com.google.android.gms.wearable.NodeApi.zza zzbbl;
    private com.google.android.gms.wearable.ChannelApi.ChannelListener zzbbm;
    private com.google.android.gms.wearable.CapabilityApi.CapabilityListener zzbbn;
    private final String zzbbo;

    private zzbo(com.google.android.gms.wearable.zza.zza zza1, com.google.android.gms.wearable.zzc.zza zza2, com.google.android.gms.wearable.DataApi.DataListener datalistener, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener, com.google.android.gms.wearable.NodeApi.zza zza3, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener, 
            com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, IntentFilter aintentfilter[], String s, String s1)
    {
        zzbbg = zza1;
        zzbbh = zza2;
        zzbbi = datalistener;
        zzbbj = messagelistener;
        zzbbk = nodelistener;
        zzbbl = zza3;
        zzbbm = channellistener;
        zzbbn = capabilitylistener;
        zzbal = aintentfilter;
        zzbbo = s;
        zzaZF = s1;
    }

    public static zzbo zza(com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, String s)
    {
        return new zzbo(null, null, null, null, null, null, null, (com.google.android.gms.wearable.CapabilityApi.CapabilityListener)zzx.zzv(capabilitylistener), null, null, s);
    }

    public static zzbo zza(com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener, String s)
    {
        return new zzbo(null, null, null, null, null, null, (com.google.android.gms.wearable.ChannelApi.ChannelListener)zzx.zzv(channellistener), null, null, (String)zzx.zzv(s), null);
    }

    public static zzbo zza(com.google.android.gms.wearable.DataApi.DataListener datalistener, IntentFilter aintentfilter[])
    {
        return new zzbo(null, null, (com.google.android.gms.wearable.DataApi.DataListener)zzx.zzv(datalistener), null, null, null, null, null, aintentfilter, null, null);
    }

    public static zzbo zza(com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, IntentFilter aintentfilter[])
    {
        return new zzbo(null, null, null, (com.google.android.gms.wearable.MessageApi.MessageListener)zzx.zzv(messagelistener), null, null, null, null, aintentfilter, null, null);
    }

    public static zzbo zza(com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
    {
        return new zzbo(null, null, null, null, (com.google.android.gms.wearable.NodeApi.NodeListener)zzx.zzv(nodelistener), null, null, null, null, null, null);
    }

    public static zzbo zzb(com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
    {
        return new zzbo(null, null, null, null, null, null, (com.google.android.gms.wearable.ChannelApi.ChannelListener)zzx.zzv(channellistener), null, null, null, null);
    }

    public void clear()
    {
        zzbbg = null;
        zzbbh = null;
        zzbbi = null;
        zzbbj = null;
        zzbbk = null;
        zzbbl = null;
        zzbbm = null;
        zzbbn = null;
    }

    public void onConnectedNodes(List list)
    {
        if (zzbbl != null)
        {
            zzbbl.onConnectedNodes(list);
        }
    }

    public IntentFilter[] zzCJ()
    {
        return zzbal;
    }

    public String zzCK()
    {
        return zzbbo;
    }

    public String zzCL()
    {
        return zzaZF;
    }

    public void zza(AmsEntityUpdateParcelable amsentityupdateparcelable)
    {
        if (zzbbg != null)
        {
            zzbbg.zza(amsentityupdateparcelable);
        }
    }

    public void zza(AncsNotificationParcelable ancsnotificationparcelable)
    {
        if (zzbbh != null)
        {
            zzbbh.zza(ancsnotificationparcelable);
        }
    }

    public void zza(CapabilityInfoParcelable capabilityinfoparcelable)
    {
        if (zzbbn != null)
        {
            zzbbn.onCapabilityChanged(capabilityinfoparcelable);
        }
    }

    public void zza(ChannelEventParcelable channeleventparcelable)
    {
        if (zzbbm != null)
        {
            channeleventparcelable.zza(zzbbm);
        }
    }

    public void zza(MessageEventParcelable messageeventparcelable)
    {
        if (zzbbj != null)
        {
            zzbbj.onMessageReceived(messageeventparcelable);
        }
    }

    public void zza(NodeParcelable nodeparcelable)
    {
        if (zzbbk != null)
        {
            zzbbk.onPeerConnected(nodeparcelable);
        }
    }

    public void zzad(DataHolder dataholder)
    {
        if (zzbbi == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        zzbbi.onDataChanged(new DataEventBuffer(dataholder));
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
        if (zzbbk != null)
        {
            zzbbk.onPeerDisconnected(nodeparcelable);
        }
    }
}
