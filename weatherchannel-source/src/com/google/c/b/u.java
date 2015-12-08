// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;

import com.google.c.a.c;
import com.google.c.a.d;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.c.b:
//            t

public final class u
{

    static boolean a(List list, Object obj)
    {
        if (obj != d.a(list))
        {
            if (!(obj instanceof List))
            {
                return false;
            }
            obj = (List)obj;
            if (list.size() != ((List) (obj)).size() || !t.a(list.iterator(), ((List) (obj)).iterator()))
            {
                return false;
            }
        }
        return true;
    }

    static int b(List list, Object obj)
    {
        for (list = list.listIterator(); list.hasNext();)
        {
            if (com.google.c.a.c.a(obj, list.next()))
            {
                return list.previousIndex();
            }
        }

        return -1;
    }

    static int c(List list, Object obj)
    {
        for (list = list.listIterator(list.size()); list.hasPrevious();)
        {
            if (com.google.c.a.c.a(obj, list.previous()))
            {
                return list.nextIndex();
            }
        }

        return -1;
    }
}
