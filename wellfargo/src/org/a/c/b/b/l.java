// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.a.c.a.a.a;
import org.a.c.a.b;
import org.a.c.b.b.a.e;
import org.a.c.b.b.a.j;

// Referenced classes of package org.a.c.b.b:
//            k, c, n, d, 
//            a, i, m, b

public class l extends b
    implements j
{

    private final boolean b = false;

    public l()
    {
    }

    private k a(a a1)
    {
        a a2 = null;
        a1 = a1.a();
        a2 = a1;
        byte byte0 = a("BYTE_ORDER_1", ((InputStream) (a1)), "Not a Valid TIFF File");
        a2 = a1;
        b(byte0, a("BYTE_ORDER_2", ((InputStream) (a1)), "Not a Valid TIFF File"));
        a2 = a1;
        int i1 = c("tiffVersion", a1, "Not a Valid TIFF File");
        if (i1 == 42)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        a2 = a1;
        throw new org.a.c.b((new StringBuilder("Unknown Tiff Version: ")).append(i1).toString());
        a1;
        k k1;
        int j1;
        if (a2 != null)
        {
            try
            {
                a2.close();
            }
            catch (Exception exception)
            {
                org.a.c.c.a.a(exception);
            }
        }
        throw a1;
        a2 = a1;
        j1 = b("offsetToFirstIFD", a1, "Not a Valid TIFF File");
        a2 = a1;
        a(((InputStream) (a1)), j1 - 8, "Not a Valid TIFF File: couldn't find IFDs");
        a2 = a1;
        if (!a_)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        a2 = a1;
        System.out.println("");
        a2 = a1;
        k1 = new k(byte0, i1, j1);
        if (a1 != null)
        {
            try
            {
                a1.close();
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                org.a.c.c.a.a(a1);
                return k1;
            }
        }
        return k1;
    }

    private boolean a(a a1, int i1, int j1, org.a.c.a a2, n n1, List list)
    {
        return a(a1, i1, j1, a2, n1, false, list);
    }

    private boolean a(a a1, int i1, int j1, org.a.c.a a2, n n1, boolean flag, List list)
    {
        ArrayList arraylist;
        Integer integer = new Integer(i1);
        if (list.contains(integer))
        {
            return false;
        }
        list.add(integer);
        arraylist = null;
        InputStream inputstream = a1.a();
        long l3;
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        l3 = i1;
        inputstream.skip(l3);
        arraylist = new ArrayList();
        l3 = i1;
        long l4 = a1.b();
        if (l3 >= l4)
        {
            if (inputstream != null)
            {
                try
                {
                    inputstream.close();
                }
                // Misplaced declaration of an exception variable
                catch (a a1)
                {
                    org.a.c.c.a.a(a1);
                }
            }
            return true;
        }
        int i2 = c("DirectoryEntryCount", inputstream, "Not a Valid TIFF File");
        int l1 = 0;
_L5:
        if (l1 < i2) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = new c(j1, arraylist, i1, b("nextDirectoryOffset", inputstream, "Not a Valid TIFF File"));
        if (!n1.a() || !((c) (obj)).b())
        {
            break MISSING_BLOCK_LABEL_236;
        }
        d d1 = ((c) (obj)).c();
        i2 = d1.d;
        l1 = d1.e;
        i1 = l1;
        if ((long)(i2 + l1) == a1.b() + 1L)
        {
            i1 = l1 - 1;
        }
        ((c) (obj)).a(new org.a.c.b.b.a(i2, i1, a1.b(i2, i1)));
        boolean flag1 = n1.a(((c) (obj)));
        if (!flag1)
        {
            int k2;
            int l2;
            int i3;
            int j3;
            if (inputstream != null)
            {
                try
                {
                    inputstream.close();
                }
                // Misplaced declaration of an exception variable
                catch (a a1)
                {
                    org.a.c.c.a.a(a1);
                }
            }
            return true;
        }
          goto _L3
        a1;
        if (b)
        {
            throw a1;
        }
          goto _L4
        a1;
        a2 = inputstream;
_L10:
        ArrayList arraylist1;
        i k1;
        int j2;
        if (a2 != null)
        {
            try
            {
                a2.close();
            }
            // Misplaced declaration of an exception variable
            catch (org.a.c.a a2)
            {
                org.a.c.c.a.a(a2);
            }
        }
        throw a1;
_L4:
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                org.a.c.c.a.a(a1);
            }
        }
        return true;
_L2:
        k2 = c("Tag", inputstream, "Not a Valid TIFF File");
        l2 = c("Type", inputstream, "Not a Valid TIFF File");
        i3 = b("Length", inputstream, "Not a Valid TIFF File");
        obj = a("ValueOffset", 4, inputstream, "Not a Valid TIFF File");
        j3 = b("ValueOffset", ((byte []) (obj)));
        if (k2 == 0)
        {
            break MISSING_BLOCK_LABEL_430;
        }
        obj = new i(k2, j1, l2, i3, j3, ((byte []) (obj)), b());
        ((i) (obj)).a(l1);
        ((i) (obj)).a(a1);
        arraylist.add(obj);
        n1.a(((i) (obj)));
        l1++;
          goto _L5
_L3:
        n1.b();
        arraylist1 = new ArrayList();
        l1 = 0;
_L11:
        if (l1 < arraylist.size())
        {
            break MISSING_BLOCK_LABEL_530;
        }
        arraylist.removeAll(arraylist1);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_518;
        }
        if (((c) (obj)).c > 0)
        {
            a(a1, ((c) (obj)).c, j1 + 1, a2, n1, list);
        }
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                org.a.c.c.a.a(a1);
            }
        }
        return true;
        k1 = (i)arraylist.get(l1);
        if (k1.c != j.co.b && k1.c != j.cw.b && k1.c != j.dz.b)
        {
            break MISSING_BLOCK_LABEL_721;
        }
        j2 = ((Number)k1.c()).intValue();
        if (k1.c != j.co.b) goto _L7; else goto _L6
_L6:
        i1 = -2;
_L9:
        if (!a(a1, j2, i1, a2, n1, true, list))
        {
            arraylist1.add(k1);
        }
        break MISSING_BLOCK_LABEL_721;
_L7:
        if (k1.c == j.cw.b)
        {
            i1 = -3;
            continue; /* Loop/switch isn't completed */
        }
        if (k1.c != j.dz.b)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = -4;
        if (true) goto _L9; else goto _L8
_L8:
        throw new org.a.c.b("Unknown subdirectory type.");
        a1;
        a2 = arraylist;
          goto _L10
        l1++;
          goto _L11
    }

    public final org.a.c.b.b.b a(a a1, org.a.c.a a2)
    {
        m m1 = new m((byte)0);
        k k1 = a(a1);
        m1.a(k1);
        a(a1, k1.c, 0, a2, ((n) (m1)), ((List) (new ArrayList())));
        return m1.c();
    }
}
