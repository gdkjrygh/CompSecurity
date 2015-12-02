// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            fw, bV, gh

final class ec
{

    private final int a;
    private final int b;

    ec(int i, int j)
    {
        b = i;
        a = j;
    }

    int a()
    {
        return b;
    }

    int b()
    {
        return a;
    }

    fw c()
    {
        return new fw(a(), b());
    }

    public String toString()
    {
        int i = bV.a;
        String s = (new StringBuilder()).append("<").append(b).append(' ').append(a).append('>').toString();
        if (gh.a != 0)
        {
            bV.a = i + 1;
        }
        return s;
    }
}
