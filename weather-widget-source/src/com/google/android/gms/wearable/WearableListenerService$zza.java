// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService, zzj, DataEventBuffer

private class zzaZe extends com.google.android.gms.wearable.internal.
{

    boolean zzaZe;
    final WearableListenerService zzaZf;

    public void onConnectedNodes(List list)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder()).append("onConnectedNodes: ").append(WearableListenerService.zza(zzaZf)).append(": ").append(list).toString());
            }
            WearableListenerService.zzb(zzaZf);
            synchronized (WearableListenerService.zzc(zzaZf))
            {
                if (!WearableListenerService.zzd(zzaZf))
                {
                    break label0;
                }
            }
            return;
        }
        WearableListenerService.zze(zzaZf).post(new Runnable(list) {

            final WearableListenerService.zza zzaZh;
            final List zzaZk;

            public void run()
            {
                zzaZh.zzaZf.onConnectedNodes(zzaZk);
            }

            
            {
                zzaZh = WearableListenerService.zza.this;
                zzaZk = list;
                super();
            }
        });
        obj;
        JVM INSTR monitorexit ;
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public void zza(AmsEntityUpdateParcelable amsentityupdateparcelable)
    {
        zzj zzj1;
        if (Log.isLoggable("WearableLS", 3))
        {
            Log.d("WearableLS", (new StringBuilder()).append("onEntityUpdate: ").append(amsentityupdateparcelable).toString());
        }
        if (!zzaZe)
        {
            return;
        }
        WearableListenerService.zzb(zzaZf);
        zzj1 = (zzj)zzaZf;
        synchronized (WearableListenerService.zzc(zzaZf))
        {
            if (!WearableListenerService.zzd(zzaZf))
            {
                break MISSING_BLOCK_LABEL_85;
            }
        }
        return;
        amsentityupdateparcelable;
        obj;
        JVM INSTR monitorexit ;
        throw amsentityupdateparcelable;
        WearableListenerService.zze(zzaZf).post(new Runnable(zzj1, amsentityupdateparcelable) {

            final WearableListenerService.zza zzaZh;
            final zzj zzaZm;
            final AmsEntityUpdateParcelable zzaZo;

            public void run()
            {
                zzaZm.zza(zzaZo);
            }

            
            {
                zzaZh = WearableListenerService.zza.this;
                zzaZm = zzj1;
                zzaZo = amsentityupdateparcelable;
                super();
            }
        });
        obj;
        JVM INSTR monitorexit ;
    }

    public void zza(AncsNotificationParcelable ancsnotificationparcelable)
    {
        zzj zzj1;
        if (Log.isLoggable("WearableLS", 3))
        {
            Log.d("WearableLS", (new StringBuilder()).append("onNotificationReceived: ").append(ancsnotificationparcelable).toString());
        }
        if (!zzaZe)
        {
            return;
        }
        WearableListenerService.zzb(zzaZf);
        zzj1 = (zzj)zzaZf;
        synchronized (WearableListenerService.zzc(zzaZf))
        {
            if (!WearableListenerService.zzd(zzaZf))
            {
                break MISSING_BLOCK_LABEL_85;
            }
        }
        return;
        ancsnotificationparcelable;
        obj;
        JVM INSTR monitorexit ;
        throw ancsnotificationparcelable;
        WearableListenerService.zze(zzaZf).post(new Runnable(zzj1, ancsnotificationparcelable) {

            final WearableListenerService.zza zzaZh;
            final zzj zzaZm;
            final AncsNotificationParcelable zzaZn;

            public void run()
            {
                zzaZm.zza(zzaZn);
            }

            
            {
                zzaZh = WearableListenerService.zza.this;
                zzaZm = zzj1;
                zzaZn = ancsnotificationparcelable;
                super();
            }
        });
        obj;
        JVM INSTR monitorexit ;
    }

    public void zza(CapabilityInfoParcelable capabilityinfoparcelable)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder()).append("onConnectedCapabilityChanged: ").append(capabilityinfoparcelable).toString());
            }
            WearableListenerService.zzb(zzaZf);
            synchronized (WearableListenerService.zzc(zzaZf))
            {
                if (!WearableListenerService.zzd(zzaZf))
                {
                    break label0;
                }
            }
            return;
        }
        WearableListenerService.zze(zzaZf).post(new Runnable(capabilityinfoparcelable) {

            final WearableListenerService.zza zzaZh;
            final CapabilityInfoParcelable zzaZl;

            public void run()
            {
                zzaZh.zzaZf.onCapabilityChanged(zzaZl);
            }

            
            {
                zzaZh = WearableListenerService.zza.this;
                zzaZl = capabilityinfoparcelable;
                super();
            }
        });
        obj;
        JVM INSTR monitorexit ;
        return;
        capabilityinfoparcelable;
        obj;
        JVM INSTR monitorexit ;
        throw capabilityinfoparcelable;
    }

    public void zza(ChannelEventParcelable channeleventparcelable)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder()).append("onChannelEvent: ").append(channeleventparcelable).toString());
            }
            WearableListenerService.zzb(zzaZf);
            synchronized (WearableListenerService.zzc(zzaZf))
            {
                if (!WearableListenerService.zzd(zzaZf))
                {
                    break label0;
                }
            }
            return;
        }
        WearableListenerService.zze(zzaZf).post(new Runnable(channeleventparcelable) {

            final WearableListenerService.zza zzaZh;
            final ChannelEventParcelable zzaZp;

            public void run()
            {
                zzaZp.zza(zzaZh.zzaZf);
            }

            
            {
                zzaZh = WearableListenerService.zza.this;
                zzaZp = channeleventparcelable;
                super();
            }
        });
        obj;
        JVM INSTR monitorexit ;
        return;
        channeleventparcelable;
        obj;
        JVM INSTR monitorexit ;
        throw channeleventparcelable;
    }

    public void zza(MessageEventParcelable messageeventparcelable)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder()).append("onMessageReceived: ").append(messageeventparcelable).toString());
            }
            WearableListenerService.zzb(zzaZf);
            synchronized (WearableListenerService.zzc(zzaZf))
            {
                if (!WearableListenerService.zzd(zzaZf))
                {
                    break label0;
                }
            }
            return;
        }
        WearableListenerService.zze(zzaZf).post(new Runnable(messageeventparcelable) {

            final WearableListenerService.zza zzaZh;
            final MessageEventParcelable zzaZi;

            public void run()
            {
                zzaZh.zzaZf.onMessageReceived(zzaZi);
            }

            
            {
                zzaZh = WearableListenerService.zza.this;
                zzaZi = messageeventparcelable;
                super();
            }
        });
        obj;
        JVM INSTR monitorexit ;
        return;
        messageeventparcelable;
        obj;
        JVM INSTR monitorexit ;
        throw messageeventparcelable;
    }

    public void zza(NodeParcelable nodeparcelable)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder()).append("onPeerConnected: ").append(WearableListenerService.zza(zzaZf)).append(": ").append(nodeparcelable).toString());
            }
            WearableListenerService.zzb(zzaZf);
            synchronized (WearableListenerService.zzc(zzaZf))
            {
                if (!WearableListenerService.zzd(zzaZf))
                {
                    break label0;
                }
            }
            return;
        }
        WearableListenerService.zze(zzaZf).post(new Runnable(nodeparcelable) {

            final WearableListenerService.zza zzaZh;
            final NodeParcelable zzaZj;

            public void run()
            {
                zzaZh.zzaZf.onPeerConnected(zzaZj);
            }

            
            {
                zzaZh = WearableListenerService.zza.this;
                zzaZj = nodeparcelable;
                super();
            }
        });
        obj;
        JVM INSTR monitorexit ;
        return;
        nodeparcelable;
        obj;
        JVM INSTR monitorexit ;
        throw nodeparcelable;
    }

    public void zzad(DataHolder dataholder)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder()).append("onDataItemChanged: ").append(WearableListenerService.zza(zzaZf)).append(": ").append(dataholder).toString());
            }
            WearableListenerService.zzb(zzaZf);
            synchronized (WearableListenerService.zzc(zzaZf))
            {
                if (!WearableListenerService.zzd(zzaZf))
                {
                    break label0;
                }
                dataholder.close();
            }
            return;
        }
        WearableListenerService.zze(zzaZf).post(new Runnable(dataholder) {

            final DataHolder zzaZg;
            final WearableListenerService.zza zzaZh;

            public void run()
            {
                DataEventBuffer dataeventbuffer = new DataEventBuffer(zzaZg);
                zzaZh.zzaZf.onDataChanged(dataeventbuffer);
                dataeventbuffer.release();
                return;
                Exception exception;
                exception;
                dataeventbuffer.release();
                throw exception;
            }

            
            {
                zzaZh = WearableListenerService.zza.this;
                zzaZg = dataholder;
                super();
            }
        });
        obj;
        JVM INSTR monitorexit ;
        return;
        dataholder;
        obj;
        JVM INSTR monitorexit ;
        throw dataholder;
    }

    public void zzb(NodeParcelable nodeparcelable)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder()).append("onPeerDisconnected: ").append(WearableListenerService.zza(zzaZf)).append(": ").append(nodeparcelable).toString());
            }
            WearableListenerService.zzb(zzaZf);
            synchronized (WearableListenerService.zzc(zzaZf))
            {
                if (!WearableListenerService.zzd(zzaZf))
                {
                    break label0;
                }
            }
            return;
        }
        WearableListenerService.zze(zzaZf).post(new Runnable(nodeparcelable) {

            final WearableListenerService.zza zzaZh;
            final NodeParcelable zzaZj;

            public void run()
            {
                zzaZh.zzaZf.onPeerDisconnected(zzaZj);
            }

            
            {
                zzaZh = WearableListenerService.zza.this;
                zzaZj = nodeparcelable;
                super();
            }
        });
        obj;
        JVM INSTR monitorexit ;
        return;
        nodeparcelable;
        obj;
        JVM INSTR monitorexit ;
        throw nodeparcelable;
    }

    _cls9.zzaZp(WearableListenerService wearablelistenerservice)
    {
        zzaZf = wearablelistenerservice;
        super();
        zzaZe = false;
        zzaZe = wearablelistenerservice instanceof zzj;
    }
}
