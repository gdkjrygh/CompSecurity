// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.ads.interactivemedia.v3.a.c;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.b:
//            a

public class b
    implements com.google.ads.interactivemedia.v3.a.b
{

    public b()
    {
    }

    public boolean a(c c1)
    {
        a a1 = (a)c1.a().getAnnotation(com/google/b/a);
        return a1 != null && Arrays.asList(a1.b()).contains(c1.b());
    }

    public boolean a(Class class1)
    {
        return false;
    }
}
