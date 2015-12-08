// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.d;

import a.a.a.a;
import a.a.a.c.e;
import a.a.a.d;
import a.a.a.f;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package a.a.a.d:
//            h, e, j, c

public class g
{

    public static boolean a;
    public static boolean b;
    private StringBuilder c;
    private StringBuilder d;
    private final List e;
    private final List f;
    private final a g;
    private final String h;
    private Integer i;
    private Integer j;

    protected g(a a1)
    {
        this(a1, "T");
    }

    protected g(a a1, String s)
    {
        g = a1;
        h = s;
        f = new ArrayList();
        e = new ArrayList();
    }

    public static g a(a a1)
    {
        return new g(a1);
    }

    private transient void a(String s, a.a.a.g ag[])
    {
        int l = ag.length;
        int k = 0;
        do
        {
            if (k >= l)
            {
                return;
            }
            a.a.a.g g1 = ag[k];
            d();
            a(c, g1);
            if (java/lang/String.equals(g1.b))
            {
                c.append(" COLLATE LOCALIZED");
            }
            c.append(s);
            k++;
        } while (true);
    }

    private void a(StringBuilder stringbuilder, String s)
    {
        f.clear();
        if (e.isEmpty()) goto _L2; else goto _L1
_L1:
        ListIterator listiterator;
        stringbuilder.append(" WHERE ");
        listiterator = e.listIterator();
_L5:
        if (listiterator.hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        if (listiterator.hasPrevious())
        {
            stringbuilder.append(" AND ");
        }
        h h1 = (h)listiterator.next();
        h1.a(stringbuilder, s);
        h1.a(f);
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void d()
    {
        if (c == null)
        {
            c = new StringBuilder();
        } else
        if (c.length() > 0)
        {
            c.append(",");
            return;
        }
    }

    public a.a.a.d.e a()
    {
        int l = -1;
        Object obj;
        int k;
        if (d == null || d.length() == 0)
        {
            obj = a.a.a.f.a(g).e();
        } else
        {
            obj = a.a.a.c.e.b(g.getTablename(), h, g.getAllColumns());
        }
        obj = new StringBuilder(((String) (obj)));
        a(((StringBuilder) (obj)), h);
        if (c != null && c.length() > 0)
        {
            ((StringBuilder) (obj)).append(" ORDER BY ").append(c);
        }
        if (i != null)
        {
            ((StringBuilder) (obj)).append(" LIMIT ?");
            f.add(i);
            k = f.size() - 1;
        } else
        {
            k = -1;
        }
        if (j != null)
        {
            if (i == null)
            {
                throw new IllegalStateException("Offset cannot be set without limit");
            }
            ((StringBuilder) (obj)).append(" OFFSET ?");
            f.add(j);
            l = f.size() - 1;
        }
        obj = ((StringBuilder) (obj)).toString();
        if (a)
        {
            a.a.a.e.a((new StringBuilder("Built SQL for query: ")).append(((String) (obj))).toString());
        }
        if (b)
        {
            a.a.a.e.a((new StringBuilder("Values for query: ")).append(f).toString());
        }
        return a.a.a.d.e.a(g, ((String) (obj)), f.toArray(), k, l);
    }

    public g a(int k)
    {
        i = Integer.valueOf(k);
        return this;
    }

    public transient g a(h h1, h ah[])
    {
        e.add(h1);
        int l = ah.length;
        int k = 0;
        do
        {
            if (k >= l)
            {
                return this;
            }
            h1 = ah[k];
            a(h1);
            e.add(h1);
            k++;
        } while (true);
    }

    public transient g a(a.a.a.g ag[])
    {
        a(" DESC", ag);
        return this;
    }

    protected StringBuilder a(StringBuilder stringbuilder, a.a.a.g g1)
    {
        a(g1);
        stringbuilder.append(h).append('.').append('\'').append(g1.e).append('\'');
        return stringbuilder;
    }

    protected void a(h h1)
    {
        if (h1 instanceof j)
        {
            a(((j)h1).d);
        }
    }

    protected void a(a.a.a.g g1)
    {
        boolean flag = false;
        if (g == null) goto _L2; else goto _L1
_L1:
        a.a.a.g ag[];
        int k;
        int l;
        ag = g.getProperties();
        l = ag.length;
        k = 0;
_L7:
        if (k < l) goto _L4; else goto _L3
_L3:
        k = ((flag) ? 1 : 0);
_L6:
        if (k == 0)
        {
            throw new d((new StringBuilder("Property '")).append(g1.c).append("' is not part of ").append(g).toString());
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (g1 != ag[k])
        {
            break; /* Loop/switch isn't completed */
        }
        k = 1;
        if (true) goto _L6; else goto _L5
_L5:
        k++;
        if (true) goto _L7; else goto _L2
_L2:
    }

    public c b()
    {
        Object obj = new StringBuilder(a.a.a.c.e.a(g.getTablename(), h));
        a(((StringBuilder) (obj)), h);
        obj = ((StringBuilder) (obj)).toString();
        if (a)
        {
            a.a.a.e.a((new StringBuilder("Built SQL for count query: ")).append(((String) (obj))).toString());
        }
        if (b)
        {
            a.a.a.e.a((new StringBuilder("Values for count query: ")).append(f).toString());
        }
        return a.a.a.d.c.a(g, ((String) (obj)), f.toArray());
    }

    public g b(int k)
    {
        j = Integer.valueOf(k);
        return this;
    }

    public List c()
    {
        return a().c();
    }
}
