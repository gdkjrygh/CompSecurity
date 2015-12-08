// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a.a;


public class b
{

    private int a;
    private Object b;

    public b(int i, Object obj)
    {
        a = -1;
        b = null;
        a = i;
        b = obj;
        c();
    }

    private void c()
    {
        if ((a == 3 || a == 0) && !(b instanceof Boolean))
        {
            throw new IllegalArgumentException("Immediately argument must be 'true' or 'false'");
        }
        if ((a == 2 || a == 1) && !(b instanceof String))
        {
            throw new IllegalArgumentException("Position or ABTest argument type must be String");
        } else
        {
            return;
        }
    }

    public int a()
    {
        return a;
    }

    public Object b()
    {
        return b;
    }
}
