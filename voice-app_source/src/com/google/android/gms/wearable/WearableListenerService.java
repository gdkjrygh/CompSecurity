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
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable:
//            CapabilityInfo, Channel, DataEventBuffer, MessageEvent, 
//            Node, zzh

public abstract class WearableListenerService extends Service
    implements CapabilityApi.CapabilityListener, ChannelApi.ChannelListener, DataApi.DataListener, MessageApi.MessageListener, NodeApi.NodeListener, NodeApi.zza
{
    private class zza extends com.google.android.gms.wearable.internal.zzas.zza
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
            WearableListenerService.zze(zzaTg).post(new Runnable(this, list) {

                final zza zzaTi;
                final List zzaTl;

                public void run()
                {
                    zzaTi.zzaTg.onConnectedNodes(zzaTl);
                }

            
            {
                zzaTi = zza1;
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
            WearableListenerService.zze(zzaTg).post(new Runnable(this, zzh1, ancsnotificationparcelable) {

                final zza zzaTi;
                final zzh zzaTn;
                final AncsNotificationParcelable zzaTo;

                public void run()
                {
                    zzaTn.zza(zzaTo);
                }

            
            {
                zzaTi = zza1;
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
            WearableListenerService.zze(zzaTg).post(new Runnable(this, capabilityinfoparcelable) {

                final zza zzaTi;
                final CapabilityInfoParcelable zzaTm;

                public void run()
                {
                    zzaTi.zzaTg.onCapabilityChanged(zzaTm);
                }

            
            {
                zzaTi = zza1;
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
            WearableListenerService.zze(zzaTg).post(new Runnable(this, channeleventparcelable) {

                final zza zzaTi;
                final ChannelEventParcelable zzaTp;

                public void run()
                {
                    zzaTp.zza(zzaTi.zzaTg);
                }

            
            {
                zzaTi = zza1;
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
            WearableListenerService.zze(zzaTg).post(new Runnable(this, messageeventparcelable) {

                final zza zzaTi;
                final MessageEventParcelable zzaTj;

                public void run()
                {
                    zzaTi.zzaTg.onMessageReceived(zzaTj);
                }

            
            {
                zzaTi = zza1;
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
            WearableListenerService.zze(zzaTg).post(new Runnable(this, nodeparcelable) {

                final zza zzaTi;
                final NodeParcelable zzaTk;

                public void run()
                {
                    zzaTi.zzaTg.onPeerConnected(zzaTk);
                }

            
            {
                zzaTi = zza1;
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
            WearableListenerService.zze(zzaTg).post(new Runnable(this, dataholder) {

                final DataHolder zzaTh;
                final zza zzaTi;

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
                zzaTi = zza1;
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
            WearableListenerService.zze(zzaTg).post(new Runnable(this, nodeparcelable) {

                final zza zzaTi;
                final NodeParcelable zzaTk;

                public void run()
                {
                    zzaTi.zzaTg.onPeerDisconnected(zzaTk);
                }

            
            {
                zzaTi = zza1;
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

        zza()
        {
            zzaTg = WearableListenerService.this;
            super();
            zzaTf = false;
            zzaTf = WearableListenerService.this instanceof zzh;
        }
    }


    public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    private boolean zzJA;
    private String zzMZ;
    private volatile int zzZN;
    private IBinder zzZQ;
    private Handler zzaTd;
    private Object zzaTe;

    public WearableListenerService()
    {
        zzZN = -1;
        zzaTe = new Object();
    }

    private void zzAS()
        throws SecurityException
    {
        int i = Binder.getCallingUid();
        if (i == zzZN)
        {
            return;
        }
        if (GooglePlayServicesUtil.zzd(this, i))
        {
            zzZN = i;
            return;
        } else
        {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
    }

    static String zza(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.zzMZ;
    }

    static void zzb(WearableListenerService wearablelistenerservice)
        throws SecurityException
    {
        wearablelistenerservice.zzAS();
    }

    static Object zzc(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.zzaTe;
    }

    static boolean zzd(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.zzJA;
    }

    static Handler zze(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.zzaTd;
    }

    public final IBinder onBind(Intent intent)
    {
        if ("com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction()))
        {
            return zzZQ;
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
        zzMZ = getPackageName();
        HandlerThread handlerthread = new HandlerThread("WearableListenerService");
        handlerthread.start();
        zzaTd = new Handler(handlerthread.getLooper());
        zzZQ = new zza();
    }

    public void onDataChanged(DataEventBuffer dataeventbuffer)
    {
    }

    public void onDestroy()
    {
        Object obj = zzaTe;
        obj;
        JVM INSTR monitorenter ;
        zzJA = true;
        if (zzaTd == null)
        {
            throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()?");
        }
        break MISSING_BLOCK_LABEL_34;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzaTd.getLooper().quit();
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
