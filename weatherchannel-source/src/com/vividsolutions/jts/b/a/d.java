// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.b.a;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.geom.Coordinate;
import java.util.ArrayList;
import java.util.List;

public final class d
{

    public d()
    {
    }

    private static int a(Coordinate acoordinate[], int i)
    {
        int j = com.vividsolutions.jts.a.a.b(acoordinate[i], acoordinate[i + 1]);
        for (i++; i < acoordinate.length && com.vividsolutions.jts.a.a.b(acoordinate[i - 1], acoordinate[i]) == j; i++) { }
        return i - 1;
    }

    private static int[] a(List list)
    {
        int ai[] = new int[list.size()];
        for (int i = 0; i < ai.length; i++)
        {
            ai[i] = ((Integer)list.get(i)).intValue();
        }

        return ai;
    }

    public final int[] a(Coordinate acoordinate[])
    {
        int i = 0;
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Integer(0));
        int j;
        do
        {
            j = a(acoordinate, i);
            arraylist.add(new Integer(j));
            i = j;
        } while (j < acoordinate.length - 1);
        return a(((List) (arraylist)));
    }
}
