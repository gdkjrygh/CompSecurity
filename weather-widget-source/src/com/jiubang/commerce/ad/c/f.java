// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.c;

import com.jiubang.commerce.database.a.d;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jiubang.commerce.ad.c:
//            e

class f
    implements Runnable
{

    final String a;
    final e b;

    f(e e1, String s)
    {
        b = e1;
        a = s;
        super();
    }

    public void run()
    {
        ArrayList arraylist = new ArrayList();
        d d1 = new d();
        d1.a(a);
        d1.a(System.currentTimeMillis());
        arraylist.add(d1);
        e.a(b).a(arraylist);
    }
}
