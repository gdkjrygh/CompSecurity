// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom.c;

import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class c
{

    private GeometryFactory a;
    private boolean b;
    private Collection c;

    private c(Collection collection)
    {
        b = false;
        GeometryFactory geometryfactory;
        if (collection.isEmpty())
        {
            geometryfactory = null;
        } else
        {
            geometryfactory = ((i)collection.iterator().next()).getFactory();
        }
        a = geometryfactory;
        c = collection;
    }

    private i a()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = c.iterator(); iterator.hasNext(); a((i)iterator.next(), ((List) (arraylist)))) { }
        if (arraylist.size() == 0)
        {
            if (a != null)
            {
                return a.createGeometryCollection(null);
            } else
            {
                return null;
            }
        } else
        {
            return a.buildGeometry(arraylist);
        }
    }

    public static i a(i j, i k)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(j);
        arraylist.add(k);
        return (new c(arraylist)).a();
    }

    public static i a(Collection collection)
    {
        return (new c(collection)).a();
    }

    private void a(i j, List list)
    {
        if (j != null)
        {
            int k = 0;
            while (k < j.getNumGeometries()) 
            {
                list.add(j.getGeometryN(k));
                k++;
            }
        }
    }
}
