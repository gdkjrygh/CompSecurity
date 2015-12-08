// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b.c;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.a.c.b.b.a.e;
import org.a.c.b.b.a.j;
import org.a.c.c;

// Referenced classes of package org.a.c.b.b.c:
//            m, h, j, n

public abstract class b
    implements j
{

    protected final int a;

    public b()
    {
        a = 73;
    }

    public b(int i)
    {
        a = i;
    }

    protected final n a(m m1)
    {
        Object obj;
        Object obj1;
        Object obj2;
        org.a.c.b.b.c.j j1;
        org.a.c.b.b.c.j j2;
        org.a.c.b.b.c.j j3;
        Object obj7;
        ArrayList arraylist;
        List list;
        int i;
        list = m1.a();
        if (1 > list.size())
        {
            throw new c("No directories.");
        }
        obj2 = null;
        j2 = null;
        j3 = null;
        j1 = null;
        arraylist = new ArrayList();
        obj7 = new HashMap();
        obj = null;
        obj1 = null;
        i = 0;
_L10:
        Object obj3;
        Object obj5;
        int l;
        if (i >= list.size())
        {
            if (arraylist.size() <= 0)
            {
                throw new c("Missing root directory.");
            }
            break MISSING_BLOCK_LABEL_620;
        }
        obj3 = (h)list.get(i);
        l = ((h) (obj3)).a;
        obj5 = new Integer(l);
        ((Map) (obj7)).put(obj5, obj3);
        if (l >= 0) goto _L2; else goto _L1
_L1:
        l;
        JVM INSTR tableswitch -4 -2: default 172
    //                   -4 302
    //                   -3 270
    //                   -2 197;
           goto _L3 _L4 _L5 _L6
_L3:
        throw new c((new StringBuilder("Unknown directory: ")).append(l).toString());
_L6:
        if (obj != null)
        {
            throw new c("More than one EXIF directory.");
        }
        obj5 = obj3;
        obj = obj2;
        obj2 = obj5;
_L7:
        HashSet hashset;
        ArrayList arraylist1;
        hashset = new HashSet();
        arraylist1 = ((h) (obj3)).a();
        l = 0;
_L8:
        if (l >= arraylist1.size())
        {
            i++;
            obj3 = obj2;
            obj2 = obj;
            obj = obj3;
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_394;
_L5:
        if (obj1 != null)
        {
            throw new c("More than one GPS directory.");
        }
        obj1 = obj2;
        obj2 = obj;
        obj5 = obj3;
        obj = obj1;
        obj1 = obj5;
          goto _L7
_L4:
        if (obj2 != null)
        {
            throw new c("More than one Interoperability directory.");
        }
        obj2 = obj;
        obj = obj3;
          goto _L7
_L2:
        if (arraylist.contains(obj5))
        {
            throw new c((new StringBuilder("More than one directory with index: ")).append(l).append(".").toString());
        }
        arraylist.add(new Integer(l));
        obj5 = obj;
        obj = obj2;
        obj2 = obj5;
          goto _L7
        Object obj4 = (org.a.c.b.b.c.j)arraylist1.get(l);
        Object obj6 = new Integer(((org.a.c.b.b.c.j) (obj4)).a);
        if (hashset.contains(obj6))
        {
            throw new c((new StringBuilder("Tag (")).append(((org.a.c.b.b.c.j) (obj4)).b.a()).append(") appears twice in directory.").toString());
        }
        hashset.add(obj6);
        int k;
        if (((org.a.c.b.b.c.j) (obj4)).a == co.b)
        {
            if (j2 != null)
            {
                throw new c("More than one Exif directory offset field.");
            }
            j2 = j3;
            j3 = ((org.a.c.b.b.c.j) (obj4));
        } else
        if (((org.a.c.b.b.c.j) (obj4)).a == dz.b)
        {
            if (j1 != null)
            {
                throw new c("More than one Interoperability directory offset field.");
            }
            obj6 = j2;
            j1 = ((org.a.c.b.b.c.j) (obj4));
            j2 = j3;
            j3 = ((org.a.c.b.b.c.j) (obj6));
        } else
        if (((org.a.c.b.b.c.j) (obj4)).a == cw.b)
        {
            if (j3 != null)
            {
                throw new c("More than one GPS directory offset field.");
            }
            j3 = j2;
            j2 = ((org.a.c.b.b.c.j) (obj4));
        } else
        {
            org.a.c.b.b.c.j j4 = j2;
            j2 = j3;
            j3 = j4;
        }
        l++;
        obj4 = j3;
        j3 = j2;
        j2 = ((org.a.c.b.b.c.j) (obj4));
          goto _L8
        Collections.sort(arraylist);
        obj4 = null;
        k = 0;
        do
        {
            if (k >= arraylist.size())
            {
                obj6 = (h)((Map) (obj7)).get(new Integer(0));
                obj7 = new n(a, ((h) (obj6)), ((Map) (obj7)));
                if (obj2 == null && j1 != null)
                {
                    throw new c("Output set has Interoperability Directory Offset field, but no Interoperability Directory");
                }
                break;
            }
            obj6 = (Integer)arraylist.get(k);
            if (((Integer) (obj6)).intValue() != k)
            {
                throw new c((new StringBuilder("Missing directory: ")).append(k).append(".").toString());
            }
            obj6 = (h)((Map) (obj7)).get(obj6);
            if (obj4 != null)
            {
                ((h) (obj4)).a(((h) (obj6)));
            }
            k++;
            obj4 = obj6;
        } while (true);
        obj4 = obj;
        if (obj2 != null)
        {
            obj4 = obj;
            if (obj == null)
            {
                obj4 = m1.d();
            }
            m1 = j1;
            if (j1 == null)
            {
                m1 = j.a(dz, a);
                ((h) (obj4)).a(m1);
            }
            ((n) (obj7)).a(((k) (obj2)), m1);
        }
        if (obj4 == null && j2 != null)
        {
            throw new c("Output set has Exif Directory Offset field, but no Exif Directory");
        }
        if (obj4 != null)
        {
            m1 = j2;
            if (j2 == null)
            {
                m1 = j.a(co, a);
                ((h) (obj6)).a(m1);
            }
            ((n) (obj7)).a(((k) (obj4)), m1);
        }
        if (obj1 == null && j3 != null)
        {
            throw new c("Output set has GPS Directory Offset field, but no GPS Directory");
        }
        if (obj1 != null)
        {
            m1 = j3;
            if (j3 == null)
            {
                m1 = j.a(cw, a);
                ((h) (obj6)).a(m1);
            }
            ((n) (obj7)).a(((k) (obj1)), m1);
        }
        return ((n) (obj7));
        if (true) goto _L10; else goto _L9
_L9:
    }

    public abstract void a(OutputStream outputstream, m m1);

    protected final void a(org.a.c.a.c c1)
    {
        a(c1, 8);
    }

    protected final void a(org.a.c.a.c c1, int i)
    {
        c1.write(a);
        c1.write(a);
        c1.b(42);
        c1.a(i);
    }
}
