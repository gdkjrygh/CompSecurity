// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom.c;

import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.l;
import com.vividsolutions.jts.geom.n;
import java.util.ArrayList;
import java.util.List;

public final class a
    implements l
{

    private List a;

    private a(List list)
    {
        a = list;
    }

    public static List b(i j)
    {
        ArrayList arraylist = new ArrayList();
        j.apply(new a(arraylist));
        return arraylist;
    }

    public final void a(i j)
    {
        if ((j instanceof n) || (j instanceof Point))
        {
            a.add(j.getCoordinate());
        }
    }
}
