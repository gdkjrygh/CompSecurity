// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b.c;

import java.util.Comparator;

// Referenced classes of package org.a.c.b.b.c:
//            j, h

class i
    implements Comparator
{

    final h a;

    i(h h)
    {
        a = h;
        super();
    }

    public int compare(Object obj, Object obj1)
    {
        obj = (j)obj;
        obj1 = (j)obj1;
        if (((j) (obj)).a != ((j) (obj1)).a)
        {
            return ((j) (obj)).a - ((j) (obj1)).a;
        } else
        {
            return ((j) (obj)).c() - ((j) (obj1)).c();
        }
    }
}
