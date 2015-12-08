// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzab;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzv;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient, zzf, Api, zzh, 
//            zzd, zze, Status, zzi

final class zzg
    implements GoogleApiClient
{
    final class zza extends Handler
    {

        final zzg zzQJ;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                Log.w("GoogleApiClientImpl", (new StringBuilder()).append("Unknown message id: ").append(message.what).toString());
                return;

            case 1: // '\001'
                zzg.zzg(zzQJ);
                return;

            case 2: // '\002'
                zzg.zzf(zzQJ);
                break;
            }
        }

        zza(Looper looper)
        {
            zzQJ = zzg.this;
            super(looper);
        }
    }

    private static class zzb extends BroadcastReceiver
    {

        private WeakReference zzQP;

        public void onReceive(Context context, Intent intent)
        {
            intent = intent.getData();
            context = null;
            if (intent != null)
            {
                context = intent.getSchemeSpecificPart();
            }
            if (context != null && context.equals("com.google.android.gms"))
            {
                if ((context = (zzg)zzQP.get()) != null)
                {
                    zzg.zzf(context);
                    return;
                }
            }
        }

        zzb(zzg zzg1)
        {
            zzQP = new WeakReference(zzg1);
        }
    }

    static interface zzc
    {

        public abstract void zzc(zze zze1);
    }

    public abstract class zzd
        implements GoogleApiClient.ConnectionCallbacks
    {

        final zzg zzQJ;

        public void onConnectionSuspended(int i)
        {
            zzg.zzb(zzQJ).lock();
            boolean flag = zzg.zza(zzQJ) instanceof zzf;
            if (flag)
            {
                zzg.zzb(zzQJ).unlock();
                return;
            }
            i;
            JVM INSTR tableswitch 1 2: default 64
        //                       1 110
        //                       2 77;
               goto _L1 _L2 _L3
_L1:
            zzg.zzb(zzQJ).unlock();
            return;
_L3:
            zzg.zza(zzQJ, i);
            zzQJ.connect();
              goto _L1
            Exception exception;
            exception;
            zzg.zzb(zzQJ).unlock();
            throw exception;
_L2:
            flag = zzQJ.zzla();
            if (flag)
            {
                zzg.zzb(zzQJ).unlock();
                return;
            }
            zzg.zza(zzQJ, true);
            if (zzQJ.zzQy == null)
            {
                zzQJ.zzQy = new zzb(zzQJ);
                IntentFilter intentfilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                intentfilter.addDataScheme("package");
                zzg.zzc(zzQJ).getApplicationContext().registerReceiver(zzQJ.zzQy, intentfilter);
            }
            zzQJ.zzQx.sendMessageDelayed(zzQJ.zzQx.obtainMessage(1), zzg.zzd(zzQJ));
            zzQJ.zzQx.sendMessageDelayed(zzQJ.zzQx.obtainMessage(2), com.google.android.gms.common.api.zzg.zze(zzQJ));
            zzg.zza(zzQJ, i);
              goto _L1
        }

        public zzd()
        {
            zzQJ = zzg.this;
            super();
        }
    }

    static interface zze
    {

        public abstract void cancel();

        public abstract void forceFailureUnlessReady(Status status);

        public abstract void zza(zzc zzc1);

        public abstract void zzb(Api.zza zza1)
            throws DeadObjectException;

        public abstract void zzk(Status status);

        public abstract Api.zzc zzkE();

        public abstract int zzkH();
    }


    private final Context mContext;
    private final int zzPH;
    private final int zzPI;
    final Api.zzb zzPK;
    private final Lock zzPR = new ReentrantLock();
    private final Looper zzPx;
    final Map zzQA = new HashMap();
    Set zzQB;
    private volatile zzh zzQC;
    private ConnectionResult zzQD;
    private final Set zzQE = Collections.newSetFromMap(new WeakHashMap());
    final Set zzQF = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75F, 2));
    private final zzc zzQG = new zzc() {

        final zzg zzQJ;

        public void zzc(zze zze2)
        {
            zzQJ.zzQF.remove(zze2);
        }

            
            {
                zzQJ = zzg.this;
                super();
            }
    };
    private final GoogleApiClient.ConnectionCallbacks zzQH = new zzd() {

        final zzg zzQJ;

        public void onConnected(Bundle bundle)
        {
            zzg.zza(zzQJ).onConnected(bundle);
        }

            
            {
                zzQJ = zzg.this;
                super();
            }
    };
    private final com.google.android.gms.common.internal.zzj.zza zzQI = new com.google.android.gms.common.internal.zzj.zza() {

        final zzg zzQJ;

        public boolean isConnected()
        {
            return zzQJ.isConnected();
        }

        public Bundle zzjY()
        {
            return null;
        }

            
            {
                zzQJ = zzg.this;
                super();
            }
    };
    final com.google.android.gms.common.internal.zze zzQg;
    final Map zzQh = new HashMap();
    private final Condition zzQr;
    final zzj zzQs;
    final Queue zzQt = new LinkedList();
    private volatile boolean zzQu;
    private long zzQv;
    private long zzQw;
    final zza zzQx;
    BroadcastReceiver zzQy;
    final Map zzQz = new HashMap();

    public zzg(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, Api.zzb zzb1, Map map, Set set, Set set1, 
            int i, int j)
    {
        zzQv = 0x1d4c0L;
        zzQw = 5000L;
        zzQB = new HashSet();
        zzQD = null;
        mContext = context;
        zzQs = new zzj(looper, zzQI);
        zzPx = looper;
        zzQx = new zza(looper);
        zzPH = i;
        zzPI = j;
        zzQr = zzPR.newCondition();
        zzQC = new zzf(this);
        GoogleApiClient.ConnectionCallbacks connectioncallbacks;
        for (set = set.iterator(); set.hasNext(); zzQs.registerConnectionCallbacks(connectioncallbacks))
        {
            connectioncallbacks = (GoogleApiClient.ConnectionCallbacks)set.next();
        }

        for (set = set1.iterator(); set.hasNext(); zzQs.registerConnectionFailedListener(set1))
        {
            set1 = (GoogleApiClient.OnConnectionFailedListener)set.next();
        }

        set1 = zze1.zzlH();
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) 
        {
            Api api = (Api)iterator.next();
            set = ((Set) (map.get(api)));
            if (set1.get(api) != null)
            {
                if (((com.google.android.gms.common.internal.zze.zza)set1.get(api)).zzTa)
                {
                    i = 1;
                } else
                {
                    i = 2;
                }
            } else
            {
                i = 0;
            }
            zzQh.put(api, Integer.valueOf(i));
            if (api.zzkF())
            {
                set = zza(api.zzkC(), set, context, looper, zze1, zzQH, zza(api, i));
            } else
            {
                set = zza(api.zzkB(), set, context, looper, zze1, zzQH, zza(api, i));
            }
            zzQz.put(api.zzkE(), set);
        }
        zzQg = zze1;
        zzPK = zzb1;
    }

    private void resume()
    {
        zzPR.lock();
        if (zzla())
        {
            connect();
        }
        zzPR.unlock();
        return;
        Exception exception;
        exception;
        zzPR.unlock();
        throw exception;
    }

    private static Api.zza zza(Api.zzb zzb1, Object obj, Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return zzb1.zza(context, looper, zze1, obj, connectioncallbacks, onconnectionfailedlistener);
    }

    private final GoogleApiClient.OnConnectionFailedListener zza(Api api, int i)
    {
        return new GoogleApiClient.OnConnectionFailedListener(api, i) {

            final zzg zzQJ;
            final Api zzQK;
            final int zzQL;

            public void onConnectionFailed(ConnectionResult connectionresult)
            {
                zzg.zza(zzQJ).zza(connectionresult, zzQK, zzQL);
            }

            
            {
                zzQJ = zzg.this;
                zzQK = api;
                zzQL = i;
                super();
            }
        };
    }

    static zzh zza(zzg zzg1)
    {
        return zzg1.zzQC;
    }

    private static zzab zza(Api.zze zze1, Object obj, Context context, Looper looper, com.google.android.gms.common.internal.zze zze2, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return new zzab(context, looper, zze1.zzkG(), connectioncallbacks, onconnectionfailedlistener, zze2, zze1.zzi(obj));
    }

    static void zza(zzg zzg1, int i)
    {
        zzg1.zzav(i);
    }

    static boolean zza(zzg zzg1, boolean flag)
    {
        zzg1.zzQu = flag;
        return flag;
    }

    private void zzav(int i)
    {
        zzPR.lock();
        zzQC.zzas(i);
        zzPR.unlock();
        return;
        Exception exception;
        exception;
        zzPR.unlock();
        throw exception;
    }

    static Lock zzb(zzg zzg1)
    {
        return zzg1.zzPR;
    }

    static Context zzc(zzg zzg1)
    {
        return zzg1.mContext;
    }

    static long zzd(zzg zzg1)
    {
        return zzg1.zzQv;
    }

    static long zze(zzg zzg1)
    {
        return zzg1.zzQw;
    }

    static void zzf(zzg zzg1)
    {
        zzg1.resume();
    }

    static void zzg(zzg zzg1)
    {
        zzg1.zzlb();
    }

    private void zzlb()
    {
        zzPR.lock();
        if (zzlc())
        {
            connect();
        }
        zzPR.unlock();
        return;
        Exception exception;
        exception;
        zzPR.unlock();
        throw exception;
    }

    public ConnectionResult blockingConnect()
    {
        InterruptedException interruptedexception;
        ConnectionResult connectionresult;
        boolean flag;
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zza(flag, "blockingConnect must not be called on the UI thread");
        zzPR.lock();
        connect();
_L1:
        flag = isConnecting();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        zzQr.await();
          goto _L1
        interruptedexception;
        Thread.currentThread().interrupt();
        connectionresult = new ConnectionResult(15, null);
        zzPR.unlock();
        return connectionresult;
        ConnectionResult connectionresult1;
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        connectionresult1 = ConnectionResult.zzOI;
        zzPR.unlock();
        return connectionresult1;
        if (zzQD == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        connectionresult1 = zzQD;
        zzPR.unlock();
        return connectionresult1;
        connectionresult1 = new ConnectionResult(13, null);
        zzPR.unlock();
        return connectionresult1;
        Exception exception;
        exception;
        zzPR.unlock();
        throw exception;
    }

    public void connect()
    {
        zzPR.lock();
        zzQC.connect();
        zzPR.unlock();
        return;
        Exception exception;
        exception;
        zzPR.unlock();
        throw exception;
    }

    public void disconnect()
    {
        zzlc();
        zzav(-1);
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.append(s).println("GoogleApiClient:");
        s = (new StringBuilder()).append(s).append("  ").toString();
        printwriter.append(s).append("mState=").append(zzQC.getName());
        printwriter.append(" mResuming=").print(zzQu);
        printwriter.append(" mWorkQueue.size()=").print(zzQt.size());
        printwriter.append(" mUnconsumedRunners.size()=").println(zzQF.size());
        for (Iterator iterator = zzQz.values().iterator(); iterator.hasNext(); ((Api.zza)iterator.next()).dump(s, filedescriptor, printwriter, as)) { }
    }

    public Context getContext()
    {
        return mContext;
    }

    public Looper getLooper()
    {
        return zzPx;
    }

    public int getSessionId()
    {
        return System.identityHashCode(this);
    }

    public boolean hasConnectedApi(Api api)
    {
        api = (Api.zza)zzQz.get(api.zzkE());
        if (api == null)
        {
            return false;
        } else
        {
            return api.isConnected();
        }
    }

    public boolean isConnected()
    {
        return zzQC instanceof com.google.android.gms.common.api.zzd;
    }

    public boolean isConnecting()
    {
        return zzQC instanceof com.google.android.gms.common.api.zze;
    }

    public void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        zzQs.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzQs.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        zzQs.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzQs.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }

    public Api.zza zza(Api.zzc zzc1)
    {
        zzc1 = (Api.zza)zzQz.get(zzc1);
        zzv.zzb(zzc1, "Appropriate Api was not requested.");
        return zzc1;
    }

    public zza.zza zza(zza.zza zza1)
    {
        boolean flag;
        if (zza1.zzkE() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zzb(flag, "This task can not be enqueued (it's probably a Batch or malformed)");
        zzv.zzb(zzQz.containsKey(zza1.zzkE()), "GoogleApiClient is not configured to use the API required for this call.");
        zzPR.lock();
        zza1 = zzQC.zza(zza1);
        zzPR.unlock();
        return zza1;
        zza1;
        zzPR.unlock();
        throw zza1;
    }

    public boolean zza(Api api)
    {
        return zzQz.containsKey(api.zzkE());
    }

    public zza.zza zzb(zza.zza zza1)
    {
        zze zze1;
        boolean flag;
        if (zza1.zzkE() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zzb(flag, "This task can not be executed (it's probably a Batch or malformed)");
        zzPR.lock();
        if (!zzla())
        {
            break MISSING_BLOCK_LABEL_113;
        }
        zzQt.add(zza1);
        for (; !zzQt.isEmpty(); zze1.zzk(Status.zzQW))
        {
            zze1 = (zze)zzQt.remove();
            zzb(zze1);
        }

        break MISSING_BLOCK_LABEL_102;
        zza1;
        zzPR.unlock();
        throw zza1;
        zzPR.unlock();
        return zza1;
        zza1 = zzQC.zzb(zza1);
        zzPR.unlock();
        return zza1;
    }

    void zzb(zze zze1)
    {
        zzQF.add(zze1);
        zze1.zza(zzQG);
    }

    void zzg(ConnectionResult connectionresult)
    {
        zzPR.lock();
        zzQD = connectionresult;
        zzQC = new zzf(this);
        zzQC.begin();
        zzQr.signalAll();
        zzPR.unlock();
        return;
        connectionresult;
        zzPR.unlock();
        throw connectionresult;
    }

    void zzkW()
    {
        zze zze1;
        for (Iterator iterator = zzQF.iterator(); iterator.hasNext(); zze1.cancel())
        {
            zze1 = (zze)iterator.next();
            zze1.zza(null);
        }

        zzQF.clear();
        for (Iterator iterator1 = zzQE.iterator(); iterator1.hasNext(); ((zzi)iterator1.next()).clear()) { }
        zzQE.clear();
        zzQB.clear();
    }

    void zzkX()
    {
        for (Iterator iterator = zzQz.values().iterator(); iterator.hasNext(); ((Api.zza)iterator.next()).disconnect()) { }
    }

    void zzkY()
    {
        zzPR.lock();
        zzQC = new com.google.android.gms.common.api.zze(this, zzQg, zzQh, zzPK, zzPR, mContext);
        zzQC.begin();
        zzQr.signalAll();
        zzPR.unlock();
        return;
        Exception exception;
        exception;
        zzPR.unlock();
        throw exception;
    }

    void zzkZ()
    {
        zzPR.lock();
        zzlc();
        zzQC = new com.google.android.gms.common.api.zzd(this);
        zzQC.begin();
        zzQr.signalAll();
        zzPR.unlock();
        return;
        Exception exception;
        exception;
        zzPR.unlock();
        throw exception;
    }

    boolean zzla()
    {
        return zzQu;
    }

    boolean zzlc()
    {
        zzPR.lock();
        boolean flag = zzla();
        if (!flag)
        {
            zzPR.unlock();
            return false;
        }
        zzQu = false;
        zzQx.removeMessages(2);
        zzQx.removeMessages(1);
        if (zzQy != null)
        {
            mContext.getApplicationContext().unregisterReceiver(zzQy);
            zzQy = null;
        }
        zzPR.unlock();
        return true;
        Exception exception;
        exception;
        zzPR.unlock();
        throw exception;
    }
}
