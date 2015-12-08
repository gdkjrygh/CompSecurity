// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer.e.a;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer:
//            q, k, ak, ExoPlaybackException, 
//            e

final class j
    implements android.os.Handler.Callback
{

    private static final String a = com/google/android/exoplayer/j.getSimpleName();
    private final Handler b;
    private final HandlerThread c = new k(this, (new StringBuilder()).append(getClass().getSimpleName()).append(":Handler").toString());
    private final Handler d;
    private final q e = new q();
    private final boolean f[];
    private final long g;
    private final long h;
    private final List i;
    private ak j[];
    private ak k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private volatile long r;
    private volatile long s;
    private volatile long t;

    public j(Handler handler, boolean flag, boolean aflag[], int i1, int j1)
    {
        boolean flag1 = false;
        super();
        p = 0;
        q = 0;
        d = handler;
        m = flag;
        f = new boolean[aflag.length];
        g = (long)i1 * 1000L;
        h = (long)j1 * 1000L;
        for (i1 = ((flag1) ? 1 : 0); i1 < aflag.length; i1++)
        {
            f[i1] = aflag[i1];
        }

        o = 1;
        r = -1L;
        t = -1L;
        i = new ArrayList(aflag.length);
        c.start();
        b = new Handler(c.getLooper(), this);
    }

    private void a(int i1, long l1, long l2)
    {
        l1 = (l1 + l2) - SystemClock.elapsedRealtime();
        if (l1 <= 0L)
        {
            b.sendEmptyMessage(i1);
            return;
        } else
        {
            b.sendEmptyMessageDelayed(i1, l1);
            return;
        }
    }

    private boolean a(ak ak1)
    {
        if (!ak1.i())
        {
            if (!ak1.j())
            {
                return false;
            }
            if (o != 4)
            {
                long l2 = ak1.e();
                long l3 = ak1.f();
                long l1;
                if (n)
                {
                    l1 = h;
                } else
                {
                    l1 = g;
                }
                if (l1 > 0L && l3 != -1L && l3 != -3L && l3 < l1 + s && (l2 == -1L || l2 == -2L || l3 < l2))
                {
                    return false;
                }
            }
        }
        return true;
    }

    private void b(int i1)
    {
        if (o != i1)
        {
            o = i1;
            d.obtainMessage(1, i1, 0).sendToTarget();
        }
    }

    private static void b(ak ak1)
    {
        if (ak1.p() == 3)
        {
            ak1.s();
        }
    }

    private void e()
    {
        n = false;
        e.a();
        for (int i1 = 0; i1 < i.size(); i1++)
        {
            ((ak)i.get(i1)).r();
        }

    }

    private void f()
    {
        e.b();
        for (int i1 = 0; i1 < i.size(); i1++)
        {
            b((ak)i.get(i1));
        }

    }

    private void g()
    {
        long l1;
        if (k != null && i.contains(k))
        {
            l1 = k.d();
        } else
        {
            l1 = e.c();
        }
        s = l1;
    }

    private void h()
    {
        n = false;
        i();
    }

    private void i()
    {
        b.removeMessages(7);
        b.removeMessages(2);
        e.b();
        if (j == null)
        {
            return;
        }
        int i1 = 0;
        while (i1 < j.length) 
        {
            try
            {
                ak ak1 = j[i1];
                b(ak1);
                if (ak1.p() == 2)
                {
                    ak1.t();
                }
                ak1.u();
            }
            catch (ExoPlaybackException exoplaybackexception)
            {
                Log.e(a, "Stop failed.", exoplaybackexception);
            }
            catch (RuntimeException runtimeexception)
            {
                Log.e(a, "Stop failed.", runtimeexception);
            }
            i1++;
        }
        j = null;
        k = null;
        i.clear();
        b(1);
    }

    public final int a()
    {
        return (int)(s / 1000L);
    }

    public final void a(int i1)
    {
        b.obtainMessage(6, i1, 0).sendToTarget();
    }

    public final void a(int i1, boolean flag)
    {
        Handler handler = b;
        int j1;
        if (flag)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        handler.obtainMessage(8, i1, j1).sendToTarget();
    }

    public final void a(e e1, int i1, Object obj)
    {
        p = p + 1;
        b.obtainMessage(9, i1, 0, Pair.create(e1, obj)).sendToTarget();
    }

    public final void a(boolean flag)
    {
        Handler handler = b;
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        handler.obtainMessage(3, i1, 0).sendToTarget();
    }

    public final transient void a(ak aak[])
    {
        b.obtainMessage(1, aak).sendToTarget();
    }

    public final int b()
    {
        if (t == -1L)
        {
            return -1;
        } else
        {
            return (int)(t / 1000L);
        }
    }

    public final void b(e e1, int i1, Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        int j1;
        j1 = p;
        p = j1 + 1;
        b.obtainMessage(9, i1, 0, Pair.create(e1, obj)).sendToTarget();
_L1:
        i1 = q;
        if (i1 > j1)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        wait();
          goto _L1
        e1;
        Thread.currentThread().interrupt();
          goto _L1
        e1;
        throw e1;
        this;
        JVM INSTR monitorexit ;
    }

    public final int c()
    {
        if (r == -1L)
        {
            return -1;
        } else
        {
            return (int)(r / 1000L);
        }
    }

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        if (l)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        b.sendEmptyMessage(5);
_L1:
        boolean flag = l;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        wait();
          goto _L1
        Object obj;
        obj;
        Thread.currentThread().interrupt();
          goto _L1
        obj;
        throw obj;
        c.quit();
        this;
        JVM INSTR monitorexit ;
    }

    public final boolean handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 9: default 1391
    //                   1 56
    //                   2 132
    //                   3 524
    //                   4 1069
    //                   5 1075
    //                   6 948
    //                   7 639
    //                   8 1201
    //                   9 1099;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L2:
        message = (ak[])message.obj;
        n = false;
        j = message;
        int i1 = 0;
