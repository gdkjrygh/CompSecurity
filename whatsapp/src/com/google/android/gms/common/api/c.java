// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jm;
import com.google.android.gms.internal.jx;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient, Api, Status, d

final class c
    implements GoogleApiClient
{

    private final Looper JF;
    private final Condition JR;
    private final jm JS;
    private final int JT;
    final Queue JU = new LinkedList();
    private ConnectionResult JV;
    private int JW;
    private volatile int JX;
    private volatile boolean JY;
    private boolean JZ;
    private final b Jy = new _cls1();
    private int Ka;
    private long Kb;
    private long Kc;
    final Handler Kd;
    BroadcastReceiver Ke;
    private final Bundle Kf = new Bundle();
    private final Map Kg = new HashMap();
    private final List Kh;
    private boolean Ki;
    private final Set Kj = Collections.newSetFromMap(new WeakHashMap());
    final Set Kk = Collections.newSetFromMap(new ConcurrentHashMap());
    private final GoogleApiClient.ConnectionCallbacks Kl = new _cls2();
    private final com.google.android.gms.internal.jm.b Km = new _cls3();
    private final Context mContext;
    private final Lock zO = new ReentrantLock();

    public com.google.android.gms.common.api.c(Context context, Looper looper, jg jg1, Map map, Set set, Set set1, int i1)
    {
        int j1 = Api.a;
        super();
        JR = zO.newCondition();
        JX = 4;
        JZ = false;
        Kb = 0x1d4c0L;
        Kc = 5000L;
        mContext = context;
        JS = new jm(context, looper, Km);
        JF = looper;
        Kd = new c(looper);
        JT = i1;
        set = set.iterator();
        do
        {
            if (!set.hasNext())
            {
                break;
            }
            GoogleApiClient.ConnectionCallbacks connectioncallbacks = (GoogleApiClient.ConnectionCallbacks)set.next();
            JS.registerConnectionCallbacks(connectioncallbacks);
            if (j1 == 0)
            {
                continue;
            }
            jx.a++;
            break;
        } while (true);
        set = set1.iterator();
        do
        {
            if (!set.hasNext())
            {
                break;
            }
            set1 = (GoogleApiClient.OnConnectionFailedListener)set.next();
            JS.registerConnectionFailedListener(set1);
        } while (j1 == 0);
        set = map.keySet().iterator();
        do
        {
            if (!set.hasNext())
            {
                break;
            }
            set1 = (Api)set.next();
            Api.b b1 = set1.gx();
            Object obj = map.get(set1);
            Kg.put(set1.gz(), a(b1, obj, context, looper, jg1, Kl, new _cls4(b1)));
        } while (j1 == 0);
        Kh = Collections.unmodifiableList(jg1.ho());
    }

    static ConnectionResult a(com.google.android.gms.common.api.c c1, ConnectionResult connectionresult)
    {
        c1.JV = connectionresult;
        return connectionresult;
    }

    private static Api.a a(Api.b b1, Object obj, Context context, Looper looper, jg jg1, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return b1.a(context, looper, jg1, obj, connectioncallbacks, onconnectionfailedlistener);
    }

    static Lock a(com.google.android.gms.common.api.c c1)
    {
        return c1.zO;
    }

    private void a(d d1)
    {
        zO.lock();
        boolean flag;
        if (d1.gz() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "This task can not be executed or enqueued (it's probably a Batch or malformed)");
        Kk.add(d1);
        d1.a(Jy);
        if (!gL())
        {
            break MISSING_BLOCK_LABEL_84;
        }
        d1.l(new Status(8));
        zO.unlock();
        return;
        d1.b(a(d1.gz()));
        zO.unlock();
        return;
        d1;
        zO.unlock();
        throw d1;
    }

    static void a(com.google.android.gms.common.api.c c1, int i1)
    {
        c1.al(i1);
    }

    static boolean a(com.google.android.gms.common.api.c c1, boolean flag)
    {
        c1.JY = flag;
        return flag;
    }

    private void al(int i1)
    {
        int j1;
        j1 = Api.a;
        zO.lock();
        if (JX == 3) goto _L2; else goto _L1
_L1:
        if (i1 != -1) goto _L4; else goto _L3
_L3:
        if (!isConnecting()) goto _L6; else goto _L5
_L5:
        Iterator iterator = JU.iterator();
_L13:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        d d1 = (d)iterator.next();
        if (d1.gF() != 1)
        {
            d1.cancel();
            iterator.remove();
        }
        continue; /* Loop/switch isn't completed */
_L6:
        JU.clear();
_L14:
        iterator = Kk.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((d)iterator.next()).cancel();
        } while (j1 == 0);
        Kk.clear();
        iterator = Kj.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((com.google.android.gms.common.api.d)iterator.next()).clear();
        } while (j1 == 0);
        Kj.clear();
        if (JV != null || JU.isEmpty()) goto _L4; else goto _L7
