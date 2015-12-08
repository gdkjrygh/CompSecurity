// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.gau.go.launcherex.goweather.goplay.ThemeDataHandler;
import com.gau.go.launcherex.goweather.goplay.q;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.b;
import com.jiubang.playsdk.a.k;
import com.jiubang.playsdk.a.v;
import com.jiubang.playsdk.a.y;
import com.jiubang.playsdk.d.c;
import com.jiubang.playsdk.d.d;
import com.jiubang.playsdk.d.e;
import com.jiubang.playsdk.d.f;
import com.jiubang.playsdk.imageload.a;
import com.jiubang.playsdk.imageload.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.go.weatherex.themestore:
//            ak, ab, ad, ae, 
//            af, ah, i, ai, 
//            al, am, ag, k

public class ac
{

    private static ac a;
    private final Context b;
    private final Handler c = new Handler();
    private final y d = com.jiubang.playsdk.a.y.a();
    private final q e = new q();
    private final ThemeDataHandler f;
    private final i g;
    private final ak h = new ak(null);
    private v i;
    private int j;
    private boolean k;
    private boolean l;
    private final SparseArray m = new SparseArray(4);
    private boolean n;
    private final ab o = new ab();
    private final List p = new ArrayList();
    private k q;
    private com.gau.go.launcherex.goweather.goplay.f r;
    private com.go.weatherex.themestore.k s;
    private Runnable t;

    private ac(Context context)
    {
        j = 0;
        n = false;
        q = new ad(this);
        r = new ae(this);
        s = new af(this);
        t = new ah(this);
        b = context.getApplicationContext();
        d.a(b);
        d.a(e);
        h.a(q);
        f = ThemeDataHandler.a(b);
        f.a(r);
        g = new i(b);
        g.a(s);
        (new a()).a(b);
    }

    private void A()
    {
        if (n)
        {
            return;
        } else
        {
            n = true;
            (new ai(this)).execute(new Void[0]);
            return;
        }
    }

    private void B()
    {
        g.a();
    }

    private void C()
    {
        com.jiubang.playsdk.a.y.a().c();
        com.jiubang.playsdk.imageload.p.a().b();
    }

    static int a(ac ac1)
    {
        int i1 = ac1.j;
        ac1.j = i1 - 1;
        return i1;
    }

    public static b a(com.jiubang.playsdk.a.a a1)
    {
        return o().b(a1);
    }

    static v a(ac ac1, v v1)
    {
        ac1.i = v1;
        return v1;
    }

    public static d a(int i1)
    {
        return o().e(i1);
    }

