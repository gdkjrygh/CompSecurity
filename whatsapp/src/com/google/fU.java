// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.List;

// Referenced classes of package com.google:
//            gh, d6

public final class fU
{

    public static boolean b;
    private final d6 a;
    private final List c;

    public fU(d6 d6, List list)
    {
        boolean flag = b;
        super();
        a = d6;
        c = list;
        if (gh.a != 0)
        {
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            b = flag;
        }
    }

    public List a()
    {
        return c;
    }

    public d6 b()
    {
        return a;
    }
}
