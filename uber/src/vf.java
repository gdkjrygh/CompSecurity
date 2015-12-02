// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.ValidateAccountRequest;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public abstract class vf
    implements sj, vp
{

    public static final String c[] = {
        "service_esmobile", "service_googleme"
    };
    private final Context a;
    final Handler b;
    private final va d;
    private final Looper e;
    private final vq f;
    private final Object g;
    private wc h;
    private boolean i;
    private sw j;
    private IInterface k;
    private final ArrayList l;
    private vk m;
    private int n;
    private final Set o;
    private final Account p;
    private final vo q;
    private final int r;

    protected vf(Context context, Looper looper, int i1, ss ss1, st st1)
    {
        g = new Object();
        i = false;
        l = new ArrayList();
        n = 1;
        a = (Context)wn.a(context);
        e = (Looper)wn.a(looper, "Looper must not be null");
        f = vq.a(context);
        q = new vo(looper, this);
        b = new vh(this, looper);
        r = i1;
        p = null;
        o = Collections.emptySet();
        d = (new sr(context)).a();
        a((ss)wn.a(ss1));
        a((st)wn.a(st1));
    }

    protected vf(Context context, Looper looper, int i1, ss ss1, st st1, va va1)
    {
        this(context, looper, vq.a(context), i1, va1, ss1, st1);
    }

    private vf(Context context, Looper looper, vq vq1, int i1, va va1)
    {
        g = new Object();
        i = false;
        l = new ArrayList();
        n = 1;
        a = (Context)wn.a(context, "Context must not be null");
        e = (Looper)wn.a(looper, "Looper must not be null");
        f = (vq)wn.a(vq1, "Supervisor must not be null");
        q = new vo(looper, this);
        b = new vh(this, looper);
        r = i1;
        d = (va)wn.a(va1);
        p = va1.b();
        o = a(va1.f());
    }

    private vf(Context context, Looper looper, vq vq1, int i1, va va1, ss ss1, st st1)
    {
        this(context, looper, vq1, i1, va1);
        a((ss)wn.a(ss1));
        a((st)wn.a(st1));
    }

    private static Set a(Set set)
    {
        Set set1 = b(set);
        if (set1 == null)
        {
            return set1;
        }
        for (Iterator iterator = set1.iterator(); iterator.hasNext();)
        {
            if (!set.contains((Scope)iterator.next()))
            {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }

        return set1;
    }

    static wc a(vf vf1, wc wc1)
    {
        vf1.h = wc1;
        return wc1;
    }

    private void a(int i1, IInterface iinterface)
    {
        boolean flag2 = true;
        Object obj;
        boolean flag;
        boolean flag1;
        if (i1 == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (iinterface != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag != flag1)
        {
            flag2 = false;
        }
        wn.b(flag2);
        obj = g;
        obj;
        JVM INSTR monitorenter ;
        n = i1;
        k = iinterface;
        i1;
        JVM INSTR tableswitch 1 2: default 94
    //                   1 87
    //                   2 75;
           goto _L1 _L2 _L3
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
_L3:
        q();
          goto _L1
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
_L2:
        r();
          goto _L1
    }

    private void a(ss ss1)
    {
        q.a(ss1);
    }

    private void a(st st1)
    {
        q.a(st1);
    }

    static void a(vf vf1, int i1)
    {
        vf1.a(i1, ((IInterface) (null)));
    }

    private boolean a(int i1, int j1, IInterface iinterface)
    {
label0:
        {
            synchronized (g)
            {
                if (n == i1)
                {
                    break label0;
                }
            }
            return false;
        }
        a(j1, iinterface);
        obj;
        JVM INSTR monitorexit ;
        return true;
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
    }

    static boolean a(vf vf1)
    {
        return vf1.i;
    }

    static boolean a(vf vf1, int i1, int j1, IInterface iinterface)
    {
        return vf1.a(i1, j1, iinterface);
    }

    private static Set b(Set set)
    {
        return set;
    }

    static sw b(vf vf1)
    {
        return vf1.j;
    }

    private String c()
    {
        return d.i();
    }

    static vo c(vf vf1)
    {
        return vf1.q;
    }

    static ArrayList d(vf vf1)
    {
        return vf1.l;
    }

    static Set e(vf vf1)
    {
        return vf1.o;
    }

    static Context f(vf vf1)
    {
        return vf1.a;
    }

    private void q()
    {
        if (m != null)
        {
            Log.e("GmsClient", (new StringBuilder("Calling connect() while still connected, missing disconnect() for ")).append(a()).toString());
            f.a(a(), m);
        }
        m = new vk(this);
        if (!f.a(a(), m, c()))
        {
            Log.e("GmsClient", (new StringBuilder("unable to connect to service: ")).append(a()).toString());
            b.sendMessage(b.obtainMessage(3, Integer.valueOf(9)));
        }
    }

    private void r()
    {
        if (m != null)
        {
            f.a(a(), m);
            m = null;
        }
    }

    private void s()
    {
        b.sendMessage(b.obtainMessage(4, Integer.valueOf(1)));
    }

    private Account t()
    {
        if (p != null)
        {
            return p;
        } else
        {
            return new Account("<<default account>>", "com.google");
        }
    }

    protected abstract IInterface a(IBinder ibinder);

    protected abstract String a();

    protected final void a(int i1, Bundle bundle)
    {
        b.sendMessage(b.obtainMessage(5, new vn(this, i1, bundle)));
    }

    protected void a(int i1, IBinder ibinder, Bundle bundle)
    {
        b.sendMessage(b.obtainMessage(1, new vl(this, i1, ibinder, bundle)));
    }

    public final void a(String s1, PrintWriter printwriter)
    {
        IInterface iinterface;
        int i1;
        printwriter.append(s1).println("GmsClient:");
        String s2 = (new StringBuilder()).append(s1).append("  ").toString();
        printwriter.append(s2).append("mStartServiceAction=").println(a());
        synchronized (g)
        {
            i1 = n;
            iinterface = k;
        }
        printwriter.append(s2).append("mConnectState=");
        i1;
        JVM INSTR tableswitch 1 4: default 116
    //                   1 179
    //                   2 149
    //                   3 159
    //                   4 169;
           goto _L1 _L2 _L3 _L4 _L5
_L2:
        break MISSING_BLOCK_LABEL_179;
_L1:
        printwriter.print("UNKNOWN");
_L6:
        printwriter.append(" mService=");
        if (iinterface == null)
        {
            printwriter.println("null");
            return;
        } else
        {
            printwriter.append(b()).append("@").println(Integer.toHexString(System.identityHashCode(iinterface.asBinder())));
            return;
        }
        printwriter;
        s1;
        JVM INSTR monitorexit ;
        throw printwriter;
_L3:
        printwriter.print("CONNECTING");
          goto _L6
_L4:
        printwriter.print("CONNECTED");
          goto _L6
_L5:
        printwriter.print("DISCONNECTING");
          goto _L6
        printwriter.print("DISCONNECTED");
          goto _L6
    }

    public final void a(sw sw1)
    {
        j = (sw)wn.a(sw1, "Must provide a non-null ConnectionStatusReportCallbacks");
        i = true;
    }

    public final void a(vw vw)
    {
        Bundle bundle = o();
        vw = new ValidateAccountRequest(vw, (Scope[])o.toArray(new Scope[o.size()]), a.getPackageName(), bundle);
        try
        {
            h.a(new vj(this), vw);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (vw vw)
        {
            Log.w("GmsClient", "service died");
            s();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (vw vw)
        {
            Log.w("GmsClient", "Remote exception occurred", vw);
        }
    }

    public final void a(vw vw, Set set)
    {
        Object obj;
        try
        {
            obj = k();
            obj = (new GetServiceRequest(r)).a(a.getPackageName()).a(((Bundle) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (vw vw)
        {
            Log.w("GmsClient", "service died");
            s();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (vw vw)
        {
            Log.w("GmsClient", "Remote exception occurred", vw);
            return;
        }
        if (set == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ((GetServiceRequest) (obj)).a((Scope[])set.toArray(new Scope[set.size()]));
        if (!g()) goto _L2; else goto _L1
_L1:
        ((GetServiceRequest) (obj)).a(t()).a(vw);
_L4:
        h.a(new vj(this), ((GetServiceRequest) (obj)));
        return;
_L2:
        if (p())
        {
            ((GetServiceRequest) (obj)).a(p);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected abstract String b();

    public final void d()
    {
        q.b();
        int i1 = rz.a(a);
        if (i1 != 0)
        {
            a(1, ((IInterface) (null)));
            b.sendMessage(b.obtainMessage(3, Integer.valueOf(i1)));
            return;
        } else
        {
            a(2, ((IInterface) (null)));
            return;
        }
    }

    public void e()
    {
        q.a();
        ArrayList arraylist = l;
        arraylist;
        JVM INSTR monitorenter ;
        int j1 = l.size();
        int i1 = 0;
_L2:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        ((vi)l.get(i1)).d();
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        l.clear();
        arraylist;
        JVM INSTR monitorexit ;
        a(1, ((IInterface) (null)));
        return;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean f()
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (n == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean g()
    {
        return false;
    }

    public final boolean h()
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (n == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Context i()
    {
        return a;
    }

    protected final va j()
    {
        return d;
    }

    protected Bundle k()
    {
        return new Bundle();
    }

    protected final void l()
    {
        b.sendMessage(b.obtainMessage(6, new vm(this)));
    }

    protected final void m()
    {
        if (!f())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

    public final IInterface n()
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        if (n == 4)
        {
            throw new DeadObjectException();
        }
        break MISSING_BLOCK_LABEL_28;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        m();
        IInterface iinterface;
        boolean flag;
        if (k != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        wn.a(flag, "Client is connected but service is null");
        iinterface = k;
        obj;
        JVM INSTR monitorexit ;
        return iinterface;
    }

    protected Bundle o()
    {
        return null;
    }

    public boolean p()
    {
        return false;
    }

}