    private d a(int i1, d d1, v v1)
    {
        if (d1 != null && v1 != null) goto _L2; else goto _L1
_L1:
        d d2 = null;
_L4:
        return d2;
_L2:
label0:
        {
            if (d1.f() != 1)
            {
                break label0;
            }
            List list = d1.c();
            d1 = null;
            int j1 = 0;
            do
            {
                d2 = d1;
                if (j1 >= list.size())
                {
                    break;
                }
                c c1 = (c)list.get(j1);
                d2 = i.a(c1.a());
                if (d2 != null)
                {
                    if (c1.a(i1))
                    {
                        d1 = d2;
                    } else
                    {
                        d1 = a(i1, d2, v1);
                    }
                }
                if (d1 != null)
                {
                    return a(d1, v1, i1);
                }
                j1++;
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        return null;
    }

    private d a(d d1, v v1, int i1)
    {
        if (d1 != null) goto _L2; else goto _L1
_L1:
        return d1;
_L2:
        d d2;
        Object obj;
        Iterator iterator;
        List list;
        iterator = null;
        obj = null;
        list = d1.c();
        d2 = iterator;
        if (v1 == null) goto _L4; else goto _L3
_L3:
        d2 = iterator;
        if (list == null) goto _L4; else goto _L5
_L5:
        d2 = iterator;
        if (list.size() <= 0) goto _L4; else goto _L6
_L6:
        iterator = list.iterator();
        d2 = ((d) (obj));
_L10:
        if (!iterator.hasNext()) goto _L4; else goto _L7
_L7:
        obj = (c)iterator.next();
        d2 = v1.a(((c) (obj)).a());
        if ((long)i1 != ((c) (obj)).a()) goto _L8; else goto _L4
_L4:
        if (d2 != null)
        {
            return d2;
        }
          goto _L1
_L8:
        obj = a(d2, v1, i1);
        d2 = ((d) (obj));
        if (obj == null) goto _L10; else goto _L9
_L9:
        d2 = ((d) (obj));
          goto _L4
    }

    public static List a(int i1, d d1)
    {
        return o().b(i1, d1);
    }

    public static List a(d d1)
    {
        return o().c(d1);
    }

    private List a(List list)
    {
        if (list != null) goto _L2; else goto _L1
_L1:
        Object obj = new ArrayList();
_L5:
        return ((List) (obj));
_L2:
        int i1 = 0;
_L6:
        if (i1 >= list.size())
        {
            break MISSING_BLOCK_LABEL_110;
        }
        if (!e.d(b, (com.jiubang.playsdk.a.a)list.get(i1))) goto _L4; else goto _L3
_L3:
        obj = list;
        if (i1 > 0)
        {
            obj = list;
            if (i1 <= list.size())
            {
                com.jiubang.playsdk.a.a a1 = (com.jiubang.playsdk.a.a)list.remove(i1);
                obj = list;
                if (a1 != null)
                {
                    list.add(0, a1);
                    return list;
                }
            }
        }
          goto _L5
_L4:
        i1++;
          goto _L6
        i1 = 0;
          goto _L3
    }

    public static void a(Context context)
    {
        n();
        if (a == null)
        {
            a = new ac(context);
        }
    }

    private void a(SparseArray sparsearray)
    {
        for (Iterator iterator = (new ArrayList(p)).iterator(); iterator.hasNext(); ((al)iterator.next()).a(sparsearray)) { }
    }

    static void a(ac ac1, SparseArray sparsearray)
    {
        ac1.a(sparsearray);
    }

    static void a(ac ac1, String s1)
    {
        ac1.c(s1);
    }

    static void a(ac ac1, String s1, int i1)
    {
        ac1.a(s1, i1);
    }

    static void a(ac ac1, boolean flag, boolean flag1, int i1)
    {
        ac1.a(flag, flag1, i1);
    }

    public static void a(al al1)
    {
        o().c(al1);
    }

    private void a(v v1)
    {
        for (Iterator iterator = (new ArrayList(p)).iterator(); iterator.hasNext(); ((al)iterator.next()).a(v1)) { }
    }

    private void a(String s1)
    {
        for (Iterator iterator = (new ArrayList(p)).iterator(); iterator.hasNext(); ((al)iterator.next()).b(s1)) { }
    }

    private void a(String s1, int i1)
    {
        for (Iterator iterator = (new ArrayList(p)).iterator(); iterator.hasNext(); ((al)iterator.next()).a(s1, i1)) { }
    }

    private void a(boolean flag, boolean flag1, int i1)
    {
        for (Iterator iterator = (new ArrayList(p)).iterator(); iterator.hasNext(); ((al)iterator.next()).a(flag, flag1, i1)) { }
    }

    public static boolean a()
    {
        n();
        return a != null;
    }

    static boolean a(ac ac1, boolean flag)
    {
        ac1.k = flag;
        return flag;
    }

    private b b(com.jiubang.playsdk.a.a a1)
    {
        return f.a(a1);
    }

    public static List b(int i1)
    {
        return o().f(i1);
    }

    private List b(int i1, d d1)
    {
        ArrayList arraylist = new ArrayList();
        d1 = c(d1).iterator();
        do
        {
            if (!d1.hasNext())
            {
                break;
            }
            e e1 = (e)d1.next();
            com.jiubang.playsdk.d.a a1 = e1.f();
            if (a1 != null && a1.a(i1))
            {
                arraylist.add(e1);
            }
        } while (true);
        return arraylist;
    }

    public static List b(d d1)
    {
        return o().d(d1);
    }

    static void b(ac ac1, v v1)
    {
        ac1.a(v1);
    }

    static void b(ac ac1, String s1)
    {
        ac1.a(s1);
    }

    public static void b(al al1)
    {
        o().d(al1);
    }

    private void b(String s1)
    {
        for (Iterator iterator = (new ArrayList(p)).iterator(); iterator.hasNext(); ((al)iterator.next()).c(s1)) { }
    }

    public static boolean b()
    {
        return o().q();
    }

    static boolean b(ac ac1)
    {
        return ac1.u();
    }

    static boolean b(ac ac1, boolean flag)
    {
        ac1.l = flag;
        return flag;
    }

    static Runnable c(ac ac1)
    {
        return ac1.t;
    }

    public static List c(int i1)
    {
        return o().g(i1);
    }

    private List c(d d1)
    {
        List list = null;
        if (d1 != null)
        {
            list = d1.d();
        }
        return com.go.weatherex.themestore.am.a(b, list);
    }

    public static void c()
    {
        o().r();
    }

    static void c(ac ac1, String s1)
    {
        ac1.b(s1);
    }

    private void c(al al1)
    {
        if (al1 == null)
        {
            return;
        }
        if (p.contains(al1))
        {
            throw new IllegalStateException((new StringBuilder()).append("did you forget to unregister OnThemeStoreEventListener: ").append(al1).toString());
        } else
        {
            p.add(al1);
            return;
        }
    }

    private void c(String s1)
    {
        for (Iterator iterator = (new ArrayList(p)).iterator(); iterator.hasNext(); ((al)iterator.next()).a(s1)) { }
    }

    static boolean c(ac ac1, boolean flag)
    {
        ac1.n = flag;
        return flag;
    }

    static Handler d(ac ac1)
    {
        return ac1.c;
    }

    private List d(d d1)
    {
        List list = null;
        if (d1 != null)
        {
            list = d1.d();
        }
        return list;
    }

    public static void d()
    {
        o().t();
    }

    public static void d(int i1)
    {
        o().h(i1);
    }

    private void d(al al1)
    {
        if (al1 == null)
        {
            return;
        } else
        {
            p.remove(al1);
            return;
        }
    }

    public static ab e()
    {
        return o().v();
    }

    private d e(int i1)
    {
        if (i == null)
        {
            return null;
        }
        i1;
        JVM INSTR tableswitch 1 4: default 40
    //                   1 68
    //                   2 95
    //                   3 101
    //                   4 101;
           goto _L1 _L2 _L3 _L4 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("theme type undefined: ").append(i1).toString());
_L2:
        i1 = 40;
_L6:
        return a(i1, i.a(i.a()), i);
_L3:
        i1 = 39;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = 41;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static boolean e(ac ac1)
    {
        return ac1.l;
    }

    static v f(ac ac1)
    {
        return ac1.i;
    }

    private List f(int i1)
    {
        if (i1 != 1 && i1 != 2 && i1 != 4 && i1 != 3)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("themeType undefined: ").append(i1).toString());
        }
        ArrayList arraylist = new ArrayList();
        if (i1 == 1)
        {
            arraylist.addAll((Collection)m.get(2));
            arraylist.addAll((Collection)m.get(1));
        } else
        {
            arraylist.addAll((Collection)m.get(i1));
        }
        return a(arraylist);
    }

