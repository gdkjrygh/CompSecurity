// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            bU, gh, fw, b1

final class fV
{

    private final int a;
    private final fw b;
    private final fw c;

    private fV(fw fw, fw fw1, int i)
    {
        c = fw;
        b = fw1;
        a = i;
    }

    fV(fw fw, fw fw1, int i, b1 b1)
    {
        this(fw, fw1, i);
    }

    fw a()
    {
        return c;
    }

    fw b()
    {
        return b;
    }

    public int c()
    {
        return a;
    }

    public String toString()
    {
        boolean flag = bU.b;
        String s = (new StringBuilder()).append(c).append("/").append(b).append('/').append(a).toString();
        if (gh.a != 0)
        {
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            bU.b = flag;
        }
        return s;
    }
}
