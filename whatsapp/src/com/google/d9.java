// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google:
//            dn, P, fl, fR, 
//            cT, eK, cP, dv, 
//            fa, dk, bR, ap, 
//            y, ge

public abstract class d9 extends dn
    implements P
{

    public static int c;
    private int b;

    public d9()
    {
        b = -1;
    }

    protected static int a(fl fl1)
    {
        return fl1.getNumber();
    }

    protected static int a(List list)
    {
        int j = c;
        list = list.iterator();
        int i = 1;
        while (list.hasNext()) 
        {
            i = a((fl)list.next()) + i * 31;
            if (j != 0)
            {
                return i;
            }
        }
        return i;
    }

    protected int a(int i, Map map)
    {
        int j;
        int k;
        k = c;
        map = map.entrySet().iterator();
        j = i;
_L2:
label0:
        {
            i = j;
            if (!map.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj = (java.util.Map.Entry)map.next();
            fR fr = (fR)((java.util.Map.Entry) (obj)).getKey();
            obj = ((java.util.Map.Entry) (obj)).getValue();
            j = j * 37 + fr.c();
            i = j;
            if (fr.o() != cT.ENUM)
            {
                i = j * 53 + obj.hashCode();
                if (k == 0)
                {
                    break label0;
                }
            }
            j = i;
            if (fr.e())
            {
                j = i * 53 + a((List)obj);
                if (k == 0)
                {
                    break MISSING_BLOCK_LABEL_160;
                }
            }
            i = j * 53 + a((fl)obj);
        }
_L3:
        j = i;
        if (k == 0) goto _L2; else goto _L1
_L1:
        return i;
        i = j;
          goto _L3
    }

    ge a()
    {
        return eK.b(this);
    }

    public void a(fa fa1)
    {
label0:
        {
            int i = c;
            boolean flag = b().d().n();
            Object obj = a().entrySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Object obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                fR fr = (fR)((java.util.Map.Entry) (obj1)).getKey();
                obj1 = ((java.util.Map.Entry) (obj1)).getValue();
                if (flag && fr.n() && fr.o() == cT.MESSAGE && !fr.e())
                {
                    fa1.e(fr.c(), (P)obj1);
                    if (i == 0)
                    {
                        continue;
                    }
                }
                dk.a(fr, obj1, fa1);
            } while (i == 0);
            obj = c();
            if (flag)
            {
                ((bR) (obj)).b(fa1);
                if (i == 0)
                {
                    break label0;
                }
            }
            ((bR) (obj)).a(fa1);
        }
    }

    public int b()
    {
        Iterator iterator;
        int i;
        int k;
        boolean flag;
        k = c;
        i = b;
        if (i != -1)
        {
            return i;
        }
        flag = b().d().n();
        iterator = a().entrySet().iterator();
        i = 0;
_L2:
        int j;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = (java.util.Map.Entry)iterator.next();
        fR fr = (fR)((java.util.Map.Entry) (obj)).getKey();
        obj = ((java.util.Map.Entry) (obj)).getValue();
        j = i;
        if (flag)
        {
            j = i;
            if (fr.n())
            {
                j = i;
                if (fr.o() == cT.MESSAGE)
                {
                    j = i;
                    if (!fr.e())
                    {
                        j = i + fa.a(fr.c(), (P)obj);
                        if (k == 0)
                        {
                            break MISSING_BLOCK_LABEL_224;
                        }
                    }
                }
            }
        }
        i = dk.b(fr, obj) + j;
_L3:
        if (k == 0) goto _L2; else goto _L1
_L1:
label0:
        {
            bR br = c();
            j = i;
            if (flag)
            {
                i += br.g();
                j = i;
                if (k == 0)
                {
                    break label0;
                }
                j = i;
            }
            j += br.b();
        }
        b = j;
        return j;
        i = j;
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public boolean d()
    {
        int i = c;
        Iterator iterator = b().f().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            fR fr = (fR)iterator.next();
            if (fr.i() && !b(fr))
            {
                return false;
            }
        } while (i == 0);
        iterator = a().entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            fR fr1 = (fR)entry.getKey();
            if (fr1.h() != ap.MESSAGE)
            {
                continue;
            }
            if (fr1.e())
            {
                Iterator iterator1 = ((List)entry.getValue()).iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    if (!((P)iterator1.next()).d())
                    {
                        return false;
                    }
                } while (i == 0);
                if (i == 0)
                {
                    continue;
                }
            }
            if (!((P)entry.getValue()).d())
            {
                return false;
            }
        } while (i == 0);
        return true;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof P))
            {
                return false;
            }
            obj = (P)obj;
            if (b() != ((P) (obj)).b())
            {
                return false;
            }
            if (!a().equals(((P) (obj)).a()) || !c().equals(((P) (obj)).c()))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return a(b().hashCode() + 779, a()) * 29 + c().hashCode();
    }

    public final String toString()
    {
        return y.a(this);
    }
}
