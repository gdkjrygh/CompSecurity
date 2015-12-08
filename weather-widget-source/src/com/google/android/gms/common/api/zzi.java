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
import android.support.v4.app.FragmentManager;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzkw;
import com.google.android.gms.internal.zzkx;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
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
//            GoogleApiClient, zzh, Api, PendingResult, 
//            zzo, zzj, zzf, zzg, 
//            zzp, zzq, Status, zzl, 
//            Scope, ResultCallback, Result

final class zzi
    implements GoogleApiClient
{
    final class zza extends Handler
    {

        final zzi zzaap;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                Log.w("GoogleApiClientImpl", (new StringBuilder()).append("Unknown message id: ").append(message.what).toString());
                return;

            case 1: // '\001'
                zzi.zzd(zzaap);
                return;

            case 2: // '\002'
                zzi.zzc(zzaap);
                return;

            case 3: // '\003'
                ((zzb)message.obj).zzf(zzaap);
                return;

            case 4: // '\004'
                throw (RuntimeException)message.obj;
            }
        }

        zza(Looper looper)
        {
            zzaap = zzi.this;
            super(looper);
        }
    }

    static abstract class zzb
    {

        private final zzj zzaaw;

        public final void zzf(zzi zzi1)
        {
            zzi.zza(zzi1).lock();
            zzj zzj1;
            zzj zzj2;
            zzj1 = zzi.zzb(zzi1);
            zzj2 = zzaaw;
            if (zzj1 != zzj2)
            {
                zzi.zza(zzi1).unlock();
                return;
            }
            zznn();
            zzi.zza(zzi1).unlock();
            return;
            Exception exception;
            exception;
            zzi.zza(zzi1).unlock();
            throw exception;
        }

        protected abstract void zznn();

        protected zzb(zzj zzj1)
        {
            zzaaw = zzj1;
        }
    }

    private static class zzc extends BroadcastReceiver
    {

        private WeakReference zzaax;

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
                if ((context = (zzi)zzaax.get()) != null)
                {
                    zzi.zzc(context);
                    return;
                }
            }
        }

        zzc(zzi zzi1)
        {
            zzaax = new WeakReference(zzi1);
        }
    }

    static interface zzd
    {

        public abstract void zzc(zze zze1);
    }

    static interface zze
    {

        public abstract void cancel();

        public abstract void zza(zzd zzd1);

        public abstract void zzb(Api.zzb zzb1)
            throws DeadObjectException;

        public abstract Api.zzc zznd();

        public abstract int zzng();

        public abstract void zzw(Status status);

        public abstract void zzx(Status status);
    }


    private final Context mContext;
    private final Looper zzYV;
    final zzf zzZH;
    final Map zzZI = new HashMap();
    private final Condition zzZX;
    final zzk zzZY;
    final Queue zzZZ = new LinkedList();
    private final int zzZf;
    private final int zzZg;
    private final GoogleApiAvailability zzZi;
    final Api.zza zzZj;
    private final Lock zzZs = new ReentrantLock();
    private volatile boolean zzaaa;
    private long zzaab;
    private long zzaac;
    private final zza zzaad;
    BroadcastReceiver zzaae;
    final Map zzaaf = new HashMap();
    final Map zzaag = new HashMap();
    Set zzaah;
    private volatile zzj zzaai;
    private ConnectionResult zzaaj;
    private final Set zzaak = Collections.newSetFromMap(new WeakHashMap());
    final Set zzaal = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75F, 2));
    private final zzd zzaam = new zzd() {

        final zzi zzaap;

        public void zzc(zze zze1)
        {
            zzaap.zzaal.remove(zze1);
        }

            
            {
                zzaap = zzi.this;
                super();
            }
    };
    private final GoogleApiClient.ConnectionCallbacks zzaan = new GoogleApiClient.ConnectionCallbacks() {

        final zzi zzaap;

        public void onConnected(Bundle bundle)
        {
            zzi.zza(zzaap).lock();
            zzi.zzb(zzaap).onConnected(bundle);
            zzi.zza(zzaap).unlock();
            return;
            bundle;
            zzi.zza(zzaap).unlock();
            throw bundle;
        }

        public void onConnectionSuspended(int k)
        {
            zzi.zza(zzaap).lock();
            zzi.zzb(zzaap).onConnectionSuspended(k);
            zzi.zza(zzaap).unlock();
            return;
            Exception exception;
            exception;
            zzi.zza(zzaap).unlock();
            throw exception;
        }

            
            {
                zzaap = zzi.this;
                super();
            }
    };
    private final com.google.android.gms.common.internal.zzk.zza zzaao = new com.google.android.gms.common.internal.zzk.zza() {

        final zzi zzaap;

        public boolean isConnected()
        {
            return zzaap.isConnected();
        }

        public Bundle zzmw()
        {
            return null;
        }

            
            {
                zzaap = zzi.this;
                super();
            }
    };

    public zzi(Context context, Looper looper, zzf zzf1, GoogleApiAvailability googleapiavailability, Api.zza zza1, Map map, ArrayList arraylist, 
            ArrayList arraylist1, int i, int j)
    {
        zzaab = 0x1d4c0L;
        zzaac = 5000L;
        zzaah = new HashSet();
        zzaaj = null;
        mContext = context;
        zzZY = new zzk(looper, zzaao);
        zzYV = looper;
        zzaad = new zza(looper);
        zzZi = googleapiavailability;
        zzZf = i;
        zzZg = j;
        zzZX = zzZs.newCondition();
        zzaai = new zzh(this);
        for (googleapiavailability = arraylist.iterator(); googleapiavailability.hasNext(); zzZY.registerConnectionCallbacks(arraylist))
        {
            arraylist = (GoogleApiClient.ConnectionCallbacks)googleapiavailability.next();
        }

        for (googleapiavailability = arraylist1.iterator(); googleapiavailability.hasNext(); zzZY.registerConnectionFailedListener(arraylist))
        {
            arraylist = (GoogleApiClient.OnConnectionFailedListener)googleapiavailability.next();
        }

        arraylist = zzf1.zzok();
        arraylist1 = map.keySet().iterator();
        while (arraylist1.hasNext()) 
        {
            Api api = (Api)arraylist1.next();
            googleapiavailability = ((GoogleApiAvailability) (map.get(api)));
            if (arraylist.get(api) != null)
            {
                if (((com.google.android.gms.common.internal.zzf.zza)arraylist.get(api)).zzadg)
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
            zzZI.put(api, Integer.valueOf(i));
            if (api.zzne())
            {
                googleapiavailability = zza(api.zznc(), googleapiavailability, context, looper, zzf1, zzaan, zza(api, i));
            } else
            {
                googleapiavailability = zza(api.zznb(), googleapiavailability, context, looper, zzf1, zzaan, zza(api, i));
            }
            zzaaf.put(api.zznd(), googleapiavailability);
        }
        zzZH = zzf1;
        zzZj = zza1;
    }

    private void resume()
    {
        zzZs.lock();
        if (zznB())
        {
            connect();
        }
        zzZs.unlock();
        return;
        Exception exception;
        exception;
        zzZs.unlock();
        throw exception;
    }

    private static Api.zzb zza(Api.zza zza1, Object obj, Context context, Looper looper, zzf zzf1, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return zza1.zza(context, looper, zzf1, obj, connectioncallbacks, onconnectionfailedlistener);
    }

    private final GoogleApiClient.OnConnectionFailedListener zza(Api api, int i)
    {
        return new GoogleApiClient.OnConnectionFailedListener(api, i) {

            final zzi zzaap;
            final Api zzaaq;
            final int zzaar;

            public void onConnectionFailed(ConnectionResult connectionresult)
            {
                zzi.zza(zzaap).lock();
                zzi.zzb(zzaap).zza(connectionresult, zzaaq, zzaar);
                zzi.zza(zzaap).unlock();
                return;
                connectionresult;
                zzi.zza(zzaap).unlock();
                throw connectionresult;
            }

            
            {
                zzaap = zzi.this;
                zzaaq = api;
                zzaar = i;
                super();
            }
        };
    }

    private static zzac zza(Api.zze zze1, Object obj, Context context, Looper looper, zzf zzf1, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return new zzac(context, looper, zze1.zznf(), connectioncallbacks, onconnectionfailedlistener, zzf1, zze1.zzm(obj));
    }

    static Lock zza(zzi zzi1)
    {
        return zzi1.zzZs;
    }

    private void zza(GoogleApiClient googleapiclient, zzo zzo1, boolean flag)
    {
        zzkw.zzaet.zzc(googleapiclient).setResultCallback(new ResultCallback(zzo1, flag, googleapiclient) {

            final GoogleApiClient zzVc;
            final zzi zzaap;
            final zzo zzaat;
            final boolean zzaau;

            public void onResult(Result result)
            {
                zzr((Status)result);
            }

            public void zzr(Status status)
            {
                if (status.isSuccess() && zzaap.isConnected())
                {
                    zzaap.reconnect();
                }
                zzaat.zza(status);
                if (zzaau)
                {
                    zzVc.disconnect();
                }
            }

            
            {
                zzaap = zzi.this;
                zzaat = zzo1;
                zzaau = flag;
                zzVc = googleapiclient;
                super();
            }
        });
    }

    static void zza(zzi zzi1, GoogleApiClient googleapiclient, zzo zzo1, boolean flag)
    {
        zzi1.zza(googleapiclient, zzo1, flag);
    }

    static zzj zzb(zzi zzi1)
    {
        return zzi1.zzaai;
    }

    static void zzc(zzi zzi1)
    {
        zzi1.resume();
    }

    static void zzd(zzi zzi1)
    {
        zzi1.zznC();
    }

    static int zze(zzi zzi1)
    {
        return zzi1.zzZf;
    }

    private void zznC()
    {
        zzZs.lock();
        if (zznE())
        {
            connect();
        }
        zzZs.unlock();
        return;
        Exception exception;
        exception;
        zzZs.unlock();
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
        zzx.zza(flag, "blockingConnect must not be called on the UI thread");
        zzZs.lock();
        connect();
_L1:
        flag = isConnecting();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        zzZX.await();
          goto _L1
        interruptedexception;
        Thread.currentThread().interrupt();
        connectionresult = new ConnectionResult(15, null);
        zzZs.unlock();
        return connectionresult;
        ConnectionResult connectionresult1;
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        connectionresult1 = ConnectionResult.zzYi;
        zzZs.unlock();
        return connectionresult1;
        if (zzaaj == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        connectionresult1 = zzaaj;
        zzZs.unlock();
        return connectionresult1;
        connectionresult1 = new ConnectionResult(13, null);
        zzZs.unlock();
        return connectionresult1;
        Exception exception;
        exception;
        zzZs.unlock();
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
        zzx.zza(flag, "blockingConnect must not be called on the UI thread");
        zzZs.lock();
        connect();
        l = timeunit.toNanos(l);
_L2:
        flag = isConnecting();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        l1 = zzZX.awaitNanos(l);
        l = l1;
        if (l1 > 0L) goto _L2; else goto _L1
_L1:
        timeunit = new ConnectionResult(14, null);
        zzZs.unlock();
        return timeunit;
        timeunit;
        Thread.currentThread().interrupt();
        timeunit = new ConnectionResult(15, null);
        zzZs.unlock();
        return timeunit;
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_151;
        }
        timeunit = ConnectionResult.zzYi;
        zzZs.unlock();
        return timeunit;
        if (zzaaj == null)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        timeunit = zzaaj;
        zzZs.unlock();
        return timeunit;
        timeunit = new ConnectionResult(13, null);
        zzZs.unlock();
        return timeunit;
        timeunit;
        zzZs.unlock();
        throw timeunit;
    }

    public PendingResult clearDefaultAccountAndReconnect()
    {
        zzx.zza(isConnected(), "GoogleApiClient is not connected yet.");
        zzo zzo1 = new zzo(zzYV);
        if (zzaaf.containsKey(zzkw.zzQf))
        {
            zza(this, zzo1, false);
            return zzo1;
        } else
        {
            AtomicReference atomicreference = new AtomicReference();
            Object obj = new GoogleApiClient.ConnectionCallbacks(atomicreference, zzo1) {

                final zzi zzaap;
                final AtomicReference zzaas;
                final zzo zzaat;

                public void onConnected(Bundle bundle)
                {
                    zzi.zza(zzaap, (GoogleApiClient)zzaas.get(), zzaat, true);
                }

                public void onConnectionSuspended(int i)
                {
                }

            
            {
                zzaap = zzi.this;
                zzaas = atomicreference;
                zzaat = zzo1;
                super();
            }
            };
            GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener = new GoogleApiClient.OnConnectionFailedListener(zzo1) {

                final zzi zzaap;
                final zzo zzaat;

                public void onConnectionFailed(ConnectionResult connectionresult)
                {
                    zzaat.zza(new Status(8));
                }

            
            {
                zzaap = zzi.this;
                zzaat = zzo1;
                super();
            }
            };
            obj = (new GoogleApiClient.Builder(mContext)).addApi(zzkw.API).addConnectionCallbacks(((GoogleApiClient.ConnectionCallbacks) (obj))).addOnConnectionFailedListener(onconnectionfailedlistener).setHandler(zzaad).build();
            atomicreference.set(obj);
            ((GoogleApiClient) (obj)).connect();
            return zzo1;
        }
    }

    public void connect()
    {
        zzZs.lock();
        zzaai.connect();
        zzZs.unlock();
        return;
        Exception exception;
        exception;
        zzZs.unlock();
        throw exception;
    }

    public void disconnect()
    {
        zzZs.lock();
        zznE();
        zzaai.disconnect();
        zzZs.unlock();
        return;
        Exception exception;
        exception;
        zzZs.unlock();
        throw exception;
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.append(s).append("mState=").append(zzaai.getName());
        printwriter.append(" mResuming=").print(zzaaa);
        printwriter.append(" mWorkQueue.size()=").print(zzZZ.size());
        printwriter.append(" mUnconsumedRunners.size()=").println(zzaal.size());
        String s1 = (new StringBuilder()).append(s).append("  ").toString();
        Api api;
        for (Iterator iterator = zzZI.keySet().iterator(); iterator.hasNext(); ((Api.zzb)zzaaf.get(api.zznd())).dump(s1, filedescriptor, printwriter, as))
        {
            api = (Api)iterator.next();
            printwriter.append(s).append(api.getName()).println(":");
        }

    }

    public ConnectionResult getConnectionResult(Api api)
    {
        Api.zzc zzc1;
        zzc1 = api.zznd();
        zzZs.lock();
        if (!isConnected() && !zznB())
        {
            throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
        }
        break MISSING_BLOCK_LABEL_51;
        api;
        zzZs.unlock();
        throw api;
        if (!zzaaf.containsKey(zzc1))
        {
            break MISSING_BLOCK_LABEL_196;
        }
        if (!((Api.zzb)zzaaf.get(zzc1)).isConnected())
        {
            break MISSING_BLOCK_LABEL_100;
        }
        api = ConnectionResult.zzYi;
        zzZs.unlock();
        return api;
        if (!zzaag.containsKey(zzc1))
        {
            break MISSING_BLOCK_LABEL_138;
        }
        api = (ConnectionResult)zzaag.get(zzc1);
        zzZs.unlock();
        return api;
        Log.wtf("GoogleApiClientImpl", (new StringBuilder()).append(api.getName()).append(" requested in getConnectionResult").append(" is not connected but is not present in the failed connections map").toString());
        api = new ConnectionResult(8, null);
        zzZs.unlock();
        return api;
        zzZs.unlock();
        throw new IllegalArgumentException((new StringBuilder()).append(api.getName()).append(" was never registered with GoogleApiClient").toString());
    }

    public Context getContext()
    {
        return mContext;
    }

    public Looper getLooper()
    {
        return zzYV;
    }

    public int getSessionId()
    {
        return System.identityHashCode(this);
    }

    public boolean hasConnectedApi(Api api)
    {
        api = (Api.zzb)zzaaf.get(api.zznd());
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
        return zzaai instanceof com.google.android.gms.common.api.zzf;
    }

    public boolean isConnecting()
    {
        return zzaai instanceof zzg;
    }

    public boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        return zzZY.isConnectionCallbacksRegistered(connectioncallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return zzZY.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    public void reconnect()
    {
        disconnect();
        connect();
    }

    public void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        zzZY.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzZY.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void stopAutoManage(FragmentActivity fragmentactivity)
    {
        if (zzZf >= 0)
        {
            zzp zzp1 = com.google.android.gms.common.api.zzp.zza(fragmentactivity);
            if (zzp1 == null)
            {
                (new Handler(mContext.getMainLooper())).post(new Runnable(fragmentactivity) {

                    final zzi zzaap;
                    final FragmentActivity zzaav;

                    public void run()
                    {
                        if (zzaav.isFinishing() || zzaav.getSupportFragmentManager().isDestroyed())
                        {
                            return;
                        } else
                        {
                            com.google.android.gms.common.api.zzp.zzb(zzaav).zzbi(zzi.zze(zzaap));
                            return;
                        }
                    }

            
            {
                zzaap = zzi.this;
                zzaav = fragmentactivity;
                super();
            }
                });
                return;
            } else
            {
                zzp1.zzbi(zzZf);
                return;
            }
        }
        if (zzZg >= 0)
        {
            zzq.zzc(fragmentactivity).zzbi(zzZg);
            return;
        } else
        {
            throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
        }
    }

    public void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        zzZY.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzZY.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }

    public Api.zzb zza(Api.zzc zzc1)
    {
        zzc1 = (Api.zzb)zzaaf.get(zzc1);
        zzx.zzb(zzc1, "Appropriate Api was not requested.");
        return zzc1;
    }

    public zzc.zza zza(zzc.zza zza1)
    {
        boolean flag;
        if (zza1.zznd() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "This task can not be enqueued (it's probably a Batch or malformed)");
        zzx.zzb(zzaaf.containsKey(zza1.zznd()), "GoogleApiClient is not configured to use the API required for this call.");
        zzZs.lock();
        zza1 = zzaai.zza(zza1);
        zzZs.unlock();
        return zza1;
        zza1;
        zzZs.unlock();
        throw zza1;
    }

    void zza(zzb zzb1)
    {
        zzb1 = zzaad.obtainMessage(3, zzb1);
        zzaad.sendMessage(zzb1);
    }

    void zza(RuntimeException runtimeexception)
    {
        runtimeexception = zzaad.obtainMessage(4, runtimeexception);
        zzaad.sendMessage(runtimeexception);
    }

    public boolean zza(Api api)
    {
        return zzaaf.containsKey(api.zznd());
    }

    public boolean zza(Scope scope)
    {
        zzZs.lock();
        if (!isConnected()) goto _L2; else goto _L1
_L1:
        boolean flag = zzaah.contains(scope);
        if (!flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        zzZs.unlock();
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        scope;
        zzZs.unlock();
        throw scope;
    }

    public zzc.zza zzb(zzc.zza zza1)
    {
        zze zze1;
        boolean flag;
        if (zza1.zznd() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "This task can not be executed (it's probably a Batch or malformed)");
        zzZs.lock();
        if (!zznB())
        {
            break MISSING_BLOCK_LABEL_113;
        }
        zzZZ.add(zza1);
        for (; !zzZZ.isEmpty(); zze1.zzx(Status.zzaaF))
        {
            zze1 = (zze)zzZZ.remove();
            zzb(zze1);
        }

        break MISSING_BLOCK_LABEL_102;
        zza1;
        zzZs.unlock();
        throw zza1;
        zzZs.unlock();
        return zza1;
        zza1 = zzaai.zzb(zza1);
        zzZs.unlock();
        return zza1;
    }

    void zzb(zze zze1)
    {
        zzaal.add(zze1);
        zze1.zza(zzaam);
    }

    void zzg(ConnectionResult connectionresult)
    {
        zzZs.lock();
        zzaaj = connectionresult;
        zzaai = new zzh(this);
        zzaai.begin();
        zzZX.signalAll();
        zzZs.unlock();
        return;
        connectionresult;
        zzZs.unlock();
        throw connectionresult;
    }

    void zznA()
    {
        zzZs.lock();
        zznE();
        zzaai = new com.google.android.gms.common.api.zzf(this);
        zzaai.begin();
        zzZX.signalAll();
        zzZs.unlock();
        return;
        Exception exception;
        exception;
        zzZs.unlock();
        throw exception;
    }

    boolean zznB()
    {
        return zzaaa;
    }

    void zznD()
    {
        if (zznB())
        {
            return;
        }
        zzaaa = true;
        if (zzaae == null)
        {
            zzaae = new zzc(this);
            IntentFilter intentfilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentfilter.addDataScheme("package");
            mContext.getApplicationContext().registerReceiver(zzaae, intentfilter);
        }
        zzaad.sendMessageDelayed(zzaad.obtainMessage(1), zzaab);
        zzaad.sendMessageDelayed(zzaad.obtainMessage(2), zzaac);
    }

    boolean zznE()
    {
        if (!zznB())
        {
            return false;
        }
        zzaaa = false;
        zzaad.removeMessages(2);
        zzaad.removeMessages(1);
        if (zzaae != null)
        {
            mContext.getApplicationContext().unregisterReceiver(zzaae);
            zzaae = null;
        }
        return true;
    }

    void zznx()
    {
        zze zze1;
        for (Iterator iterator = zzaal.iterator(); iterator.hasNext(); zze1.cancel())
        {
            zze1 = (zze)iterator.next();
            zze1.zza(null);
        }

        zzaal.clear();
        for (Iterator iterator1 = zzaak.iterator(); iterator1.hasNext(); ((zzl)iterator1.next()).clear()) { }
        zzaak.clear();
    }

    void zzny()
    {
        for (Iterator iterator = zzaaf.values().iterator(); iterator.hasNext(); ((Api.zzb)iterator.next()).disconnect()) { }
    }

    void zznz()
    {
        zzZs.lock();
        zzaai = new zzg(this, zzZH, zzZI, zzZi, zzZj, zzZs, mContext);
        zzaai.begin();
        zzZX.signalAll();
        zzZs.unlock();
        return;
        Exception exception;
        exception;
        zzZs.unlock();
        throw exception;
    }

    public zzl zzp(Object obj)
    {
        zzx.zzb(obj, "Listener must not be null");
        zzZs.lock();
        obj = new zzl(zzYV, obj);
        zzaak.add(obj);
        zzZs.unlock();
        return ((zzl) (obj));
        obj;
        zzZs.unlock();
        throw obj;
    }
}
