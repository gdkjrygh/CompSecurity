// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.whatsapp:
//            nf, App, mk, o1, 
//            ake, ox

public class ij
{

    private final HashMap a = new HashMap();
    private final HashMap b = new HashMap();
    private final Handler c = new Handler();

    public ij()
    {
    }

    static HashMap a(ij ij1)
    {
        return ij1.a;
    }

    private static boolean a(long l)
    {
        return l != 0L && 25000L + l > System.currentTimeMillis();
    }

    public long a(String s)
    {
        s = (nf)a.get(s);
        if (s == null)
        {
            return 0L;
        } else
        {
            return ((nf) (s)).e;
        }
    }

    public String a(String s, long l)
    {
        nf nf1;
label0:
        {
            int i = App.am;
            nf nf2 = (nf)a.get(s);
            nf1 = nf2;
            if (nf2 == null)
            {
                nf1 = new nf(null);
                a.put(s, nf1);
            }
            if (l == 0L)
            {
                nf1.e = 0L;
                if (i == 0)
                {
                    break label0;
                }
            }
            nf1.e = l;
        }
        nf1.b = 0L;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (mk.h((String)entry.getKey()))
            {
                Object obj = (nf)entry.getValue();
                if (((nf) (obj)).a != null)
                {
                    obj = (o1)((nf) (obj)).a.get(s);
                    if (obj != null)
                    {
                        obj.a = 0L;
                        return (String)entry.getKey();
                    }
                }
            }
        }

        return null;
    }

    public void a()
    {
        int i = App.am;
        a.clear();
        Iterator iterator = b.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ake ake1 = (ake)iterator.next();
            c.removeCallbacks(ake1);
        } while (i == 0);
        b.clear();
    }

    public void a(String s, String s1)
    {
        nf nf1 = (nf)a.get(s);
        if (nf1 == null)
        {
            nf1 = new nf(null);
            a.put(s, nf1);
        }
        if (s1 != null && mk.h(s))
        {
            if (nf1.a == null)
            {
                nf1.a = new HashMap();
            }
            o1 o1_2 = (o1)nf1.a.get(s1);
            o1 o1_1 = o1_2;
            if (o1_2 == null)
            {
                o1_1 = new o1(null);
                nf1.a.put(s1, o1_1);
            }
            o1_1.a = 0L;
        }
        nf1.b = 0L;
        s = (new StringBuilder()).append(s).append(s1).toString();
        s = (ake)b.get(s);
        if (s != null)
        {
            c.removeCallbacks(s);
        }
    }

    public void a(String s, String s1, int i)
    {
        Object obj = (nf)a.get(s);
        if (obj == null)
        {
            obj = new nf(null);
            a.put(s, obj);
        }
        if (s1 != null && mk.h(s))
        {
            if (((nf) (obj)).a == null)
            {
                obj.a = new HashMap();
            }
            o1 o1_2 = (o1)((nf) (obj)).a.get(s1);
            o1 o1_1 = o1_2;
            if (o1_2 == null)
            {
                o1_1 = new o1(null);
                ((nf) (obj)).a.put(s1, o1_1);
            }
            o1_1.a = System.currentTimeMillis();
            o1_1.b = i;
        }
        obj.b = System.currentTimeMillis();
        obj.d = i;
        String s2 = (new StringBuilder()).append(s).append(s1).toString();
        ake ake1 = (ake)b.get(s2);
        obj = ake1;
        if (ake1 == null)
        {
            obj = new ake(this, s, s1);
            b.put(s2, obj);
        }
        c.removeCallbacks(((Runnable) (obj)));
        c.postDelayed(((Runnable) (obj)), 25000L);
    }

    public void a(String s, boolean flag)
    {
        nf nf2 = (nf)a.get(s);
        nf nf1 = nf2;
        if (nf2 == null)
        {
            nf1 = new nf(null);
            a.put(s, nf1);
        }
        nf1.c = flag;
        if (!flag)
        {
            nf1.e = 0L;
        }
    }

    public int b(String s, String s1)
    {
        nf nf1 = (nf)a.get(s);
        if (nf1 != null) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        if (s1 == null || !mk.h(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (nf1.a == null) goto _L1; else goto _L3
_L3:
        s = (o1)nf1.a.get(s1);
        if (s == null) goto _L1; else goto _L4
_L4:
        int i;
        if (a(((o1) (s)).a))
        {
            i = ((o1) (s)).b;
        } else
        {
            i = -1;
        }
        return i;
        if (!a(nf1.b)) goto _L1; else goto _L5
_L5:
        return nf1.d;
    }

    public boolean b(String s)
    {
        s = (nf)a.get(s);
        if (s == null)
        {
            return false;
        } else
        {
            return ((nf) (s)).c;
        }
    }

    public void c(String s)
    {
        nf nf2 = (nf)a.get(s);
        nf nf1 = nf2;
        if (nf2 == null)
        {
            nf1 = new nf(null);
            a.put(s, nf1);
        }
        nf1.e = 1L;
    }

    public boolean d(String s)
    {
        if (mk.h(s))
        {
            return true;
        }
        s = (nf)a.get(s);
        boolean flag;
        if (s == null)
        {
            flag = false;
        } else
        if (((nf) (s)).e == 1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public ox e(String s)
    {
        Object obj;
        int k;
        k = App.am;
        obj = (nf)a.get(s);
        if (obj != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if (!mk.h(s))
        {
            break; /* Loop/switch isn't completed */
        }
        if (((nf) (obj)).a == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        long l = 0L;
        Iterator iterator = ((nf) (obj)).a.entrySet().iterator();
        int i = -1;
        obj = null;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (((o1)entry.getValue()).a > l)
            {
                obj = (String)entry.getKey();
                l = ((o1)entry.getValue()).a;
                i = ((o1)entry.getValue()).b;
            }
        } while (k == 0);
        if (a(l))
        {
            return new ox(((String) (obj)), i);
        }
        if (k == 0) goto _L1; else goto _L3
_L3:
        int j = b(s, null);
        if (j != -1)
        {
            return new ox(s, j);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
