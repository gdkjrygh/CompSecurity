// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a;

import com.gau.go.a.a.c;
import com.gau.go.a.c.h;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.gau.go.a:
//            e

class q
    implements Runnable
{

    final String a;
    final e b;

    q(e e1, String s)
    {
        b = e1;
        a = s;
        super();
    }

    public void run()
    {
        Object obj = e.f(b).a(a);
        if (obj != null && ((LinkedList) (obj)).size() > 0)
        {
            c c1;
            for (obj = ((LinkedList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); e.a(b, c1))
            {
                c1 = (c)((Iterator) (obj)).next();
            }

            e.e(b, false);
        }
    }
}
