// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b.c;

import java.util.ArrayList;
import java.util.List;
import org.a.c.b.b.a.j;
import org.a.c.c;

// Referenced classes of package org.a.c.b.b.c:
//            h, j, n

public final class m
    implements j
{

    private static final String c = System.getProperty("line.separator");
    public final int a;
    private final ArrayList b;

    public m()
    {
        this(73);
    }

    public m(int i)
    {
        b = new ArrayList();
        a = i;
    }

    private h a(int i)
    {
        int k = 0;
_L6:
        if (k < b.size()) goto _L2; else goto _L1
_L1:
        h h1 = null;
_L4:
        return h1;
_L2:
        h h2;
        h2 = (h)b.get(k);
        h1 = h2;
        if (h2.a == i) goto _L4; else goto _L3
_L3:
        k++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(h h1)
    {
        if (a(h1.a) != null)
        {
            throw new c("Output set already contains a directory of that type.");
        } else
        {
            b.add(h1);
            return;
        }
    }

    public final List a()
    {
        return new ArrayList(b);
    }

    protected final List a(n n)
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
        do
        {
            if (i >= b.size())
            {
                return arraylist;
            }
            arraylist.addAll(((h)b.get(i)).a(n));
            i++;
        } while (true);
    }

    public final h b()
    {
        return a(0);
    }

    public final h c()
    {
        if (a(0) == null)
        {
            a(new h(0));
        }
        h h1 = a(-2);
        if (h1 != null)
        {
            return h1;
        } else
        {
            return d();
        }
    }

    public final h d()
    {
        h h1 = new h(-2);
        a(h1);
        return h1;
    }

    public final String toString()
    {
        StringBuffer stringbuffer;
        int i;
        stringbuffer = new StringBuffer();
        stringbuffer.append("");
        stringbuffer.append("TiffOutputSet {");
        stringbuffer.append(c);
        stringbuffer.append("");
        stringbuffer.append((new StringBuilder("byteOrder: ")).append(a).toString());
        stringbuffer.append(c);
        i = 0;
_L2:
        if (i >= b.size())
        {
            stringbuffer.append("");
            stringbuffer.append("}");
            stringbuffer.append(c);
            return stringbuffer.toString();
        }
        Object obj = (h)b.get(i);
        stringbuffer.append("");
        stringbuffer.append((new StringBuilder("\tdirectory ")).append(i).append(": ").append(((h) (obj)).b()).append(" (").append(((h) (obj)).a).append(")").toString());
        stringbuffer.append(c);
        obj = ((h) (obj)).a();
        int k = 0;
        do
        {
label0:
            {
                if (k < ((ArrayList) (obj)).size())
                {
                    break label0;
                }
                i++;
            }
            if (true)
            {
                continue;
            }
            org.a.c.b.b.c.j j1 = (org.a.c.b.b.c.j)((ArrayList) (obj)).get(k);
            stringbuffer.append("");
            stringbuffer.append((new StringBuilder("\t\tfield ")).append(i).append(": ").append(j1.b).toString());
            stringbuffer.append(c);
            k++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

}
