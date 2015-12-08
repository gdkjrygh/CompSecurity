// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.MediaRouter;
import android.support.v7.b.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package android.support.v7.media:
//            bj, af, al, ae, 
//            d, bm, bn, bl, 
//            ad, ai, ak, bt, 
//            e, s, c, l, 
//            ag, aj, ah, j

class bk extends bj
    implements af, al
{

    private static final ArrayList j;
    private static final ArrayList k;
    protected final Object a;
    protected final Object b = h();
    protected final Object c = ae.a(this);
    protected final Object d;
    protected int e;
    protected boolean f;
    protected boolean g;
    protected final ArrayList h = new ArrayList();
    protected final ArrayList i = new ArrayList();
    private final bt l;
    private aj m;
    private ah n;

    public bk(Context context, bt bt1)
    {
        super(context);
        l = bt1;
        a = context.getSystemService("media_router");
        context = context.getResources();
        d = ae.a(a, context.getString(e.c), false);
        j();
    }

    private void a(bm bm1)
    {
        d d1 = new d(bm1.b, j(bm1.a));
        a(bm1, d1);
        bm1.c = d1.a();
    }

    private int b(String s1)
    {
        int j1 = h.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((bm)h.get(i1)).b.equals(s1))
            {
                return i1;
            }
        }

        return -1;
    }

    private int e(ad ad1)
    {
        int j1 = i.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((bn)i.get(i1)).a == ad1)
            {
                return i1;
            }
        }

        return -1;
    }

    private boolean f(Object obj)
    {
        if (i(obj) != null || g(obj) >= 0) goto _L2; else goto _L1
_L1:
        String s1;
        boolean flag;
        if (i() == obj)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            s1 = "DEFAULT_ROUTE";
        } else
        {
            s1 = String.format(Locale.US, "ROUTE_%08x", new Object[] {
                Integer.valueOf(j(obj).hashCode())
            });
        }
        if (b(s1) >= 0) goto _L4; else goto _L3
_L3:
        obj = new bm(obj, s1);
        a(((bm) (obj)));
        h.add(obj);
        return true;
_L4:
        int i1 = 2;
        do
        {
            String s2 = String.format(Locale.US, "%s_%d", new Object[] {
                s1, Integer.valueOf(i1)
            });
            if (b(s2) < 0)
            {
                s1 = s2;
                continue; /* Loop/switch isn't completed */
            }
            i1++;
        } while (true);
_L2:
        return false;
        if (true) goto _L3; else goto _L5
