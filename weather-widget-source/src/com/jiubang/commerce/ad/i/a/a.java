// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.i.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jiubang.commerce.ad.i.a:
//            b

public class a
{

    private List a;

    public a()
    {
    }

    public List a()
    {
        return a;
    }

    public void a(String s, List list)
    {
        if (a == null)
        {
            a = new ArrayList();
        }
        if (list != null && !list.isEmpty())
        {
            Object obj;
            for (list = list.iterator(); list.hasNext(); a.add(new b(s, obj)))
            {
                obj = list.next();
            }

        }
    }
}
