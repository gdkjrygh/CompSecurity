// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google:
//            eK, bR, d9, aH, 
//            cP, fR, c5, fz, 
//            ap, P, b4, dT, 
//            eJ, eh

public abstract class ee extends eK
{

    private static final String z;
    private b4 a;
    private dT b;
    private boolean c;
    private bR d;

    protected ee()
    {
        this(null);
    }

    protected ee(b4 b4_1)
    {
        d = bR.d();
        a = b4_1;
    }

    static Map a(ee ee1)
    {
        return ee1.b();
    }

    private Map b()
    {
        int k = d9.c;
        TreeMap treemap = new TreeMap();
        Iterator iterator = aH.a(a()).f().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            fR fr = (fR)iterator.next();
            if (fr.e())
            {
                List list = (List)a(fr);
                try
                {
                    if (!list.isEmpty())
                    {
                        treemap.put(fr, list);
                    }
                }
                catch (UnsupportedOperationException unsupportedoperationexception)
                {
                    throw unsupportedoperationexception;
                }
                if (k == 0)
                {
                    continue;
                }
            }
            try
            {
                if (b(fr))
                {
                    treemap.put(fr, a(fr));
                }
            }
            catch (UnsupportedOperationException unsupportedoperationexception1)
            {
                throw unsupportedoperationexception1;
            }
        } while (k == 0);
        return treemap;
    }

    protected abstract aH a();

    public eJ a()
    {
        return c();
    }

    public eK a()
    {
        return c();
    }

    public eK a(bR br)
    {
        return b(br);
    }

    public final ee a(bR br)
    {
        d = br;
        f();
        return this;
    }

    public ee a(fR fr, Object obj)
    {
        aH.a(a(), fr).a(this, obj);
        return this;
    }

    public eh a(bR br)
    {
        return a(br);
    }

    public eh a(fR fr)
    {
        return aH.a(a(), fr).a();
    }

    public eh a(fR fr, Object obj)
    {
        return b(fr, obj);
    }

    public Object a(fR fr)
    {
        Object obj1 = aH.a(a(), fr).a(this);
        Object obj = obj1;
        try
        {
            if (fr.e())
            {
                obj = Collections.unmodifiableList((List)obj1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (fR fr)
        {
            throw fr;
        }
        return obj;
    }

    public Map a()
    {
        return Collections.unmodifiableMap(b());
    }

    public cP b()
    {
        return aH.a(a());
    }

    public final ee b(bR br)
    {
        d = bR.b(d).a(br).c();
        f();
        return this;
    }

    public ee b(fR fr, Object obj)
    {
        aH.a(a(), fr).b(this, obj);
        return this;
    }

    public eh b(fR fr, Object obj)
    {
        return a(fr, obj);
    }

    public boolean b(fR fr)
    {
        return aH.a(a(), fr).b(this);
    }

    public final bR c()
    {
        return d;
    }

    public ee c()
    {
        throw new UnsupportedOperationException(z);
    }

    public Object clone()
    {
        return c();
    }

    public boolean d()
    {
        Iterator iterator;
        int k;
        k = d9.c;
        iterator = b().f().iterator();
_L2:
        fR fr;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        fr = (fR)iterator.next();
        boolean flag;
        try
        {
            flag = fr.i();
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            try
            {
                throw unsupportedoperationexception;
            }
            catch (UnsupportedOperationException unsupportedoperationexception1)
            {
                throw unsupportedoperationexception1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        if (!b(fr))
        {
            return false;
        }
        boolean flag1;
        try
        {
            if (fr.h() != ap.MESSAGE)
            {
                continue; /* Loop/switch isn't completed */
            }
            flag1 = fr.e();
        }
        catch (UnsupportedOperationException unsupportedoperationexception2)
        {
            throw unsupportedoperationexception2;
        }
        if (flag1)
        {
            Iterator iterator1 = ((List)a(fr)).iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                P p = (P)iterator1.next();
                try
                {
                    flag1 = p.d();
                }
                catch (UnsupportedOperationException unsupportedoperationexception3)
                {
                    throw unsupportedoperationexception3;
                }
                if (!flag1)
                {
                    return false;
                }
            } while (k == 0);
            if (k == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        try
        {
            flag1 = b(fr);
        }
        catch (UnsupportedOperationException unsupportedoperationexception4)
        {
            try
            {
                throw unsupportedoperationexception4;
            }
            catch (UnsupportedOperationException unsupportedoperationexception5)
            {
                throw unsupportedoperationexception5;
            }
        }
        if (!flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((P)a(fr)).d())
        {
            return false;
        }
        if (k == 0) goto _L2; else goto _L1
_L1:
        return true;
    }

    protected boolean e()
    {
        return c;
    }

    protected final void f()
    {
        boolean flag = c;
        UnsupportedOperationException unsupportedoperationexception;
        if (flag)
        {
            try
            {
                if (a != null)
                {
                    a.a();
                    c = false;
                    return;
                }
            }
            catch (UnsupportedOperationException unsupportedoperationexception1)
            {
                throw unsupportedoperationexception1;
            }
        }
        break MISSING_BLOCK_LABEL_37;
        unsupportedoperationexception;
        throw unsupportedoperationexception;
    }

    protected b4 g()
    {
        try
        {
            if (b == null)
            {
                b = new dT(this, null);
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            throw unsupportedoperationexception;
        }
        return b;
    }

    protected void h()
    {
        c = true;
    }

    void i()
    {
        a = null;
    }

    protected void j()
    {
        try
        {
            if (a != null)
            {
                h();
            }
            return;
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            throw unsupportedoperationexception;
        }
    }

    static 
    {
        char ac[];
        int k;
        int l;
        ac = "B\0077\000h\177\034~\000=f\0371\000-rO*\034ht\n~\034>s\035,\032,r\n0S*oO-\006*u\003?\000;s\034p".toCharArray();
        l = ac.length;
        k = 0;
_L7:
        char c1;
        if (l <= k)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 72;
_L8:
        ac[k] = (char)(byte0 ^ c1);
        k++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 22;
          goto _L8
_L3:
        byte0 = 111;
          goto _L8
_L4:
        byte0 = 94;
          goto _L8
        byte0 = 115;
          goto _L8
    }
}