_L5:
    }

    private static bn i(Object obj)
    {
        obj = ((android.media.MediaRouter.RouteInfo)obj).getTag();
        if (obj instanceof bn)
        {
            return (bn)obj;
        } else
        {
            return null;
        }
    }

    private String j(Object obj)
    {
        Context context = a();
        obj = ((android.media.MediaRouter.RouteInfo)obj).getName(context);
        if (obj != null)
        {
            return obj.toString();
        } else
        {
            return "";
        }
    }

    private void j()
    {
        Object obj = (MediaRouter)a;
        int j1 = ((MediaRouter) (obj)).getRouteCount();
        ArrayList arraylist = new ArrayList(j1);
        for (int i1 = 0; i1 < j1; i1++)
        {
            arraylist.add(((MediaRouter) (obj)).getRouteAt(i1));
        }

        obj = arraylist.iterator();
        boolean flag;
        for (flag = false; ((Iterator) (obj)).hasNext(); flag |= f(((Iterator) (obj)).next())) { }
        if (flag)
        {
            f();
        }
    }

    public final j a(String s1)
    {
        int i1 = b(s1);
        if (i1 >= 0)
        {
            return new bl(this, ((bm)h.get(i1)).a);
        } else
        {
            return null;
        }
    }

    public final void a(ad ad1)
    {
        if (ad1.p() != this)
        {
            Object obj = ae.b(a, d);
            ad1 = new bn(ad1, obj);
            ai.a(obj, ad1);
            ak.a(obj, c);
            a(((bn) (ad1)));
            i.add(ad1);
            ((MediaRouter)a).addUserRoute((android.media.MediaRouter.UserRouteInfo)obj);
        } else
        {
            int i1 = g(ae.a(a, 0x800003));
            if (i1 >= 0 && ((bm)h.get(i1)).b.equals(ad1.o()))
            {
                ad1.n();
                return;
            }
        }
    }

    protected void a(bm bm1, d d1)
    {
        int i1 = ((android.media.MediaRouter.RouteInfo)bm1.a).getSupportedTypes();
        if ((i1 & 1) != 0)
        {
            d1.a(j);
        }
        if ((i1 & 2) != 0)
        {
            d1.a(k);
        }
        d1.a(((android.media.MediaRouter.RouteInfo)bm1.a).getPlaybackType());
        d1.b(((android.media.MediaRouter.RouteInfo)bm1.a).getPlaybackStream());
        d1.c(((android.media.MediaRouter.RouteInfo)bm1.a).getVolume());
        d1.d(((android.media.MediaRouter.RouteInfo)bm1.a).getVolumeMax());
        d1.e(((android.media.MediaRouter.RouteInfo)bm1.a).getVolumeHandling());
    }

    protected void a(bn bn1)
    {
        Object obj = bn1.b;
        String s1 = bn1.a.a();
        ((android.media.MediaRouter.UserRouteInfo)obj).setName(s1);
        ak.a(bn1.b, bn1.a.h());
        ak.b(bn1.b, bn1.a.i());
        ak.c(bn1.b, bn1.a.k());
        ak.d(bn1.b, bn1.a.l());
        android.support.v7.media.ak.e(bn1.b, bn1.a.j());
    }

    public final void a(Object obj)
    {
        if (obj == ae.a(a, 0x800003))
        {
            bn bn1 = i(obj);
            if (bn1 != null)
            {
                bn1.a.n();
                return;
            }
            int i1 = g(obj);
            if (i1 >= 0)
            {
                obj = (bm)h.get(i1);
                obj = l.a(((bm) (obj)).b);
                if (obj != null)
                {
                    ((ad) (obj)).n();
                    return;
                }
            }
        }
    }

    public final void a(Object obj, int i1)
    {
        obj = i(obj);
        if (obj != null)
        {
            ((bn) (obj)).a.a(i1);
        }
    }

    public final void b(ad ad1)
    {
        if (ad1.p() != this)
        {
            int i1 = e(ad1);
            if (i1 >= 0)
            {
                Object obj = (bn)i.remove(i1);
                ai.a(((bn) (obj)).b, null);
                ak.a(((bn) (obj)).b, null);
                ad1 = ((ad) (a));
                obj = ((bn) (obj)).b;
                ((MediaRouter)ad1).removeUserRoute((android.media.MediaRouter.UserRouteInfo)obj);
            }
        }
    }

    public final void b(android.support.v7.media.e e1)
    {
        boolean flag = false;
        int i1;
        if (e1 != null)
        {
            List list = e1.a().a();
            int k1 = list.size();
            int j1 = 0;
            i1 = 0;
            while (j1 < k1) 
            {
                String s1 = (String)list.get(j1);
                if (s1.equals("android.media.intent.category.LIVE_AUDIO"))
                {
                    i1 |= 1;
                } else
                if (s1.equals("android.media.intent.category.LIVE_VIDEO"))
                {
                    i1 |= 2;
                } else
                {
                    i1 = 0x800000 | i1;
                }
                j1++;
            }
            flag = e1.b();
        } else
        {
            i1 = 0;
        }
        if (e != i1 || f != flag)
        {
            e = i1;
            f = flag;
            g();
            j();
        }
    }

    public final void b(Object obj)
    {
        if (f(obj))
        {
            f();
        }
    }

    public final void b(Object obj, int i1)
    {
        obj = i(obj);
        if (obj != null)
        {
            ((bn) (obj)).a.b(i1);
        }
    }

    public final void c(ad ad1)
    {
        if (ad1.p() != this)
        {
            int i1 = e(ad1);
            if (i1 >= 0)
            {
                a((bn)i.get(i1));
            }
        }
    }

    public final void c(Object obj)
    {
        if (i(obj) == null)
        {
            int i1 = g(obj);
            if (i1 >= 0)
            {
                h.remove(i1);
                f();
            }
        }
    }

    public final void d(ad ad1)
    {
        if (ad1.e()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i1;
        if (ad1.p() == this)
        {
            break; /* Loop/switch isn't completed */
        }
        if ((i1 = e(ad1)) >= 0)
        {
            h(((bn)i.get(i1)).b);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        int j1 = b(ad1.o());
        if (j1 >= 0)
        {
            h(((bm)h.get(j1)).a);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void d(Object obj)
    {
        if (i(obj) == null)
        {
            int i1 = g(obj);
            if (i1 >= 0)
            {
                a((bm)h.get(i1));
                f();
            }
        }
    }

    public final void e(Object obj)
    {
        if (i(obj) == null)
        {
            int i1 = g(obj);
            if (i1 >= 0)
            {
                bm bm1 = (bm)h.get(i1);
                i1 = ((android.media.MediaRouter.RouteInfo)obj).getVolume();
                if (i1 != bm1.c.i())
                {
                    bm1.c = (new d(bm1.c)).c(i1).a();
                    f();
                }
            }
        }
    }

    protected final void f()
    {
        l l1 = new l();
        int j1 = h.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            l1.a(((bm)h.get(i1)).c);
        }

        a(l1.a());
    }

    protected final int g(Object obj)
    {
        int j1 = h.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((bm)h.get(i1)).a == obj)
            {
                return i1;
            }
        }

        return -1;
    }

    protected void g()
    {
        if (g)
        {
            g = false;
            ae.a(a, b);
        }
        if (e != 0)
        {
            g = true;
            Object obj = a;
            int i1 = e;
            Object obj1 = b;
            ((MediaRouter)obj).addCallback(i1, (android.media.MediaRouter.Callback)obj1);
        }
    }

    protected Object h()
    {
        return new ag(this);
    }

    protected void h(Object obj)
    {
        if (m == null)
        {
            m = new aj();
        }
        m.a(a, 0x800003, obj);
    }

    protected Object i()
    {
        if (n == null)
        {
            n = new ah();
        }
        return n.a(a);
    }

    static 
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arraylist = new ArrayList();
        j = arraylist;
        arraylist.add(intentfilter);
        intentfilter = new IntentFilter();
        intentfilter.addCategory("android.media.intent.category.LIVE_VIDEO");
        arraylist = new ArrayList();
        k = arraylist;
        arraylist.add(intentfilter);
    }
}
