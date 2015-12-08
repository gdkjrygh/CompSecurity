// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom.c;

import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.l;
import com.vividsolutions.jts.geom.n;
import com.vividsolutions.jts.geom.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class h
    implements l
{

    private Collection a;
    private boolean b;

    private h(Collection collection, boolean flag)
    {
        b = false;
        a = collection;
        b = flag;
    }

    public static List b(i j)
    {
        ArrayList arraylist = new ArrayList();
        j.apply(new h(arraylist, false));
        return arraylist;
    }

    public final void a(i j)
    {
        if (b && (j instanceof p))
        {
            j = j.getFactory().createLineString(((p)j).a());
            a.add(j);
        } else
        if (j instanceof n)
        {
            a.add(j);
            return;
        }
    }
}
