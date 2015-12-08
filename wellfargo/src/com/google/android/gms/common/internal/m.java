// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

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
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.api.u;
import com.google.android.gms.common.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.internal:
//            x, y, au, o, 
//            h, r, p, v, 
//            t, ValidateAccountRequest, q, al, 
//            GetServiceRequest, u, ae

public abstract class m
    implements h, x
{

    public static final String c[] = {
        "service_esmobile", "service_googleme"
    };
    final Handler a;
    protected AtomicInteger b;
    private final Context d;
    private final com.google.android.gms.common.internal.h e;
    private final Looper f;
    private final y g;
    private final b h;
    private final Object i;
    private al j;
    private u k;
    private IInterface l;
    private final ArrayList m;
    private com.google.android.gms.common.internal.r n;
    private int o;
    private final Set p;
    private final Account q;
    private final q r;
    private final r s;
    private final int t;

    protected m(Context context, Looper looper, int i1, com.google.android.gms.common.internal.h h1, q q1, r r1)
    {
        this(context, looper, y.a(context), com.google.android.gms.common.b.a(), i1, h1, (q)au.a(q1), (r)au.a(r1));
    }

    protected m(Context context, Looper looper, y y1, b b1, int i1, com.google.android.gms.common.internal.h h1, q q1, 
            r r1)
    {
        i = new Object();
        m = new ArrayList();
        o = 1;
        b = new AtomicInteger(0);
        d = (Context)au.a(context, "Context must not be null");
        f = (Looper)au.a(looper, "Looper must not be null");
        g = (y)au.a(y1, "Supervisor must not be null");
        h = (b)au.a(b1, "API availability must not be null");
        a = new o(this, looper);
        t = i1;
        e = (com.google.android.gms.common.internal.h)au.a(h1);
        q = h1.b();
        p = b(h1.e());
        r = q1;
        s = r1;
    }

    static u a(m m1)
    {
        return m1.k;
    }

    static al a(m m1, al al1)
    {
        m1.j = al1;
        return al1;
    }

    static void a(m m1, int i1, IInterface iinterface)
    {
        m1.b(i1, iinterface);
    }

    private boolean a(int i1, int j1, IInterface iinterface)
    {
label0:
        {
            synchronized (i)
            {
                if (o == i1)
                {
                    break label0;
                }
            }
            return false;
        }
        b(j1, iinterface);
        obj;
        JVM INSTR monitorexit ;
        return true;
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
    }

    static boolean a(m m1, int i1, int j1, IInterface iinterface)
    {
        return m1.a(i1, j1, iinterface);
    }

    static q b(m m1)
    {
        return m1.r;
    }

    private Set b(Set set)
    {
        Set set1 = a(set);
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

    private void b(int i1, IInterface iinterface)
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
        com.google.android.gms.common.internal.au.b(flag2);
        obj = i;
        obj;
        JVM INSTR monitorenter ;
        o = i1;
        l = iinterface;
        a(i1, iinterface);
        i1;
        JVM INSTR tableswitch 1 3: default 109
    //                   1 102
    //                   2 83
    //                   3 95;
           goto _L1 _L2 _L3 _L4
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
_L3:
        p();
          goto _L1
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
_L4:
        g();
          goto _L1
_L2:
        q();
          goto _L1
    }

    static ArrayList c(m m1)
    {
        return m1.m;
    }

    static Set d(m m1)
    {
        return m1.p;
    }

    static r e(m m1)
    {
        return m1.s;
    }

    private void p()
    {
        if (n != null)
        {
            Log.e("GmsClient", (new StringBuilder()).append("Calling connect() while still connected, missing disconnect() for ").append(d()).toString());
            g.b(d(), n, f());
            b.incrementAndGet();
        }
        n = new com.google.android.gms.common.internal.r(this, b.get());
        if (!g.a(d(), n, f()))
        {
            Log.e("GmsClient", (new StringBuilder()).append("unable to connect to service: ").append(d()).toString());
            a.sendMessage(a.obtainMessage(3, b.get(), 9));
        }
    }

    private void q()
    {
        if (n != null)
        {
            g.b(d(), n, f());
            n = null;
        }
    }

    protected abstract IInterface a(IBinder ibinder);

    protected Set a(Set set)
    {
        return set;
    }

    public void a()
    {
        b.incrementAndGet();
        ArrayList arraylist = m;
        arraylist;
        JVM INSTR monitorenter ;
        int j1 = m.size();
        int i1 = 0;
_L2:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        ((p)m.get(i1)).e();
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        m.clear();
        arraylist;
        JVM INSTR monitorexit ;
        b(1, null);
        return;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void a(int i1)
    {
    }

    protected void a(int i1, Bundle bundle, int j1)
    {
        a.sendMessage(a.obtainMessage(5, j1, -1, new v(this, i1, bundle)));
    }

    protected void a(int i1, IBinder ibinder, Bundle bundle, int j1)
    {
        a.sendMessage(a.obtainMessage(1, j1, -1, new t(this, i1, ibinder, bundle)));
    }

    protected void a(int i1, IInterface iinterface)
    {
    }

    protected void a(ConnectionResult connectionresult)
    {
    }

    public void a(u u1)
    {
        k = (u)au.a(u1, "Connection progress callbacks cannot be null.");
        b(2, null);
    }

    public void a(ae ae)
    {
        Bundle bundle = n();
        ae = new ValidateAccountRequest(ae, (Scope[])p.toArray(new Scope[p.size()]), d.getPackageName(), bundle);
        try
        {
            j.a(new com.google.android.gms.common.internal.q(this, b.get()), ae);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ae ae)
        {
            Log.w("GmsClient", "service died");
            b(1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ae ae)
        {
            Log.w("GmsClient", "Remote exception occurred", ae);
        }
    }

    public void a(ae ae, Set set)
    {
        Object obj;
        try
        {
            obj = k();
            obj = (new GetServiceRequest(t)).a(d.getPackageName()).a(((Bundle) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (ae ae)
        {
            Log.w("GmsClient", "service died");
            b(1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ae ae)
        {
            Log.w("GmsClient", "Remote exception occurred", ae);
            return;
        }
        if (set == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        ((GetServiceRequest) (obj)).a(set);
        if (!c()) goto _L2; else goto _L1
_L1:
        ((GetServiceRequest) (obj)).a(j()).a(ae);
_L4:
        j.a(new com.google.android.gms.common.internal.q(this, b.get()), ((GetServiceRequest) (obj)));
        return;
_L2:
        if (o())
        {
            ((GetServiceRequest) (obj)).a(q);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        int i1;
        synchronized (i)
        {
            i1 = o;
            as = l;
        }
        printwriter.append(s1).append("mConnectState=");
        i1;
        JVM INSTR tableswitch 1 4: default 64
    //                   1 127
    //                   2 97
    //                   3 107
    //                   4 117;
           goto _L1 _L2 _L3 _L4 _L5
_L2:
        break MISSING_BLOCK_LABEL_127;
_L1:
        printwriter.print("UNKNOWN");
_L6:
        printwriter.append(" mService=");
        if (as == null)
        {
            printwriter.println("null");
            return;
        } else
        {
            printwriter.append(e()).append("@").println(Integer.toHexString(System.identityHashCode(as.asBinder())));
            return;
        }
        s1;
        filedescriptor;
        JVM INSTR monitorexit ;
        throw s1;
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

    public Bundle a_()
    {
        return null;
    }

    public void b(int i1)
    {
        a.sendMessage(a.obtainMessage(4, b.get(), i1));
    }

    public boolean b()
    {
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (o == 3)
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

    protected void c(int i1)
    {
        a.sendMessage(a.obtainMessage(6, i1, -1, new com.google.android.gms.common.internal.u(this)));
    }

    public boolean c()
    {
        return false;
    }

    protected abstract String d();

    protected abstract String e();

    protected final String f()
    {
        return e.h();
    }

    protected void g()
    {
    }

    public boolean h()
    {
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (o == 2)
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
        return d;
    }

    public final Account j()
    {
        if (q != null)
        {
            return q;
        } else
        {
            return new Account("<<default account>>", "com.google");
        }
    }

    protected Bundle k()
    {
        return new Bundle();
    }

    protected final void l()
    {
        if (!b())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

    public final IInterface m()
    {
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (o == 4)
        {
            throw new DeadObjectException();
        }
        break MISSING_BLOCK_LABEL_28;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        l();
        IInterface iinterface;
        boolean flag;
        if (l != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        au.a(flag, "Client is connected but service is null");
        iinterface = l;
        obj;
        JVM INSTR monitorexit ;
        return iinterface;
    }

    protected Bundle n()
    {
        return null;
    }

    public boolean o()
    {
        return false;
    }

}
