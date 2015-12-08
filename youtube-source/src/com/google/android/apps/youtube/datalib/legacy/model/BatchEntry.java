// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;


public final class BatchEntry
{

    public final Object a;
    public final int b;

    private BatchEntry(Object obj, int i)
    {
        b = i;
        a = obj;
    }

    BatchEntry(Object obj, int i, byte byte0)
    {
        this(obj, i);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (BatchEntry)obj;
            if (b != ((BatchEntry) (obj)).b)
            {
                return false;
            }
            if (a == null)
            {
                if (((BatchEntry) (obj)).a != null)
                {
                    return false;
                }
            } else
            {
                return a.equals(((BatchEntry) (obj)).a);
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        return (i + 31) * 31 + b;
    }
}
