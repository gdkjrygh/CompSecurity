// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.ads.interactivemedia.v3.a.c.a;
import com.google.ads.interactivemedia.v3.a.f;
import com.google.ads.interactivemedia.v3.a.w;
import com.google.ads.interactivemedia.v3.a.x;

// Referenced classes of package com.google.b:
//            a

public class c
    implements x
{

    public c()
    {
    }

    public w a(f f1, a a1)
    {
        a1 = a1.a();
        com.google.b.a a2 = (com.google.b.a)a1.getAnnotation(com/google/b/a);
        if (a2 == null || a1 == a2.a())
        {
            return null;
        } else
        {
            return f1.a(a2.a());
        }
    }
}
