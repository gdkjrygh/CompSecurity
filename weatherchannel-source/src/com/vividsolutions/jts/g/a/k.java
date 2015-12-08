// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.a;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.b.b;
import com.vividsolutions.jts.b.d;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.g.a:
//            e

public final class k
{
    final class a
        implements Comparable
    {

        private m a;
        private int b;

        static int a(a a1)
        {
            return a1.b;
        }

        public final int compareTo(Object obj)
        {
            Object obj1 = (a)obj;
            int j = a.a(((a) (obj1)).a);
            int i = j;
            if (j == 0)
            {
                i = ((a) (obj1)).a.a(a) * -1;
            }
            if (i == 0)
            {
                obj = a;
                obj1 = ((a) (obj1)).a;
                int l = ((m) (obj)).a.compareTo(((m) (obj1)).a);
                i = l;
                if (l == 0)
                {
                    return ((m) (obj)).b.compareTo(((m) (obj1)).b);
                }
            }
            return i;
        }

        public a(m m1, int i)
        {
            a = new m(m1);
            b = i;
        }
    }


    private Collection a;
    private m b;

    public k(List list)
    {
        b = new m();
        new com.vividsolutions.jts.a.a();
        a = list;
    }

    private void a(Coordinate coordinate, List list, List list1)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            b b1 = (b)list.next();
            if (b1.g())
            {
                Coordinate acoordinate[] = b1.a().b();
                int i = 0;
                while (i < acoordinate.length - 1) 
                {
                    b.a = acoordinate[i];
                    b.b = acoordinate[i + 1];
                    if (b.a.y > b.b.y)
                    {
                        m m1 = b;
                        Coordinate coordinate1 = m1.a;
                        m1.a = m1.b;
                        m1.b = coordinate1;
                    }
                    if (Math.max(b.a.x, b.b.x) >= coordinate.x)
                    {
                        m m2 = b;
                        int j;
                        if (m2.a.y == m2.b.y)
                        {
                            j = 1;
                        } else
                        {
                            j = 0;
                        }
                        if (j == 0 && coordinate.y >= b.a.y && coordinate.y <= b.b.y && com.vividsolutions.jts.a.a.a(b.a, b.b, coordinate) != -1)
                        {
                            j = b1.a(1);
                            if (!b.a.equals(acoordinate[i]))
                            {
                                j = b1.a(2);
                            }
                            list1.add(new a(b, j));
                        }
                    }
                    i++;
                }
            }
        } while (true);
    }

    public final int a(Coordinate coordinate)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            e e1 = (e)iterator.next();
            h h1 = e1.c();
            if (coordinate.y >= h1.f() && coordinate.y <= h1.g())
            {
                a(coordinate, e1.a(), ((List) (arraylist)));
            }
        } while (true);
        if (arraylist.size() == 0)
        {
            return 0;
        } else
        {
            Collections.sort(arraylist);
            return com.vividsolutions.jts.g.a.a.a((a)arraylist.get(0));
        }
    }
}
