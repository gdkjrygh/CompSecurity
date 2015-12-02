// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


final class e4
{

    private final Object a;
    private final int b;

    e4(Object obj, int i)
    {
        a = obj;
        b = i;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof e4)
        {
            if (a == ((e4) (obj = (e4)obj)).a && b == ((e4) (obj)).b)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return System.identityHashCode(a) * 65535 + b;
    }
}
