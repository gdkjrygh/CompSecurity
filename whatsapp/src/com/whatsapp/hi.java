// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            _2

public final class hi
{

    private final boolean a;
    private final boolean b;
    private final int c;

    private hi(int i, boolean flag, boolean flag1)
    {
        c = i;
        b = flag;
        a = flag1;
    }

    hi(int i, boolean flag, boolean flag1, _2 _p2)
    {
        this(i, flag, flag1);
    }

    public int a()
    {
        return c;
    }

    public boolean b()
    {
        return a;
    }

    public boolean c()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (hi)obj;
            if (c != ((hi) (obj)).c || b != ((hi) (obj)).b || a != ((hi) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = 1;
        int k = c;
        int i;
        if (b)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!a)
        {
            j = 0;
        }
        return (i + k * 31) * 31 + j;
    }
}