_L90:
        int j1;
        int k1;
        int l1;
        int i2;
        long l2;
        long l3;
        long l4;
        long l5;
        boolean flag;
        if (i1 < message.length)
        {
            if (message[i1].k())
            {
                if (k == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                try
                {
                    com.google.android.exoplayer.e.a.b(flag);
                    k = message[i1];
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    Log.e(a, "Internal track renderer error.", message);
                    d.obtainMessage(3, message).sendToTarget();
                    h();
                    return true;
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    Log.e(a, "Internal runtime error.", message);
                    d.obtainMessage(3, new ExoPlaybackException(message)).sendToTarget();
                    h();
                    return true;
                }
            }
            i1++;
            continue; /* Loop/switch isn't completed */
        }
        b(2);
        b.sendEmptyMessage(2);
        return true;
_L3:
        l2 = SystemClock.elapsedRealtime();
        j1 = 1;
        i1 = 0;
_L80:
        if (i1 >= j.length) goto _L12; else goto _L11
_L11:
        k1 = j1;
        if (j[i1].p() != 0) goto _L14; else goto _L13
_L13:
        k1 = j1;
        if (j[i1].q() == 0)
        {
            k1 = 0;
        }
          goto _L14
_L12:
        if (j1 != 0) goto _L16; else goto _L15
_L15:
        a(2, l2, 10L);
          goto _L17
_L81:
        if (k1 >= j.length) goto _L19; else goto _L18
_L18:
        message = j[k1];
        l2 = l3;
        l1 = j1;
        i2 = i1;
        if (!f[k1]) goto _L21; else goto _L20
_L20:
        l2 = l3;
        l1 = j1;
        i2 = i1;
        if (message.p() != 1) goto _L21; else goto _L22
_L22:
        message.b(s, false);
        i.add(message);
        if (i1 == 0) goto _L24; else goto _L23
_L23:
        if (!message.i()) goto _L24; else goto _L25
_L25:
        i1 = 1;
_L82:
        if (j1 == 0) goto _L27; else goto _L26
_L26:
        if (!a(message)) goto _L27; else goto _L28
_L28:
        j1 = 1;
_L83:
        l2 = l3;
        l1 = j1;
        i2 = i1;
        if (l3 == -1L) goto _L21; else goto _L29
_L29:
        l4 = message.e();
        if (l4 != -1L) goto _L31; else goto _L30
_L30:
        l2 = -1L;
        l1 = j1;
        i2 = i1;
          goto _L21
_L31:
        l2 = l3;
        l1 = j1;
        i2 = i1;
        if (l4 == -2L) goto _L21; else goto _L32
_L32:
        l2 = Math.max(l3, l4);
        l1 = j1;
        i2 = i1;
          goto _L21
_L19:
        r = l3;
        if (i1 == 0) goto _L34; else goto _L33
_L33:
        b(5);
_L35:
        b.sendEmptyMessage(7);
          goto _L17
_L34:
        if (j1 != 0)
        {
            i1 = 4;
        } else
        {
            i1 = 3;
        }
        b(i1);
        if (m && o == 4)
        {
            e();
        }
          goto _L35
_L4:
        i1 = message.arg1;
        if (i1 != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n = false;
        m = flag;
        if (flag) goto _L37; else goto _L36
_L36:
        f();
        g();
_L40:
        d.obtainMessage(2).sendToTarget();
        return true;
_L37:
        if (o != 4) goto _L39; else goto _L38
_L38:
        e();
        b.sendEmptyMessage(7);
          goto _L40
        message;
        d.obtainMessage(2).sendToTarget();
        throw message;
_L39:
        if (o != 3) goto _L40; else goto _L41
_L41:
        b.sendEmptyMessage(7);
          goto _L40
_L8:
        com.google.android.exoplayer.e.j.a("doSomeWork");
        l3 = SystemClock.elapsedRealtime();
        if (r == -1L) goto _L43; else goto _L42
_L42:
        l2 = r;
_L85:
        i1 = 1;
        j1 = 1;
        g();
        k1 = 0;
_L84:
        if (k1 >= i.size()) goto _L45; else goto _L44
_L44:
        message = (ak)i.get(k1);
        message.b(s);
        if (i1 == 0) goto _L47; else goto _L46
_L46:
        if (!message.i()) goto _L47; else goto _L48
_L48:
        i1 = 1;
_L86:
        if (j1 == 0) goto _L50; else goto _L49
_L49:
        if (!a(message)) goto _L50; else goto _L51
_L51:
        j1 = 1;
_L87:
        if (l2 == -1L) goto _L53; else goto _L52
_L52:
        l4 = message.e();
        l5 = message.f();
        if (l5 != -1L) goto _L55; else goto _L54
_L54:
        l2 = -1L;
          goto _L53
_L88:
        l2 = Math.min(l2, l5);
          goto _L53
_L45:
        t = l2;
        if (i1 == 0) goto _L57; else goto _L56
_L56:
        b(5);
        f();
_L62:
        b.removeMessages(7);
        if ((!m || o != 4) && o != 3) goto _L59; else goto _L58
_L58:
        a(7, l3, 10L);
_L65:
        com.google.android.exoplayer.e.j.a();
        return true;
_L57:
        if (o != 3 || j1 == 0) goto _L61; else goto _L60
_L60:
        b(4);
        if (m)
        {
            e();
        }
          goto _L62
_L61:
        if (o != 4 || j1 != 0) goto _L62; else goto _L63
_L63:
        n = m;
        b(3);
        f();
          goto _L62
_L59:
        if (i.isEmpty()) goto _L65; else goto _L64
_L64:
        a(7, l3, 1000L);
          goto _L65
_L7:
        i1 = message.arg1;
        n = false;
        s = (long)i1 * 1000L;
        e.b();
        e.a(s);
        if (o != 1 && o != 2) goto _L67; else goto _L66
_L70:
        if (i1 >= i.size()) goto _L69; else goto _L68
_L68:
        message = (ak)i.get(i1);
        b(message);
        message.a(s);
        i1++;
          goto _L70
_L69:
        b(3);
        b.sendEmptyMessage(7);
          goto _L66
_L5:
        h();
        return true;
_L6:
        i();
        this;
        JVM INSTR monitorenter ;
        l = true;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return true;
        message;
        this;
        JVM INSTR monitorexit ;
        throw message;
_L10:
        i1 = message.arg1;
        message = ((Message) (message.obj));
        message = (Pair)message;
        ((e)((Pair) (message)).first).(i1, ((Pair) (message)).second);
        this;
        JVM INSTR monitorenter ;
        q = q + 1;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        if (o != 1)
        {
            b.sendEmptyMessage(7);
        }
          goto _L71
        message;
        this;
        JVM INSTR monitorexit ;
        throw message;
        message;
        this;
        JVM INSTR monitorenter ;
        q = q + 1;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        throw message;
        message;
        this;
        JVM INSTR monitorexit ;
        throw message;
_L9:
        i1 = message.arg1;
        if (message.arg2 != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (f[i1] == flag) goto _L73; else goto _L72
_L72:
        f[i1] = flag;
        if (o != 1 && o != 2) goto _L74; else goto _L73
_L74:
        message = j[i1];
        i1 = message.p();
        if (i1 != 1 && i1 != 2 && i1 != 3) goto _L73; else goto _L75
_L75:
        if (!flag) goto _L77; else goto _L76
_L76:
        if (m && o == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        message.b(s, flag);
        i.add(message);
        if (!flag) goto _L79; else goto _L78
_L78:
        message.r();
_L79:
        b.sendEmptyMessage(7);
          goto _L73
_L77:
        if (message == k)
        {
            e.a(message.d());
        }
        b(message);
        i.remove(message);
        message.t();
          goto _L73
_L1:
        return false;
_L14:
        i1++;
        j1 = k1;
          goto _L80
_L17:
        return true;
_L16:
        l3 = 0L;
        j1 = 1;
        i1 = 1;
        k1 = 0;
          goto _L81
_L21:
        k1++;
        l3 = l2;
        j1 = l1;
        i1 = i2;
          goto _L81
_L24:
        i1 = 0;
          goto _L82
_L27:
        j1 = 0;
          goto _L83
_L53:
        k1++;
          goto _L84
_L43:
        l2 = 0x7fffffffffffffffL;
          goto _L85
_L47:
        i1 = 0;
          goto _L86
_L50:
        j1 = 0;
          goto _L87
_L55:
        if (l5 == -3L || l4 != -1L && l4 != -2L && l5 >= l4) goto _L53; else goto _L88
_L66:
        return true;
_L67:
        i1 = 0;
          goto _L70
_L71:
        return true;
_L73:
        return true;
        if (true) goto _L90; else goto _L89
_L89:
    }

}
