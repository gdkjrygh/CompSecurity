// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.ComponentName;
import android.content.Context;
import android.support.v4.b.a.a;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package android.support.v7.media:
//            bc, bt, bh, aa, 
//            z, bj, ac, k, 
//            c, ad, u, ab, 
//            j, f, az, t, 
//            w, e, s

final class y
    implements bc, bt
{

    private final Context a;
    private final ArrayList b = new ArrayList();
    private final ArrayList c = new ArrayList();
    private final ArrayList d = new ArrayList();
    private final ArrayList e = new ArrayList();
    private final bh f = new bh();
    private final aa g = new aa(this, (byte)0);
    private final z h = new z(this, (byte)0);
    private final a i;
    private final bj j;
    private az k;
    private ad l;
    private ad m;
    private j n;
    private e o;

    y(Context context)
    {
        a = context;
        i = android.support.v4.b.a.a.a(context);
        j = android.support.v7.media.bj.a(context, this);
        a(j);
    }

    static Context a(y y1)
    {
        return y1.a;
    }

    private void a(ac ac1, k k1)
    {
        if (!ac1.a(k1)) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        int l1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        j1 = 0;
        i1 = 0;
        flag2 = false;
        flag = false;
        flag1 = flag2;
        l1 = j1;
        if (k1 == null) goto _L4; else goto _L3
_L3:
        if (!k1.b()) goto _L6; else goto _L5
_L5:
        List list;
        int i2;
        list = k1.a();
        i2 = list.size();
        j1 = 0;
_L12:
        flag1 = flag;
        l1 = i1;
        if (j1 >= i2) goto _L4; else goto _L7
_L7:
        c c1;
        String s2;
        int j2;
        c1 = (c)list.get(j1);
        s2 = c1.a();
        j2 = ac1.a(s2);
        if (j2 >= 0) goto _L9; else goto _L8
_L8:
        k1 = (new StringBuilder()).append(ac1.c().flattenToShortString()).append(":").append(s2).toString();
        if (b(k1) >= 0) goto _L11; else goto _L10
_L10:
        k1 = new ad(ac1, s2, k1);
        ArrayList arraylist = ac.b(ac1);
        l1 = i1 + 1;
        arraylist.add(i1, k1);
        c.add(k1);
        k1.a(c1);
        if (u.e())
        {
            Log.d("MediaRouter", (new StringBuilder("Route added: ")).append(k1).toString());
        }
        h.a(257, k1);
        i1 = l1;
_L14:
        j1++;
          goto _L12
_L11:
        l1 = 2;
_L13:
label0:
        {
            String s1 = String.format(Locale.US, "%s_%d", new Object[] {
                k1, Integer.valueOf(l1)
            });
            if (b(s1) >= 0)
            {
                break label0;
            }
            k1 = s1;
        }
          goto _L10
        l1++;
          goto _L13
_L9:
        if (j2 < i1)
        {
            Log.w("MediaRouter", (new StringBuilder("Ignoring route descriptor with duplicate id: ")).append(c1).toString());
        } else
        {
            k1 = (ad)ac.b(ac1).get(j2);
            ArrayList arraylist1 = ac.b(ac1);
            l1 = i1 + 1;
            Collections.swap(arraylist1, j2, i1);
            i1 = k1.a(c1);
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_737;
            }
            if ((i1 & 1) != 0)
            {
                if (u.e())
                {
                    Log.d("MediaRouter", (new StringBuilder("Route changed: ")).append(k1).toString());
                }
                h.a(259, k1);
            }
            if ((i1 & 2) != 0)
            {
                if (u.e())
                {
                    Log.d("MediaRouter", (new StringBuilder("Route volume changed: ")).append(k1).toString());
                }
                h.a(260, k1);
            }
            if ((i1 & 4) != 0)
            {
                if (u.e())
                {
                    Log.d("MediaRouter", (new StringBuilder("Route presentation display changed: ")).append(k1).toString());
                }
                h.a(261, k1);
            }
            if (k1 != m)
            {
                break MISSING_BLOCK_LABEL_737;
            }
            flag = true;
            i1 = l1;
        }
          goto _L14
_L6:
        Log.w("MediaRouter", (new StringBuilder("Ignoring invalid provider descriptor: ")).append(k1).toString());
        l1 = j1;
        flag1 = flag2;
_L4:
        for (i1 = ac.b(ac1).size() - 1; i1 >= l1; i1--)
        {
            k1 = (ad)ac.b(ac1).get(i1);
            k1.a(null);
            c.remove(k1);
        }

        a(flag1);
        for (i1 = ac.b(ac1).size() - 1; i1 >= l1; i1--)
        {
            k1 = (ad)ac.b(ac1).remove(i1);
            if (u.e())
            {
                Log.d("MediaRouter", (new StringBuilder("Route removed: ")).append(k1).toString());
            }
            h.a(258, k1);
        }

        if (u.e())
        {
            Log.d("MediaRouter", (new StringBuilder("Provider changed: ")).append(ac1).toString());
        }
        h.a(515, ac1);
_L2:
        return;
        i1 = l1;
          goto _L14
    }

    static void a(y y1, f f1, k k1)
    {
        int i1 = y1.c(f1);
        if (i1 >= 0)
        {
            y1.a((ac)y1.d.get(i1), k1);
        }
    }

    private void a(boolean flag)
    {
label0:
        {
            if (l != null && !b(l))
            {
                Log.i("MediaRouter", (new StringBuilder("Clearing the default route because it is no longer selectable: ")).append(l).toString());
                l = null;
            }
            if (l != null || c.isEmpty())
            {
                break label0;
            }
            Iterator iterator = c.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                ad ad1 = (ad)iterator.next();
                boolean flag1;
                if (ad1.p() == j && android.support.v7.media.ad.a(ad1).equals("DEFAULT_ROUTE"))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
            } while (!flag1 || !b(ad1));
            l = ad1;
            Log.i("MediaRouter", (new StringBuilder("Found default route: ")).append(l).toString());
        }
        if (m != null && !b(m))
        {
            Log.i("MediaRouter", (new StringBuilder("Unselecting the current route because it is no longer selectable: ")).append(m).toString());
            c(((ad) (null)));
        }
        if (m == null)
        {
            c(f());
        } else
        if (flag)
        {
            g();
            return;
        }
    }

    private int b(String s1)
    {
        int j1 = c.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (ad.c((ad)c.get(i1)).equals(s1))
            {
                return i1;
            }
        }

        return -1;
    }

    static bh b(y y1)
    {
        return y1.f;
    }

    private static boolean b(ad ad1)
    {
        return ad.d(ad1) != null && ad.b(ad1);
    }

    private int c(f f1)
    {
        int j1 = d.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (android.support.v7.media.ac.a((ac)d.get(i1)) == f1)
            {
                return i1;
            }
        }

        return -1;
    }

    private int c(Object obj)
    {
        int j1 = e.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((ab)e.get(i1)).a() == obj)
            {
                return i1;
            }
        }

        return -1;
    }

    static ad c(y y1)
    {
        return y1.m;
    }

    private void c(ad ad1)
    {
        if (m != ad1)
        {
            if (m != null)
            {
                if (u.e())
                {
                    Log.d("MediaRouter", (new StringBuilder("Route unselected: ")).append(m).toString());
                }
                h.a(263, m);
                if (n != null)
                {
                    n.c();
                    n.a();
                    n = null;
                }
            }
            m = ad1;
            if (m != null)
            {
                n = ad1.p().a(android.support.v7.media.ad.a(ad1));
                if (n != null)
                {
                    n.b();
                }
                if (u.e())
                {
                    Log.d("MediaRouter", (new StringBuilder("Route selected: ")).append(m).toString());
                }
                h.a(262, m);
            }
            g();
        }
    }

    static ArrayList d(y y1)
    {
        return y1.b;
    }

    static bj e(y y1)
    {
        return y1.j;
    }

    private ad f()
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            ad ad1 = (ad)iterator.next();
            if (ad1 != l)
            {
                boolean flag;
                if (ad1.p() == j && ad1.a("android.media.intent.category.LIVE_AUDIO") && !ad1.a("android.media.intent.category.LIVE_VIDEO"))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag && b(ad1))
                {
                    return ad1;
                }
            }
        }

        return l;
    }

    private void g()
    {
        if (m != null)
        {
            f.a = m.k();
            f.b = m.l();
            f.c = m.j();
            f.d = m.i();
            f.e = m.h();
            int j1 = e.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                ((ab)e.get(i1)).c();
            }

        }
    }

    public final ad a(String s1)
    {
        int i1 = c(j);
        if (i1 >= 0)
        {
            ac ac1 = (ac)d.get(i1);
            i1 = ac1.a(s1);
            if (i1 >= 0)
            {
                return (ad)ac.b(ac1).get(i1);
            }
        }
        return null;
    }

    public final u a(Context context)
    {
        int i1 = b.size();
label0:
        do
        {
            do
            {
                i1--;
                u u1;
                if (i1 >= 0)
                {
                    u1 = (u)((WeakReference)b.get(i1)).get();
                    if (u1 != null)
                    {
                        continue label0;
                    }
                    b.remove(i1);
                } else
                {
                    context = new u(context);
                    b.add(new WeakReference(context));
                    return context;
                }
            } while (true);
        } while (u1.b != context);
        return u1;
    }

    public final void a()
    {
        k = new az(a, this);
        k.a();
    }

    public final void a(ad ad1)
    {
        if (!c.contains(ad1))
        {
            Log.w("MediaRouter", (new StringBuilder("Ignoring attempt to select removed route: ")).append(ad1).toString());
            return;
        }
        if (!ad.b(ad1))
        {
            Log.w("MediaRouter", (new StringBuilder("Ignoring attempt to select disabled route: ")).append(ad1).toString());
            return;
        } else
        {
            c(ad1);
            return;
        }
    }

    public final void a(ad ad1, int i1)
    {
        if (ad1 == m && n != null)
        {
            n.a(i1);
        }
    }

    public final void a(f f1)
    {
        if (c(f1) < 0)
        {
            ac ac1 = new ac(f1);
            d.add(ac1);
            if (u.e())
            {
                Log.d("MediaRouter", (new StringBuilder("Provider added: ")).append(ac1).toString());
            }
            h.a(513, ac1);
            a(ac1, f1.e());
            f1.a(g);
            f1.a(o);
        }
    }

    public final void a(Object obj)
    {
        if (c(obj) < 0)
        {
            obj = new ab(this, obj);
            e.add(obj);
        }
    }

    public final boolean a(s s1, int i1)
    {
        int k1 = c.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            ad ad1 = (ad)c.get(j1);
            if (((i1 & 1) == 0 || !ad1.f()) && ad1.a(s1))
            {
                return true;
            }
        }

        return false;
    }

    public final List b()
    {
        return c;
    }

    public final void b(ad ad1, int i1)
    {
        if (ad1 == m && n != null)
        {
            n.b(i1);
        }
    }

    public final void b(f f1)
    {
        int i1 = c(f1);
        if (i1 >= 0)
        {
            f1.a(null);
            f1.a(null);
            f1 = (ac)d.get(i1);
            a(f1, ((k) (null)));
            if (u.e())
            {
                Log.d("MediaRouter", (new StringBuilder("Provider removed: ")).append(f1).toString());
            }
            h.a(514, f1);
            d.remove(i1);
        }
    }

    public final void b(Object obj)
    {
        int i1 = c(obj);
        if (i1 >= 0)
        {
            ((ab)e.remove(i1)).b();
        }
    }

    public final ad c()
    {
        if (l == null)
        {
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        } else
        {
            return l;
        }
    }

    public final ad d()
    {
        if (m == null)
        {
            throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
        } else
        {
            return m;
        }
    }

    public final void e()
    {
        Object obj;
        boolean flag1;
        obj = new t();
        int j1 = b.size();
        flag1 = false;
        boolean flag = false;
        do
        {
            j1--;
            if (j1 < 0)
            {
                break;
            }
            u u1 = (u)((WeakReference)b.get(j1)).get();
            if (u1 == null)
            {
                b.remove(j1);
            } else
            {
                int i2 = u1.c.size();
                int l1 = 0;
                while (l1 < i2) 
                {
                    w w1 = (w)u1.c.get(l1);
                    ((t) (obj)).a(w1.c);
                    if ((w1.d & 1) != 0)
                    {
                        flag1 = true;
                        flag = true;
                    }
                    if ((w1.d & 4) != 0)
                    {
                        flag = true;
                    }
                    l1++;
                }
            }
        } while (true);
        if (flag)
        {
            obj = ((t) (obj)).a();
        } else
        {
            obj = android.support.v7.media.s.a;
        }
        if (o == null || !o.a().equals(obj) || o.b() != flag1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!((s) (obj)).b() || flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (o == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        o = null;
_L4:
        if (u.e())
        {
            Log.d("MediaRouter", (new StringBuilder("Updated discovery request: ")).append(o).toString());
        }
        int k1 = d.size();
        int i1 = 0;
        while (i1 < k1) 
        {
            android.support.v7.media.ac.a((ac)d.get(i1)).a(o);
            i1++;
        }
        if (true) goto _L1; else goto _L3
_L3:
        o = new e(((s) (obj)), flag1);
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }
}
