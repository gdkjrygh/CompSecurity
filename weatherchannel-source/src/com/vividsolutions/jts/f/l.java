// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.f;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.a;
import com.vividsolutions.jts.i.b;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.f:
//            j, r, i

public final class l
    implements j
{

    private j a;
    private double b;
    private boolean c;

    public l(j j1, double d)
    {
        this(j1, d, (byte)0);
    }

    private l(j j1, double d, byte byte0)
    {
        boolean flag = true;
        super();
        c = false;
        a = j1;
        b = d;
        if (b == 1.0D)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        if (byte0 != 0)
        {
            flag = false;
        }
        c = flag;
    }

    static Coordinate[] a(l l1, Coordinate acoordinate[])
    {
        Coordinate acoordinate1[] = new Coordinate[acoordinate.length];
        for (int i = 0; i < acoordinate.length; i++)
        {
            acoordinate1[i] = new Coordinate(Math.round(acoordinate[i].x * l1.b), Math.round(acoordinate[i].y * l1.b), acoordinate[i].z);
        }

        return com.vividsolutions.jts.geom.a.b(acoordinate1);
    }

    static void b(l l1, Coordinate acoordinate[])
    {
        if (acoordinate.length == 2)
        {
            new Coordinate(acoordinate[0]);
            new Coordinate(acoordinate[1]);
        }
        for (int i = 0; i < acoordinate.length; i++)
        {
            acoordinate[i].x = acoordinate[i].x / l1.b + 0.0D;
            acoordinate[i].y = acoordinate[i].y / l1.b + 0.0D;
        }

        if (acoordinate.length == 2 && acoordinate[0].equals2D(acoordinate[1]))
        {
            System.out.println(acoordinate);
        }
    }

    public final void a(Collection collection)
    {
        Object obj = collection;
        if (c)
        {
            b b1 = new b() {

                private l a;

                public final Object a(Object obj1)
                {
                    obj1 = (r)obj1;
                    return new i(com.vividsolutions.jts.f.l.a(a, ((r) (obj1)).c()), ((r) (obj1)).a());
                }

            
            {
                a = l.this;
                super();
            }
            };
            obj = new ArrayList();
            for (collection = collection.iterator(); collection.hasNext(); ((List) (obj)).add(b1.a(collection.next()))) { }
        }
        a.a(((Collection) (obj)));
    }

    public final Collection b()
    {
        Collection collection = a.b();
        if (c)
        {
            b b1 = new b() {

                private l a;

                public final Object a(Object obj)
                {
                    obj = (r)obj;
                    com.vividsolutions.jts.f.l.b(a, ((r) (obj)).c());
                    return null;
                }

            
            {
                a = l.this;
                super();
            }
            };
            for (Iterator iterator = collection.iterator(); iterator.hasNext(); b1.a(iterator.next())) { }
        }
        return collection;
    }
}
