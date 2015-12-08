// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom.c;

import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.j;
import com.vividsolutions.jts.geom.l;
import java.util.List;

public final class e
    implements l
{

    private Class a;
    private List b;

    private e(Class class1, List list)
    {
        a = class1;
        b = list;
    }

    public static List a(i k, Class class1, List list)
    {
        if (a(k, class1))
        {
            list.add(k);
        } else
        if (k instanceof j)
        {
            k.apply$6f9a9d12(new e(class1, list));
            return list;
        }
        return list;
    }

    private static boolean a(Object obj, Class class1)
    {
        return class1.isAssignableFrom(obj.getClass());
    }

    public final void a(i k)
    {
        if (a == null || a(k, a))
        {
            b.add(k);
        }
    }
}
