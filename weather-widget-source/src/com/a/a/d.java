// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.a.a:
//            a, j, h, g, 
//            b, i, f, an, 
//            e, s

public final class d extends a
{

    boolean b;
    private ArrayList c;
    private HashMap d;
    private ArrayList e;
    private ArrayList f;
    private boolean g;
    private f h;
    private boolean i;
    private long j;
    private an k;
    private long l;

    public d()
    {
        c = new ArrayList();
        d = new HashMap();
        e = new ArrayList();
        f = new ArrayList();
        g = true;
        h = null;
        b = false;
        i = false;
        j = 0L;
        k = null;
        l = -1L;
    }

    static ArrayList a(d d1)
    {
        return d1.c;
    }

    static boolean a(d d1, boolean flag)
    {
        d1.i = flag;
        return flag;
    }

    static HashMap b(d d1)
    {
        return d1.d;
    }

    static ArrayList c(d d1)
    {
        return d1.f;
    }

    static ArrayList d(d d1)
    {
        return d1.e;
    }

    private void i()
    {
        if (g)
        {
            f.clear();
            ArrayList arraylist = new ArrayList();
            int i2 = e.size();
            for (int i1 = 0; i1 < i2; i1++)
            {
                j j2 = (j)e.get(i1);
                if (j2.b == null || j2.b.size() == 0)
                {
                    arraylist.add(j2);
                }
            }

            ArrayList arraylist1 = new ArrayList();
            for (; arraylist.size() > 0; arraylist1.clear())
            {
                int i3 = arraylist.size();
                for (int k1 = 0; k1 < i3; k1++)
                {
                    j j3 = (j)arraylist.get(k1);
                    f.add(j3);
                    if (j3.e == null)
                    {
                        continue;
                    }
                    int l3 = j3.e.size();
                    for (int k2 = 0; k2 < l3; k2++)
                    {
                        j j4 = (j)j3.e.get(k2);
                        j4.d.remove(j3);
                        if (j4.d.size() == 0)
                        {
                            arraylist1.add(j4);
                        }
                    }

                }

                arraylist.clear();
                arraylist.addAll(arraylist1);
            }

            g = false;
            if (f.size() != e.size())
            {
                throw new IllegalStateException("Circular dependencies cannot exist in AnimatorSet");
            }
        } else
        {
            int k3 = e.size();
            for (int l1 = 0; l1 < k3; l1++)
            {
                j j1 = (j)e.get(l1);
                if (j1.b != null && j1.b.size() > 0)
                {
                    int i4 = j1.b.size();
                    for (int l2 = 0; l2 < i4; l2++)
                    {
                        h h1 = (h)j1.b.get(l2);
                        if (j1.d == null)
                        {
                            j1.d = new ArrayList();
                        }
                        if (!j1.d.contains(h1.a))
                        {
                            j1.d.add(h1.a);
                        }
                    }

                }
                j1.f = false;
            }

        }
    }

    public a a(long l1)
    {
        return c(l1);
    }

    public g a(a a1)
    {
        if (a1 != null)
        {
            g = true;
            return new g(this, a1);
        } else
        {
            return null;
        }
    }

