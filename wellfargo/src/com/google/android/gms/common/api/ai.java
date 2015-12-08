// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.ae;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.signin.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            bh, a, g, ax, 
//            i, bi, au, ao, 
//            as, aj, h, ap, 
//            at, aq, bg, af

public class ai
    implements bh
{

    private final ax a;
    private final Lock b;
    private final Context c;
    private final b d;
    private ConnectionResult e;
    private int f;
    private int g;
    private boolean h;
    private int i;
    private final Bundle j = new Bundle();
    private final Set k = new HashSet();
    private f l;
    private int m;
    private boolean n;
    private boolean o;
    private ae p;
    private boolean q;
    private boolean r;
    private final h s;
    private final Map t;
    private final g u;
    private ArrayList v;

    public ai(ax ax1, h h1, Map map, b b1, g g1, Lock lock, Context context)
    {
        g = 0;
        h = false;
        v = new ArrayList();
        a = ax1;
        s = h1;
        t = map;
        d = b1;
        u = g1;
        b = lock;
        c = context;
    }

    static Context a(ai ai1)
    {
        return ai1.c;
    }

    private void a(ConnectionResult connectionresult)
    {
        if (!b(2))
        {
            return;
        }
        if (connectionresult.b())
        {
            i();
            return;
        }
        if (c(connectionresult))
        {
            k();
            i();
            return;
        } else
        {
            d(connectionresult);
            return;
        }
    }

    static void a(ai ai1, ConnectionResult connectionresult)
    {
        ai1.d(connectionresult);
    }

    static void a(ai ai1, ConnectionResult connectionresult, a a1, int i1)
    {
        ai1.b(connectionresult, a1, i1);
    }

    static void a(ai ai1, ResolveAccountResponse resolveaccountresponse)
    {
        ai1.a(resolveaccountresponse);
    }

    private void a(ResolveAccountResponse resolveaccountresponse)
    {
        if (!b(0))
        {
            return;
        }
        ConnectionResult connectionresult = resolveaccountresponse.b();
        if (connectionresult.b())
        {
            p = resolveaccountresponse.a();
            o = true;
            q = resolveaccountresponse.c();
            r = resolveaccountresponse.d();
            f();
            return;
        }
        if (c(connectionresult))
        {
            k();
            f();
            return;
        } else
        {
            d(connectionresult);
            return;
        }
    }

    private void a(boolean flag)
    {
        if (l != null)
        {
            if (l.b() && flag)
            {
                l.p();
            }
            l.a();
            p = null;
        }
    }

    private boolean a(int i1, int j1, ConnectionResult connectionresult)
    {
        while (j1 == 1 && !b(connectionresult) || e != null && i1 >= f) 
        {
            return false;
        }
        return true;
    }

    static boolean a(ai ai1, int i1)
    {
        return ai1.b(i1);
    }

    static b b(ai ai1)
    {
        return ai1.d;
    }

    private void b(ConnectionResult connectionresult, a a1, int i1)
    {
        if (i1 != 2)
        {
            int j1 = a1.a().a();
            if (a(j1, i1, connectionresult))
            {
                e = connectionresult;
                f = j1;
            }
        }
        a.e.put(a1.c(), connectionresult);
    }

    private boolean b(int i1)
    {
        if (g != i1)
        {
            Log.wtf("GoogleApiClientConnecting", (new StringBuilder()).append("GoogleApiClient connecting is in step ").append(c(g)).append(" but received callback for step ").append(c(i1)).toString());
            d(new ConnectionResult(8, null));
            return false;
        } else
        {
            return true;
        }
    }

    private boolean b(ConnectionResult connectionresult)
    {
        while (connectionresult.a() || d.a(connectionresult.c()) != null) 
        {
            return true;
        }
        return false;
    }

    static boolean b(ai ai1, ConnectionResult connectionresult)
    {
        return ai1.c(connectionresult);
    }

    private String c(int i1)
    {
        switch (i1)
        {
        default:
            return "UNKNOWN";

        case 0: // '\0'
            return "STEP_GETTING_SERVICE_BINDINGS";

        case 1: // '\001'
            return "STEP_VALIDATING_ACCOUNT";

        case 2: // '\002'
            return "STEP_AUTHENTICATING";

        case 3: // '\003'
            return "STEP_GETTING_REMOTE_SERVICE";
        }
    }

    static Lock c(ai ai1)
    {
        return ai1.b;
    }

    static void c(ai ai1, ConnectionResult connectionresult)
    {
        ai1.a(connectionresult);
    }

    private boolean c(ConnectionResult connectionresult)
    {
        return m == 2 || m == 1 && !connectionresult.a();
    }

    static ax d(ai ai1)
    {
        return ai1.a;
    }

    private void d(ConnectionResult connectionresult)
    {
        boolean flag = false;
        h = false;
        l();
        if (!connectionresult.a())
        {
            flag = true;
        }
        a(flag);
        a.e.clear();
        a.a(connectionresult);
        if (!a.j() || !d.a(c, connectionresult.c()))
        {
            a.l();
            a.a.a(connectionresult);
        }
        a.a.a();
    }

    private boolean e()
    {
        i = i - 1;
        if (i > 0)
        {
            return false;
        }
        if (i < 0)
        {
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.");
            d(new ConnectionResult(8, null));
            return false;
        }
        if (e != null)
        {
            d(e);
            return false;
        } else
        {
            return true;
        }
    }

    static boolean e(ai ai1)
    {
        return ai1.n;
    }

    static f f(ai ai1)
    {
        return ai1.l;
    }

    private void f()
    {
        if (i == 0)
        {
            if (n)
            {
                if (o)
                {
                    g();
                    return;
                }
            } else
            {
                i();
                return;
            }
        }
    }

    static ae g(ai ai1)
    {
        return ai1.p;
    }

    private void g()
    {
        ArrayList arraylist = new ArrayList();
        g = 1;
        i = a.d.size();
        Iterator iterator = a.d.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.api.i i1 = (com.google.android.gms.common.api.i)iterator.next();
            if (a.e.containsKey(i1))
            {
                if (e())
                {
                    h();
                }
            } else
            {
                arraylist.add(a.d.get(i1));
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            v.add(bi.a().submit(new au(this, arraylist)));
        }
    }

    static Set h(ai ai1)
    {
        return ai1.m();
    }

    private void h()
    {
        g = 2;
        a.f = m();
        v.add(bi.a().submit(new ao(this, null)));
    }

    private void i()
    {
        ArrayList arraylist = new ArrayList();
        g = 3;
        i = a.d.size();
        Iterator iterator = a.d.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.api.i i1 = (com.google.android.gms.common.api.i)iterator.next();
            if (a.e.containsKey(i1))
            {
                if (e())
                {
                    j();
                }
            } else
            {
                arraylist.add(a.d.get(i1));
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            v.add(bi.a().submit(new as(this, arraylist)));
        }
    }

    static void i(ai ai1)
    {
        ai1.k();
    }

    private void j()
    {
        a.i();
        bi.a().execute(new aj(this));
        if (l != null)
        {
            if (q)
            {
                l.a(p, r);
            }
            a(false);
        }
        com.google.android.gms.common.api.i i1;
        for (Iterator iterator = a.e.keySet().iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.h)a.d.get(i1)).a())
        {
            i1 = (com.google.android.gms.common.api.i)iterator.next();
        }

        if (h)
        {
            h = false;
            b();
            return;
        }
        Bundle bundle;
        if (j.isEmpty())
        {
            bundle = null;
        } else
        {
            bundle = j;
        }
        a.a.a(bundle);
    }

    static void j(ai ai1)
    {
        ai1.i();
    }

    private void k()
    {
        n = false;
        a.f = Collections.emptySet();
        Iterator iterator = k.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.api.i i1 = (com.google.android.gms.common.api.i)iterator.next();
            if (!a.e.containsKey(i1))
            {
                a.e.put(i1, new ConnectionResult(17, null));
            }
        } while (true);
    }

    static boolean k(ai ai1)
    {
        return ai1.e();
    }

    private void l()
    {
        for (Iterator iterator = v.iterator(); iterator.hasNext(); ((Future)iterator.next()).cancel(true)) { }
        v.clear();
    }

    static void l(ai ai1)
    {
        ai1.f();
    }

    private Set m()
    {
        HashSet hashset = new HashSet(s.d());
        Map map = s.f();
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a1 = (a)iterator.next();
            if (!a.e.containsKey(a1.c()))
            {
                hashset.addAll(((i)map.get(a1)).a);
            }
        } while (true);
        return hashset;
    }

    static void m(ai ai1)
    {
        ai1.h();
    }

    public af a(af af)
    {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public void a()
    {
        a.a.b();
        a.e.clear();
        h = false;
        n = false;
        e = null;
        g = 0;
        m = 2;
        o = false;
        q = false;
        HashMap hashmap = new HashMap();
        Iterator iterator = t.keySet().iterator();
        boolean flag = false;
        while (iterator.hasNext()) 
        {
            a a1 = (a)iterator.next();
            com.google.android.gms.common.api.h h1 = (com.google.android.gms.common.api.h)a.d.get(a1.c());
            int i1 = ((Integer)t.get(a1)).intValue();
            boolean flag1;
            if (a1.a().a() == 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (h1.c())
            {
                n = true;
                if (i1 < m)
                {
                    m = i1;
                }
                if (i1 != 0)
                {
                    k.add(a1.c());
                }
            }
            hashmap.put(h1, new ap(this, a1, i1));
            flag = flag1 | flag;
        }
        if (flag)
        {
            n = false;
        }
        if (n)
        {
            s.a(Integer.valueOf(a.m()));
            at at1 = new at(this, null);
            l = (f)u.a(c, a.a(), s, s.i(), at1, at1);
        }
        i = a.d.size();
        v.add(bi.a().submit(new aq(this, hashmap)));
    }

    public void a(int i1)
    {
        d(new ConnectionResult(8, null));
    }

    public void a(Bundle bundle)
    {
        if (b(3))
        {
            if (bundle != null)
            {
                j.putAll(bundle);
            }
            if (e())
            {
                j();
                return;
            }
        }
    }

    public void a(ConnectionResult connectionresult, a a1, int i1)
    {
        if (b(3))
        {
            b(connectionresult, a1, i1);
            if (e())
            {
                j();
                return;
            }
        }
    }

    public void b()
    {
        Iterator iterator = a.b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            bg bg1 = (bg)iterator.next();
            if (bg1.e() != 1)
            {
                bg1.b();
                iterator.remove();
            }
        } while (true);
        a.f();
        if (e == null && !a.b.isEmpty())
        {
            h = true;
            return;
        } else
        {
            l();
            a(true);
            a.e.clear();
            a.a(null);
            a.a.a();
            return;
        }
    }

    public void c()
    {
        h = false;
    }

    public String d()
    {
        return "CONNECTING";
    }
}
