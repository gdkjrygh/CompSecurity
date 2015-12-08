// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.f;

import com.vividsolutions.jts.a.k;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.a.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.f:
//            r, p

public final class i
    implements r
{

    private p a;
    private Coordinate b[];
    private Object c;

    public i(Coordinate acoordinate[], Object obj)
    {
        a = new p(this);
        b = acoordinate;
        c = obj;
    }

    public static List a(Collection collection)
    {
        ArrayList arraylist = new ArrayList();
        a(collection, ((Collection) (arraylist)));
        return arraylist;
    }

    private static void a(Collection collection, Collection collection1)
    {
        for (collection = collection.iterator(); collection.hasNext(); ((i)collection.next()).a.a(collection1)) { }
    }

    public final Coordinate a(int j)
    {
        return b[j];
    }

    public final Object a()
    {
        return c;
    }

    public final void a(k k1, int j, int l)
    {
        for (l = 0; l < k1.b(); l++)
        {
            a(new Coordinate(k1.a(l)), j);
        }

    }

    public final void a(Coordinate coordinate, int j)
    {
        int i1 = j + 1;
        int l = j;
        if (i1 < b.length)
        {
            l = j;
            if (coordinate.equals2D(b[i1]))
            {
                l = i1;
            }
        }
        a.a(coordinate, l);
    }

    public final int b()
    {
        return b.length;
    }

    public final int b(int j)
    {
        boolean flag = false;
        if (j == b.length - 1)
        {
            j = -1;
        } else
        {
            Coordinate coordinate = b[j];
            Coordinate coordinate1 = b[j + 1];
            j = ((flag) ? 1 : 0);
            if (!coordinate.equals2D(coordinate1))
            {
                double d1 = coordinate1.x - coordinate.x;
                double d2 = coordinate1.y - coordinate.y;
                if (d1 == 0.0D && d2 == 0.0D)
                {
                    throw new IllegalArgumentException((new StringBuilder("Cannot compute the octant for two identical points ")).append(coordinate).toString());
                }
                if (d1 == 0.0D && d2 == 0.0D)
                {
                    throw new IllegalArgumentException((new StringBuilder("Cannot compute the octant for point ( ")).append(d1).append(", ").append(d2).append(" )").toString());
                }
                double d3 = Math.abs(d1);
                double d4 = Math.abs(d2);
                if (d1 >= 0.0D)
                {
                    if (d2 >= 0.0D)
                    {
                        j = ((flag) ? 1 : 0);
                        if (d3 < d4)
                        {
                            return 1;
                        }
                    } else
                    {
                        return d3 < d4 ? 6 : 7;
                    }
                } else
                {
                    if (d2 >= 0.0D)
                    {
                        return d3 < d4 ? 2 : 3;
                    }
                    return d3 < d4 ? 5 : 4;
                }
            }
        }
        return j;
    }

    public final Coordinate[] c()
    {
        return b;
    }

    public final boolean d()
    {
        return b[0].equals(b[b.length - 1]);
    }

    public final String toString()
    {
        return com.vividsolutions.jts.d.i.a(new a(b));
    }
}