    public void a()
    {
        boolean flag = false;
        b = false;
        i = true;
        i();
        int k3 = f.size();
label0:
        for (int i1 = 0; i1 < k3; i1++)
        {
            j j1 = (j)f.get(i1);
            Object obj1 = j1.a.f();
            if (obj1 == null || ((ArrayList) (obj1)).size() <= 0)
            {
                continue;
            }
            obj1 = (new ArrayList(((java.util.Collection) (obj1)))).iterator();
            do
            {
                b b1;
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        continue label0;
                    }
                    b1 = (b)((Iterator) (obj1)).next();
                } while (!(b1 instanceof i) && !(b1 instanceof f));
                j1.a.b(b1);
            } while (true);
        }

        Object obj = new ArrayList();
        int k1 = 0;
        while (k1 < k3) 
        {
            j j2 = (j)f.get(k1);
            if (h == null)
            {
                h = new f(this, this);
            }
            if (j2.b == null || j2.b.size() == 0)
            {
                ((ArrayList) (obj)).add(j2);
            } else
            {
                int l3 = j2.b.size();
                for (int k2 = 0; k2 < l3; k2++)
                {
                    h h1 = (h)j2.b.get(k2);
                    h1.a.a.a(new i(this, j2, h1.b));
                }

                j2.c = (ArrayList)j2.b.clone();
            }
            j2.a.a(h);
            k1++;
        }
        if (j <= 0L)
        {
            j j3;
            for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); c.add(j3.a))
            {
                j3 = (j)((Iterator) (obj)).next();
                j3.a.a();
            }

        } else
        {
            k = an.b(new float[] {
                0.0F, 1.0F
            });
            k.c(j);
            k.a(new e(this, ((ArrayList) (obj))));
            k.a();
        }
        if (a != null)
        {
            ArrayList arraylist = (ArrayList)a.clone();
            int l2 = arraylist.size();
            for (int l1 = 0; l1 < l2; l1++)
            {
                ((b)arraylist.get(l1)).a(this);
            }

        }
        if (e.size() == 0 && j == 0L)
        {
            i = false;
            if (a != null)
            {
                ArrayList arraylist1 = (ArrayList)a.clone();
                int i3 = arraylist1.size();
                for (int i2 = ((flag) ? 1 : 0); i2 < i3; i2++)
                {
                    ((b)arraylist1.get(i2)).c(this);
                }

            }
        }
    }

    public void a(Object obj)
    {
        Iterator iterator = e.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a1 = ((j)iterator.next()).a;
            if (a1 instanceof d)
            {
                ((d)a1).a(obj);
            } else
            if (a1 instanceof s)
            {
                ((s)a1).a(obj);
            }
        } while (true);
    }

    public transient void a(a aa[])
    {
        int i1 = 1;
        if (aa != null)
        {
            g = true;
            g g1 = a(aa[0]);
            for (; i1 < aa.length; i1++)
            {
                g1.a(aa[i1]);
            }

        }
    }

    public void b()
    {
        b = true;
        if (!e())
        {
            break MISSING_BLOCK_LABEL_172;
        }
        Object obj;
        Iterator iterator1;
        if (a != null)
        {
            obj = (ArrayList)a.clone();
            for (Iterator iterator = ((ArrayList) (obj)).iterator(); iterator.hasNext(); ((b)iterator.next()).d(this)) { }
        } else
        {
            obj = null;
        }
        if (k == null || !k.d()) goto _L2; else goto _L1
_L1:
        k.b();
_L4:
        if (obj != null)
        {
            for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((b)((Iterator) (obj)).next()).c(this)) { }
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (f.size() > 0)
        {
            iterator1 = f.iterator();
            while (iterator1.hasNext()) 
            {
                ((j)iterator1.next()).a.b();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        i = false;
    }

    public void b(long l1)
    {
        j = l1;
    }

    public d c(long l1)
    {
        if (l1 < 0L)
        {
            throw new IllegalArgumentException("duration must be a value of zero or greater");
        }
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((j)iterator.next()).a.a(l1)) { }
        l = l1;
        return this;
    }

    public void c()
    {
        b = true;
        if (e())
        {
            if (f.size() != e.size())
            {
                i();
                j j1;
                for (Iterator iterator = f.iterator(); iterator.hasNext(); j1.a.a(h))
                {
                    j1 = (j)iterator.next();
                    if (h == null)
                    {
                        h = new f(this, this);
                    }
                }

            }
            if (k != null)
            {
                k.b();
            }
            if (f.size() > 0)
            {
                for (Iterator iterator1 = f.iterator(); iterator1.hasNext(); ((j)iterator1.next()).a.c()) { }
            }
            if (a != null)
            {
                for (Iterator iterator2 = ((ArrayList)a.clone()).iterator(); iterator2.hasNext(); ((b)iterator2.next()).c(this)) { }
            }
            i = false;
        }
    }

    public Object clone()
    {
        return h();
    }

    public boolean d()
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext();)
        {
            if (((j)iterator.next()).a.d())
            {
                return true;
            }
        }

        return false;
    }

    public boolean e()
    {
        return i;
    }

    public a g()
    {
        return h();
    }

    public d h()
    {
        d d1 = (d)super.g();
        d1.g = true;
        d1.b = false;
        d1.i = false;
        d1.c = new ArrayList();
        d1.d = new HashMap();
        d1.e = new ArrayList();
        d1.f = new ArrayList();
        HashMap hashmap = new HashMap();
        Iterator iterator1 = e.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            j j1 = (j)iterator1.next();
            j j2 = j1.a();
            hashmap.put(j1, j2);
            d1.e.add(j2);
            d1.d.put(j2.a, j2);
            j2.b = null;
            j2.c = null;
            j2.e = null;
            j2.d = null;
            ArrayList arraylist1 = j2.a.f();
            if (arraylist1 != null)
            {
                Iterator iterator2 = arraylist1.iterator();
                Object obj = null;
                do
                {
                    if (!iterator2.hasNext())
                    {
                        break;
                    }
                    b b1 = (b)iterator2.next();
                    if (b1 instanceof f)
                    {
                        ArrayList arraylist = ((ArrayList) (obj));
                        if (obj == null)
                        {
                            arraylist = new ArrayList();
                        }
                        arraylist.add(b1);
                        obj = arraylist;
                    }
                } while (true);
                if (obj != null)
                {
                    obj = ((ArrayList) (obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        arraylist1.remove((b)((Iterator) (obj)).next());
                    }
                }
            }
        } while (true);
        Iterator iterator = e.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj1 = (j)iterator.next();
            j j3 = (j)hashmap.get(obj1);
            if (((j) (obj1)).b != null)
            {
                obj1 = ((j) (obj1)).b.iterator();
                while (((Iterator) (obj1)).hasNext()) 
                {
                    h h1 = (h)((Iterator) (obj1)).next();
                    j3.a(new h((j)hashmap.get(h1.a), h1.b));
                }
            }
        } while (true);
        return d1;
    }
}
