// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom.c;

import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.j;
import com.vividsolutions.jts.geom.l;
import java.util.ArrayList;
import java.util.List;

public final class i
    implements l
{

    private List a;

    private i(List list)
    {
        a = list;
    }

    public static List b(com.vividsolutions.jts.geom.i k)
    {
        ArrayList arraylist = new ArrayList();
        if (k instanceof Point)
        {
            arraylist.add(k);
        } else
        if (k instanceof j)
        {
            k.apply$6f9a9d12(new i(arraylist));
            return arraylist;
        }
        return arraylist;
    }

    public final void a(com.vividsolutions.jts.geom.i k)
    {
        if (k instanceof Point)
        {
            a.add(k);
        }
    }
}
