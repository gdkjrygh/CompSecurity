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
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.internal.zzkl;
import com.google.android.gms.internal.zzkm;
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
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient, zzf, Api, PendingResult, 
//            zzh, zzl, zzd, zze, 
//            zzm, zzn, Status, zzi, 
//            Scope, ResultCallback, Result

final class zzg
    implements GoogleApiClient
{
    final class zza extends Handler
    {

        final zzg zzXE;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                Log.w("GoogleApiClientImpl", (new StringBuilder()).append("Unknown message id: ").append(message.what).toString());
                return;

            case 1: // '\001'
                zzg.zzd(zzXE);
                return;

            case 2: // '\002'
                zzg.zzc(zzXE);
                break;
            }
        }

        zza(Looper looper)
        {
            zzXE = zzg.this;
            super(looper);
        }
    }

    private static class zzb extends BroadcastReceiver
    {

        private WeakReference zzXK;

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
                if ((context = (zzg)zzXK.get()) != null)
                {
                    zzg.zzc(context);
                    return;
                }
            }
        }

        zzb(zzg zzg1)
        {
            zzXK = new WeakReference(zzg1);
        }
    }

    static interface zzc
    {

        public abstract void zzc(zze zze1);
    }

    public abstract class zzd
        implements GoogleApiClient.ConnectionCallbacks
    {

        final zzg zzXE;

        public void onConnectionSuspended(int i)
        {
            zzg.zzb(zzXE).lock();
            zzg.zza(zzXE).onConnectionSuspended(i);
            zzg.zzb(zzXE).unlock();
            return;
            Exception exception;
            exception;
            zzg.zzb(zzXE).unlock();
            throw exception;
        }

        public zzd()
        {
            zzXE = zzg.this;
            super();
        }
    }

    static interface zze
    {

        public abstract void cancel();

        public abstract void forceFailureUnlessReady(Status status);

        public abstract void zza(zzc zzc1);

        public abstract void zzb(Api.Client client)
            throws DeadObjectException;

        public abstract Api.ClientKey zzms();

        public abstract int zzmv();

        public abstract void zzr(Status status);
    }


    private final Context mContext;
    private final int zzWB;
    private final int zzWC;
    final Api.zza zzWE;
    private final Lock zzWL = new ReentrantLock();
    private final Looper zzWt;
    final Set zzXA = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75F, 2));
    private final zzc zzXB = new zzc() {

        final zzg zzXE;

        public void zzc(zze zze2)
        {
            zzXE.zzXA.remove(zze2);
        }

            
            {
                zzXE = zzg.this;
                super();
            }
    };
    private final GoogleApiClient.ConnectionCallbacks zzXC = new zzd() {

        final zzg zzXE;

        public void onConnected(Bundle bundle)
        {
            zzg.zza(zzXE).onConnected(bundle);
        }

            
            {
                zzXE = zzg.this;
                super();
            }
    };
    private final com.google.android.gms.common.internal.zzj.zza zzXD = new com.google.android.gms.common.internal.zzj.zza() {

        final zzg zzXE;

        public boolean isConnected()
        {
            return zzXE.isConnected();
        }

        public Bundle zzlM()
        {
            return null;
        }

            
            {
                zzXE = zzg.this;
                super();
            }
    };
    final com.google.android.gms.common.internal.zze zzXa;
    final Map zzXb = new HashMap();
    private final Condition zzXm;
    final zzj zzXn;
    final Queue zzXo = new LinkedList();
    private volatile boolean zzXp;
    private long zzXq;
    private long zzXr;
    final zza zzXs;
    BroadcastReceiver zzXt;
    final Map zzXu = new HashMap();
    final Map zzXv = new HashMap();
    Set zzXw;
    private volatile zzh zzXx;
    private ConnectionResult zzXy;
    private final Set zzXz = Collections.newSetFromMap(new WeakHashMap());

    public zzg(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, Api.zza zza1, Map map, Set set, Set set1, 
            int i, int j)
    {
        zzXq = 0x1d4c0L;
        zzXr = 5000L;
        zzXw = new HashSet();
        zzXy = null;
        mContext = context;
        zzXn = new zzj(looper, zzXD);
        zzWt = looper;
        zzXs = new zza(looper);
        zzWB = i;
        zzWC = j;
        zzXm = zzWL.newCondition();
        zzXx = new zzf(this);
        GoogleApiClient.ConnectionCallbacks connectioncallbacks;
        for (set = set.iterator(); set.hasNext(); zzXn.registerConnectionCallbacks(connectioncallbacks))
        {
            connectioncallbacks = (GoogleApiClient.ConnectionCallbacks)set.next();
        }

        for (set = set1.iterator(); set.hasNext(); zzXn.registerConnectionFailedListener(set1))
        {
            set1 = (GoogleApiClient.OnConnectionFailedListener)set.next();
        }

        set1 = zze1.zznx();
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) 
        {
            Api api = (Api)iterator.next();
            set = ((Set) (map.get(api)));
            if (set1.get(api) != null)
            {
                if (((com.google.android.gms.common.internal.zze.zza)set1.get(api)).zzZW)
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
            zzXb.put(api, Integer.valueOf(i));
            if (api.zzmt())
            {
                set = zza(api.zzmq(), set, context, looper, zze1, zzXC, zza(api, i));
            } else
            {
                set = zza(api.zzmp(), set, context, looper, zze1, zzXC, zza(api, i));
            }
            zzXu.put(api.zzms(), set);
        }
        zzXa = zze1;
        zzWE = zza1;
    }

    private void resume()
    {
        zzWL.lock();
        if (zzmO())
        {
            connect();
        }
        zzWL.unlock();
        return;
        Exception exception;
        exception;
        zzWL.unlock();
        throw exception;
    }

    private static Api.Client zza(Api.zza zza1, Object obj, Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return zza1.zza(context, looper, zze1, obj, connectioncallbacks, onconnectionfailedlistener);
    }

    private final GoogleApiClient.OnConnectionFailedListener zza(Api api, int i)
    {
        return new GoogleApiClient.OnConnectionFailedListener(api, i) {

            final zzg zzXE;
            final Api zzXF;
            final int zzXG;

            public void onConnectionFailed(ConnectionResult connectionresult)
            {
                zzg.zza(zzXE).zza(connectionresult, zzXF, zzXG);
            }

            
            {
                zzXE = zzg.this;
                zzXF = api;
                zzXG = i;
                super();
            }
        };
    }

    static zzh zza(zzg zzg1)
    {
        return zzg1.zzXx;
    }

    private static zzz zza(Api.zzc zzc1, Object obj, Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return new zzz(context, looper, zzc1.zzmu(), connectioncallbacks, onconnectionfailedlistener, zze1, zzc1.zzl(obj));
    }

    private void zza(GoogleApiClient googleapiclient, zzl zzl1, boolean flag)
    {
        zzkl.zzabj.zzc(googleapiclient).setResultCallback(new ResultCallback(zzl1, flag, googleapiclient) {

            final GoogleApiClient zzSA;
            final zzg zzXE;
            final zzl zzXI;
            final boolean zzXJ;

            public void onResult(Result result)
            {
                zzm((Status)result);
            }

            public void zzm(Status status)
            {
                if (status.isSuccess() && zzXE.isConnected())
                {
                    zzXE.reconnect();
                }
                zzXI.setResult(status);
                if (zzXJ)
                {
                    zzSA.disconnect();
                }
            }

            
            {
                zzXE = zzg.this;
                zzXI = zzl1;
                zzXJ = flag;
                zzSA = googleapiclient;
                super();
            }
        });
    }

    static void zza(zzg zzg1, GoogleApiClient googleapiclient, zzl zzl1, boolean flag)
    {
        zzg1.zza(googleapiclient, zzl1, flag);
    }

    private void zzaY(int i)
    {
        zzWL.lock();
        zzXx.zzaV(i);
        zzWL.unlock();
        return;
        Exception exception;
        exception;
        zzWL.unlock();
        throw exception;
    }

    static Lock zzb(zzg zzg1)
    {
        return zzg1.zzWL;
    }

    static void zzc(zzg zzg1)
    {
        zzg1.resume();
    }

    static void zzd(zzg zzg1)
    {
        zzg1.zzmP();
    }

    private void zzmP()
    {
        zzWL.lock();
        if (zzmR())
        {
            connect();
        }
        zzWL.unlock();
        return;
        Exception exception;
        exception;
        zzWL.unlock();
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
        zzu.zza(flag, "blockingConnect must not be called on the UI thread");
        zzWL.lock();
        connect();
_L1:
        flag = isConnecting();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        zzXm.await();
          goto _L1
        interruptedexception;
        Thread.currentThread().interrupt();
        connectionresult = new ConnectionResult(15, null);
        zzWL.unlock();
        return connectionresult;
        ConnectionResult connectionresult1;
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        connectionresult1 = ConnectionResult.zzVG;
        zzWL.unlock();
        return connectionresult1;
        if (zzXy == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        connectionresult1 = zzXy;
        zzWL.unlock();
        return connectionresult1;
        connectionresult1 = new ConnectionResult(13, null);
        zzWL.unlock();
        return connectionresult1;
        Exception exception;
        exception;
        zzWL.unlock();
        throw exception;
    }

    public ConnectionResult blockingConnect(long l, TimeUnit timeunit)
    {
        long l1;
        boolean flag;
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "blockingConnect must not be called on the UI thread");
        zzWL.lock();
        connect();
        l = timeunit.toNanos(l);
_L2:
        flag = isConnecting();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        l1 = zzXm.awaitNanos(l);
        l = l1;
        if (l1 > 0L) goto _L2; else goto _L1
_L1:
        timeunit = new ConnectionResult(14, null);
        zzWL.unlock();
        return timeunit;
        timeunit;
        Thread.currentThread().interrupt();
        timeunit = new ConnectionResult(15, null);
        zzWL.unlock();
        return timeunit;
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_151;
        }
        timeunit = ConnectionResult.zzVG;
        zzWL.unlock();
        return timeunit;
        if (zzXy == null)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        timeunit = zzXy;
        zzWL.unlock();
        return timeunit;
        timeunit = new ConnectionResult(13, null);
        zzWL.unlock();
        return timeunit;
        timeunit;
        zzWL.unlock();
        throw timeunit;
    }

    public PendingResult clearDefaultAccountAndReconnect()
    {
        zzu.zza(isConnected(), "GoogleApiClient is not connected yet.");
        zzl zzl1 = new zzl(zzWt);
        if (zzXu.containsKey(zzkl.zzNX))
        {
            zza(this, zzl1, false);
            return zzl1;
        } else
        {
            AtomicReference atomicreference = new AtomicReference();
            Object obj = new GoogleApiClient.ConnectionCallbacks(atomicreference, zzl1) {

                final zzg zzXE;
                final AtomicReference zzXH;
                final zzl zzXI;

                public void onConnected(Bundle bundle)
                {
                    zzg.zza(zzXE, (GoogleApiClient)zzXH.get(), zzXI, true);
                }

                public void onConnectionSuspended(int i)
                {
                }

            
            {
                zzXE = zzg.this;
                zzXH = atomicreference;
                zzXI = zzl1;
                super();
            }
            };
            GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener = new GoogleApiClient.OnConnectionFailedListener(zzl1) {

                final zzg zzXE;
                final zzl zzXI;

                public void onConnectionFailed(ConnectionResult connectionresult)
                {
                    zzXI.setResult(new Status(8));
                }

            
            {
                zzXE = zzg.this;
                zzXI = zzl1;
                super();
            }
            };
            obj = (new GoogleApiClient.Builder(mContext)).addApi(zzkl.API).addConnectionCallbacks(((GoogleApiClient.ConnectionCallbacks) (obj))).addOnConnectionFailedListener(onconnectionfailedlistener).setHandler(zzXs).build();
            atomicreference.set(obj);
            ((GoogleApiClient) (obj)).connect();
            return zzl1;
        }
    }

    public void connect()
    {
        zzWL.lock();
        zzXx.connect();
        zzWL.unlock();
        return;
        Exception exception;
        exception;
        zzWL.unlock();
        throw exception;
    }

    public void disconnect()
    {
        zzmR();
        zzaY(-1);
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.append(s).append("mState=").append(zzXx.getName());
        printwriter.append(" mResuming=").print(zzXp);
        printwriter.append(" mWorkQueue.size()=").print(zzXo.size());
        printwriter.append(" mUnconsumedRunners.size()=").println(zzXA.size());
        String s1 = (new StringBuilder()).append(s).append("  ").toString();
        Api api;
        for (Iterator iterator = zzXb.keySet().iterator(); iterator.hasNext(); ((Api.Client)zzXu.get(api.zzms())).dump(s1, filedescriptor, printwriter, as))
        {
            api = (Api)iterator.next();
            printwriter.append(s).append(api.getName()).println(":");
        }

    }

    public ConnectionResult getConnectionResult(Api api)
    {
        Api.ClientKey clientkey;
        clientkey = api.zzms();
        zzWL.lock();
        if (!isConnected() && !zzmO())
        {
            throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
        }
        break MISSING_BLOCK_LABEL_51;
        api;
        zzWL.unlock();
        throw api;
        if (!zzXu.containsKey(clientkey))
        {
            break MISSING_BLOCK_LABEL_196;
        }
        if (!((Api.Client)zzXu.get(clientkey)).isConnected())
        {
            break MISSING_BLOCK_LABEL_100;
        }
        api = ConnectionResult.zzVG;
        zzWL.unlock();
        return api;
        if (!zzXv.containsKey(clientkey))
        {
            break MISSING_BLOCK_LABEL_138;
        }
        api = (ConnectionResult)zzXv.get(clientkey);
        zzWL.unlock();
        return api;
        Log.wtf("GoogleApiClientImpl", (new StringBuilder()).append(api.getName()).append(" requested in getConnectionResult").append(" is not connected but is not present in the failed connections map").toString());
        api = new ConnectionResult(8, null);
        zzWL.unlock();
        return api;
        zzWL.unlock();
        throw new IllegalArgumentException((new StringBuilder()).append(api.getName()).append(" was never registered with GoogleApiClient").toString());
    }

    public Context getContext()
    {
        return mContext;
    }

    public Looper getLooper()
    {
        return zzWt;
    }

    public int getSessionId()
    {
        return System.identityHashCode(this);
    }

    public boolean hasConnectedApi(Api api)
    {
        api = (Api.Client)zzXu.get(api.zzms());
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
        return zzXx instanceof com.google.android.gms.common.api.zzd;
    }

    public boolean isConnecting()
    {
        return zzXx instanceof com.google.android.gms.common.api.zze;
    }

    public boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        return zzXn.isConnectionCallbacksRegistered(connectioncallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return zzXn.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    public void reconnect()
    {
        disconnect();
        connect();
    }

    public void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        zzXn.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzXn.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void stopAutoManage(FragmentActivity fragmentactivity)
    {
        if (zzWB >= 0)
        {
            zzm.zza(fragmentactivity).zzbb(zzWB);
            return;
        }
        if (zzWC >= 0)
        {
            zzn.zzb(fragmentactivity).zzbb(zzWC);
            return;
        } else
        {
            throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
        }
    }

    public void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        zzXn.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzXn.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }

    public Api.Client zza(Api.ClientKey clientkey)
    {
        clientkey = (Api.Client)zzXu.get(clientkey);
        zzu.zzb(clientkey, "Appropriate Api was not requested.");
        return clientkey;
    }

    public zza.zza zza(zza.zza zza1)
    {
        boolean flag;
        if (zza1.zzms() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "This task can not be enqueued (it's probably a Batch or malformed)");
        zzu.zzb(zzXu.containsKey(zza1.zzms()), "GoogleApiClient is not configured to use the API required for this call.");
        zzWL.lock();
        zza1 = zzXx.zza(zza1);
        zzWL.unlock();
        return zza1;
        zza1;
        zzWL.unlock();
        throw zza1;
    }

    public boolean zza(Api api)
    {
        return zzXu.containsKey(api.zzms());
    }

    public boolean zza(Scope scope)
    {
        zzWL.lock();
        if (!isConnected()) goto _L2; else goto _L1
_L1:
        boolean flag = zzXw.contains(scope);
        if (!flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        zzWL.unlock();
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        scope;
        zzWL.unlock();
        throw scope;
    }

    public zza.zza zzb(zza.zza zza1)
    {
        zze zze1;
        boolean flag;
        if (zza1.zzms() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "This task can not be executed (it's probably a Batch or malformed)");
        zzWL.lock();
        if (!zzmO())
        {
            break MISSING_BLOCK_LABEL_113;
        }
        zzXo.add(zza1);
        for (; !zzXo.isEmpty(); zze1.zzr(Status.zzXR))
        {
            zze1 = (zze)zzXo.remove();
            zzb(zze1);
        }

        break MISSING_BLOCK_LABEL_102;
        zza1;
        zzWL.unlock();
        throw zza1;
        zzWL.unlock();
        return zza1;
        zza1 = zzXx.zzb(zza1);
        zzWL.unlock();
        return zza1;
    }

    void zzb(zze zze1)
    {
        zzXA.add(zze1);
        zze1.zza(zzXB);
    }

    void zze(ConnectionResult connectionresult)
    {
        zzWL.lock();
        zzXy = connectionresult;
        zzXx = new zzf(this);
        zzXx.begin();
        zzXm.signalAll();
        zzWL.unlock();
        return;
        connectionresult;
        zzWL.unlock();
        throw connectionresult;
    }

    void zzmK()
    {
        zze zze1;
        for (Iterator iterator = zzXA.iterator(); iterator.hasNext(); zze1.cancel())
        {
            zze1 = (zze)iterator.next();
            zze1.zza(null);
        }

        zzXA.clear();
        for (Iterator iterator1 = zzXz.iterator(); iterator1.hasNext(); ((zzi)iterator1.next()).clear()) { }
        zzXz.clear();
        zzXw.clear();
    }

    void zzmL()
    {
        for (Iterator iterator = zzXu.values().iterator(); iterator.hasNext(); ((Api.Client)iterator.next()).disconnect()) { }
    }

    void zzmM()
    {
        zzWL.lock();
        zzXx = new com.google.android.gms.common.api.zze(this, zzXa, zzXb, zzWE, zzWL, mContext);
        zzXx.begin();
        zzXm.signalAll();
        zzWL.unlock();
        return;
        Exception exception;
        exception;
        zzWL.unlock();
        throw exception;
    }

    void zzmN()
    {
        zzWL.lock();
        zzmR();
        zzXx = new com.google.android.gms.common.api.zzd(this);
        zzXx.begin();
        zzXm.signalAll();
        zzWL.unlock();
        return;
        Exception exception;
        exception;
        zzWL.unlock();
        throw exception;
    }

    boolean zzmO()
    {
        return zzXp;
    }

    void zzmQ()
    {
        if (zzmO())
        {
            return;
        }
        zzXp = true;
        if (zzXt == null)
        {
            zzXt = new zzb(this);
            IntentFilter intentfilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentfilter.addDataScheme("package");
            mContext.getApplicationContext().registerReceiver(zzXt, intentfilter);
        }
        zzXs.sendMessageDelayed(zzXs.obtainMessage(1), zzXq);
        zzXs.sendMessageDelayed(zzXs.obtainMessage(2), zzXr);
    }

    boolean zzmR()
    {
        zzWL.lock();
        boolean flag = zzmO();
        if (!flag)
        {
            zzWL.unlock();
            return false;
        }
        zzXp = false;
        zzXs.removeMessages(2);
        zzXs.removeMessages(1);
        if (zzXt != null)
        {
            mContext.getApplicationContext().unregisterReceiver(zzXt);
            zzXt = null;
        }
        zzWL.unlock();
        return true;
        Exception exception;
        exception;
        zzWL.unlock();
        throw exception;
    }

    public zzi zzo(Object obj)
    {
        zzu.zzb(obj, "Listener must not be null");
        zzWL.lock();
        obj = new zzi(zzWt, obj);
        zzXz.add(obj);
        zzWL.unlock();
        return ((zzi) (obj));
        obj;
        zzWL.unlock();
        throw obj;
    }
}
