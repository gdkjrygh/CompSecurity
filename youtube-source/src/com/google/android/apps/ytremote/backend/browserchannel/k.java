// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.browserchannel;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.apps.ytremote.a.b.a;
import com.google.android.apps.ytremote.a.d.b;
import com.google.android.apps.ytremote.backend.logic.CloudService;
import com.google.android.apps.ytremote.backend.model.Method;
import com.google.android.apps.ytremote.backend.model.Params;
import com.google.android.apps.ytremote.util.c;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.apps.ytremote.backend.browserchannel:
//            r, a, j, UnexpectedReponseCodeException, 
//            n, q, o, p, 
//            l, m, c

public class k
    implements CloudService
{

    private static final String a;
    private static final String b = com/google/android/apps/ytremote/backend/browserchannel/k.getName();
    private static final List c = Collections.emptyList();
    private r d;
    private final com.google.android.apps.ytremote.backend.browserchannel.c e;
    private com.google.android.apps.ytremote.backend.browserchannel.a f;
    private com.google.android.apps.ytremote.backend.model.a g;
    private final Context h;
    private final AtomicBoolean i = new AtomicBoolean(false);
    private boolean j;
    private Thread k;
    private boolean l;
    private boolean m;
    private CountDownLatch n;
    private final boolean o;
    private final ExecutorService p = Executors.newSingleThreadExecutor();
    private final Queue q = new LinkedBlockingQueue(10);
    private int r;
    private int s;
    private CountDownLatch t;
    private final Timer u = new Timer("Timer - Reconnect to RC server");
    private TimerTask v;
    private long w;
    private final ScheduledExecutorService x = Executors.newSingleThreadScheduledExecutor();
    private ScheduledFuture y;

    public k(Context context, com.google.android.apps.ytremote.backend.browserchannel.c c1)
    {
        j = true;
        l = true;
        r = 5000;
        h = context;
        e = c1;
        f();
        t = new CountDownLatch(0);
        n = new CountDownLatch(0);
        o = com.google.android.apps.ytremote.a.b.a.a(context);
    }

    static com.google.android.apps.ytremote.backend.browserchannel.a a(k k1, com.google.android.apps.ytremote.backend.browserchannel.a a1)
    {
        k1.f = a1;
        return a1;
    }

    static AtomicBoolean a(k k1)
    {
        return k1.i;
    }

    static void a(k k1, Method method, Params params, List list)
    {
label0:
        {
label1:
            {
                if (k1.n.getCount() != 0L || k1.t.getCount() != 0L)
                {
                    try
                    {
                        k1.t.await(com.google.android.apps.ytremote.backend.browserchannel.r.a, TimeUnit.MILLISECONDS);
                        k1.n.await(5L, TimeUnit.SECONDS);
                    }
                    catch (InterruptedException interruptedexception)
                    {
                        Log.w(b, "Interrupted while waiting to connect.", interruptedexception);
                    }
                }
                if (!k1.m)
                {
                    k1.q.poll();
                    a(list, com.google.android.apps.ytremote.backend.logic.CloudService.OnSendMessageResult.SendMessageResult.NOT_CONNECTED);
                    list = b;
                    StringBuilder stringbuilder = (new StringBuilder("Dropping call for method:")).append(method).append("[").append(params).append("], because");
                    if (k1.b())
                    {
                        params = " still connecting, but not done";
                    } else
                    {
                        params = " not connected";
                    }
                    Log.w(list, stringbuilder.append(params).toString());
                    if (com.google.android.apps.ytremote.a.b.a.a(k1.h))
                    {
                        throw new IllegalStateException((new StringBuilder("Had to drop call for method: ")).append(method).append(" because not connected").toString());
                    }
                    break label1;
                }
                j j1;
                try
                {
                    j1 = k1.f.a(method, params);
                }
                catch (Exception exception)
                {
                    Log.e(b, (new StringBuilder("Exception while sending message: ")).append(method).append("(").append(params).append(")").toString(), exception);
                    exception = null;
                }
                if (j1 != null)
                {
                    if (j1.b() == 200)
                    {
                        k1.q.poll();
                        k1.s = 0;
                        for (k1 = list.iterator(); k1.hasNext();)
                        {
                            method = (com.google.android.apps.ytremote.backend.logic.CloudService.OnSendMessageResult)k1.next();
                            try
                            {
                                params = com.google.android.apps.ytremote.backend.logic.CloudService.OnSendMessageResult.SendMessageResult.OK;
                            }
                            // Misplaced declaration of an exception variable
                            catch (Params params)
                            {
                                Log.w(b, (new StringBuilder("OnSendMessageResult ")).append(method).append(" threw exception").append(params).toString());
                            }
                        }

                        break label1;
                    }
                    if (com.google.android.apps.ytremote.a.b.a.a(k1.h))
                    {
                        throw new IllegalStateException("sendJson returned a non-200 response. This shouldn't happen.");
                    }
                }
                int i1 = k1.s + 1;
                k1.s = i1;
                if (i1 >= 2)
                {
                    break label0;
                }
                Log.w(b, (new StringBuilder("Increasing recent errors and retrying: ")).append(k1.s).toString());
            }
            return;
        }
        Log.w(b, (new StringBuilder("Too many errors on sending ")).append(method).append("(").append(params).append("). Reconnecting...").toString());
        k1.e();
    }

    static void a(k k1, List list, com.google.android.apps.ytremote.backend.logic.CloudService.OnSendMessageResult.SendMessageResult sendmessageresult)
    {
        a(list, sendmessageresult);
    }

    static void a(k k1, CountDownLatch countdownlatch)
    {
        if (countdownlatch != null)
        {
            countdownlatch.countDown();
        }
    }

    private void a(Method method, Params params, List list)
    {
        this;
        JVM INSTR monitorenter ;
        q.offer(new r(method, params, list));
        if (d == null)
        {
            g();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        method;
        throw method;
    }

    private static void a(List list, com.google.android.apps.ytremote.backend.logic.CloudService.OnSendMessageResult.SendMessageResult sendmessageresult)
    {
        for (list = list.iterator(); list.hasNext(); list.next()) { }
    }

    static boolean a(k k1, boolean flag)
    {
        k1.m = false;
        return false;
    }

    static void b(k k1, boolean flag)
    {
        k1.b(false);
    }

    private void b(boolean flag)
    {
        if (k != null)
        {
            k.interrupt();
        }
        f.a(true, flag);
    }

    static boolean b(k k1)
    {
        return k1.m;
    }

    static com.google.android.apps.ytremote.backend.browserchannel.c c(k k1)
    {
        return k1.e;
    }

    static String c()
    {
        return b;
    }

    static void c(k k1, boolean flag)
    {
        k1.d(false);
    }

    private void c(boolean flag)
    {
        m = flag;
        Context context = h;
        android.content.Intent intent;
        if (flag)
        {
            intent = com.google.android.apps.ytremote.intent.Intents.IntentAction.CONNECTION_STATUS_CONNECTED.asIntent();
        } else
        {
            intent = com.google.android.apps.ytremote.intent.Intents.IntentAction.CONNECTION_STATUS_DISCONNECTED.asIntent();
        }
        context.sendBroadcast(intent);
    }

    private static String d()
    {
        Object obj = NetworkInterface.getNetworkInterfaces();
_L2:
        Enumeration enumeration;
        if (!((Enumeration) (obj)).hasMoreElements())
        {
            break MISSING_BLOCK_LABEL_74;
        }
        enumeration = ((NetworkInterface)((Enumeration) (obj)).nextElement()).getInetAddresses();
_L4:
        if (!enumeration.hasMoreElements()) goto _L2; else goto _L1
_L1:
        InetAddress inetaddress = (InetAddress)enumeration.nextElement();
        if (inetaddress.isLoopbackAddress()) goto _L4; else goto _L3
_L3:
        obj = inetaddress.getHostAddress().toString();
        return ((String) (obj));
        SocketException socketexception;
        socketexception;
        Log.e(b, socketexception.toString());
        return null;
    }

    static void d(k k1)
    {
        k1.f.a();
        k1.c(true);
        k1.f();
        k1.k = new n(k1, "HangingGetThread");
        k1.k.start();
        return;
        Object obj;
        obj;
        Log.e(b, (new StringBuilder("Unexpected response when binding channel: ")).append(((UnexpectedReponseCodeException) (obj)).getCode()).toString(), ((Throwable) (obj)));
        ((UnexpectedReponseCodeException) (obj)).getCode();
        JVM INSTR tableswitch 401 403: default 100
    //                   401 105
    //                   402 100
    //                   403 105;
           goto _L1 _L2 _L1 _L2
_L1:
        k1.e();
        return;
_L2:
        k1.a(false);
        if (true) goto _L1; else goto _L3
_L3:
        obj;
        Log.e(b, "Error connecting to Remote Control server:", ((Throwable) (obj)));
        k1.e();
        return;
    }

    private void d(boolean flag)
    {
        if (flag)
        {
            n = new CountDownLatch(1);
            h.sendBroadcast(com.google.android.apps.ytremote.intent.Intents.IntentAction.CONNECTION_STATUS_STARTED_CONNECTING.asIntent());
            return;
        } else
        {
            n.countDown();
            h.sendBroadcast(com.google.android.apps.ytremote.intent.Intents.IntentAction.CONNECTION_STATUS_STOPPED_CONNECTING.asIntent());
            return;
        }
    }

    static boolean d(k k1, boolean flag)
    {
        k1.l = flag;
        return flag;
    }

    private void e()
    {
        c(false);
        d(false);
        b(false);
        if (i.get()) goto _L2; else goto _L1
_L1:
        if (!j) goto _L4; else goto _L3
_L3:
        j = false;
        a(g);
_L2:
        h.sendBroadcast(com.google.android.apps.ytremote.intent.Intents.IntentAction.LOUNGE_SERVER_CONNECTION_ERROR.asIntent());
        return;
_L4:
        if (!com.google.android.apps.ytremote.a.d.b.a(h))
        {
            android.content.Intent intent = com.google.android.apps.ytremote.intent.Intents.IntentAction.CLOUD_SERVICE_NO_NETWORK.asIntent();
            h.sendBroadcast(intent);
        }
        if (t.getCount() == 0L)
        {
            if (w * 2L < 0x3a980L)
            {
                w = w * 2L;
            }
            Log.i(b, (new StringBuilder("Reconnecting in ")).append(w).append(" ms.").toString());
            t = new CountDownLatch(1);
            v = new q(this);
            u.schedule(v, w);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    static void e(k k1)
    {
        k1.g();
    }

    static CountDownLatch f(k k1)
    {
        return k1.n;
    }

    private void f()
    {
        j = true;
        w = (int)(Math.random() * 1000D) + 2000;
    }

    static String g(k k1)
    {
        return d();
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        r r1;
        r1 = (r)q.peek();
        d = r1;
        if (r1 == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        java.util.concurrent.Future future = p.submit(new o(this));
        y = x.schedule(new p(this, future), r, TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static com.google.android.apps.ytremote.backend.browserchannel.a h(k k1)
    {
        return k1.f;
    }

    static Context i(k k1)
    {
        return k1.h;
    }

    static boolean j(k k1)
    {
        return k1.l;
    }

    static void k(k k1)
    {
        k1.e();
    }

    static r l(k k1)
    {
        return k1.d;
    }

    static Queue m(k k1)
    {
        return k1.q;
    }

    static ScheduledFuture n(k k1)
    {
        return k1.y;
    }

    static int o(k k1)
    {
        return k1.r;
    }

    static com.google.android.apps.ytremote.backend.model.a p(k k1)
    {
        return k1.g;
    }

    public final CountDownLatch a(com.google.android.apps.ytremote.backend.model.a a1)
    {
        com.google.android.apps.ytremote.util.c.a(a1);
        if (n.getCount() != 0L)
        {
            Log.w(b, "Already in the process of connecting. Ignoring connect request");
            return n;
        } else
        {
            g = a1;
            s = 0;
            d(true);
            t.countDown();
            (new l(this, "asyncConnect", a1)).start();
            return n;
        }
    }

    public final void a(Method method, Params params)
    {
        a(method, params, c);
    }

    final void a(CountDownLatch countdownlatch)
    {
        (new m(this, "Testing for buffered proxy", null)).start();
    }

    public final void a(boolean flag)
    {
        i.set(true);
        r r1;
        for (Iterator iterator = q.iterator(); iterator.hasNext(); a(r1.b, com.google.android.apps.ytremote.backend.logic.CloudService.OnSendMessageResult.SendMessageResult.CANCELED))
        {
            r1 = (r)iterator.next();
            Log.w(b, (new StringBuilder("Dropping message: ")).append(r1).toString());
        }

        q.clear();
        if (v != null)
        {
            v.cancel();
            v = null;
        }
        try
        {
            n.await(3L, TimeUnit.SECONDS);
        }
        catch (InterruptedException interruptedexception)
        {
            Log.e(b, "Interrupted while waiting for BC to connect", interruptedexception);
        }
        if (n.getCount() > 0L)
        {
            Log.w(b, "Timed out while waiting for BC to connect. Will attempt stopping the connection anyway.");
        }
        if (m)
        {
            b(flag);
        }
        c(false);
        d(false);
        h.sendBroadcast(com.google.android.apps.ytremote.intent.Intents.IntentAction.BIG_SCREEN_DISCONNECTED.asIntent());
    }

    public final boolean a()
    {
        return m;
    }

    public final boolean b()
    {
        return n.getCount() != 0L;
    }

    static 
    {
        a = (new StringBuilder()).append(Build.MANUFACTURER.toUpperCase()).append(" ").append(Build.MODEL).toString();
    }
}
