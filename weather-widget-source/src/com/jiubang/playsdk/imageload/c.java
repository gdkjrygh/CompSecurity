// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.imageload;

import com.jiubang.playsdk.j;

// Referenced classes of package com.jiubang.playsdk.imageload:
//            b, d

public class c
{

    private static c a;
    private d b;
    private b c;

    public c()
    {
        c = new b();
        b = new d(j.a(), c);
    }

    public static c a()
    {
        if (a == null)
        {
            a = new c();
        }
        return a;
    }

    public d b()
    {
        return b;
    }
}
