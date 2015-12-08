// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.b;

import com.vividsolutions.jts.f.a;
import com.vividsolutions.jts.f.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.vividsolutions.jts.b:
//            d

public final class j
{

    private b a;

    private j(Collection collection)
    {
        a = new b(b(collection));
    }

    public static void a(Collection collection)
    {
        (new j(collection)).a.a();
    }

    private static Collection b(Collection collection)
    {
        ArrayList arraylist = new ArrayList();
        d d1;
        for (collection = collection.iterator(); collection.hasNext(); arraylist.add(new a(d1.a, d1)))
        {
            d1 = (d)collection.next();
        }

        return arraylist;
    }
}
