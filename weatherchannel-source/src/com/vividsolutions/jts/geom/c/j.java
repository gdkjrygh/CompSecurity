// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom.c;

import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.l;
import java.util.ArrayList;
import java.util.List;

public final class j
    implements l
{

    private List a;

    private j(List list)
    {
        a = list;
    }

    public static List b(i k)
    {
        ArrayList arraylist = new ArrayList();
        if (k instanceof Polygon)
        {
            arraylist.add(k);
        } else
        if (k instanceof com.vividsolutions.jts.geom.j)
        {
            k.apply$6f9a9d12(new j(arraylist));
            return arraylist;
        }
        return arraylist;
    }

    public final void a(i k)
    {
        if (k instanceof Polygon)
        {
            a.add(k);
        }
    }
}
