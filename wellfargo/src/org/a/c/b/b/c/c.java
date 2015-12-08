// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b.c;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.a.c.a;
import org.a.c.b;
import org.a.c.b.b.e;
import org.a.c.b.b.h;
import org.a.c.b.b.i;
import org.a.c.b.b.l;

// Referenced classes of package org.a.c.b.b.c:
//            b, d, e, m, 
//            f, h, k, g, 
//            n

public class c extends org.a.c.b.b.c.b
{

    private static final Comparator c = new d();
    private static final Comparator d = new org.a.c.b.b.c.e();
    private final byte b[];

    public c(int j, byte abyte0[])
    {
        super(j);
        b = abyte0;
    }

    private List a()
    {
        ArrayList arraylist1;
        int j;
        int i1;
        int j1;
        int k1;
        Object obj;
        Object obj1;
        ArrayList arraylist;
        e e1;
        try
        {
            obj = new org.a.c.a.a.b(b);
            a a1 = org.a.c.a.a();
            obj = (new l()).a(((org.a.c.a.a.a) (obj)), a1);
            arraylist = new ArrayList();
            obj = ((org.a.c.b.b.b) (obj)).b;
        }
        catch (b b1)
        {
            throw new org.a.c.c(b1.getMessage(), b1);
        }
        j = 0;
_L13:
        if (j < ((List) (obj)).size()) goto _L2; else goto _L1
_L1:
        Collections.sort(arraylist, e.f);
        arraylist1 = new ArrayList();
        obj = null;
        j = 0;
        i1 = -1;
_L15:
        if (j < arraylist.size()) goto _L4; else goto _L3
_L3:
        if (obj == null) goto _L6; else goto _L5
_L5:
        arraylist1.add(new h(((e) (obj)).d, i1 - ((e) (obj)).d));
        return arraylist1;
_L2:
        obj1 = (org.a.c.b.b.c)((List) (obj)).get(j);
        arraylist.add(obj1);
        arraylist1 = ((org.a.c.b.b.c) (obj1)).a();
        i1 = 0;
_L14:
        if (i1 < arraylist1.size()) goto _L8; else goto _L7
_L7:
        obj1 = ((org.a.c.b.b.c) (obj1)).d();
        if (obj1 == null) goto _L10; else goto _L9
_L9:
        arraylist.add(obj1);
          goto _L10
_L8:
        e1 = ((i)arraylist1.get(i1)).a();
        if (e1 == null) goto _L12; else goto _L11
_L11:
        arraylist.add(e1);
          goto _L12
_L4:
        obj1 = (e)arraylist.get(j);
        j1 = ((e) (obj1)).d;
        k1 = ((e) (obj1)).e;
        if (obj == null)
        {
            obj = obj1;
            break MISSING_BLOCK_LABEL_322;
        }
        if (((e) (obj1)).d - i1 <= 3)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        arraylist1.add(new h(((e) (obj)).d, i1 - ((e) (obj)).d));
        obj = obj1;
        break MISSING_BLOCK_LABEL_322;
_L6:
        return arraylist1;
_L10:
        j++;
          goto _L13
_L12:
        i1++;
          goto _L14
        i1 = j1 + k1;
        j++;
          goto _L15
    }

    private void a(OutputStream outputstream, m m1, List list, List list1, int j)
    {
        boolean flag;
        flag = false;
        org.a.c.b.b.c.h h1 = m1.b();
        m1 = new byte[j];
        System.arraycopy(b, 0, m1, 0, Math.min(b.length, m1.length));
        a(new org.a.c.a.c(new f(m1, 0), a), h1.d());
        j = 0;
_L3:
        if (j < list.size()) goto _L2; else goto _L1
_L1:
        j = ((flag) ? 1 : 0);
_L5:
        if (j >= list1.size())
        {
            outputstream.write(m1);
            return;
        }
        break MISSING_BLOCK_LABEL_165;
_L2:
        e e1;
        int i1;
        e1 = (e)list.get(j);
        i1 = 0;
_L4:
label0:
        {
            if (i1 < e1.e)
            {
                break label0;
            }
            j++;
        }
          goto _L3
        int j1 = e1.d + i1;
        if (j1 < m1.length)
        {
            m1[j1] = 0;
        }
        i1++;
          goto _L4
        list = (k)list1.get(j);
        list.a(new org.a.c.a.c(new f(m1, list.d()), a));
        j++;
          goto _L5
    }

    public final void a(OutputStream outputstream, m m1)
    {
        List list;
        n n1;
        List list1;
        ArrayList arraylist;
        int j;
        list = a();
        j = b.length;
        if (list.size() <= 0)
        {
            throw new org.a.c.c("Couldn't analyze old tiff data.");
        }
        if (list.size() == 1)
        {
            e e1 = (e)list.get(0);
            if (e1.d == 8)
            {
                int i1 = e1.d;
                if (e1.e + i1 + 8 == j)
                {
                    (new g(a)).a(outputstream, m1);
                    return;
                }
            }
        }
        n1 = a(m1);
        list1 = m1.a(n1);
        j = b.length;
        arraylist = new ArrayList(list);
        Collections.sort(arraylist, e.f);
        Collections.reverse(arraylist);
_L5:
        if (arraylist.size() > 0) goto _L2; else goto _L1
_L1:
        ArrayList arraylist1;
        Collections.sort(arraylist, c);
        Collections.reverse(arraylist);
        arraylist1 = new ArrayList(list1);
        Collections.sort(arraylist1, d);
        Collections.reverse(arraylist1);
_L8:
        e e2;
        k k1;
        int j1;
        int l1;
        if (arraylist1.size() <= 0)
        {
            n1.a(a);
            a(outputstream, m1, list, list1, j);
            return;
        }
        k1 = (k)arraylist1.remove(0);
        l1 = k1.c();
        j1 = 0;
        e2 = null;
          goto _L3
_L2:
        if ((e2 = (e)arraylist.get(0)).d + e2.e != j) goto _L1; else goto _L4
_L4:
        j1 = e2.e;
        arraylist.remove(0);
        j -= j1;
          goto _L5
_L3:
        if (j1 < arraylist.size()) goto _L7; else goto _L6
_L6:
        e e3;
        if (e2 == null)
        {
            k1.a(j);
            j += l1;
        } else
        {
            k1.a(e2.d);
            arraylist.remove(e2);
            if (e2.e > l1)
            {
                arraylist.add(new h(e2.d + l1, e2.e - l1));
                Collections.sort(arraylist, c);
                Collections.reverse(arraylist);
            }
        }
          goto _L8
_L7:
        if ((e3 = (e)arraylist.get(j1)).e < l1) goto _L6; else goto _L9
_L9:
        j1++;
        e2 = e3;
          goto _L3
    }

}