_L7:
        JZ = true;
        zO.unlock();
        return;
_L4:
        boolean flag;
        boolean flag1;
        flag = isConnecting();
        flag1 = isConnected();
        JX = 3;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_264;
        }
        if (i1 != -1)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        JV = null;
        JR.signalAll();
        Ki = false;
        iterator = Kg.values().iterator();
_L15:
        if (!iterator.hasNext()) goto _L9; else goto _L8
_L8:
        Api.a a1 = (Api.a)iterator.next();
        if (a1.isConnected())
        {
            a1.disconnect();
        }
          goto _L10
_L9:
        Ki = true;
        JX = 4;
        if (!flag1) goto _L2; else goto _L11
_L11:
        if (i1 == -1)
        {
            break MISSING_BLOCK_LABEL_349;
        }
        JS.aE(i1);
        Ki = false;
_L2:
        zO.unlock();
        return;
        Exception exception;
        exception;
        zO.unlock();
        throw exception;
        if (j1 == 0) goto _L13; else goto _L12
_L12:
        if (j1 == 0) goto _L14; else goto _L6
_L10:
        if (j1 == 0) goto _L15; else goto _L9
    }

    static int b(com.google.android.gms.common.api.c c1)
    {
        return c1.JX;
    }

    static int b(com.google.android.gms.common.api.c c1, int i1)
    {
        c1.JW = i1;
        return i1;
    }

    static Bundle c(com.google.android.gms.common.api.c c1)
    {
        return c1.Kf;
    }

    static void d(com.google.android.gms.common.api.c c1)
    {
        c1.gJ();
    }

    static Context e(com.google.android.gms.common.api.c c1)
    {
        return c1.mContext;
    }

    static long f(com.google.android.gms.common.api.c c1)
    {
        return c1.Kb;
    }

    static long g(com.google.android.gms.common.api.c c1)
    {
        return c1.Kc;
    }

    private void gJ()
    {
label0:
        {
            int i1 = Api.a;
            Ka = Ka - 1;
            if (Ka != 0)
            {
                break label0;
            }
            if (JV != null)
            {
                JZ = false;
                al(3);
                if (!gL() || !GooglePlayServicesUtil.e(mContext, JV.getErrorCode()))
                {
                    gM();
                    JS.b(JV);
                }
                Ki = false;
                if (i1 == 0)
                {
                    break label0;
                }
            }
            JX = 2;
            gM();
            JR.signalAll();
            gK();
            if (JZ)
            {
                JZ = false;
                al(-1);
                if (i1 == 0)
                {
                    break label0;
                }
            }
            Bundle bundle;
            if (Kf.isEmpty())
            {
                bundle = null;
            } else
            {
                bundle = Kf;
            }
            JS.f(bundle);
        }
    }

    private void gK()
    {
        int i1;
        i1 = Api.a;
        zO.lock();
        boolean flag = isConnected();
        if (flag) goto _L2; else goto _L1
_L1:
        flag = gL();
        if (!flag) goto _L3; else goto _L2
_L2:
        flag = true;
_L7:
        jx.a(flag, "GoogleApiClient is not connected yet.");
_L4:
        flag = JU.isEmpty();
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        a((d)JU.remove());
          goto _L4
        Object obj;
        obj;
        Log.w("GoogleApiClientImpl", "Service died while flushing queue", ((Throwable) (obj)));
        if (i1 == 0) goto _L4; else goto _L5
_L5:
        zO.unlock();
        return;
        obj;
        throw obj;
        obj;
        zO.unlock();
        throw obj;
_L3:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void gM()
    {
        zO.lock();
        boolean flag = JY;
        if (!flag)
        {
            zO.unlock();
            return;
        }
        JY = false;
        Kd.removeMessages(2);
        Kd.removeMessages(1);
        mContext.unregisterReceiver(Ke);
        zO.unlock();
        return;
        Exception exception;
        exception;
        zO.unlock();
        throw exception;
    }

    static boolean h(com.google.android.gms.common.api.c c1)
    {
        return c1.Ki;
    }

    static void i(com.google.android.gms.common.api.c c1)
    {
        c1.gM();
    }

    static void j(com.google.android.gms.common.api.c c1)
    {
        c1.resume();
    }

    static ConnectionResult k(com.google.android.gms.common.api.c c1)
    {
        return c1.JV;
    }

    static int l(com.google.android.gms.common.api.c c1)
    {
        return c1.JW;
    }

    private void resume()
    {
        zO.lock();
        if (gL())
        {
            connect();
        }
        zO.unlock();
        return;
        Exception exception;
        exception;
        zO.unlock();
        throw exception;
    }

    public Api.a a(Api.c c1)
    {
        c1 = (Api.a)Kg.get(c1);
        jx.b(c1, "Appropriate Api was not requested.");
        return c1;
    }

    public BaseImplementation.a b(BaseImplementation.a a1)
    {
        if (isConnected()) goto _L2; else goto _L1
_L1:
        boolean flag = gL();
        if (!flag) goto _L3; else goto _L2
_L2:
        flag = true;
_L5:
        jx.a(flag, "GoogleApiClient is not connected yet.");
        gK();
        try
        {
            a(a1);
        }
        catch (DeadObjectException deadobjectexception)
        {
            al(1);
            return a1;
        }
        return a1;
        a1;
        try
        {
            throw a1;
        }
        // Misplaced declaration of an exception variable
        catch (BaseImplementation.a a1)
        {
            throw a1;
        }
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void connect()
    {
        int i1;
        i1 = Api.a;
        zO.lock();
        boolean flag;
        JZ = false;
        if (isConnected())
        {
            break MISSING_BLOCK_LABEL_34;
        }
        flag = isConnecting();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        zO.unlock();
        return;
        Iterator iterator;
        Ki = true;
        JV = null;
        JX = 1;
        Kf.clear();
        Ka = Kg.size();
        iterator = Kg.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((Api.a)iterator.next()).connect();
        } while (i1 == 0);
        zO.unlock();
        return;
        Exception exception;
        exception;
        zO.unlock();
        throw exception;
    }

    public void disconnect()
    {
        gM();
        al(-1);
    }

    boolean gL()
    {
        return JY;
    }

    public Looper getLooper()
    {
        return JF;
    }

    public boolean isConnected()
    {
        return JX == 2;
    }

    public boolean isConnecting()
    {
        return JX == 1;
    }

    public void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        JS.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        JS.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        JS.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        JS.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }

    private class _cls1
        implements b
    {

        final com.google.android.gms.common.api.c Kn;

        public void b(d d1)
        {
            Kn.Kk.remove(d1);
        }

        _cls1()
        {
            Kn = c.this;
            super();
        }
    }


    private class _cls2
        implements GoogleApiClient.ConnectionCallbacks
    {

        final com.google.android.gms.common.api.c Kn;

        public void onConnected(Bundle bundle)
        {
            com.google.android.gms.common.api.c.a(Kn).lock();
            if (com.google.android.gms.common.api.c.b(Kn) != 1)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_38;
            }
            com.google.android.gms.common.api.c.c(Kn).putAll(bundle);
            com.google.android.gms.common.api.c.d(Kn);
            com.google.android.gms.common.api.c.a(Kn).unlock();
            return;
            bundle;
            com.google.android.gms.common.api.c.a(Kn).unlock();
            throw bundle;
        }

        public void onConnectionSuspended(int i1)
        {
            com.google.android.gms.common.api.c.a(Kn).lock();
            i1;
            JVM INSTR tableswitch 1 2: default 36
        //                       1 70
        //                       2 49;
               goto _L1 _L2 _L3
_L1:
            com.google.android.gms.common.api.c.a(Kn).unlock();
            return;
_L3:
            com.google.android.gms.common.api.c.a(Kn, i1);
            Kn.connect();
            if (Api.a == 0) goto _L1; else goto _L2
_L2:
            boolean flag = Kn.gL();
            if (flag)
            {
                com.google.android.gms.common.api.c.a(Kn).unlock();
                return;
            }
            com.google.android.gms.common.api.c.a(Kn, true);
            Kn.Ke = Kn. new a();
            IntentFilter intentfilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentfilter.addDataScheme("package");
            com.google.android.gms.common.api.c.e(Kn).registerReceiver(Kn.Ke, intentfilter);
            Kn.Kd.sendMessageDelayed(Kn.Kd.obtainMessage(1), com.google.android.gms.common.api.c.f(Kn));
            Kn.Kd.sendMessageDelayed(Kn.Kd.obtainMessage(2), com.google.android.gms.common.api.c.g(Kn));
            com.google.android.gms.common.api.c.a(Kn, i1);
              goto _L1
            Exception exception;
            exception;
            com.google.android.gms.common.api.c.a(Kn).unlock();
            throw exception;
        }

        _cls2()
        {
            Kn = c.this;
            super();
        }

        private class a extends BroadcastReceiver
        {

            private WeakReference Ks;

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
                    if ((context = (com.google.android.gms.common.api.c)Ks.get()) != null && !context.isConnected() && !context.isConnecting() && context.gL())
                    {
                        context.connect();
                        return;
                    }
                }
            }

            a()
            {
                Ks = new WeakReference(com.google.android.gms.common.api.c.this);
            }
        }

    }


    private class _cls3
        implements com.google.android.gms.internal.jm.b
    {

        final com.google.android.gms.common.api.c Kn;

        public Bundle fX()
        {
            return null;
        }

        public boolean gN()
        {
            return com.google.android.gms.common.api.c.h(Kn);
        }

        public boolean isConnected()
        {
            return Kn.isConnected();
        }

        _cls3()
        {
            Kn = c.this;
            super();
        }
    }


    private class c extends Handler
    {

        final com.google.android.gms.common.api.c Kn;

        public void handleMessage(Message message)
        {
            int i1 = Api.a;
            message.what;
            JVM INSTR tableswitch 1 2: default 32
        //                       1 61
        //                       2 72;
               goto _L1 _L2 _L3
_L1:
            Log.w("GoogleApiClientImpl", (new StringBuilder()).append("Unknown message id: ").append(message.what).toString());
_L4:
            return;
_L2:
            com.google.android.gms.common.api.c.i(Kn);
            if (i1 == 0) goto _L4; else goto _L3
_L3:
            com.google.android.gms.common.api.c.j(Kn);
            if (i1 == 0) goto _L4; else goto _L1
        }

        c(Looper looper)
        {
            Kn = com.google.android.gms.common.api.c.this;
            super(looper);
        }
    }


    private class _cls4
        implements GoogleApiClient.OnConnectionFailedListener
    {

        final com.google.android.gms.common.api.c Kn;
        final Api.b Ko;

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            com.google.android.gms.common.api.c.a(Kn).lock();
            if (com.google.android.gms.common.api.c.k(Kn) == null || Ko.getPriority() < com.google.android.gms.common.api.c.l(Kn))
            {
                com.google.android.gms.common.api.c.a(Kn, connectionresult);
                com.google.android.gms.common.api.c.b(Kn, Ko.getPriority());
            }
            com.google.android.gms.common.api.c.d(Kn);
            com.google.android.gms.common.api.c.a(Kn).unlock();
            return;
            connectionresult;
            com.google.android.gms.common.api.c.a(Kn).unlock();
            throw connectionresult;
        }

        _cls4(Api.b b1)
        {
            Kn = com.google.android.gms.common.api.c.this;
            Ko = b1;
            super();
        }
    }


    private class d
    {

        public abstract void a(b b1);

        public abstract void b(Api.a a1);

        public abstract void cancel();

        public abstract int gF();

        public abstract Api.c gz();

        public abstract void l(Status status);
    }

}
