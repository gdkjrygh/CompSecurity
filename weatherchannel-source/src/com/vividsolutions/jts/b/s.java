// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.b;

import com.vividsolutions.jts.a.a;

public final class s
{

    int a[];

    public s(int i)
    {
        c(1);
        a[0] = i;
    }

    public s(int i, int j, int k)
    {
        c(3);
        a[0] = i;
        a[1] = j;
        a[2] = k;
    }

    public s(s s1)
    {
        c(s1.a.length);
        if (s1 != null)
        {
            for (int i = 0; i < a.length; i++)
            {
                a[i] = s1.a[i];
            }

        }
    }

    private void c(int i)
    {
        a = new int[i];
        b(-1);
    }

    public final int a(int i)
    {
        if (i < a.length)
        {
            return a[i];
        } else
        {
            return -1;
        }
    }

    public final boolean a()
    {
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] != -1)
            {
                return false;
            }
        }

        return true;
    }

    public final void b(int i)
    {
        for (int j = 0; j < a.length; j++)
        {
            a[j] = i;
        }

    }

    public final boolean b()
    {
        return a.length > 1;
    }

    public final void c()
    {
        if (a.length <= 1)
        {
            return;
        } else
        {
            int i = a[1];
            a[1] = a[2];
            a[2] = i;
            return;
        }
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (a.length > 1)
        {
            stringbuffer.append(com.vividsolutions.jts.a.a.a(a[1]));
        }
        stringbuffer.append(com.vividsolutions.jts.a.a.a(a[0]));
        if (a.length > 1)
        {
            stringbuffer.append(com.vividsolutions.jts.a.a.a(a[2]));
        }
        return stringbuffer.toString();
    }
}
