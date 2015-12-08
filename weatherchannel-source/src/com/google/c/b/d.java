// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;


final class d
{

    static int a(int i, String s)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(" cannot be negative but was: ").append(i).toString());
        } else
        {
            return i;
        }
    }

    static void a(Object obj, Object obj1)
    {
        if (obj == null)
        {
            throw new NullPointerException((new StringBuilder()).append("null key in entry: null=").append(obj1).toString());
        }
        if (obj1 == null)
        {
            throw new NullPointerException((new StringBuilder()).append("null value in entry: ").append(obj).append("=null").toString());
        } else
        {
            return;
        }
    }

    static void a(boolean flag)
    {
        com.google.c.a.d.a(flag, "no calls to next() since the last call to remove()");
    }
}
