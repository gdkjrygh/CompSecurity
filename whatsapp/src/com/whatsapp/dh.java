// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.TextUtils;

public class dh
{

    final String a;
    final long b;

    public dh(long l, String s)
    {
        b = l;
        a = s;
    }

    public String a()
    {
        return a;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || obj.getClass() != getClass())
            {
                return false;
            }
            obj = (dh)obj;
            if (b != ((dh) (obj)).b || !TextUtils.equals(a, ((dh) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = (int)(b ^ b >>> 32);
        int i;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        return i + j * 31;
    }

    public String toString()
    {
        return (new StringBuilder()).append(b).append(":").append(a).toString();
    }
}
