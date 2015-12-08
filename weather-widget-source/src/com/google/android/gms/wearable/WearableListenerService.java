// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable:
//            CapabilityInfo, Channel, DataEventBuffer, MessageEvent, 
//            Node, zzj

public abstract class WearableListenerService extends Service
    implements CapabilityApi.CapabilityListener, ChannelApi.ChannelListener, DataApi.DataListener, MessageApi.MessageListener, NodeApi.NodeListener, NodeApi.zza
{
    private class zza extends com.google.android.gms.wearable.internal.zzav.zza
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
            WearableListenerService.zze(zzaZf).post(new Runnable(this, list) {

                final zza zzaZh;
                final List zzaZk;

                public void run()
                {
                    zzaZh.zzaZf.onConnectedNodes(zzaZk);
                }

            
            {
                zzaZh = zza1;
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
            WearableListenerService.zze(zzaZf).post(new Runnable(this, zzj1, amsentityupdateparcelable) {

                final zza zzaZh;
                final zzj zzaZm;
                final AmsEntityUpdateParcelable zzaZo;

                public void run()
                {
                    zzaZm.zza(zzaZo);
                }

            
            {
                zzaZh = zza1;
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
            WearableListenerService.zze(zzaZf).post(new Runnable(this, zzj1, ancsnotificationparcelable) {

                final zza zzaZh;
                final zzj zzaZm;
                final AncsNotificationParcelable zzaZn;

                public void run()
                {
                    zzaZm.zza(zzaZn);
                }

            
            {
                zzaZh = zza1;
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
            WearableListenerService.zze(zzaZf).post(new Runnable(this, capabilityinfoparcelable) {

                final zza zzaZh;
                final CapabilityInfoParcelable zzaZl;

                public void run()
                {
                    zzaZh.zzaZf.onCapabilityChanged(zzaZl);
                }

            
            {
                zzaZh = zza1;
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
            WearableListenerService.zze(zzaZf).post(new Runnable(this, channeleventparcelable) {

                final zza zzaZh;
                final ChannelEventParcelable zzaZp;

                public void run()
                {
                    zzaZp.zza(zzaZh.zzaZf);
                }

            
            {
                zzaZh = zza1;
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
            WearableListenerService.zze(zzaZf).post(new Runnable(this, messageeventparcelable) {

                final zza zzaZh;
                final MessageEventParcelable zzaZi;

                public void run()
                {
                    zzaZh.zzaZf.onMessageReceived(zzaZi);
                }

            
            {
                zzaZh = zza1;
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
            WearableListenerService.zze(zzaZf).post(new Runnable(this, nodeparcelable) {

                final zza zzaZh;
                final NodeParcelable zzaZj;

                public void run()
                {
                    zzaZh.zzaZf.onPeerConnected(zzaZj);
                }

            
            {
                zzaZh = zza1;
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
            WearableListenerService.zze(zzaZf).post(new Runnable(this, dataholder) {

                final DataHolder zzaZg;
                final zza zzaZh;

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
                zzaZh = zza1;
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
            WearableListenerService.zze(zzaZf).post(new Runnable(this, nodeparcelable) {

                final zza zzaZh;
                final NodeParcelable zzaZj;

                public void run()
                {
                    zzaZh.zzaZf.onPeerDisconnected(zzaZj);
                }

            
            {
                zzaZh = zza1;
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

        zza()
        {
            zzaZf = WearableListenerService.this;
            super();
            zzaZe = false;
            zzaZe = WearableListenerService.this instanceof zzj;
        }
    }


    public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    private boolean zzLA;
    private String zzOZ;
    private Handler zzaZc;
    private Object zzaZd;
    private volatile int zzacB;
    private IBinder zzacE;

    public WearableListenerService()
    {
        zzacB = -1;
        zzaZd = new Object();
    }

    private void zzCs()
        throws SecurityException
    {
        int i = Binder.getCallingUid();
        if (i == zzacB)
        {
            return;
        }
        if (GooglePlayServicesUtil.zze(this, i))
        {
            zzacB = i;
            return;
        } else
        {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
    }

    static String zza(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.zzOZ;
    }

    static void zzb(WearableListenerService wearablelistenerservice)
        throws SecurityException
    {
        wearablelistenerservice.zzCs();
    }

    static Object zzc(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.zzaZd;
    }

    static boolean zzd(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.zzLA;
    }

    static Handler zze(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.zzaZc;
    }

    public final IBinder onBind(Intent intent)
    {
        if ("com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction()))
        {
            return zzacE;
        } else
        {
            return null;
        }
    }

    public void onCapabilityChanged(CapabilityInfo capabilityinfo)
    {
    }

    public void onChannelClosed(Channel channel, int i, int j)
    {
    }

    public void onChannelOpened(Channel channel)
    {
    }

    public void onConnectedNodes(List list)
    {
    }

    public void onCreate()
    {
        super.onCreate();
        if (Log.isLoggable("WearableLS", 3))
        {
            Log.d("WearableLS", (new StringBuilder()).append("onCreate: ").append(getPackageName()).toString());
        }
        zzOZ = getPackageName();
        HandlerThread handlerthread = new HandlerThread("WearableListenerService");
        handlerthread.start();
        zzaZc = new Handler(handlerthread.getLooper());
        zzacE = new zza();
    }

    public void onDataChanged(DataEventBuffer dataeventbuffer)
    {
    }

    public void onDestroy()
    {
        Object obj = zzaZd;
        obj;
        JVM INSTR monitorenter ;
        zzLA = true;
        if (zzaZc == null)
        {
            throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()?");
        }
        break MISSING_BLOCK_LABEL_34;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzaZc.getLooper().quit();
        obj;
        JVM INSTR monitorexit ;
        super.onDestroy();
        return;
    }

    public void onInputClosed(Channel channel, int i, int j)
    {
    }

    public void onMessageReceived(MessageEvent messageevent)
    {
    }

    public void onOutputClosed(Channel channel, int i, int j)
    {
    }

    public void onPeerConnected(Node node)
    {
    }

    public void onPeerDisconnected(Node node)
    {
    }
}