    public static void f()
    {
        o().w();
    }

    public static y g()
    {
        return o().x();
    }

    private List g(int i1)
    {
        Object obj = f(1);
        ArrayList arraylist = new ArrayList();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            com.jiubang.playsdk.a.a a1 = (com.jiubang.playsdk.a.a)((Iterator) (obj)).next();
            if (com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.a(a1, i1))
            {
                arraylist.add(a1);
            }
        } while (true);
        return arraylist;
    }

    static void g(ac ac1)
    {
        ac1.m();
    }

    public static q h()
    {
        return o().y();
    }

    private void h(int i1)
    {
        g.a(i1);
    }

    static void h(ac ac1)
    {
        ac1.A();
    }

    static y i(ac ac1)
    {
        return ac1.d;
    }

    public static boolean i()
    {
        return o().z();
    }

    public static void j()
    {
        o().A();
    }

    static boolean j(ac ac1)
    {
        return ac1.k;
    }

    public static void k()
    {
        o().B();
    }

    static void k(ac ac1)
    {
        ac1.s();
    }

    static Context l(ac ac1)
    {
        return ac1.b;
    }

    public static void l()
    {
        o().C();
    }

    static q m(ac ac1)
    {
        return ac1.e;
    }

    private void m()
    {
        if (n)
        {
            return;
        } else
        {
            m.clear();
            m.put(1, e.a(b, 1));
            m.put(2, e.a(b, 2));
            m.put(3, e.a(b, 3));
            m.put(4, e.a(b, 4));
            return;
        }
    }

    static SparseArray n(ac ac1)
    {
        return ac1.m;
    }

    private static void n()
    {
        if (!p())
        {
            throw new IllegalStateException("please call initSingleton on main thread...");
        } else
        {
            return;
        }
    }

    private static ac o()
    {
        n();
        if (a == null)
        {
            throw new IllegalStateException("did you forget to call initSingleton?");
        } else
        {
            return a;
        }
    }

    private static boolean p()
    {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    private boolean q()
    {
        return i != null;
    }

    private void r()
    {
        if (j > 0)
        {
            return;
        }
        k = false;
        l = false;
        if (d.f())
        {
            s();
            return;
        }
        if (!com.jiubang.playsdk.f.e.j(b))
        {
            s();
            return;
        } else
        {
            j = j + 1;
            d.a(0L, 1, 2, 0, h);
            c.postDelayed(t, 5000L);
            return;
        }
    }

    private void s()
    {
        (new ag(this, com.jiubang.playsdk.d.f.b(0L, 1, 2, 0))).execute(new Void[0]);
        j = j + 1;
    }

    private void t()
    {
        String s1 = com.jiubang.playsdk.d.f.b(0L, 1, 2, 0);
        d.a(s1, true);
        d.a(false);
    }

    private boolean u()
    {
        boolean flag = true;
        if (i == null)
        {
            return false;
        }
        d d1 = a(1);
        d d2 = a(3);
        if (a(d1).size() <= 0 || a(d2).size() <= 0)
        {
            flag = false;
        }
        return flag;
    }

    private ab v()
    {
        return o;
    }

    private void w()
    {
        e.a(o.b);
    }

    private y x()
    {
        return d;
    }

    private q y()
    {
        return e;
    }

    private boolean z()
    {
        return m.size() > 0;
    }
}
