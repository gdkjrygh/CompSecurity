// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.PowerManager;
import android.util.Pair;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.model.transfer.a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            m, n, s, u, 
//            p, t, l, r, 
//            v, q, TransferException

public final class TransfersExecutor
    implements m
{

    private final int A;
    private final boolean B;
    private final Context a;
    private final v b;
    private final r c;
    private final Random d = new Random();
    private final HandlerThread e = new HandlerThread(getClass().getName());
    private final Handler f;
    private final Object g = new Object();
    private int h;
    private int i;
    private boolean j;
    private final n k;
    private final Map l = new LinkedHashMap();
    private final Map m = new HashMap();
    private final Map n = new HashMap();
    private final HashSet o = new HashSet();
    private final android.os.PowerManager.WakeLock p;
    private final android.net.wifi.WifiManager.WifiLock q;
    private final u r = new u(this);
    private final s s = new s(this);
    private final ChargingReceiver t = new ChargingReceiver();
    private boolean u;
    private boolean v;
    private int w;
    private boolean x;
    private boolean y;
    private volatile String z;

    public TransfersExecutor(Context context, r r1, v v1, String s1, int i1, boolean flag)
    {
        a = context;
        c = r1;
        b = v1;
        j = true;
        A = i1;
        B = flag;
        k = new n(context, s1);
        s.b();
        r.c();
        t.a();
        p = ((PowerManager)context.getSystemService("power")).newWakeLock(1, getClass().getName());
        q = ((WifiManager)context.getSystemService("wifi")).createWifiLock(getClass().getName());
        e.start();
        f = new p(this, e.getLooper());
    }

    private int a(int i1, int j1, int k1, Object obj)
    {
        synchronized (g)
        {
            f.obtainMessage(i1, j1, k1, obj).sendToTarget();
            j = false;
            i1 = i + 1;
            i = i1;
        }
        return i1;
    }

    private int a(int i1, Object obj)
    {
        synchronized (g)
        {
            f.obtainMessage(i1, obj).sendToTarget();
            j = false;
            i1 = i + 1;
            i = i1;
        }
        return i1;
    }

    private int a(int i1, Object obj, int j1)
    {
        synchronized (g)
        {
            f.sendMessageDelayed(f.obtainMessage(12, obj), j1);
            j = false;
            i1 = i + 1;
            i = i1;
        }
        return i1;
    }

    static android.os.PowerManager.WakeLock a(TransfersExecutor transfersexecutor)
    {
        return transfersexecutor.p;
    }

    private void a(t t1, int i1)
    {
        boolean flag1 = true;
        String s1;
        l l1;
        boolean flag;
        if (t1.c != com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.PENDING)
        {
            t1.c = com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.PENDING;
            flag = true;
        } else
        {
            flag = false;
        }
        s1 = t1.a;
        l1 = (l)m.remove(s1);
        if (l1 != null)
        {
            l1.a(i1);
        }
        n.remove(s1);
        o.remove(s1);
        if (t1.d != i1)
        {
            t1.d = i1;
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = ((flag) ? 1 : 0);
        }
        if (i1 != 0)
        {
            k.b(t1);
            c.f(t1.a());
        }
    }

    private int b(int i1)
    {
        synchronized (g)
        {
            f.obtainMessage(i1).sendToTarget();
            j = false;
            i1 = i + 1;
            i = i1;
        }
        return i1;
    }

    static Context b(TransfersExecutor transfersexecutor)
    {
        return transfersexecutor.a;
    }

    static void c(TransfersExecutor transfersexecutor)
    {
        synchronized (transfersexecutor.g)
        {
            if (!transfersexecutor.j)
            {
                transfersexecutor.b(7);
            }
        }
    }

    private final void f()
    {
        if (x) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Iterator iterator;
        boolean flag;
        boolean flag1;
        byte byte0;
        byte byte1;
        byte byte2;
        byte byte3;
        int i1;
        boolean flag2;
        if (u && !r.b())
        {
            byte2 = 1;
        } else
        {
            byte2 = 0;
        }
        if (v && !t.c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!s.a())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!r.a())
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        if (flag1)
        {
            byte1 = 4;
        } else
        {
            byte1 = 0;
        }
        if (byte2 != 0)
        {
            byte2 = 8;
        } else
        {
            byte2 = 0;
        }
        if (flag)
        {
            byte3 = 16;
        } else
        {
            byte3 = 0;
        }
        iterator = l.values().iterator();
        i1 = 0;
        flag2 = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            t t1 = (t)iterator.next();
            if (t1.b())
            {
                int j1;
                if (i1 >= w)
                {
                    j1 = 32;
                } else
                {
                    j1 = 0;
                }
                j1 |= byte1 | (byte0 | 0) | byte2 | byte3;
                if (j1 == 0)
                {
                    if (m.containsKey(t1.a) || o.contains(t1.a))
                    {
                        j1 = 1;
                    } else
                    {
                        j1 = 0;
                    }
                    if (j1 == 0)
                    {
                        String s1 = t1.a;
                        l l1;
                        if (!m.containsKey(s1))
                        {
                            flag2 = true;
                        } else
                        {
                            flag2 = false;
                        }
                        com.google.android.apps.youtube.common.fromguava.c.b(flag2);
                        l1 = b.a(t1.a(), this);
                        m.put(s1, l1);
                        t1.c = com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.RUNNING;
                        t1.d = 0;
                        k.b(t1);
                        (new q(this, l1)).start();
                        c.f(t1.a());
                    }
                    i1++;
                    flag2 = true;
                } else
                {
                    a(t1, j1);
                    flag2 = true;
                }
            }
        } while (true);
        y = flag2;
        if (!flag2 || flag || flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (q.isHeld()) goto _L1; else goto _L3
_L3:
        q.acquire();
        return;
        if (!q.isHeld()) goto _L1; else goto _L4
_L4:
        q.release();
        return;
    }

    public final int a()
    {
        return b(1);
    }

    public final int a(int i1)
    {
        return a(6, i1, 0, null);
    }

    public final int a(String s1)
    {
        return a(1, s1);
    }

    public final int a(String s1, int i1)
    {
        return a(3, i1, 0, s1);
    }

    public final int a(String s1, String s2, a a1)
    {
        return a(2, new t(null, s1, s2, a1));
    }

    public final int a(String s1, String s2, String s3, a a1)
    {
        return a(2, new t(s1, s2, s3, a1));
    }

    public final int a(boolean flag)
    {
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        return a(5, i1, 0, null);
    }

    public final void a(Message message)
    {
        boolean flag2 = true;
        message.what;
        JVM INSTR tableswitch 1 14: default 76
    //                   1 146
    //                   2 529
    //                   3 720
    //                   4 456
    //                   5 418
    //                   6 494
    //                   7 522
    //                   8 898
    //                   9 961
    //                   10 1052
    //                   11 1212
    //                   12 1512
    //                   13 1538
    //                   14 1695;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        message = ((Message) (g));
        message;
        JVM INSTR monitorenter ;
        int i1;
        i1 = h + 1;
        h = i1;
        Object obj1;
        t t4;
        boolean flag1;
        if (i1 == i && !y)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        j = flag1;
        if (j)
        {
            c.a(h);
        }
        message;
        JVM INSTR monitorexit ;
_L17:
        return;
_L2:
        k.a();
        String s1 = (String)message.obj;
        if (s1 == null)
        {
            message = k.a(null);
        } else
        {
            message = k.a(s1);
        }
        message = message.iterator();
        do
        {
            if (!message.hasNext())
            {
                break;
            }
            t t3 = (t)message.next();
            L.e((new StringBuilder("Restoring task: (filePath=")).append(t3.a).append("; accountName=").append(t3.i).append("; status=").append(t3.c.name()).toString());
            l.put(t3.a, t3);
            if (t3.b() && t3.c != com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.PENDING)
            {
                t3.c = com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.PENDING;
                t3.d = 1;
                k.b(t3);
            }
        } while (true);
        message = new HashMap(l.size());
        t t5;
        for (Iterator iterator = l.values().iterator(); iterator.hasNext(); message.put(t5.a, t5.a()))
        {
            t5 = (t)iterator.next();
        }

        z = s1;
        c.a(message);
        x = true;
        f();
        continue; /* Loop/switch isn't completed */
_L6:
        if (message.arg1 != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (v != flag1)
        {
            v = flag1;
            f();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (message.arg1 != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (u != flag1)
        {
            u = flag1;
            f();
        }
        continue; /* Loop/switch isn't completed */
_L7:
        int j1 = message.arg1;
        if (w != j1)
        {
            w = j1;
            f();
        }
        continue; /* Loop/switch isn't completed */
_L8:
        f();
        continue; /* Loop/switch isn't completed */
_L3:
        com.google.android.apps.youtube.common.fromguava.c.b(x);
        message = (t)message.obj;
        if (l.containsKey(((t) (message)).a))
        {
            t t1 = (t)l.get(((t) (message)).a);
            if (!t1.b())
            {
                k.c(t1);
                k.a(message);
                l.put(((t) (message)).a, message);
                c.b(message.a());
                f();
            } else
            if (o.remove(((t) (message)).a))
            {
                f();
            }
        } else
        {
            k.a(message);
            if (z == null || z.equals(((t) (message)).i))
            {
                l.put(((t) (message)).a, message);
                c.b(message.a());
                f();
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        com.google.android.apps.youtube.common.fromguava.c.b(x);
        Object obj = (String)message.obj;
        int k1 = message.arg1;
        if (!l.containsKey(obj))
        {
            k.b(((String) (obj)));
        } else
        {
            message = (l)m.get(obj);
            if (message != null)
            {
                message.a(k1);
            }
            m.remove(obj);
            n.remove(obj);
            o.remove(obj);
            message = (t)l.remove(obj);
            message.d = ((t) (message)).d | k1;
            k.c(message);
            message = message.a();
            obj = b.a(message);
            if (obj != null)
            {
                ((Runnable) (obj)).run();
            }
            c.c(message);
            f();
        }
        continue; /* Loop/switch isn't completed */
_L9:
        obj1 = (t)l.get(message.obj);
        if (obj1 == null) goto _L17; else goto _L16
_L16:
        obj1.f = ((long)message.arg1 << 31) + (long)message.arg2;
        k.b(((t) (obj1)));
        c.d(((t) (obj1)).a());
        continue; /* Loop/switch isn't completed */
_L10:
        obj1 = (t)l.get(message.obj);
        if (obj1 == null) goto _L17; else goto _L18
_L18:
        long l2 = ((long)message.arg1 << 31) + (long)message.arg2;
        if (((t) (obj1)).e != l2)
        {
            n.remove(((t) (obj1)).a);
        }
        obj1.e = l2;
        k.b(((t) (obj1)));
        c.e(((t) (obj1)).a());
        continue; /* Loop/switch isn't completed */
_L11:
        message = (Pair)message.obj;
        obj1 = (String)((Pair) (message)).first;
        t4 = (t)l.get(obj1);
        if (t4 == null) goto _L17; else goto _L19
_L19:
        if (((Pair) (message)).second != null)
        {
            message = (a)((Pair) (message)).second;
        } else
        {
            message = new a();
        }
        t4.h = message;
        t4.c = com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.COMPLETED;
        m.remove(obj1);
        n.remove(obj1);
        o.remove(obj1);
        if (B)
        {
            k.b(t4);
        } else
        {
            l.remove(obj1);
            k.c(t4);
        }
        c.f(t4.a());
        f();
        continue; /* Loop/switch isn't completed */
_L12:
        obj1 = (t)l.get(message.obj);
        if (obj1 == null) goto _L17; else goto _L20
_L20:
        Integer integer;
        boolean flag;
        int l1;
        if (message.arg1 == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        message = ((t) (obj1)).a;
        integer = (Integer)n.get(message);
        if (integer == null)
        {
            l1 = 0;
        } else
        {
            l1 = integer.intValue();
        }
        l1++;
        if (flag || l1 > A)
        {
            L.b((new StringBuilder("transfer fatal fail ")).append(message).toString());
            obj1.c = com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.FAILED;
            if (B)
            {
                k.b(((t) (obj1)));
            } else
            {
                l.remove(message);
                k.c(((t) (obj1)));
            }
            m.remove(message);
            n.remove(message);
            o.remove(message);
            c.f(((t) (obj1)).a());
        } else
        {
            L.c((new StringBuilder("transfer fail ")).append(message).toString());
            n.put(message, Integer.valueOf(l1));
            m.remove(message);
            o.add(message);
            a(12, message, Math.min((1 << l1) * 1000, 0x927c0) + d.nextInt(5000));
        }
        f();
        continue; /* Loop/switch isn't completed */
_L13:
        message = (String)message.obj;
        if (o.remove(message))
        {
            f();
        }
        continue; /* Loop/switch isn't completed */
_L14:
        L.e("Pausing all tasks");
        t t2;
        for (message = l.values().iterator(); message.hasNext(); k.b(t2))
        {
            t2 = (t)message.next();
            L.e((new StringBuilder("Pausing task: (filePath=")).append(t2.a).append("; accountName=").append(t2.i).append("; status=").append(t2.c.name()).toString());
            if (t2.c.equals(com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.RUNNING))
            {
                a(t2, 128);
            }
        }

        z = null;
        l.clear();
        n.clear();
        o.clear();
        continue; /* Loop/switch isn't completed */
_L15:
        k.a();
        L.e("Removing all tasks");
        k.b();
        m.clear();
        l.clear();
        n.clear();
        o.clear();
        if (true) goto _L1; else goto _L21
_L21:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(String s1, long l1)
    {
        a(8, (int)(l1 >> 31), (int)(0x7fffffffL & l1), s1);
    }

    public final void a(String s1, TransferException transferexception)
    {
        int i1;
        if (transferexception.fatal)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        a(11, i1, 0, s1);
    }

    public final void a(String s1, a a1)
    {
        a(10, Pair.create(s1, a1));
    }

    public final int b(boolean flag)
    {
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        return a(4, i1, 0, null);
    }

    public final Set b()
    {
        return Collections.unmodifiableSet(m.keySet());
    }

    public final void b(String s1, long l1)
    {
        a(9, (int)(l1 >> 31), (int)(0x7fffffffL & l1), s1);
    }

    public final int c()
    {
        return b(13);
    }

    public final void d()
    {
        for (; q.isHeld(); q.release())
        {
            L.c("wifiLock held in quit");
        }

        s.c();
        r.d();
        t.b();
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        int i1 = i - h;
        boolean flag;
        if (i1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag, (new StringBuilder("pendingMessages = ")).append(i1).toString());
        obj;
        JVM INSTR monitorexit ;
        e.quit();
        k.c();
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final String e()
    {
        return z;
    }

    private class ChargingReceiver extends BroadcastReceiver
    {

        final TransfersExecutor a;
        private volatile boolean b;

        public final void a()
        {
            b = Util.b(TransfersExecutor.b(a));
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentfilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            TransfersExecutor.b(a).registerReceiver(this, intentfilter);
        }

        public final void b()
        {
            TransfersExecutor.b(a).unregisterReceiver(this);
        }

        public final boolean c()
        {
            return b;
        }

        public void onReceive(Context context, Intent intent)
        {
            b = "android.intent.action.ACTION_POWER_CONNECTED".equals(intent.getAction());
            com.google.android.apps.youtube.core.transfer.TransfersExecutor.c(a);
        }

        public ChargingReceiver()
        {
            a = TransfersExecutor.this;
            super();
        }
    }

}
