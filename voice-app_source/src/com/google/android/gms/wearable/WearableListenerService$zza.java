// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService, zzh, DataEventBuffer

private class zzaTf extends com.google.android.gms.wearable.internal.
{

    boolean zzaTf;
    final WearableListenerService zzaTg;

    public void onConnectedNodes(List list)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder()).append("onConnectedNodes: ").append(WearableListenerService.zza(zzaTg)).append(": ").append(list).toString());
            }
            WearableListenerService.zzb(zzaTg);
            synchronized (WearableListenerService.zzc(zzaTg))
            {
                if (!WearableListenerService.zzd(zzaTg))
                {
                    break label0;
                }
            }
            return;
        }
        WearableListenerService.zze(zzaTg).post(new Runnable(list) {

            final WearableListenerService.zza zzaTi;
            final List zzaTl;

            public void run()
            {
                zzaTi.zzaTg.onConnectedNodes(zzaTl);
            }

            
            {
                zzaTi = WearableListenerService.zza.this;
                zzaTl = list;
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

    public void zza(AncsNotificationParcelable ancsnotificationparcelable)
    {
        zzh zzh1;
        if (Log.isLoggable("WearableLS", 3))
        {
            Log.d("WearableLS", (new StringBuilder()).append("onNotificationReceived: ").append(ancsnotificationparcelable).toString());
        }
        if (!zzaTf)
        {
            return;
        }
        WearableListenerService.zzb(zzaTg);
        zzh1 = (zzh)zzaTg;
        synchronized (WearableListenerService.zzc(zzaTg))
        {
            if (!WearableListenerService.zzd(zzaTg))
            {
                break MISSING_BLOCK_LABEL_85;
            }
        }
        return;
        ancsnotificationparcelable;
        obj;
        JVM INSTR monitorexit ;
        throw ancsnotificationparcelable;
        WearableListenerService.zze(zzaTg).post(new Runnable(zzh1, ancsnotificationparcelable) {

            final WearableListenerService.zza zzaTi;
            final zzh zzaTn;
            final AncsNotificationParcelable zzaTo;

            public void run()
            {
                zzaTn.zza(zzaTo);
            }

            
            {
                zzaTi = WearableListenerService.zza.this;
                zzaTn = zzh1;
                zzaTo = ancsnotificationparcelable;
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
            WearableListenerService.zzb(zzaTg);
            synchronized (WearableListenerService.zzc(zzaTg))
            {
                if (!WearableListenerService.zzd(zzaTg))
                {
                    break label0;
                }
            }
            return;
        }
        WearableListenerService.zze(zzaTg).post(new Runnable(capabilityinfoparcelable) {

            final WearableListenerService.zza zzaTi;
            final CapabilityInfoParcelable zzaTm;

            public void run()
            {
                zzaTi.zzaTg.onCapabilityChanged(zzaTm);
            }

            
            {
                zzaTi = WearableListenerService.zza.this;
                zzaTm = capabilityinfoparcelable;
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
            WearableListenerService.zzb(zzaTg);
            synchronized (WearableListenerService.zzc(zzaTg))
            {
                if (!WearableListenerService.zzd(zzaTg))
                {
                    break label0;
                }
            }
            return;
        }
        WearableListenerService.zze(zzaTg).post(new Runnable(channeleventparcelable) {

            final WearableListenerService.zza zzaTi;
            final ChannelEventParcelable zzaTp;

            public void run()
            {
                zzaTp.zza(zzaTi.zzaTg);
            }

            
            {
                zzaTi = WearableListenerService.zza.this;
                zzaTp = channeleventparcelable;
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
            WearableListenerService.zzb(zzaTg);
            synchronized (WearableListenerService.zzc(zzaTg))
            {
                if (!WearableListenerService.zzd(zzaTg))
                {
                    break label0;
                }
            }
            return;
        }
        WearableListenerService.zze(zzaTg).post(new Runnable(messageeventparcelable) {

            final WearableListenerService.zza zzaTi;
            final MessageEventParcelable zzaTj;

            public void run()
            {
                zzaTi.zzaTg.onMessageReceived(zzaTj);
            }

            
            {
                zzaTi = WearableListenerService.zza.this;
                zzaTj = messageeventparcelable;
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
                Log.d("WearableLS", (new StringBuilder()).append("onPeerConnected: ").append(WearableListenerService.zza(zzaTg)).append(": ").append(nodeparcelable).toString());
            }
            WearableListenerService.zzb(zzaTg);
            synchronized (WearableListenerService.zzc(zzaTg))
            {
                if (!WearableListenerService.zzd(zzaTg))
                {
                    break label0;
                }
            }
            return;
        }
        WearableListenerService.zze(zzaTg).post(new Runnable(nodeparcelable) {

            final WearableListenerService.zza zzaTi;
            final NodeParcelable zzaTk;

            public void run()
            {
                zzaTi.zzaTg.onPeerConnected(zzaTk);
            }

            
            {
                zzaTi = WearableListenerService.zza.this;
                zzaTk = nodeparcelable;
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

    public void zzac(DataHolder dataholder)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder()).append("onDataItemChanged: ").append(WearableListenerService.zza(zzaTg)).append(": ").append(dataholder).toString());
            }
            WearableListenerService.zzb(zzaTg);
            synchronized (WearableListenerService.zzc(zzaTg))
            {
                if (!WearableListenerService.zzd(zzaTg))
                {
                    break label0;
                }
                dataholder.close();
            }
            return;
        }
        WearableListenerService.zze(zzaTg).post(new Runnable(dataholder) {

            final DataHolder zzaTh;
            final WearableListenerService.zza zzaTi;

            public void run()
            {
                DataEventBuffer dataeventbuffer = new DataEventBuffer(zzaTh);
                zzaTi.zzaTg.onDataChanged(dataeventbuffer);
                dataeventbuffer.release();
                return;
                Exception exception;
                exception;
                dataeventbuffer.release();
                throw exception;
            }

            
            {
                zzaTi = WearableListenerService.zza.this;
                zzaTh = dataholder;
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
                Log.d("WearableLS", (new StringBuilder()).append("onPeerDisconnected: ").append(WearableListenerService.zza(zzaTg)).append(": ").append(nodeparcelable).toString());
            }
            WearableListenerService.zzb(zzaTg);
            synchronized (WearableListenerService.zzc(zzaTg))
            {
                if (!WearableListenerService.zzd(zzaTg))
                {
                    break label0;
                }
            }
            return;
        }
        WearableListenerService.zze(zzaTg).post(new Runnable(nodeparcelable) {

            final WearableListenerService.zza zzaTi;
            final NodeParcelable zzaTk;

            public void run()
            {
                zzaTi.zzaTg.onPeerDisconnected(zzaTk);
            }

            
            {
                zzaTi = WearableListenerService.zza.this;
                zzaTk = nodeparcelable;
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

    _cls8.zzaTp(WearableListenerService wearablelistenerservice)
    {
        zzaTg = wearablelistenerservice;
        super();
        zzaTf = false;
        zzaTf = wearablelistenerservice instanceof zzh;
    }
}
